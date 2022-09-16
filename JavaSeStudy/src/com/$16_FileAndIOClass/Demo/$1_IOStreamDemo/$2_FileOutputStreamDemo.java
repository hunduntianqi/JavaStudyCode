package com.$16_FileAndIOClass.Demo.$1_IOStreamDemo;

import java.io.FileOutputStream;
import java.io.OutputStream;

public class $2_FileOutputStreamDemo {
    public static void main(String[] args) throws Exception {
        // 1. 创建一个文件字节输出流管道与目标文件接通
        OutputStream os = new FileOutputStream("./123.txt", true);
        // 2. 写入数据
        // 2.1 public void write(int a):写一个字节
        os.write('a');
        os.write('b');
        os.write('c');
        os.write("\n".getBytes());
        // 2.2 public void write(byte[] buffer): 写一个字节数组
        byte[] buffer = {'a', 97, 98, 99};
        os.write(buffer);
        os.write("\n".getBytes());
        byte[] buffer2 = "我爱徐冬梅".getBytes();
        os.write(buffer2);
        os.write("\n".getBytes());
        // 2.3 public void write(byte[] buffer, int pos, int len): 写一个字节数组的一部分
        os.write(buffer, 0, 4);
        os.write("\n".getBytes());
        // 刷新数据, 确保将缓存区的数据写入文件, 刷新后可以继续写入数据
        os.flush();
        os.write("\n".getBytes());
        os.write("\n".getBytes());
        os.close(); // 释放资源(关闭文件), 包含文件刷新, 关闭后文件不能再次写入
    }
}
