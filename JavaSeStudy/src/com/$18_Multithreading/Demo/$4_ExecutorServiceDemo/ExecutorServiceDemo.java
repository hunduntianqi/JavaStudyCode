package com.$18_Multithreading.Demo.$4_ExecutorServiceDemo;

import java.util.concurrent.*;

public class ExecutorServiceDemo {
    /**
     *  目标: 自定义线程池对象, 并测试特性
     */
    public static void main(String[] args) throws Exception {
        // 1. 创建线程池对象
        /**
         *   public ThreadPoolExecutor(int corePoolSize,
         *                               int maximumPoolSize,
         *                               long keepAliveTime,
         *                               TimeUnit unit,
         *                               BlockingQueue<Runnable> workQueue,
         *                               ThreadFactory threadFactory,
         *                               RejectedExecutionHandler handler)
         */
        ExecutorService pool = new ThreadPoolExecutor(3, 5, 6, TimeUnit.SECONDS,
                new ArrayBlockingQueue<>(5), Executors.defaultThreadFactory(),
                new ThreadPoolExecutor.AbortPolicy());

        // 2. 给任务线程池处理Runnable任务
//        Runnable target = new MyRunnable();
//        pool.execute(target);
//        pool.execute(target);
//        pool.execute(target);
//        pool.execute(target);
//        pool.execute(target);
        // 给任务线程池处理Callable任务
//        Callable<String> target = new MyCallable(500);
        Future<String> f1 = pool.submit(new MyCallable(100));
        Future<String> f2 = pool.submit(new MyCallable(200));
        Future<String> f3 = pool.submit(new MyCallable(300));
        Future<String> f4 = pool.submit(new MyCallable(400));
        System.out.println(f1.get());
        System.out.println(f2.get());
        System.out.println(f3.get());
        System.out.println(f4.get());

        // 关闭线程池(开发中一般不会用)
//        pool.shutdownNow();  // 立即关闭线程池, 即时任务没有完成, 会丢失任务
        pool.shutdown(); // 会等待全部任务执行完毕之后再关闭线程池
    }
}
