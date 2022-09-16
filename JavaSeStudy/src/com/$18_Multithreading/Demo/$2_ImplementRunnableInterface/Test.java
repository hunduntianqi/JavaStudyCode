package com.$18_Multithreading.Demo.$2_ImplementRunnableInterface;

/*
    方式二: 实现Runnable接口
        1. 定义一个线程类MyRunnable实现Runnablej接口, 重写run()方法
        2. 创建MyRunnable任务对象
        3. 把MyRunnable任务对象交给Thread处理
        4. 调用线程对象的start()方法启动线程
 */

public class Test {
    public static void main(String[] args) {
        // 创建一个任务对象
        // 匿名内部类方式创建对象
        Runnable myRunnable = new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    System.out.println("子线程执行输出" + i + "次");
                }
            }
        };
        // 把任务对象交给Thread处理
        Thread t = new Thread(myRunnable);
        t.start();

        for (int i = 0; i < 10; i++) {
            System.out.println("主线程执行" + i + "次");
        }
    }
}
