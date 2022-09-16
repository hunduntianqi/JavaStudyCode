package com.$7_DateClass.NewDateClassDemo;

import java.time.LocalDate;
import java.time.Period;

public class $6_PeriodClassDemo {
    public static void main(String[] args) {
        // 获取当前本地日期对象
        LocalDate toDay = LocalDate.now();
        System.out.println(toDay);
        
        // 以生日的年月日创建日期对象
        LocalDate birthDay = LocalDate.of(1998, 02, 24);
        System.out.println(birthDay);
        
        // 比较两个日期对象间隔
        Period pi = Period.between(toDay, birthDay);
        System.out.println(pi.getYears());
        System.out.println(pi.getMonths());
        System.out.println(pi.getDays());
    }
}
