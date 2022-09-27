package javabasic.l_face_object_advanced.Demo.$2_inheritDemo.Demo1;

public class Cat extends Animal{
    // 定义猫类, 继承Animal类, 并具有抓老鼠的行为
    public void grabMouse () {
        System.out.println(super.name + "在抓老鼠~~");
    }
}
