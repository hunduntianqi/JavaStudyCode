package javabasic.l_face_object_advanced.Demo.$6_InterfaceDemo.Demo1;

public abstract class Animal {
    private String name;
    private int age;
    
    public Animal () {}
    
    public Animal (String name, int age) {
        this.name = name;
        this.age = age;
    }
    
    // 创建抽象方法==>eat
    public abstract void eat ();
    
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
    
    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
