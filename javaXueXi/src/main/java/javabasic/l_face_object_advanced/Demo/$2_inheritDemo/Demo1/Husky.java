package javabasic.l_face_object_advanced.Demo.$2_inheritDemo.Demo1;

public class Husky extends Dog{
    // 定义哈士奇类, 新增拆家的行为
    public void pushers () {
        System.out.println(super.name + "在拆家！！！");
    }
}
