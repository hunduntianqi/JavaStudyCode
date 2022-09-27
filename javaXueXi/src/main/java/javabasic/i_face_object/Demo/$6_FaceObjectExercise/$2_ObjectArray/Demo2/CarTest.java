package javabasic.i_face_object.Demo.$6_FaceObjectExercise.$2_ObjectArray.Demo2;

/*
    定义数组存储三个汽车对象
        汽车的属性: 品牌, 价格, 颜色
        要求: 创建三个汽车对象, 数据通过键盘录入而来, 并把数据存入数组
 */

import java.util.Scanner;

public class CarTest {
    public static void main(String[] args) {
        // 创建Scanner对象
        Scanner sc = new Scanner(System.in);
        // 动态初始化定义数组
        Car[] array = new Car[3];
        for (int i = 0; i < 3; i++) {
            Car car = new Car();
            System.out.printf("请输入第%d个汽车的品牌\n", i + 1);
            car.setBrand(sc.next());
            System.out.printf("请输入第%d个汽车的价格\n", i + 1);
            car.setPrice(sc.nextInt());
            System.out.printf("请输入第%d个汽车的颜色\n", i + 1);
            car.setColor(sc.next());
            // 对象添加数组
            array[i] = car;
        }
    
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
