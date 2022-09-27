package javabasic.l_face_object_advanced.Demo.$5_AbstractDemo.Demo1;

public abstract class Person {
    private String name;
    private int age;
    
    public Person () {}
    
    public Person (String name, int age) {
        this.name = name;
        this.age = age;
    }
    
    // 定义抽象方法
    public abstract void work();
    
    public void sleep () {
        System.out.println("睡觉了~~");
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
}
