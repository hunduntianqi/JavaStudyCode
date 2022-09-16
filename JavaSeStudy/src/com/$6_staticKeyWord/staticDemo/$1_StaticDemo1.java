package com.$6_staticKeyWord.staticDemo;

public class $1_StaticDemo1 {
    // 静态成员变量
    public static int onLineNumber;
    // 实例成员变量
    public String name;
    
    public static void getMax() {
        // 静态方法可以直接访问静态成员
        System.out.println($1_StaticDemo1.onLineNumber);
        System.out.println(onLineNumber);
        // 静态方法可以访问静态方法
        inAddr();
        
        //        //静态方法不可以直接访问实例成员和实例方法
        //        // System.out.println(name); 代码报错
        // sing(); 代码报错
        // 创建对象访问实例成员
        $1_StaticDemo1 s = new $1_StaticDemo1();
        System.out.println(s.name);
        s.sing();
    }
    
    public void run() {
        // 实例方法可以访问实例成员变量, 也可以访问静态成员变量
        System.out.println($1_StaticDemo1.onLineNumber);
        System.out.println(onLineNumber);
        System.out.println(name);
        
        // 实例方法访问静态方法
        inAddr();
        // 实例方法访问实例方法
        sing();
    }
    
    public void sing() {
        
    }
    
    public static void inAddr() {
        // 静态成员方法
        System.out.println("混沌初开道为先~~");
    }
}

