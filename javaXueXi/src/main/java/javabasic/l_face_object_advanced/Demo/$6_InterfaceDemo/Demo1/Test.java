package javabasic.l_face_object_advanced.Demo.$6_InterfaceDemo.Demo1;

public class Test {
    public static void main(String[] args) {
        // 创建青蛙对象
        Frog frog = new Frog();
        frog.eat();
        frog.swimming();
        // 创建狗对象
        Dog dog = new Dog();
        dog.eat();
        dog.swimming();
        // 创建兔子对象
        Rabbit rabbit = new Rabbit();
        rabbit.eat();
    }
}
