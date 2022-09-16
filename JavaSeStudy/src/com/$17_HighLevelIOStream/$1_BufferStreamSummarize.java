package com.$17_HighLevelIOStream;

/*
    缓冲流概述:
        缓冲流也称高效流, 或者高级流
        作用: 缓冲流自带缓冲区, 可以提高原始字节流, 字符流读写数据的性能

    缓冲流分类:
        字节输入缓冲流:
            BufferedInputStream
            构造器:
                public BufferedInputStream(InputStream is): 可以把低级的字节输入流包装成一个高级的缓冲字节
                                                            输入流缓冲管道, 提高字节输入流读数据的性能
        字节输出缓冲流:
            BufferedOutputStream
            构造器:
                public BufferedOutputStream(OutputStream os): 可以把低级的字节输出流包装成一个高级的缓冲字节
                                                              输出流缓冲管道, 提高字节输出流写数据的性能
        字符输入缓冲流:
            BufferedReader
            构造器:
                public BufferedReader(Reader r): 可以把低级的字符输入流包装成一个高级的缓冲字符输入流管道,
                                                 提高字符输入流读数据的性能
            新增方法:
                public String readLine(): 读取一行数据返回, 如果读取没有完毕, 无行可读返回null
        字符输出缓冲流:
            BufferedWriter
            构造器:
                public BufferedWriter(Writer w): 可以把低级的字符输出流包装成一个高级的缓冲字符输出流管道,
                                                 提高字符输出流写数据的性能
                新增方法:
                    public void newLine(): 换行操作
 */

import java.io.*;

public class $1_BufferStreamSummarize {
    public static void main(String[] args) {
        try (
                InputStream is = new FileInputStream("D:\\Users\\Administrator\\Desktop\\test\\蒋大为 - 最美的歌儿唱给妈妈.mp3");
                // 包装字节输入缓冲流
                InputStream bis = new BufferedInputStream(is);

                OutputStream os = new FileOutputStream("D:\\Users\\Administrator\\Desktop\\test\\蒋大为 - 最美的歌儿唱给妈妈2.mp3");
                // 包装字节输出流缓冲流
                OutputStream bos = new BufferedOutputStream(os);
        ) {
            long starttime = System.currentTimeMillis();
            // 读取数据
            byte[] buffer = bis.readAllBytes();
            int len = bis.read(buffer);
            // 写入数据
            os.write(buffer);
            long endtime = System.currentTimeMillis();
            System.out.println("缓冲高级读写共用时:" + (endtime - starttime) + "ms");

        } catch (Exception e) {
            e.printStackTrace();
        }

        try (
                InputStream is = new FileInputStream("D:\\Users\\Administrator\\Desktop\\test\\蒋大为 - 最美的歌儿唱给妈妈.mp3");
//                // 包装字节输入缓冲流
//                InputStream bis = new BufferedInputStream(is);

                OutputStream os = new FileOutputStream("D:\\Users\\Administrator\\Desktop\\test\\蒋大为 - 最美的歌儿唱给妈妈1.mp3");
//                // 包装字节输出流缓冲流
//                OutputStream bos = new BufferedOutputStream(os);
        ) {
            long starttime = System.currentTimeMillis();
            // 读取数据
            byte[] buffer = is.readAllBytes();
            int len = is.read(buffer);
            // 写入数据
            os.write(buffer);
            long endtime = System.currentTimeMillis();
            System.out.println("普通低级流读写共用时:" + (endtime - starttime) + "ms");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
