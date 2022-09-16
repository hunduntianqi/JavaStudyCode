package com.$5_CommonAPI.CommonAPIDemo.$3_ObjectClassDemo;
/*
    掌握equals()方法的使用
 */
public class Test2 {
    public static void main(String[] args) {
        Student s1 = new Student("郭鹏涛", '男', 23);
        Student s2 = new Student("陶静", '女', 23);
        System.out.println(s1.toString());
        System.out.println(s2.toString());
        System.out.println(s1.equals(s2));
    }
}
