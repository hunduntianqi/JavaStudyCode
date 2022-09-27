package javabasic.l_face_object_advanced.Demo.$6_InterfaceDemo.Demo3;

public interface InterDemo {
    
    // 定义抽象方法
    public abstract void method ();
    
    // 定义默认方法
    public default void show () {
        System.out.println("接口中的默认方法~~~");
    }
}
