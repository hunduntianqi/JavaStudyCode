package com.$20_OtherKnowledge.Demo.$4_ReflectDemo.$5_ReflectDemo;

public class Teacher {
    private String name;
    private char sex;
    private double salary;

    public Teacher(String name, char sex, double salary) {
        this.name = name;
        this.sex = sex;
        this.salary = salary;
    }

    public Teacher() {
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

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "name='" + name + '\'' +
                ", sex=" + sex +
                ", salary=" + salary +
                '}';
    }
}
