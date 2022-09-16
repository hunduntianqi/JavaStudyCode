package com.$18_Multithreading.Demo.$1_InheritThreadClass;

/*
    定义一个线程类继承Thread类
 */

public class MyThread extends Thread{
    /**
     *  重写run()方法, 定义线程以后要做的内容
     */
    @Override
    public void run() {
//        super.run();
        for (int i = 0; i < 5; i++) {
            System.out.println("子线程执行输出" + i + "次");
        }
    }
}
