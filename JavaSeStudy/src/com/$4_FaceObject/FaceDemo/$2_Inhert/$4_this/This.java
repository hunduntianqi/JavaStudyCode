package com.$4_FaceObject.FaceDemo.$2_Inhert.$4_this;

public class This {
    public static void main(String[] args) {
        Student s1 = new Student("郭鹏涛", "伊川县实验高中");
        System.out.println(s1.getName());
        System.out.println(s1.getSchoolName());
    
        Student s2 = new Student("张佳琪");
        System.out.println(s2.getName());
        System.out.println(s2.getSchoolName());
    }
}
