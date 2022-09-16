package com.$20_OtherKnowledge.Demo.$4_ReflectDemo.$1_GetClass;

/*
    目标:
        反射的第一步: 获取class对象
        三种方式:
            1. Class c1 = Class.forName('包名+类名');
            2. Class c2 = 类名.class;
            3. Class c3 = 对象.getClass();
 */

public class Test {
    public static void main(String[] args) throws Exception {
        // 1. 调用Class类中的静态方法: forName(全限名 >> 包名+类名)
        Class c1 = Class.forName("com.JavaGrammar.Jan_09_OtherKnowledge.ReflectSummarize.ReflectTest.Test1.Student");
        System.out.println(c1);  // Student.class
        // 2. 通过类名.class获取class文件对象
        Class c2 = Student.class;
        System.out.println(c2);
        // 3. 通过对象.getClass()方法获取对象对应类的class对象
        Student student = new Student();
        Class c3 = student.getClass();
        System.out.println(c3);
    }
}
