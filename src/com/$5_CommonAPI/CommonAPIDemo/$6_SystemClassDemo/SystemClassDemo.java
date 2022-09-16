package com.$5_CommonAPI.CommonAPIDemo.$6_SystemClassDemo;


public class SystemClassDemo {
    public static void main(String[] args) {
        System.out.println("程序开始...");
        // System.exit(0); // 终止JVM的运行
        // 获取当前时间的毫秒值:从1970年1月1日00:00:00开始到当前时间
        long time = System.currentTimeMillis();
        System.out.println(time);
        
        long startTime = System.currentTimeMillis();
        for (int i = 0; i <= 100000; i++) {
            System.out.println(i + "次");
        }
        long endTime = System.currentTimeMillis();
        System.out.println((endTime - startTime) / 1000.0 + "s");
        System.out.println("程序结束...");
    }
}
