package com.$20_OtherKnowledge.Demo.$4_ReflectDemo.$2_GetConstructor;

public class Student {
    private String name;
    private int age;

    // 无参数构造器
    private Student() {
        System.out.println("无参数构造器执行");
    }

    // 有参数构造器
    public Student(String name, int age) {
        System.out.println("有参数构造器被执行");
        this.name = name;
        this.age = age;
    }

    // get / set 方法
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }


    // 重写toString方法
    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
