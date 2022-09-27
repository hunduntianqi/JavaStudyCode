package javabasic.l_face_object_advanced.Demo.$6_InterfaceDemo.Demo2;
// 定义篮球教练类, 继承Coach类
public class BasketBallCoach extends Coach{
    
    public BasketBallCoach() {
    }
    
    public BasketBallCoach(String name, int age) {
        super(name, age);
    }
    
    @Override
    public void teach() {
        System.out.println("%s是一名篮球教练, 要教篮球运动员打篮球！！".formatted(this.getName()));
    }
}
