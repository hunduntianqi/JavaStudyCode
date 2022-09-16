package com.$4_FaceObject.FaceDemo.$2_Inhert.$1_constructor.$2_Demo2;

public class Test {
    public static void main(String[] args) {
        // 使用无参构造创建对象
        Car c1 = new Car();
        System.out.println(c1.name);
        System.out.println(c1.price);
        
        // 使用有参构造创建对象
        Car c2 = new Car("大众", 23);
        System.out.println(c2.name);
        System.out.println(c2.price);
    }
}
