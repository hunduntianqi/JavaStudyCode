package com.$18_Multithreading.Demo.$2_ImplementRunnableInterface;

public class MyRunnable implements Runnable{
    /**
     *  重写run()方法, 定义线程执行任务
     */
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("子线程执行输出" + i + "次");
        }
    }
}
