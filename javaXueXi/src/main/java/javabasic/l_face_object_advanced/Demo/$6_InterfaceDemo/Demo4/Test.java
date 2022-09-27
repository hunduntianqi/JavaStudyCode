package javabasic.l_face_object_advanced.Demo.$6_InterfaceDemo.Demo4;

public class Test {
    public static void main(String[] args) {
        // 调用接口中的静态方法
        Inter.show();
        // 调用实现类中重写的方法
        ImplementsInter ii = new ImplementsInter();
        ii.method();
    }
}
