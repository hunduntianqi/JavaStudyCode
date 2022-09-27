package javabasic.l_face_object_advanced.Demo.$2_inheritDemo.Demo1;

public class Test {
    public static void main(String[] args) {
        // 创建猫对象
        PuppetCat puppetCat = new PuppetCat();
        puppetCat.name = "布偶猫";
        puppetCat.eat();
        puppetCat.drinking();
        puppetCat.grabMouse();
        
        ChineseLiHuaCat chineseCat = new ChineseLiHuaCat();
        chineseCat.name = "中国狸花猫";
        chineseCat.eat();
        chineseCat.drinking();
        chineseCat.grabMouse();
        
        // 创建哈士奇对象
        Husky husky = new Husky();
        husky.name = "二哈";
        husky.eat();
        husky.drinking();
        husky.pushers();
        husky.lookDoor();
        
        // 创建泰迪对象
        Teddy teddy = new Teddy();
        teddy.name = "迪迪";
        teddy.eat();
        teddy.drinking();
        teddy.lookDoor();
        teddy.rub();
    }
}
