package com.$6_staticKeyWord;
/*
    懒汉单例设计模式
 */
public class $2_SingleTest2 {
    // 2.定义一个静态成员变量存储本类对象
    private static $2_SingleTest2 instance;
    
    // 1.私有构造器
    private $2_SingleTest2() {
    
    }
    
    // 3.定义一个方法, 可以调用获取一个对象
    public static $2_SingleTest2 getInstance() {
        if (instance == null) {
            instance = new $2_SingleTest2();
        }
        
        return instance;
    }
    
}

