package com.$7_DateClass;

/*
    Date类概述:
        Date类的对象在Java中代表的是当前所在系统的此刻日期时间
        构造器:
            public Date():创建一个Date对象, 代表的是系统当前此刻的日期时间
            public Date(long time):将时间毫秒值转换成Date日期对象
        常用方法:
            public long getTime():获取时间对象的毫秒值-指从1970-1-1-00:00:00至今
            public void setTIme(long time):设置日期对象的时间为当前时间毫秒值对应的时间
        总结:
            创建日期对象:
                方法1:
                    Date date = new Date();
                方法2:
                    long time = date.getTime();
            时间毫秒值恢复日期对象:
                方法1:
                    Date d = new Date(time);
                方法2:
                    d.setTime(time);
 */

import java.util.Date;

public class $2_DateClassSummarize {
    public static void main(String[] args) {
        Date d = new Date();
        System.out.println(d.getTime());
        
        // 计算当前时间往后走1小时121秒之后的时间是多少
        // 1.得到当前时间毫秒值
        Date d1 = new Date();
        System.out.println(d1);
        
        // 2.当前时间往后走1小时121秒
        long time = System.currentTimeMillis();
        time += (60 * 60 + 121) * 1000;
        
        // 3.将时间毫秒值转换成对应的日期对象
        Date d2 = new Date(time);
        System.out.println(d2);
        
        Date d3 = new Date();
        d3.setTime(time);
        System.out.println(d3);
    }
}
