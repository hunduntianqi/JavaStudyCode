package javabasic.l_face_object_advanced.Demo.$1_staticDemo.Demo1;

public class Test {
    public static void main(String[] args) {
        // 1. 创建第一个学生对象
        Student student1 = new Student();
        student1.setName("张三");
        student1.setAge(23);
        student1.setSex('男');
        student1.study();
        Student.teacherName = "阿玮老师";
        System.out.println(student1.toString());;
        
        // 2. 创建第二个学生对象
        Student student2 = new Student();
        student2.setName("李四");
        student2.setAge(23);
        student2.setSex('女');
        student2.study();
        System.out.println(student2);
    }
}
