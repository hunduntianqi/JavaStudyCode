package com.$17_HighLevelIOStream.Demo.$1_BufferStreamDemo;

import java.io.*;

public class $1_ByteDemo {
    public static void main(String[] args) {
        String pathsource = "D:\\Users\\Administrator\\Desktop\\test\\图片备份";
        // 创建文件对象
        File filesource = new File(pathsource);
        File fileresultbuffer = new File(pathsource + "1");
        File fileresult = new File(pathsource + "2");
        fileresultbuffer.mkdir();
        fileresult.mkdir();
        File[] bufferfile = filesource.listFiles();
        long startBufferTime = System.currentTimeMillis();
        for (File file : bufferfile) {
            try (
                    InputStream is = new FileInputStream(pathsource + "\\" + file.getName());
                    // 缓冲流包装
                    InputStream bis = new BufferedInputStream(is);
                    OutputStream os = new FileOutputStream(pathsource + "1\\" + file.getName());
                    // 缓冲流包装
                    OutputStream bos = new BufferedOutputStream(os);
            ) {
                // 读取数据
//                byte[] buffer = bis.readAllBytes();
                byte[] buffer = bis.readAllBytes();
                int len = bis.read(buffer);
                // 写入数据
                bos.write(buffer);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        long entBufferTime = System.currentTimeMillis();
        System.out.println("字节缓冲流用时:" + (entBufferTime - startBufferTime) + "ms");

        long startTime = System.currentTimeMillis();
        for (File file : bufferfile) {
            try (
                    InputStream is = new FileInputStream(pathsource + "\\" + file.getName());
//                    // 缓冲流包装
//                    InputStream bis = new BufferedInputStream(is);
                    OutputStream os = new FileOutputStream(pathsource + "2\\" + file.getName());
//                    // 缓冲流包装
//                    OutputStream bos = new BufferedOutputStream(os);
            ) {
                // 读取数据
//                byte[] buffer = is.readAllBytes();
                byte[] buffer = is.readAllBytes();
                int len = is.read(buffer);
                // 写入数据
                os.write(buffer);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        long endTime = System.currentTimeMillis();
        System.out.println("普通字节流用时:" + (endTime - startTime) + "ms");
    }
}
