package com.$6_staticKeyWord;

public class $2_SingleTest1 {
    /**
     *  饿汉单例模式
     */
    
    // 2.定义静态变量存储一个对象, 属于类, 与类一起加载, 且只会加载一次
    
    public static $2_SingleTest1 instance = new $2_SingleTest1();
    
    // 1. 将构造器私有, 使其不能对外创建对象
    private $2_SingleTest1() {
    
    }
    
    public void run() {
        System.out.println("Java永远的神！！");
    }
}
