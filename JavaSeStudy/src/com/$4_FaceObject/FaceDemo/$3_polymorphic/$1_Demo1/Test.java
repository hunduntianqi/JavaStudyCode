package com.$4_FaceObject.FaceDemo.$3_polymorphic.$1_Demo1;

public class Test {
    public static void main(String[] args) {
        Animal d = new Dog();
        d.run();
        System.out.println(d.name);
        // 多态不能调用子类独有功能, 可通过强制类型转换解决
        // d.door();
        Dog d1 = (Dog) d;
        d1.door();
        System.out.println(d1.name);
        System.out.println("------------------");
        Animal t = new Tortoise();
        t.run();
        System.out.println(t.name);
        
        go(d);
        go(t);
    }
    
    /**
     *  定义方法, 所有动物类都可以作为参数传进
     */
    public static void go (Animal a) {
        System.out.println("开始！！");
        a.run();
        System.out.println("结束！！");
    }
}
