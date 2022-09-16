package com.$6_staticKeyWord.staticDemo;

public class $2_StaticDemo2 {
    public static String name;
    
    // 定义静态代码块
    /**
     *  特点:静态代码块, 与类一起加载, 优先执行, 与所在位置无关
     *  作用:可以在程序加载时进行静态数据初始化操作,
     */
    static {
        System.out.println("~~静态代码块被触发一次~~");
    }
    
    public static void main(String[] args) {
        // 静态代码块的作用和特点
        System.out.println("main方法被触发执行！！");
        System.out.println(name);
    }
    
    static {
        System.out.println("~~静态代码块被触发一次~~");
        name = "郭鹏涛是个单身狗";
    }
}

