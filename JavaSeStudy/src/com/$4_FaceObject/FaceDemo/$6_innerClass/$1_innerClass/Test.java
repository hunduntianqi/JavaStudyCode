package com.$4_FaceObject.FaceDemo.$6_innerClass.$1_innerClass;

public class Test {
    public static void main(String[] args) {
        // 创建成员内部类对象
        OuterJavaBean.Inner in = new OuterJavaBean().new Inner();
        System.out.println(in.getName());
        System.out.println(in.getAge());
        
        People.Heart in2 = new People().new Heart();
        in2.show();
    }
}
