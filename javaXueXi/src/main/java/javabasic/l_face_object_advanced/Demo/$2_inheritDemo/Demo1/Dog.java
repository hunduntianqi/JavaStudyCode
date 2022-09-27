package javabasic.l_face_object_advanced.Demo.$2_inheritDemo.Demo1;

public class Dog extends Animal{
    // 定义狗类, 具有看家的行为
    public void lookDoor () {
        System.out.println(super.name + "在看家~~~");
    }
}
