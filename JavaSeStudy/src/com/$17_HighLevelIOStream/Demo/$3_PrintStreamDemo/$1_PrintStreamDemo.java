package com.$17_HighLevelIOStream.Demo.$3_PrintStreamDemo;

import java.io.PrintStream;

public class $1_PrintStreamDemo {
    /**
     * PrintStream(属于字节输出流):
     * 构造器:
     * 1. public PrintStream(OutputStream os): 打印流直接通向字节输出流管道
     * 2. public PrintStream(File f): 打印流直接通向文件对象
     * 3. public PrintStream(String filepath): 打印流直接通向文件路径
     * 4. public PrintStream(String filepath, String charset) : 以指定编码创建打印流对象
     * 方法:
     * public void print(Xxx xxx): 打印任意类型的数据出去
     */
    public static void main(String[] args) throws Exception {
        // 1. 创建字节打印流对象
        PrintStream ps = new PrintStream("ps.txt");
        ps.print(58);
        ps.print("郭鹏涛");
        ps.print("陈欣妮是小仙女~~");
    }
}
