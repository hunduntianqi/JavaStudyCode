package javabasic.l_face_object_advanced.Demo.$1_staticDemo.Demo4;

/*
    静态方法中没有this关键字
    静态方法, 只能访问静态
    非静态方法可以访问所有
 */

public class Student {
    String name;
    int age;
    static String teacherName;
    
    // 实例方法默认有一个this关键字的参数
    public void show1 (Student this) {
        System.out.println("this: %s".formatted(this));
        System.out.println("%s, %d, %s".formatted(name, age, teacherName));
    }
    
    public static void method () {
        System.out.println("静态方法!!");
    }
}
