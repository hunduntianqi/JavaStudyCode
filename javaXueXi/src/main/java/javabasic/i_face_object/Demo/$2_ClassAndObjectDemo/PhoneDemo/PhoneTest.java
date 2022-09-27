package javabasic.i_face_object.Demo.$2_ClassAndObjectDemo.PhoneDemo;

public class PhoneTest {
    // Phone测试类
    public static void main(String[] args) {
        // 创建Phone对象
        Phone p1 = new Phone();
        // 访问类的成员变量
        p1.brand = "华为";
        p1.price = 1999.0;
        System.out.println(p1.brand + "手机价格: " + p1.price + "元");
        // 访问类的成员方法
        p1.call();
        p1.playGame();
        
        // 创建第二个Phone对象
        Phone p2 = new Phone();
        p2.brand = "Apple";
        p2.price = 8888;
        System.out.println(p2.brand + "手机价格" + p2.price + "元");
        p2.call();
        p2.playGame();
    }
}
