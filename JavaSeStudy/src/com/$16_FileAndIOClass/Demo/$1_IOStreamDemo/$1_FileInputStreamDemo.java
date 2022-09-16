package com.$16_FileAndIOClass.Demo.$1_IOStreamDemo;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

public class $1_FileInputStreamDemo {
    public static void main(String[] args) throws Exception{
        // 1. 创建一个文件字节输入流管道
        InputStream file = new FileInputStream("D:\\Users\\Administrator\\Desktop\\test\\" +
                "微信图片_20210815132734.jpg");
//            try {
//                // 读取一个字节返回
//                int a = file.read();
//                System.out.println((char) a);
        // 使用循环读取所有字节
//                int b;
//                StringBuffer sb = new StringBuffer();
//                while ((b = file.read()) != -1) {
//                    sb.append((char)b);
//                    System.out.print((char)b);
//                }
//                String s = sb.toString();
//                System.out.println(s);
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
        //  读取一个字节数组返回
//            byte[] buffer = new byte[1024];
//            int len;
//            while ((len = file.read(buffer)) != -1) {
////                System.out.print(b);
////                System.out.println();
//                System.out.print(new String(buffer, 0, len));
//            }
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        }
        // 一次读取全部字节
        File f = new File("D:\\Users\\Administrator\\Desktop\\test\\" +
                "微信图片_20210815132734.jpg");
        // 定义一个与文件大小相同的字节数组
//        byte[] buffer = new byte[(int)f.length()];
//        int len = file.read(buffer);
//        String rs = new String(buffer);
//        System.out.println("读取了" + len + "个字节");
//        System.out.println("文件大小:" + f.length());
//        System.out.println(rs);
        // 读取全部字节
        byte[] by = file.readAllBytes();
        System.out.println(new String(by, "utf-8"));
    }
}
