package javabasic.l_face_object_advanced.Demo.$1_staticDemo.Demo1;

public class Student {
    public static String teacherName;
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
    
    // 定义成员方法
    public void study() {
        System.out.println(this.name + "在认真的学习！！");
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
    public String toString() {
        return "Student{" +
                "name='" + this.name + '\'' +
                ", age=" + this.age +
                ", sex=" + this.sex +
                ", teacherName=" + Student.teacherName +
                '}';
    }
}
