package javabasic.l_face_object_advanced.Demo.$6_InterfaceDemo.Demo2;

public class Test {
    public static void main(String[] args) {
        // 创建乒乓球类对象
        PingPangSportsman pingPangSportsman = new PingPangSportsman("张继科", 30);
        pingPangSportsman.study();
        pingPangSportsman.speakEnglish();
        // 创建篮球运动员对象
        BasketBallSportsman basketBallSportsman = new BasketBallSportsman("刘玉栋", 28);
        basketBallSportsman.study();
        // 创建乒乓球教练对象
        PingPangCoach pingPangCoach = new PingPangCoach("刘国梁", 45);
        pingPangCoach.teach();
        pingPangCoach.speakEnglish();
        // 创建篮球教练对象
        BasketBallCoach basketBallCoach = new BasketBallCoach("姚明", 40);
        basketBallCoach.teach();
    }
}
