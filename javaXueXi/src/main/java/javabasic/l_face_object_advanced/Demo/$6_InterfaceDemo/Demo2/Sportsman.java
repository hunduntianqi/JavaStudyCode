package javabasic.l_face_object_advanced.Demo.$6_InterfaceDemo.Demo2;

// 定义运动员类, 继承Person类
public abstract class Sportsman extends Person {
    public Sportsman() {
    }
    
    public Sportsman(String name, int age) {
        super(name, age);
    }
    
    // 定义抽象方法 ==>学习
    public abstract void study();
}
