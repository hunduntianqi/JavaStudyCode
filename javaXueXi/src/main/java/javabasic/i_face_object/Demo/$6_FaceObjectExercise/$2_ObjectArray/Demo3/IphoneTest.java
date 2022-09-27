package javabasic.i_face_object.Demo.$6_FaceObjectExercise.$2_ObjectArray.Demo3;

/*
    定义数组存储3部手机对象
        属性: 品牌, 价格, 颜色
        要求:
            计算三部手机的平均价格
 */

public class IphoneTest {
    public static void main(String[] args) {
        // 动态初始化定义数组
        Iphone[] array = new Iphone[3];
        // 创建对象并存储数组
        Iphone iphone1 = new Iphone("华为", 3999, "白色");
        array[0] = iphone1;
        Iphone iphone2 = new Iphone("小米", 1999, "黑色");
        array[1] = iphone2;
        Iphone iphone3 = new Iphone("魅族", 2998, "蓝色");
        array[2] = iphone3;
        // 定义变量存储平均值
        double average = (iphone1.getPrice() + iphone2.getPrice() + iphone3.getPrice()) / 3.0;
        System.out.printf("三部手机的平均值为: %.2f元\n", average);
    }
}
