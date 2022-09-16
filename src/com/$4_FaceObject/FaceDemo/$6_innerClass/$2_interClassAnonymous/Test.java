package com.$4_FaceObject.FaceDemo.$6_innerClass.$2_interClassAnonymous;

/*
    学习匿名内部类的形式和特点
 */

public class Test {
    public static void main(String[] args) {
        Animal a = new Animal() {
            @Override
            public void run() {
                System.out.println("老虎跑的很快！！");
            }
        };
        a.run();
    }
}

//class Tiger extends Animal {
//    @Override
//    public void run() {
//        System.out.println("老虎跑的很快！！");
//    }
//}

abstract class Animal {
    public abstract void run();
}
