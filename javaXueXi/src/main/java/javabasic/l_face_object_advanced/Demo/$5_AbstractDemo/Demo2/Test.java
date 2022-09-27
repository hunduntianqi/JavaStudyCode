package javabasic.l_face_object_advanced.Demo.$5_AbstractDemo.Demo2;

public class Test {
    public static void main(String[] args) {
        // 创建青蛙对象
        Animal frog = new Frog("青蛙", 2);
        frog.drinking();
        frog.eat();
        // 创建狗对象
        Animal dog = new Dog("狗", 5);
        dog.drinking();
        dog.eat();
        // 创建山羊对象
        Animal sheep = new Sheep("山羊", 3);
        sheep.drinking();
        sheep.eat();
    }
}
