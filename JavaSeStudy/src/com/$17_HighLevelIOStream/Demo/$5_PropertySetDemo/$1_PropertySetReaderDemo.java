package com.$17_HighLevelIOStream.Demo.$5_PropertySetDemo;

import java.io.FileInputStream;
import java.util.Properties;

public class $1_PropertySetReaderDemo {
    public static void main(String[] args) throws Exception {
        // Properties读取属性文件中的键值对信息
        Properties properties = new Properties();
        System.out.println(properties);

        // 加载属性文件中的键值对信息到Properties对象中
        properties.load(new FileInputStream("JavaSeStudy/src/properties.properties"));
        System.out.println(properties);
        System.out.println(properties.getProperty("name"));
        // 获取键名的集合
        System.out.println(properties.stringPropertyNames().getClass());

    }
}
