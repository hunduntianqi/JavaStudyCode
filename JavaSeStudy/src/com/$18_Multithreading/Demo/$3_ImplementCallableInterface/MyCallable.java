package com.$18_Multithreading.Demo.$3_ImplementCallableInterface;

import java.util.concurrent.Callable;

// 定义一个任务类实现Callable接口, 并申明任务执行完毕后的结果数据类型
public class MyCallable implements Callable<String> {
    private int n;

    public MyCallable (int n) {
        this.n = n;
    }
    /**
     *  重写Call方法
     */
    @Override
    public String call() throws Exception {
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += i;
        }
        return "子线程执行结果为:" + sum;
    }
}
