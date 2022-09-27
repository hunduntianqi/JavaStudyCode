package javabasic.l_face_object_advanced.Demo.$5_AbstractDemo.Demo1;

public class Test {
    public static void main(String[] args) {
//        Person person = new Person(); // 抽象类不能实例化
        // 创建子类对象
        Student student = new Student("张三", 24);
        student.work();
        System.out.println(student.getName() + student.getAge());
    }
}
