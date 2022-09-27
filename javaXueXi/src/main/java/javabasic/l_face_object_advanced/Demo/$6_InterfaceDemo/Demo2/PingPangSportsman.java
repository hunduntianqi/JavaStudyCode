package javabasic.l_face_object_advanced.Demo.$6_InterfaceDemo.Demo2;
// 定义乒乓球运动员类, 继承Sportsman类, 实现Speak接口
public class PingPangSportsman extends Sportsman implements Speak{
    public PingPangSportsman() {
    }
    
    public PingPangSportsman(String name, int age) {
        super(name, age);
    }
    
    @Override
    public void speakEnglish() {
        System.out.println("%s作为一名乒乓球运动员, 英语说的贼溜~~".formatted(this.getName()));
    }
    
    @Override
    public void study() {
        System.out.println("%s是一名乒乓球运动员, 要学习打乒乓球！！！".formatted(this.getName()));
    }
}
