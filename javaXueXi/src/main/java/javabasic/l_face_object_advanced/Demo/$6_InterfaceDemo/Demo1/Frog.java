package javabasic.l_face_object_advanced.Demo.$6_InterfaceDemo.Demo1;

// 定义青蛙类, 继承Animal类, 实现Swimming接口
public class Frog extends Animal implements Swimming{
    public Frog() {
    }
    
    public Frog(String name, int age) {
        super(name, age);
    }
    
    // 重写父类抽象方法eat
    @Override
    public void eat() {
        System.out.println("青蛙吃虫子~~");
    }
    
    // 重写接口抽象方法swimming
    @Override
    public void swimming() {
        System.out.println("青蛙可以蛙泳~~");
    }
}
