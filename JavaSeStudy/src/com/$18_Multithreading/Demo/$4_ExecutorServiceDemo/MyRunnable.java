package com.$18_Multithreading.Demo.$4_ExecutorServiceDemo;

public class MyRunnable implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread() + "被执行输出==>>" + i);
        }

        try {
            Thread.sleep(1000);
            System.out.println(Thread.currentThread() + "与本任务绑定, 已进入休眠状态..");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
