package com.$4_FaceObject.FaceDemo.$3_polymorphic.$1_Demo1;


public class Tortoise extends Animal {
    public String tortoise = "子类乌龟";
    
    @Override
    public void run() {
        System.out.println("乌龟根本跑不了！！");
    }
    
    // 独有功能
    public void layEggs() {
        System.out.println("乌龟在下蛋~~");
    }
}
