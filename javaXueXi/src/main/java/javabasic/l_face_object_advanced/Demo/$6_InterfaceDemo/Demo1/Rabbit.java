package javabasic.l_face_object_advanced.Demo.$6_InterfaceDemo.Demo1;
// 定义兔子类, 继承Animal类
public class Rabbit extends Animal{
    public Rabbit() {
    }
    
    public Rabbit(String name, int age) {
        super(name, age);
    }
    
    // 重写父类抽象方法
    public void eat () {
        System.out.println("兔子吃胡萝卜~~");
    }
}
