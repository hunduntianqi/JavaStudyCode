package com.$16_FileAndIOClass.Demo.$1_IOStreamDemo;

/*
    字符输出流(Writer):
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
 */

import java.io.FileWriter;
import java.io.Writer;

public class $4_FileWriterDemo {
    public static void main(String[] args) throws Exception{
        // 创建字符输入流管道与源文件接通
        Writer fw = new FileWriter("./字符写入.txt", true);
        // 1. 写一个字符
        fw.write(97);
        fw.write("\n");
        // 2. 写入一个字符数组
        char[] ch = {'a', 'b', '郭', '鹏', '涛'};
        fw.write(ch);
        fw.write("\n");
        // 3. 写一个字符串
        fw.write("我爱徐冬梅");
        fw.write("\n");
        // 4. 写一个字符串的一部分
        fw.write("我爱徐冬梅", 2, 3);
        // 5. 写一个字符数组的一部分
        fw.write(ch, 2, 3);
        fw.write("\n");
        fw.close();
    }
}
