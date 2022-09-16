package com.$17_HighLevelIOStream.Demo.$2_TransitionStreamDemo;

/*
     InputStreamReader:
         1. 先提取文件的原始字节流, 原始字节不会存在问题
         2. 将原始字节流以指定编码转换成字符输入流
     构造器:
         1. public InputStreamReader(InputStream is): 可以把原始字节流按照默认编码转换成字符输入流, 几乎不用, 与默认FileReader一样
         2. public InputStreamReader(InputStream is, String charset): 可以把原始字节流按照指定编码转换成字符输入流,
 */

import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;

public class $1_InputStreamReaderDemo {

    public static void main(String[] args) throws Exception {
        // 1. 先提取文件原始字节流
        InputStream is = new FileInputStream("D:\\Users\\Administrator\\Desktop\\test\\me.txt");
        // 2. 把原始字节流转换成字符输入流(读取不会乱码)
        InputStreamReader tis = new InputStreamReader(is, "utf-8");
//        int data;
//        while ((data = tis.read()) != -1) {
//            System.out.print((char) data);
//        }
        char[] buffer = new char[1024];
        int len = tis.read(buffer);
        System.out.println(buffer);
    }
}
