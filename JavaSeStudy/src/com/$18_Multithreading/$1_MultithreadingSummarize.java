package com.$18_Multithreading;

/*
    多线程:指从软硬件上实现多条执行流程的技术
        Thread类:Java中代表线程
            构造器:
                    1. public Thread(String name): 为当前线程指定名称
                    2. public Thread(Runnable target): 封装Runnable对象为线程对象
                    3. public Thread(Runnable target, String name): 封装Runnable对象为线程对象, 并指定线程名称
    多线程的创建:
        方式一:继承Thread类
                1. 定义一个MyThread类继承线程类java.lang.Thread, 重写run()方法
                2. 创建MyThread类对象
                3. 调用线程对象的start()方法启动线程(启动后还是执行run()方法的)
            优点:编码简单
            缺点:线程类已经继承Thread, 无法继承其他类, 不利于扩展
            注意:
                1. 直接调用run()方法会当成普通方法执行, 相当于还是单线程执行, 只有调用start()方法
                    才是启动一个新的线程执行
                2. 主线程任务不能放在子线程之前, 主线程放在子线程之前, 主线程一直会先执行, 相当于是单线程
                    的效果了
        方式二: 实现Runnable接口
            1. 定义一个线程类MyRunnable实现Runnablej接口, 重写run()方法
            2. 创建MyRunnable任务对象
            3. 把MyRunnable任务对象交给Thread处理
            4. 调用线程对象的start()方法启动线程
            优点: 线程任务类只是实现接口, 可以继续继承类和实现接口, 扩展性强
            缺点: 编程多一层对象包装, 如果线程有执行结果是不可以直接返回的
        方式三: JDK5新增: 实现Callable接口
            1. 得到任务对象:定义类实现Callable接口, 重写call方法, 封装要做的事情
            2. 用FutureTask把Callable对象封装成线程任务对象
            3. 把线程任务对象交给Thread处理
            4. 调用Thread的start()方法启动线程, 执行任务
            5. 线程执行完毕后, 通过FutureTask的get()方法获取任务执行结果
            FutureTask常用方法:
                1. public FutureTask<> (Callable call): 把Callable对象封装成FutureTask对象
                2. public V get() throws Exception: 获取线程执行call方法返回的结果
            优点:
                1. 线程任务类只是实现接口, 可以继续继承类和实现接口, 扩展性强
                2. 可以在线程执行完毕后去获取线程执行的结果
            缺点:
                编码复杂一点
    Thread类常用方法:
        1. String getName() :获取当前线程名称, 默认线程名称是Thread-索引
        2. void setName(String name): 将此线程的名称更改为指定的名称, 通过构造器也可以设置线程名称
        3. static Thread currentThread(): 获取当前线程对象
    Thread线程休眠方法:
        public static void sleep(long time): 让当前线程休眠指定的时间后再继续执行, 单位为毫秒
    线程安全问题:
        指多个线程同时操作同一个共享资源的时候可能会出现业务安全问题
        原因:
            1. 存在多线程并发
            2. 同时访问共享资源
            3. 存在修改共享资源
        解决方法:
            线程同步:
                加锁:让多个线程实现先后依次访问共享资源
                1. 同步代码块:
                    作用: 把出现线程安全问题的核心代码使用(synchronized)上锁
                    原理: 每次只能一个线程进入, 执行完毕后自动解锁, 其他线程才可以进来执行
                    锁对象要求: 理论上: 锁对象只要对于当前同时执行的线程来说是同一个对象即可
                                        规范上: 建议使用共享资源作为锁对象
                                                    对于实例方法建议使用this作为锁对象
                                                    对于静态方法建议使用字节码(类名.class)对象作为锁对象
                2. 同步方法:
                    作用: 把出现线程安全问题的核心方法上锁
                    原理: 每次只能一个线程进入, 执行完毕以后自动解锁, 其他线程才可以进来执行
                    格式:
                        修饰符 synchronized 返回值类型 方法名称(参数列表) {
                            操作共享资源的代码
                        }
                        实例方法: 同步方法默认使用this作为锁对象, 但是代码要高度面向对象
                        静态方法: 同步方法默认使用类名.class作为锁对象
                3. Lock锁:
                    JDK5以后提供的新的锁对象, 更加灵活方便
                    Lock是接口, 不能直接实例化, 可以采用它的实现类ReentrantLock来构建锁对象
                        1. public ReentrantLock(): 获得Lock锁的实现类对象
                        2. void lock(): 获得锁
                        3. void unlock(): 释放锁
    线程通信:
        指线程间相互发送数据
        前提: 通常是在多个线程操作同一个共享资源的时候需要进行通信, 且要保证线程安全
        常见形式:
            1. 通过共享一个数据的方式实现
            2. 根据共享数据的情况决定自己改怎么做, 以及通知其他线程怎么做
        实际应用模型:
            生产者与消费者模型: 生产者线程负责生产数据, 消费者线程负责消费生产者产生的数据
                一般要求:
                    1. 生产者线程生产完数据后唤醒消费者, 然后等待自己
                    2. 消费者消费完数据后唤醒生产者, 然后等待自己
    线程池:
        指一个可以复用线程的技术
        线程池接口:ExecutorService
        创建线程池对象:
            方式一:
                使用ExecutorService的实现类ThreadPoolExecutor创建一个线程池对象
                构造器:
                    public ThreadPoolExecutor(int corePoolSize, int maximumPoolSize, long keepAliveTime, TImeUnit unit,
                                                            BlockingQueue<Runnable> workQueue, ThreadFactory threadFactory,
                                                            RejectedExecutionHandler handler)
                    参数说明:
                        1. corePoolSize: 指定线程池的线程数量(核心线程), 不能小于0
                        2. maximumPoolSize: 指定线程池可支持的最大线程数, 最大线程数 >= 核心线程数
                        3. keepAliveTIme: 指定临时线程的最大存活时间, 不能小于0
                        4. unit: 指定存活时间的单位(秒, 分, 时, 天), 指时间单位
                        5. workQueue: 指定任务队列, 不能为null
                        6. threadFactory: 指定用哪个线程工厂创建线程, 不能为null
                        7. handler: 指定线程忙, 任务满的时候, 新任务来了怎么办
            方式二:
                使用线程池的工具类Executors调用方法返回不同特点的线程池对象
                1. public static ExecutorService newCachedThreadPool(): 线程数量随着任务增加而增加, 如果线程任务执行完毕且空闲了一段时间会被回收掉
                2. public static ExecutorService newFixedThreadPool(int nThreads): 创建固定线程数量的线程池, 如果某个线程因为执行异常而结束, 线程池会补充一个新线程替代它
                3. public static ExecutorService newSingleThreadExecutor(): 创建只有一个线程的线程池对象, 如果该线程出现异常结束, 线程池会补充一个新线程
                4. public static ScheduledExecutorService newScheduledThreadPool(int corePoolSize): 创建一个线程池, 可以实现在给定的延迟后运行任务, 或者定期执行任务
                注意: Executors底层也是基于线程池的实现类ThreadPoolExecutor创建线程池对象
    定时器:
        指一种控制任务延时调用, 或者周期调用的技术
        作用: 闹钟, 定时邮件发送
        实现方式:
            方式一: Timer
                构造器:
                    public Timer(): 创建Timer定时器对象
                方法:
                    public void schedule(TimeTask task, long delay, long period): 开启一个定时器, 按照计划处理TimeTask任务
                特点:
                    1. 单线程, 处理多个任务按照顺序执行, 存在延时与设置定时器的时间有出入
                    2. 可能因为某个任务的异常使Timer线程死掉, 从而影响后续任务执行
            方式二: ScheduledExecutorService
                public static ScheduledExecutorService newScheduledThreadPool(int corePoolSize): 的到线程池对象
                方法: public ScheduledFuture<?> scheduleAtFixedRate(Runnable command, long initialDelay, long period, TimeUnit unit): 周期调度方法
                特点: 基于线程池, 某个任务的执行情况不会影响其他定时任务的执行
    线程的并发并行和生命周期
        并发:CPU分时轮询的执行线程
        并行:在同一时刻, 同时有多个线程被CPU处理执行
        多线程是并发和并行同时进行
        线程的生命周期:
            线程的状态: 指线程从生到死的过程, 以及中间经历的各种状态及状态转换
 */

public class $1_MultithreadingSummarize {
}
