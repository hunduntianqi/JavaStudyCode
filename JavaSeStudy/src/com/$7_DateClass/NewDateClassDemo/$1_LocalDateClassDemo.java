package com.$7_DateClass.NewDateClassDemo;

import java.time.LocalDate;
import java.time.Month;

public class $1_LocalDateClassDemo {
    /**
     *  学会使用LocalDate类
     */
    public static void main(String[] args) {
        // 获取本地日期对象
        LocalDate nowDate = LocalDate.now();
        System.out.println(nowDate);
        
        // 获取年数
        int year = nowDate.getYear();
        System.out.println("year:" + year);
        // 获取月份数
        Month month1 = nowDate.getMonth();
        System.out.println(month1);
        
        int month = nowDate.getMonthValue();
        System.out.println("month:" + month);
        
        // 获取当前是本月第几天
        int dayMonth = nowDate.getDayOfMonth();
        System.out.println("dayMonth:" + dayMonth);
        // 获取当前是今年第几天
        int dayYear = nowDate.getDayOfYear();
        System.out.println("dayYear:" + dayYear);
        
        // 今年第几周
        System.out.println(nowDate.getDayOfWeek());
        System.out.println(nowDate.getDayOfWeek().getValue());
        
        System.out.println("----------------------------------");
        // 指定时间创建对象
        LocalDate fixDate = LocalDate.of(1998, 02, 24);
        System.out.println(fixDate);
        System.out.println(LocalDate.of(1998, Month.FEBRUARY, 24));
        System.out.println("------------------------");
    }
}
