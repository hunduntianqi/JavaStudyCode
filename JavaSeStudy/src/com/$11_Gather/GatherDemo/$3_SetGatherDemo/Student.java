package com.$11_Gather.GatherDemo.$3_SetGatherDemo;

import java.util.Objects;

public class Student implements Comparable<Student>{
    private String name;
    private int age;
    private char sex;

    public Student() {
    }

    public Student(String name, int age, char sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

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

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student)) return false;
        Student Student = (Student) o;
        return age == Student.age && sex == Student.sex && Objects.equals(name, Student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, sex);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sex=" + sex +
                '}';
    }

    // 重写Comparable接口compareTo方法定义比较规则
    @Override
    public int compareTo(Student o) {
        // 按照年龄进行比较
        return this.age - o.age >= 0 ? 1: -1;
    }
}
