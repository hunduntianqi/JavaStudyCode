package com.$18_Multithreading.Demo.$1_InheritThreadClass;

/*
    方式一:继承Thread类
        Thread类:Java中代表线程
            1. 定义一个MyThread类继承线程类java.lang.Thread, 重写run()方法
            2. 创建MyThread类对象
            3. 调用线程对象的start()方法启动线程(启动后还是执行run()方法的)
 */

public class Test {
    public static void main(String[] args) {
        // 创建新线程对象
        Thread myThread = new MyThread();
        myThread.start();

        for (int i = 0; i < 5; i++) {
            System.out.println("主线程执行输出" + i + "次");
        }
    }
}
