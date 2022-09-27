package javabasic.l_face_object_advanced.Demo.$1_staticDemo.Demo2;

/*
    测试类:
        调用工具类ArrayUtil的静态方法进行测试
 */

public class Test {
    public static void main(String[] args) {
        // 定义整数数组
        int[] arrayInt = {1, 2, 3, 4, 5, 6};
        // 调用工具类方法
        String str = ArrayUtil.printArr(arrayInt);
        System.out.println(str);
        
        // 定义浮点数数组
        double[] arrayDouble = {1.1, 2.3, 3.5, 4.2, 1.8, 9.5};
        double average = ArrayUtil.getAverage(arrayDouble);
        String averStr = "计算的平均值为%.2f".formatted(average, average);
        System.out.println(averStr);
    }
}
