package com.$7_DateClass.NewDateClassDemo;

import java.time.LocalDateTime;

public class $3_LocalDateTimeClassDemo {
    public static void main(String[] args) {
        // 获取本地日期时间对象
        LocalDateTime now = LocalDateTime.now();
        System.out.println("今天是:" + now);
        System.out.println(now.getYear());
        System.out.println(now.getMonth());
        System.out.println(now.getDayOfMonth());
        System.out.println(now.getHour());
        System.out.println(now.getMinute());
        System.out.println(now.getSecond());
        System.out.println(now.getNano());
        
        // LocalDateTime转换成LocalDate对象:
        System.out.println(now.toLocalDate());
        
        // LocalDateTime转换成LocalTime对象
        System.out.println(now.toLocalTime());
    }
}
