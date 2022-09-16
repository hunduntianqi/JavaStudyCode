package com.$17_HighLevelIOStream;

/*
    打印流:
        可以实现方便, 高效的打印数据到文件中去
        PrintStream(属于字节输出流):
            构造器:
                1. public PrintStream(OutputStream os): 打印流直接通向字节输出流管道
                2. public PrintStream(File f): 打印流直接通向文件对象
                3. public PrintStream(String filepath): 打印流直接通向文件路径
                4. public PrintStream(String filepath, String charset) : 以指定编码创建打印流对象
            方法:
                public void print(Xxx xxx): 打印任意类型的数据出去
        PrintWriter(属于字符输出流):
            构造器:
                1. public PrintWriter(OutputStream os): 打印流直接通向字节输出流管道
                2. public PrintWriter(Writer w): 打印流直接通向字符输出流管道
                3. public PrintWriter(File f): 打印流直接通向文件对象
                4. public PrintWriter(String filepath): 打印流直接通向文件路径
            方法:
                public void print(Xxx xxx): 打印任意类型的数据
        输出语句重定向:
            打印流的一种应用, 可以把输出语句的打印位置改到文件
            PrintStream ps = new PrintStream("文件地址");
           System.setOut(ps) // 把系统打印流改成自定义打印流, 数据不再展示在控制台, 而是流入指定文件
*/

public class $3_PrintStreamSummarize {
}
