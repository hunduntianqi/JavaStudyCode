package com.$20_OtherKnowledge.Demo.$4_ReflectDemo.$3_GetMemberVariable;

public class Student {
    private String name;
    private int age;
    public static String schoolName;
    public static final String COUNTTRY = "中国";

    public Student() {
        System.out.println("无参数构造器被执行");
    }

    private Student(String name, int age) {
        System.out.println("有参数构造器被执行");
        this.name = name;
        this.age = age;
    }

    // get和set方法
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
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
