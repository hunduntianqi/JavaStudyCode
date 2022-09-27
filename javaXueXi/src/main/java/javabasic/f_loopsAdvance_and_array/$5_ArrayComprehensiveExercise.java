package javabasic.f_loopsAdvance_and_array;

import java.util.Random;

/*
    数组综合练习
 */
public class $5_ArrayComprehensiveExercise {
    public static void main (String[] args) {
        ArrayExerciseDemo7();
    }
    
    public static void ArrayExerciseDemo1 () {
        /*
            需求:
                定义一个数组, 存储1, 2, 3, 4, 5
                遍历数组得到每一个元素, 求数组里面所有数据和
         */
        // 静态初始化定义数组
        int[] array = {1, 2, 3, 4, 5};
        // 定义变量存储数组数据之和
        int arraySum = 0;
        // 遍历数组取出数组元素
        for (int i = 0; i < array.length; i++) {
            arraySum += array[i];
        }
        // 打印输出数组元素之和
        System.out.println("数组" + array + "各元素之和为: " + arraySum);
    }
    
    public static void ArrayExerciseDemo2 () {
        /*
            需求:
                定义一个数组, 存储1~10的数字, 遍历数组得到每一个元素, 统计数组里面一共有多少个能被3整除的数字
         */
        // 动态初始化定义数组
        int[] array = new int[10];
        // for循环遍历数组并赋值
        for (int i = 0; i < array.length; i++) {
            array[i] = i + 1;
        }
        // 定义变量储存数组中能被3整除数字的个数
        int num = 0;
        // for循环遍历数组
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 3 == 0) {
                num++;
            }
        }
        System.out.println("数组" + array + "中可以被3整除数字的个数为: " + num);
    }
    
    public static void ArrayExerciseDemo3 () {
        /*
            需求:
                定义一个数组, 存储1~10, 遍历数组得到每一个元素
                如果是奇数, 则将当前数字扩大两倍; 如果是偶数, 则兼当前数字变成二分之一
         */
        // 静态初始化定义数组
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        // for循环遍历数组
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                System.out.print(array[i] / 2 + " ");
                array[i] = array[i] / 2;
            } else {
                System.out.print(array[i] * 2 + " ");
                array[i] = array[i] * 2;
            }
        }
    }
    
    public static void ArrayExerciseDemo4 () {
        /*
            需求:求最值
                已知数组元素为 {33, 5, 72, 44, 55}
                请找出数组最大值并打印在控制台中
         */
        // 静态初始化定义数组
        int[] array = {33, 5, 72, 44, 55, -89};
        // 定义变量记录数组最大值
        int max = array[0];
        // for循环遍历数组
        for (int i = 0; i < array.length; i++) {
            max = max > array[i] ? max : array[i];
        }
        System.out.println("数组的最大值为: " + max);
    }
    
    public static void ArrayExerciseDemo5 () {
        /*
            需求: 生成10个1~100之间的随机数, 存入数组
            a. 求出所有数据之和
            b. 求所有数据的平均数
            c. 统计由所少个数据比平均值小
         */
        // 创建Random对象
        Random random = new Random();
        // 动态初始化定义数组, 长度为10
        int[] array = new int[10];
        // for循环将10个随机数存入数组
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100) + 1;
        }
        // 遍历数组
        String str = "[";
        for (int i = 0; i < array.length; i++) {
            if (i == array.length - 1) {
                str = str + array[i] + "]";
            } else {
                str = str + array[i] + ", ";
            }
        }
        System.out.println(str);
        // 定义变量记录数组所有数据之和
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        // 定义变量记录数组所有数据的平均数
        double mean = 0.0;
        mean = sum / 10.0;
        // 定义变量存储数组中小于平均数的数据个数
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < mean) {
                count++;
            }
        }
        System.out.println("数组中所有数据之和为: " + sum);
        System.out.println("数组中所有数据的平均数为: " + mean);
        System.out.println("数组中小于平均数的数据个数为: " + count);
    }
    
    public static void ArrayExerciseDemo6 () {
        /*
            需求: 交换数组中的数据
                定义一个数组, 存入1~5, 按照要求交换索引对应的元素
                交换前: 1,2,3,4,5
                交换后: 5,4,3,2,1
         */
        // 静态初始化定义数组
        int[] array = {1, 2, 3, 4, 5, 6, 7};
        for (int i = 0; i < array.length / 2; i++) {
            // 定义变量当做交换数据的中间值
            int median = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = median;
        }
        // 遍历打印数组
        String str = "{";
        for (int i = 0; i < array.length; i++) {
            if (i == array.length - 1) {
                str = str + array[i] + "}";
            } else {
                str = str + array[i] + ", ";
            }
        }
        System.out.println(str);
    }
    
    public static void ArrayExerciseDemo7 () {
        /*
            需求: 定义一个数组, 存入1~5, 要求打乱数组中所有数据的顺序
         */
        // 静态初始化定义数组
        int[] array = {1, 2, 3, 4, 5};
        // 创建Random对象
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            // 生成随机索引
            int randomIndex = random.nextInt(array.length);
            // 定义临时变量
            int temp = array[i];
            // 将数据进行随机交换
            array[i] = array[randomIndex];
            array[randomIndex] = temp;
        }
        
        // 遍历打印数组, 确认结果
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + ", ");
        }
    }
}
