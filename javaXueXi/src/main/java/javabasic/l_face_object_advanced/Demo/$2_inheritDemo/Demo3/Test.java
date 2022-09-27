package javabasic.l_face_object_advanced.Demo.$2_inheritDemo.Demo3;

public class Test {
    public static void main(String[] args) {
        // 创建经理对象
        Manager manager = new Manager(1, "郭经理", 12000, 1000);
        manager.work();
        manager.eat();
        // 创建厨师对象
        Chef chef = new Chef(2, "胖厨师", 8000);
        chef.work();
        chef.eat();
    }
}
