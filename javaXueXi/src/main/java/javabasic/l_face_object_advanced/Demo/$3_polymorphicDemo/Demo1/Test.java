package javabasic.l_face_object_advanced.Demo.$3_polymorphicDemo.Demo1;

public class Test {
    public static void main(String[] args) {
        // 创建一个学生对象
        Person student = new Student();
        student.setName("张佳琪");
        student.setAge(23);
        // 创建一个老师对象
        Person teacher = new Teacher();
        teacher.setName("郭鹏涛");
        teacher.setAge(24);
        // 创建一个管理员对象
        Person administrator = new Administrator();
        administrator.setName("天道");
        administrator.setAge(999999);
        System.out.println(student.toString());
        System.out.println(teacher.toString());;
        System.out.println(administrator.toString());
    }
}
