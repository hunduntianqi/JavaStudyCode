package com.$11_Gather.GatherDemo.$3_SetGatherDemo;

import java.util.HashSet;
import java.util.Set;

public class $1_HashSetGatherDemo {
    /**
     *  需求:
     *      创建一个存储学生对象的集合, 存储多个学生对象, 实用程序实现在控制台遍历该集合
     *      要求:学生对象的 成员变量值相同, 就认为是同一个对象
     *  分析:
     *      1. 定义学生类, 创建HashSet集合对象, 创建学生对象
     *      2. 把学生添加到集合
     *      3. 在学生类中重写两个方法:hashCode()和equals(), 自动生成即可
     *      4. 遍历集合:增强for
     */

    public static void main(String[] args) {
        Set<Student> sets = new HashSet<>();
        Student s1 = new Student("无恙", 20, '男');
        Student s2 = new Student("无恙", 20, '男');
        Student s3 = new Student("周雄", 21, '男');
        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());
        System.out.println(s3.hashCode());
        // 添加元素到集合中
        sets.add(s1);
        sets.add(s2);
        sets.add(s3);

        System.out.println(sets);

        // 遍历集合:增强for
        for (Student set : sets) {
            System.out.println(set);
        }
    }
}
