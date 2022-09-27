package javabasic.l_face_object_advanced.Demo.$5_AbstractDemo.Demo2;

public class Sheep extends Animal{
    public Sheep() {}
    
    public Sheep (String name, int age) {
        super(name, age);
    }
    
    @Override
    public void eat() {
        System.out.println("一只山羊在吃草~~");
    }
}
