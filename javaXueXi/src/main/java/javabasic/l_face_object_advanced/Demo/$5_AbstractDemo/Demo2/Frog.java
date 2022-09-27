package javabasic.l_face_object_advanced.Demo.$5_AbstractDemo.Demo2;

public class Frog extends Animal{
    public Frog() {}
    
    public Frog (String name, int age) {
        super(name, age);
    }
    @Override
    public void eat() {
        System.out.println("青蛙在吃虫子！！");
    }
}
