package com.$16_FileAndIOClass.Demo.$1_IOStreamDemo;

/*
    字符输入流(Reader):
            实现类代表:FileReader
                构造器:
                    1. public FileReader(File file): 创建字符输入流管道与源文件对象接通
                    2. public FileReader(String pathname): 创建字符输入流管道与源文件路径接通
                常用方法:
                    1. public int read(): 每次读取一个字符返回, 如果字符已经没有可读的返回-1
                    2. public int read(char[] buffer): 每次读取一个字符数组, 返回读取的字符个数, 如果字符已经没有可读的
                                                                    返回-1
 */

import java.io.FileReader;
import java.io.Reader;

public class $3_FileReaderDemo {
    public static void main(String[] args) throws Exception {
        // 每次读取一个字符返回
        // 1. 创建一个字符输入流管道与源文件接通
        Reader fr = new FileReader("D:\\Users\\Administrator\\Desktop\\test\\me.txt");
//        int code;
////        System.out.println((char)code);
//        // 循环读取字符
//        while ((code = fr.read()) != -1) {
//            System.out.print((char)code);
//        }

        // 一次读取一个字符数组返回
        char[] buffer = new char[1024];
        int len = fr.read(buffer);
        System.out.println(new String(buffer, 0, len));
    }
}
