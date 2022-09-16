package com.$7_DateClass.NewDateClassDemo;

import java.time.Instant;
import java.time.ZoneId;
import java.util.Date;

public class $4_InstantClassDemo {
    public static void main(String[] args) {
        // 创建时间戳对象
        Instant instant = Instant.now();
        System.out.println(instant);
        
        // 系统此刻时间戳
        Instant instant1 = Instant.now();
        System.out.println(instant1.atZone(ZoneId.systemDefault())); // 转换为系统默认时间戳
        
        // Instant对象转换为Date对象
        Date date = Date.from(instant);
        System.out.println(date);
        
        // Date对象转换为Instant对象
        Instant instan3 = date.toInstant();
        System.out.println(instan3);
    }
}
