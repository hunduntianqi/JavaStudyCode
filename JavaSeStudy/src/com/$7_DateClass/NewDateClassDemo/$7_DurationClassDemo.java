package com.$7_DateClass.NewDateClassDemo;

import java.time.Duration;
import java.time.LocalDateTime;

public class $7_DurationClassDemo {
    public static void main(String[] args) {
        // 本地日期时间对象
        LocalDateTime today = LocalDateTime.now();
        System.out.println(today);
        
        // 出生的日期时间对象
        LocalDateTime birthday = LocalDateTime.of(1998, 02, 24,06,00,00);
        System.out.println(birthday);
        
        // 创建Duration对象
        Duration duration = Duration.between(today, birthday);
        System.out.println(duration.toDays()); // 相差天数
        System.out.println(duration.toHours()); // 相差小时数
        System.out.println(duration.toMinutes()); // 相差分钟数
        System.out.println(duration.toSeconds()); // 相差秒数
        System.out.println(duration.toMillis()); // 相差毫秒数
        System.out.println(duration.toNanos()); // 相差纳秒数
    }
}
