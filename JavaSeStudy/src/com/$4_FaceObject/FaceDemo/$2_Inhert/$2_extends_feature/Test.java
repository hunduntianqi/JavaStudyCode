package com.$4_FaceObject.FaceDemo.$2_Inhert.$2_extends_feature;

public class Test {
    public static void main(String[] args) {
        Student s1 = new Student();
        System.out.println(s1.age);
        s1.run();
        //  System.out.println(s1.name); // 子类继承父类私有属性, 但无法直接访问
        
        // 子类可以共享父类的静态成员, 但不可以继承父类的静态成员
        System.out.println(Student.onLineNumber);
        Student.inAddr();
    }
}
