package javabasic.l_face_object_advanced.Demo.$2_inheritDemo.Demo1;

public class Animal {
    public String name;
    // 定义动物类, 具有吃饭, 喝水的行为
    public void eat () {
        System.out.println(this.name + "在吃饭~~");
    }
    
    public void drinking () {
        System.out.println(this.name + "在喝水~~");
    }
}
