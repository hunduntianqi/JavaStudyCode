package javabasic.l_face_object_advanced.Demo.$2_inheritDemo.Demo2;

public class Test {
    public static void main(String[] args) {
        // 创建哈士奇对象
        Husky husky = new Husky();
        husky.eat();
        husky.drinking();
        husky.lookDoor();
        husky.pushers();
        // 创建沙皮狗对象
        SharPei sharpei = new SharPei();
        sharpei.eat();
        sharpei.drinking();
        sharpei.lookDoor();
        // 创建中华田园犬对象
        ChineseRuralDog ruralDog = new ChineseRuralDog();
        ruralDog.eat();
        ruralDog.drinking();
        ruralDog.lookDoor();
    }
}
