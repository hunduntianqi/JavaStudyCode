package com.$20_OtherKnowledge.Demo.$4_ReflectDemo.$5_ReflectDemo;

/*
    目标: 提供一个通用框架, 支持提供所有对象的基本信息
 */

import java.lang.reflect.Method;
import java.util.ArrayList;

public class ReflectDemo2 {
    /**
     *  需求: 给你一个任意的对象, 在不清除对象字段的情况下, 可以把对象的字段名称和对应的值存储到文件中去
     *  分析:
     *      1. 定义一个方法, 可以接受任意类型的对象
     *      2. 每次收到一个对象后, 需要解析这个对象的全部的成员变量名称
     *      3. 这个对象可能是任意的, 需要利用反射获取对象全部的成员变量名称
     */
    public static void main(String[] args) {
        Student s = new Student();
        s.setName("猪八戒");
        s.setAge(1000);
        s.setClassName("西天跑路1班");
        s.setHobby("吃, 睡");
        s.setSex('男');
        MybatisUtil.save(s);

        Teacher t = new Teacher();
        t.setName("波仔");
        t.setSex('男');
        t.setSalary(6000);
        MybatisUtil.save(t);
    }
}
