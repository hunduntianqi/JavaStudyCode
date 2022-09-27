package javabasic.l_face_object_advanced.Demo.$3_polymorphicDemo.Demo2;

public class Test {
    public static void main(String[] args) {
        // 多态创建狗对象
        Animal dog = new Dog();
        System.out.println("name:%s".formatted(dog.name)); // name:动物 ==> 变量调用编译和运行都看左边父类
        dog.show(); // Dog ----show方法 ==> 方法调用编译看左边, 运行看右边
        // 多态创建猫对象
        Animal cat = new Cat();
        System.out.println("name:%s".formatted(cat.name));
        cat.show();
    }
}

class Animal {
    String name = "动物";
    public void show() {
        System.out.println("Animal ----show方法");
    }
}

class Dog extends Animal{
    String name = "狗";
    @Override
    public void show() {
        System.out.println("Dog ----show方法");
    }
}

class Cat extends Animal{
    String name = "猫";
    @Override
    public void show() {
        System.out.println("Cat ----show方法");
    }
}
