package com.$5_CommonAPI.CommonAPIDemo.$1_StringDemo;

/*
    需求:
        手机号码屏蔽
        以字符串的形式从键盘接收一个手机号, 将中间四位号码屏蔽
 */

import java.util.Scanner;

public class $1_IphoneNum {
    public static void main(String[] args) {
        // 创建Scanner对象
        Scanner sc = new Scanner(System.in);
    
        // 创建字符串对象接收号码
        System.out.println("请输入您的手机号码:");
        String iPhoneNum = sc.next();
        // 调用方法屏蔽手机号中间4位
        String before = iPhoneNum.substring(0, 3);
        String end = iPhoneNum.substring(7);
        String ipone = before + "****" + end;
        System.out.println("手机号码屏蔽后的结果为:" + ipone);
    }
}
