package javabasic.l_face_object_advanced.Demo.$1_staticDemo.Demo3;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();
        list.add(new Student("郭鹏涛", 24, '男'));
        list.add(new Student("张佳琪", 23, '女'));
        list.add(new Student("郭鹏强", 21, '男'));
        // 调用工具类方法, 获取最大学生的年龄
        int maxAge = Util.getMaxAge(list);
        String str = "最大学生的年龄为%d岁".formatted(maxAge);
        System.out.println(str);
    }
}
