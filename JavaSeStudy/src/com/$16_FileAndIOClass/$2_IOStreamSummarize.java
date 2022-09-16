package com.$16_FileAndIOClass;

/*
    IO流:
        作用:读写文件数据
        I: 表示Input, 输入流, 读数据到内存
        O: 表示Output, 输出流, 写数据到磁盘
    IO流的分类:
        按方向分:
            1. 输入流
            2. 输出流
        按数据最小单位分:
            1. 字节流
            2. 字符流
    流的四大类(抽象类):
        1. 字节输入流(InputStream):
            以内存为基准, 来自磁盘文件 / 网络中的数据以字节的形式读入到内存中
            实现类代表:FileInputStream
                构造器:
                    1. public FileInputStream(File file): 创建字节输入流管道与源文件对象接通
                    2. public FileInputStream(String pathname): 创建字节输入流管道与源文件路径接通
                读取方法:
                    public int read(): 每次读取一个字节返回, 如果字节已经没有可读的返回-1
                    public int read(byte[] buffer): 每次读取一个字节数组返回, 如果字节已经没有可读的返回-1
        2. 字节输出流(OutputStream):
            以内存为基准, 把内存中的数据以字节写出到磁盘文件或网络中去
            实现类代表:FileOutputStream
                构造器:
                    1. public FIleOutputStream(File file): 创建字节输出流管道与源文件对象接通
                    2. public FIleOutputStream(File file, boolean append): 创建字节输出流管道与源文件对象接通, 可追加数据
                    3. public FIleOutputStream(String filepath): 创建字节输出流管道与源文件路径接通
                    4. public FIleOutputStream(String filepath, boolean append): 创建字节输出流管道与源文件路径接通, 可追加数据
                写入方法:
                    1. public void write(int a): 写一个字节
                    2. public void write(byte[] buffer): 写一个字节数组
                    3. public void write(byte[] buffer, int pos, int len): 写一个字节数组的一部分
                刷新和关闭写入文件:
                    1. 刷新文件:file.flush(), 刷新数据, 确保缓存区数据写入文件, 刷新后可以继续写入数据
                    2. 关闭文件: file.close(), 释放资源, 包含刷新数据, 关闭文件后不能继续写入数据
        3. 字符输入流(Reader):
            以内存为基准, 来自磁盘文件或网络中的数据以字符的形式读入到内存中
            实现类代表:FileReader
                构造器:
                    1. public FileReader(File file): 创建字符输入流管道与源文件对象接通
                    2. public FileReader(String pathname): 创建字符输入流管道与源文件路径接通
                常用方法:
                    1. public int read(): 每次读取一个字符返回, 如果字符已经没有可读的返回-1
                    2. public int read(char[] buffer): 每次读取一个字符数组, 返回读取的字符个数, 如果字符已经没有可读的
                                                                    返回-1
        4. 字符输出流(Writer):
            以内存为基准, 把内存中的数据以字符写出到磁盘文件或者网络介质中去
            实现类代表:FileWriter
                构造器:
                    1. public FileWriter(File file): 创建字符输出流管道与源文件对象接通
                    2. public FIleWriter(File file, boolean append): 创建字符输出流管道与源文件对象接通, 可追加数据
                    3. public FileWriter(String filepath): 创建字符输出流管道与源文件路径接通
                    3. public FIleWriter(String filepath, boolean append): 创建字符输出流管道与源文件路径接通, 可追加数据
                常用方法:
                    1. void write(int c): 写一个字符
                    2. void write(char[] cbuf): 写入一个字符数组
                    3. void write(char[] cbuf, int off, int len): 写入字符数组的一部分
                    4. void write(String str): 写一个字符串
                    5. void write(String str, int off, int len): 写一个字符串的一部分
                文件关闭与刷新:
                    1. 刷新文件:file.flush(), 刷新数据, 确保缓存区数据写入文件, 刷新后可以继续写入数据
                    2. 关闭文件: file.close(), 释放资源, 包含刷新数据, 关闭文件后不能继续写入数据
            字节流与字符流的使用:
                1. 字节流适合做一切文件数据的拷贝(音视频, 文本)
                2. 字节流不适合读取中文内容输出
                3. 字符流适合做文本文件的操作(读, 写)
 */

public class $2_IOStreamSummarize {
}
