package javabasic.l_face_object_advanced.Demo.$6_InterfaceDemo.Demo2;
// 定义乒乓球教练类, 继承Coach类, 实现Speak接口
public class PingPangCoach extends Coach implements Speak{
    public PingPangCoach() {
    }
    
    public PingPangCoach(String name, int age) {
        super(name, age);
    }
    
    @Override
    public void teach() {
        System.out.println(this.getName() + "作为一名乒乓球教练, 要教乒乓球运动员打乒乓球~~");
    }
    
    @Override
    public void speakEnglish() {
        System.out.println(this.getName() + "作为一名乒乓球教练, 需要出国交流, 学会了说一口流利的英语！！");
    }
}
