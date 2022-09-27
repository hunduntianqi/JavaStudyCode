package javabasic.l_face_object_advanced.Demo.$6_InterfaceDemo.Demo1;
// 定义Dog类, 继承Animal类, 实现 Swimming 接口
public class Dog extends Animal implements Swimming{
    public Dog() {
    }
    
    public Dog(String name, int age) {
        super(name, age);
    }
    
    // 重写父类eat方法
    @Override
    public void eat() {
        System.out.println("狗吃骨头~~");
    }
    
    // 重写接口抽象方法
    @Override
    public void swimming() {
        System.out.println("狗可以狗刨~~");
    }
}
