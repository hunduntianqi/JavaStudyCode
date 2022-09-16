package com.$8_Regex;

import java.util.Scanner;

public class $4_RegexDemo3 {
    public static void main(String[] args) {
        // 目标:校验手机号码 邮箱 电话号码
//        checkPhone();
//        checkemali();
        checkTel();
    }
    
    public static void checkPhone() {
        Scanner sc = new Scanner(System.in);
        while (true){
            System.out.println("请输入您的注册手机号:");
            String iphone = sc.next();
            if (iphone.matches("1[3-9]\\d{9}")) {
                System.out.println("手机号码格式正确, 注册完成！");
                break;
            } else {
                System.out.println("您输入的手机号格式有误, 请重新输入！！");
            }
        }
    }
    
    public static void checkemali() {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("请输入您的注册邮箱:");
            String email = sc.next();
            if (email.matches("\\w{1,30}@[a-zA-Z0-9]{2,20}(\\.[a-zA-Z0-9]{2,20}){1,2}")) {
                System.out.println("邮箱格式正确, 注册成功！");
                break;
            } else {
                System.out.println("您输入的邮箱格式有误, 请重新输入！");
            }
            
        }
    }
    
    public static void checkTel() {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("请输入您的电话号码:");
            String tel = sc.next();
            if (tel.matches("0\\d{2,6}-?\\d{5,20}")) {
                System.out.println("格式正确, 注册成功！！");
                break;
            } else {
                System.out.println("格式有误, 请重新输入！！");
            }
        }
    }
}
