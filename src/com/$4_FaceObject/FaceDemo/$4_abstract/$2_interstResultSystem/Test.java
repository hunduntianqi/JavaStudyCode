package com.$4_FaceObject.FaceDemo.$4_abstract.$2_interstResultSystem;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入您的用户名:");
        String loginName = sc.next();
        System.out.println("请输入您的密码:");
        String passWord = sc.next();
        
        // 创建活期账户对象
        CurrentAccount ca = new CurrentAccount();
        ca.setMoney(10000);
        ca.handle(loginName,passWord);
        
        // 创建定期账户对象
        FixedAccount fa = new FixedAccount();
        fa.setMoney(10000);
        fa.handle(loginName, passWord);
    }
}
