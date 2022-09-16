package com.$4_FaceObject.FaceDemo.$3_polymorphic.$1_Demo1;


public class Dog extends Animal {
    public String name = "子类狗";
    
    @Override
    public void run() {
        System.out.println("狗跑的贼溜~~");
    }
    
    // 独有功能
    public void door() {
        System.out.println("狗在看门！！");
    }
}
