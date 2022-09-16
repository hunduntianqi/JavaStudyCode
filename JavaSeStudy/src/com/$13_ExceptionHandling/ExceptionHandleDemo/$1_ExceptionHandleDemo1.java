package com.$13_ExceptionHandling.ExceptionHandleDemo;

/*
    需求:
        键盘录入一个合理的价格为止
    分析:
        定义一个死循环, 让用户不断的输入价格
 */

import java.util.Scanner;

public class $1_ExceptionHandleDemo1 {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        while(true) {
            System.out.println("请您输入一个合法的价格:");
            String priceStr = sc.nextLine();
            // 转换成double类型的价格
            try {
                double price = Double.valueOf(priceStr);
                // 判断价格是否大于0
                if (price > 0) {
                    System.out.println("定价:" + price);
                    break;
                } else {
                    System.out.println("你输入的价格有误, 它必须是一个正数~~");
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
