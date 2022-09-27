package javabasic.i_face_object.Demo.$6_FaceObjectExercise.$2_ObjectArray.Demo1;

/*
    定义数组存储3个商品对象
    商品属性:
        id, name, price, count
 */

public class Test {
    public static void main(String[] args) {
        // 定义商品类数组
        Commodity[] array = new Commodity[3];
        
        // 创建三个商品对象
        Commodity goods1 = new Commodity(1, "鼠标", 19.9, 20);
        Commodity goods2 = new Commodity(2, "键盘", 29.9, 20);
        Commodity goods3 = new Commodity(3, "显示器", 199, 10);
        array[0] = goods1;
        array[1] = goods2;
        array[2] = goods3;
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
