package com.$17_HighLevelIOStream.Demo.$4_SerializeOcjectDemo;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class $2_ObjectOutputStreamDemo {
    /**
     * 对象字节输出流
     *             ObjectOutputStream:
     *             构造器:
     *                 public ObjectOutputStream(OutputStream out): 把低级字节输出流包装成高级的对象字节输出流
     *              注意:
     *                 1. 对象如果要序列化, 必须实现Serializable序列化接口
     *                 2. transient修饰的成员变量不参与序列化:
     *                    例: private transient String passWord
     */
    public static void main(String[] args) throws Exception{
        // 1. 创建学生对象
        Student study = new Student("郭鹏涛", "混沌天炁", "2251789949gpt", 23);
        // 2. 对象序列化, 使用对象字节输出流包装字节输出流管道
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("./obj.txt"));
        // 3. 直接调用序列化方法
        oos.writeObject(study);
        // 4. 资源释放
        oos.close();
    }
}
