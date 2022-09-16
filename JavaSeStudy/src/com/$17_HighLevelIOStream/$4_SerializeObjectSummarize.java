package com.$17_HighLevelIOStream;

/*
    对象序列化:
        作用:以内存为基准, 把内存中的对象存储到磁盘文件中, 称为对象序列化
        对象字节输出流(序列化)
            ObjectOutputStream:
            构造器:
                public ObjectOutputStream(OutputStream out): 把低级字节输出流包装成高级的对象字节输出流
            序列化方法:
                public final void writeObject(Object obj): 把对象写出去到对象序列化流的文件中
            注意:
                1. 对象如果要序列化, 必须实现Serializable序列化接口
                2. transient修饰的成员变量不参与序列化:
                   例: private transient String passWord
    对象反序列化:
        作用:以内存为基准, 把存储到磁盘文件中去的对象数据恢复成内存中的对象, 称为对象反序列化
        对象字节输入流(反序列化):
            ObjectInputStream:
            构造器:
                public ObjectInputStream(InputStream out): 把低级字节输入流包装成高级的对象字节输入流
            反序列化方法:
                public Object readObject(): 把存储到磁盘文件中的对象数据恢复成内存中的对象返回
 */

public class $4_SerializeObjectSummarize {
}
