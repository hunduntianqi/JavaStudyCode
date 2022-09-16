package com.$5_CommonAPI.CommonAPIDemo.$1_StringDemo;

/*
    模拟用户登录
 */

import java.util.Scanner;

public class $2_UserLogin {
    public static void main(String[] args) {
        // 1.定义正确的登录名和密码
        String username = "15138706802";
        String password = "2251789949gpt";
        // 2.定义循环, 循环三次让用户登录
        // 创建Scanner对象
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            System.out.println("请输入您的登录名称:");
            String name = sc.next();
            System.out.println("请输入您的密码:");
            String pw = sc.next();
            if (name.equals(username)) {
                if (pw.equals(password)) {
                    System.out.println("恭喜您登录成功！！");
                    break;
                } else {
                    System.out.println("您输入的密码有误, 请重新输入！！");
                }
            } else {
                if (i == 2) {
                    System.out.println("您已经连续三次输入不成功, 请稍后再试....");
                } else {
                    System.out.println("您输入的用户有误!!");
                }
                
            }
        }
    }
}
