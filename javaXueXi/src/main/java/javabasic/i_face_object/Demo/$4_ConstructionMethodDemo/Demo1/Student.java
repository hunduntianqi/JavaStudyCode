package javabasic.i_face_object.Demo.$4_ConstructionMethodDemo.Demo1;

public class Student {
    private String name;
    private int age;
    
    // 无参构造
    public Student() {
        System.out.println("无参构造自动调用！！");
    }
    
    // 定义有参构造器
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("有参构造器被调用！！");
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public String getName() {
        return this.name;
    }
    
    public void setAge(int age) {
        this.age = age;
    }
    
    public int getAge() {
        return this.age;
    }
}
