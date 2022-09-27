package javabasic.l_face_object_advanced.Demo.$5_AbstractDemo.Demo2;

public abstract class Animal {
    private String name;
    private int age;
    
    public Animal () {}
    
    public Animal (String name, int age) {
        this.name = name;
        this.age = age;
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
    
    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
    
    // 动物的行为, 吃xxx和喝水
    public void drinking () {
        System.out.println(this.name + "在喝水~~");
    }
    
    // 定义抽象方法, 吃xxx
    public abstract void eat();
}
