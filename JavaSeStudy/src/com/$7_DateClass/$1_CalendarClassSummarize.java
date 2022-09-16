package com.$7_DateClass;

/*
    Calendar类:
        作用:
            代表了系统此刻日期对应的日历对象
        Calendar类是一个抽象类, 不能直接创建对象！！
        Calendar类创建对象方法:
            public static Calendar getInstance():获取当前日历对象
        常用方法:
            1. public int get(int field):取日期中的某个字段信息
            2. public void set(int field, int value):修改日历的某个字段信息
            3. public void add(int field, int amount):为某个字段增加或减少指定的值
            4. public final Date getTime():拿到此刻日期对象
            5. public long getTimeInMillis():拿到此刻时间毫秒值
            注意:
                Calendar是可变日期对象, 一旦修改后其对象本身的时间将产生变化！！
 */


import java.util.Calendar;

public class $1_CalendarClassSummarize {
    public static void main(String[] args) {
        // 创建Calendar对象
        Calendar cl = Calendar.getInstance();
        System.out.println(cl);
        
        // 获取日历的信息
        int year = cl.get(Calendar.YEAR);
        System.out.println(year);
        int month = cl.get(Calendar.MONTH) + 1;
        System.out.println(month);
    }
}
