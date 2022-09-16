package com.$7_DateClass.NewDateClassDemo;

import java.time.LocalTime;

public class $2_LocalTimeClassDemo {
    /**
     *  学会使用LocalTime类
     */
    public static void main(String[] args) {
        // 获取本地时间对象
        LocalTime nowTime = LocalTime.now();
        System.out.println(nowTime);
        
        int hour = nowTime.getHour(); // 时
        int min = nowTime.getMinute(); // 分
        int sec = nowTime.getSecond(); // 秒
        System.out.println(hour + ":" + min + ":" + sec );
        
        int naSec = nowTime.getNano(); // 纳秒
        System.out.println(naSec);
        
        // 指定时间获取对象
        LocalTime fixTime = LocalTime.of(20, 51, 20);
        System.out.println(fixTime);
    }
}
