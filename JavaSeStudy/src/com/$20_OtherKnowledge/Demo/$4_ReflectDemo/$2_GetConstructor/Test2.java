package com.$20_OtherKnowledge.Demo.$4_ReflectDemo.$2_GetConstructor;

/*
    目标:
        通过反射获取的构造器创建对象
 */

import org.junit.Test;

import java.lang.reflect.Constructor;

public class Test2 {
    @Test
    /* 4. getDeclaredConstructor(): 获取单个构造器 */
    public void getDeclaredConstructor() throws Exception {
        // 1. 获取类对象
        Class c = Student.class;
        // 2. 提取类中的某个构造器(按照参数类别与参数个数定位, 且无法获取构造器时会报错)
        Constructor constructor = c.getDeclaredConstructor();
        System.out.println(constructor.getName() + "===>" + constructor.getParameterCount());
        // 创建对象
        // 如果构造器为私有构造器, 需要进行暴力反射
        constructor.setAccessible(true); // 暴力反射打开权限, 会破坏封装性
        Student student = (Student) constructor.newInstance();
        student.setName("郭鹏涛");
        student.setAge(24);
        System.out.println("名字:" + student.getName() + "\n年龄:" + student.getAge());

        // 定位有参构造器
        Constructor c2 = c.getConstructor(String.class, int.class);
        System.out.println(c2.getName() + "===>" + c2.getParameterCount());
        // 使用有参构造器创建对象
        Student s = (Student) c2.newInstance("陈欣妮", 24);
        System.out.println("名字:" + s.getName() + "\n年龄:" + s.getAge());
    }
}
