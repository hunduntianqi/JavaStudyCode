package com.$7_DateClass.NewDateClassDemo;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class $5_DateTimeFormatterClassDemo {
    public static void main(String[] args) {
        // 创建日期时间对象
        LocalDateTime ldt = LocalDateTime.now();
        System.out.println(ldt);
        
        // 创建格式化对象
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss EEE a");
        // 正向格式化
        System.out.println(dtf.format(ldt));
        // 逆向格式化
        System.out.println(ldt.format(dtf));
        
        // 解析字符串格式
        // 1. 先创建格式化对象
        DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        
        // 2. 解析格式化字符串
        LocalDateTime ldt1 = LocalDateTime.parse("2021-12-15 21:50:30", dtf1);
        System.out.println(ldt1);
    }
}
