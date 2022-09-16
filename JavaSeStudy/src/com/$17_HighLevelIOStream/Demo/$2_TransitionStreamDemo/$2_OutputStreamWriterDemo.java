package com.$17_HighLevelIOStream.Demo.$2_TransitionStreamDemo;

/*
    字符输出转换流:
        OutputStreamWrite:
    构造器:
        public OutputStreamWriter(OutputStream os, String charset): 以指定编码把字节输出流转换成字符输出流,
        从而指定写出去的字符编码
 */

import java.io.*;

public class $2_OutputStreamWriterDemo {
    public static void main(String[] args) throws Exception {
        // 创建字节输入流
        InputStream is = new FileInputStream("D:\\Users\\Administrator\\Desktop\\test\\QQ评论0.txt");
        // 构建字节输入转换流
        InputStreamReader tis = new InputStreamReader(is, "utf-8");
        // 创建字节输出流
        OutputStream os = new FileOutputStream("字符写入.txt");
        // 创建字节输出转换流
        OutputStreamWriter tos = new OutputStreamWriter(os, "gbk");
        char[] buffer = new char[1024];
        int len;
        while ((len = tis.read(buffer)) != -1) {
            tos.write(buffer);
        }
        tos.close();
        os.close();
    }
}
