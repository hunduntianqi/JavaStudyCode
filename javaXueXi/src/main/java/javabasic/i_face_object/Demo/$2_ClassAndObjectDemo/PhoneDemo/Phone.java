package javabasic.i_face_object.Demo.$2_ClassAndObjectDemo.PhoneDemo;

public class Phone {
    // 定义类的属性
    String brand;
    double price;
    
    // 定义类的成员方法
    public void call () {
        System.out.println(this.brand + "手机可以打电话");
    }
    
    public void playGame () {
        System.out.println(this.brand + "手机可以玩游戏");
    }
}
