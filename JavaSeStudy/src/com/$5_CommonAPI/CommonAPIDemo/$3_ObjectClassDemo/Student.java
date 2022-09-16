package com.$5_CommonAPI.CommonAPIDemo.$3_ObjectClassDemo;

import java.util.Objects;

public class Student {
    private String name;
    private char sex;
    private int age;
    
    public Student() {
    
    }
    
    public Student(String name, char sex, int age) {
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
    
    public char getSex() {
        return sex;
    }
    
    public void setSex(char sex) {
        this.sex = sex;
    }
    
    public int getAge() {
        return age;
    }
    
    public void setAge(int age) {
        this.age = age;
    }

//    @Override
//    public String toString() {
//        return "Studen {name=" + name + ", sex=" + sex +
//                ", age=" + age + "}";
//    }
    
    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", sex=" + sex +
                ", age=" + age +
                '}';
    }
    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student)) return false;
        Student student = (Student) o;
        return sex == student.sex && age == student.age && Objects.equals(name, student.name);
    }
}