package com.$4_FaceObject.FaceDemo.$2_Inhert.$1_constructor.$2_Demo2;

public class Car {
    String name;
    double price;
    
    public Car() {
        //无参数构造器
        System.out.println("这是一个无参构造器~~");
    }
    
    public Car(String name, double price) {
        System.out.println("这是一个带参数构造器~~");
        this.name = name;
        this.price = price;
    }
}
