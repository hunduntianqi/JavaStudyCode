package com.$18_Multithreading.Demo.$4_ExecutorServiceDemo;

import java.util.concurrent.Callable;

public class MyCallable implements Callable<String> {
    private int n;
    public MyCallable(int n) {
        this.n = n;
    }

    @Override
    public String call() throws Exception {
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += n;
        }
        return Thread.currentThread().getName() + "计算的结果为" + sum;
    }
}
