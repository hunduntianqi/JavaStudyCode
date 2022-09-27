package javabasic.l_face_object_advanced.Demo.$6_InterfaceDemo.Demo2;
// 定义教练类, 继承Person类
public abstract class Coach extends Person{
    public Coach() {
    }
    
    public Coach(String name, int age) {
        super(name, age);
    }
    
    // 定义抽象方法 ==》 教东西
    public abstract void teach ();
}
