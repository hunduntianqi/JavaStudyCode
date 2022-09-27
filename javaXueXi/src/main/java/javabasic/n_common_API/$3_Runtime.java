package javabasic.n_common_API;
/*
    Runtime:
        表示当前虚拟机的运行环境
        public static Runtime getRuntime (): 获取当前系统的运行环境对象
        public void exit (int status): 停止当前运行的Java虚拟机
        public int availableProcessors(): 获得CPU的线程数
        public long maxMemory(): JVM能从系统中获取的总内存大小(单位是byte)
        public long totalMemory(): JVM已经从系统中获取的总内存大小(单位是byte)
        public long freeMemory(): JVM已剩余内存大小(单位是byte)
        public Process exec (String command): 运行cmd命令
 */

public class $3_Runtime {
    public static void main(String[] args) throws Exception {
        // 获取Runtime对象
        Runtime runtime = Runtime.getRuntime();
        // 获得CPU的线程数
        System.out.println("当前CPU的线程数为:" + runtime.availableProcessors());
        // 获取JVM可以从系统中获取的总内存大小
        System.out.println("JVM可以从系统中获取的总内存大小为:%d MB".formatted(runtime.maxMemory() / 1024 / 1024));
        // 获取JVM已经从系统中获取的总内存大小
        System.out.println("JVM已经从系统中获取的总内存大小为:%d MB".formatted(runtime.totalMemory() / 1024 / 1024));
        // 获取JVM剩余内存大小
        System.out.println("JVM剩余内存大小为:%d MB".formatted(runtime.freeMemory() / 1024 / 1024));
        // 运行cmd命令
        runtime.exec("shutdown -a");
        /*
            shutdown: 关机命令
            shutdown -s: 默认一分钟之后关机
            shutdown -s -t 3600: 指定3600秒之后关机
            shutdown -a: 取消关机操作
            shutdown -r: 关机并重启
         */
        // 停止虚拟机
        runtime.exit(0);
        System.out.println("================");
    }
}
