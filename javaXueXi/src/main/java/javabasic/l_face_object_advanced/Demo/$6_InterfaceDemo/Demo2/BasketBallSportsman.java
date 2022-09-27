package javabasic.l_face_object_advanced.Demo.$6_InterfaceDemo.Demo2;
// 定义篮球运动员类, 继承Sportsman类
public class BasketBallSportsman extends Sportsman{
    
    public BasketBallSportsman() {
    }
    
    public BasketBallSportsman(String name, int age) {
        super(name, age);
    }
    
    @Override
    public void study() {
        System.out.println("%s是一名篮球运动员, 要学习打篮球~~".formatted(this.getName()));
    }
}
