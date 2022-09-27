package javabasic.l_face_object_advanced.Demo.$5_AbstractDemo.Demo2;

public class Dog extends Animal{
    public Dog() {}
    
    public Dog(String name, int age) {
        super(name, age);
    }
    
    @Override
    public void eat() {
        System.out.println("狗吃骨头~~");
    }
}
