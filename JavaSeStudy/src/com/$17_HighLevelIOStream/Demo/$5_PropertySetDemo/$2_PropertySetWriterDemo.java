package com.$17_HighLevelIOStream.Demo.$5_PropertySetDemo;

import java.io.FileOutputStream;
import java.util.Properties;

public class $2_PropertySetWriterDemo {
    /**
     *      Properties属性集对象:
     *         本质是一个Map集合, 但是一般不会当做集合使用, 因为HashMap更好用
     *
     *         核心作用:
     *             代表的是一个属性文件, 可以把自己对象中的键值对信息存入到一个属性文件中
     *             属性文件: 后缀是.properties结尾的文件, 里面的内容是key = value, 后续做系统配置信息的
     *         Properties和IO流结合的方法:
     *             1. void load(InputStream inStream): 从输入字节流读取属性列表(键和元素对)
     *             2. void load(Reader reader): 从输入字符流读取属性列表(键和元素对)
     *             3. void store(OutputStream out, String comments): 将此属性列表(键和元素对)写入此Properties表中, 以适合使用
     *                                                                                         load(InputStream)方法的格式写入输出字节流
     *             4. void store(Writer writer, String comments): 此属性列表(建和元素对)写入此Properties表中, 以适合使用load(Reader):
     *                                                                                 方法的格式写入输出字符流
     *             5. public Object setProperty(String key, String value): 保存键值对(put)
     *             6. public String getProperty(String key): 使用此属性列表中指定的键搜索属性值(get)
     *             7. publc Set<String> stringPropertyNames(): 所有键名称的集合(keySet())
     */
    public static void main(String[] args) throws Exception {
        // 使用Properties把键值对信息存入到属性文件中
        Properties properties = new Properties();
        properties.put("adimin", "123456");
        properties.put("dlei", "003197");
        properties.setProperty("name", "郭鹏涛"); // 保存键值对信息
        System.out.println(properties);

        // 创建属性文件
        properties.store(new FileOutputStream("./properties.properties"), "give me 100");

    }
}
