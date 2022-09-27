package javabasic.l_face_object_advanced.Demo.$1_staticDemo.Demo2;
/*
    创建数组工具类
 */
public class ArrayUtil {
    // 私有化构造器
    private ArrayUtil () {}
    
    // 定义静态方法, 打印数组
    public static String printArr (int[] array) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < array.length; i++) {
            if (i == 0) {
                sb.append("[" + array[i] + ", ");
            } else if (i == array.length - 1) {
                sb.append(array[i] + "]");
            } else {
                sb.append(array[i] + ", ");
            }
        }
        return sb.toString();
    }
    
    // 定义静态方法, 求平均分
    public static double getAverage (double[] array) {
        double sum = 0.0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        double average = sum / array.length;
        return average;
    }
}
