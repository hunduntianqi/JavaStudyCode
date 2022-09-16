package com.$17_HighLevelIOStream.Demo.$4_SerializeOcjectDemo;

import java.io.FileInputStream;
import java.io.InputStream;
import java.io.ObjectInputStream;

public class $1_ObjectInputStreamDemo {
    /**
     * 对象反序列化:
     *         作用:以内存为基准, 把存储到磁盘文件中去的对象数据恢复成内存中的对象, 称为对象反序列化
     *         对象字节输入流(反序列化):
     *             ObjectInputStream:
     *             构造器:
     *                 public ObjectInputStream(InputStream out): 把低级字节输入流包装成高级的对象字节输入流
     *             反序列化方法:
     *                 public Object readObject(): 把存储到磁盘文件中的对象数据恢复成内存中的对象返回
     */
    public static void main(String[] args) throws Exception{
        // 1. 创建低级字节输入流
        InputStream is = new FileInputStream("./obj.txt");
        // 2. 包装成高级对象字节输入流
        ObjectInputStream ois = new ObjectInputStream(is);
        Student obj =(Student) ois.readObject();
        System.out.println(obj);
    }
}
