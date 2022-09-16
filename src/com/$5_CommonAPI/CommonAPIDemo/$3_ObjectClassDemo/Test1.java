package com.$5_CommonAPI.CommonAPIDemo.$3_ObjectClassDemo;

/*
    掌握Object类中toString方法的使用
*/

public class Test1 {
    public static void main(String[] args) {
        Student s = new Student("郭鹏涛", '男', 23);
        System.out.println(s.toString());
        // 直接输出对象变量s , toString可以省略不写
        System.out.println(s);
    }
}

