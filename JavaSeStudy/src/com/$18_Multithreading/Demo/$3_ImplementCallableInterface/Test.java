package com.$18_Multithreading.Demo.$3_ImplementCallableInterface;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

/*
    方式三: JDK5新增: 实现Callable接口
        1. 得到任务对象:定义类实现Callable接口, 重写call方法, 封装要做的事情
        2. 用FutureTask把Callable对象封装成线程任务对象
        3. 把线程任务对象交给Thread处理
        4. 调用Thread的start()方法启动线程, 执行任务
        5. 线程执行完毕后, 通过FutureTask的get()方法获取任务执行结果
 */

public class Test {
    public static void main(String[] args) throws Exception {
        // 创建任务对象
        Callable<String> call = new MyCallable(10);
        // 把call任务对象交给FutureTask对象
        FutureTask<String> f = new FutureTask<>(call);
        Thread t = new Thread(f);
        t.start();
        String s = f.get();
        System.out.println(s);
    }
}
