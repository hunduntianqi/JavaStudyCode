package javabasic.l_face_object_advanced.Demo.$1_staticDemo.Demo4;

public class Test {
    public static void main(String[] args) {
        Student.teacherName = "阿伟老师"; // 为静态变量赋值
        
        Student s1 = new Student();
        s1.name = "张三";
        s1.age = 23;
        System.out.println("s1: %s".formatted(s1));
        s1.show1();
        
        Student s2 = new Student();
        s2.name = "李四";
        s2.age = 24;
        System.out.println("s2: %s".formatted(s2));
        s2.show1();
    }
}
