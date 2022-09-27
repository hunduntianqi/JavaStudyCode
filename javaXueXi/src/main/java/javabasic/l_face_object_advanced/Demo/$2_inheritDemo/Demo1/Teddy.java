package javabasic.l_face_object_advanced.Demo.$2_inheritDemo.Demo1;

public class Teddy extends Dog{
    // 定义泰迪类, 继承狗类, 并有蹭一蹭的行为
    public void rub () {
        System.out.println(super.name + "蹭了你一下~~");
    }
}
