package javabasic.l_face_object_advanced.Demo.$2_inheritDemo.Demo2;
// 沙皮狗
public class SharPei extends Dog{
    @Override
    public void eat () {
        super.eat();
        System.out.println("狗啃骨头！！");
    }
}
