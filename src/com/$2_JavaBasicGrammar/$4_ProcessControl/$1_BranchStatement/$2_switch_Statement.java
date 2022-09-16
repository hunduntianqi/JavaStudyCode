package com.$2_JavaBasicGrammar.$4_ProcessControl.$1_BranchStatement;

/*
    switch语句:
        根据表达式的值,与每个case进行比较, 执行相对应的case语句体
        格式:
            switch(表达式) {
                case 1:
                    语句体1;
                    break;
                case 2:
                    语句体2;
                    break;
                case 3:
                    语句体3;
                    break;
                .....

                default:
                    语句体n+1;
                    break;
            }
      switch语句执行流程:
        1. 首先计算出表达式的值
        2 其次, 和case依次比较, 一旦有对应的值, 就会执行相应的语句, 在执行的过程中, 遇到break就会结束
        3 最后, 如果所有的case都和表达式的值不匹配, 就会执行default语句体部分, 然后程序结束
 */

import java.util.Scanner;

public class $2_switch_Statement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入相应月份:");
        String month = sc.next();
        switch (month) {
            case "一月":
            case "二月":
            case "三月":
                System.out.println("春天来了！！");
                break;
            case "四月":
            case "五月":
            case "六月":
                System.out.println("夏天好热");
                break;
            case "七月":
            case "八月":
            case "九月":
                System.out.println("秋天天气转凉了");
                break;
            case "十月":
            case "十一月":
            case "十二月":
                System.out.println("冬天好冷啊！！");
                break;
            default:
                System.out.println("您输入的月份有误, 一年只有十二个月哦~~");
        }
    }
}
