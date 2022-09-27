package javabasic.f_loopsAdvance_and_array;

import java.util.Random;
import java.util.Scanner;

/*
    循环练习
 */
public class $3_LoopExercise {
    public static void main(String[] args) {
        loopExerciseDemo4();
    }
    
    public static void loopExerciseDemo1() {
        /*
            需求: 逢七过
            规则: 从任意一个数字开始报数, 当要报的数字是包含七或者是七的倍数, 都要说过
                使用程序在控制台打印出0~100之间逢七过的数字
         */
        for (int i = 1; i <= 100; i++) {
            if ((i % 7 == 0) || (i % 10 == 7) || (i / 10 == 7)) {
                System.out.println("逢七过: " + i);
            } else {
                System.out.println("数字: " + i);
            }
        }
    }
    
    public static void loopExerciseDemo2() {
        /*
            需求:
                键盘录入一个大于2的整数, 计算并返回整数的平方根, 结果返回整数部分, 小数部分舍去
         */
        // 创建Scanner对象
        Scanner sc = new Scanner(System.in);
        // 定义变量接收键盘录入数据
        System.out.println("请输入一个大于2的整数:");
        int num = sc.nextInt();
        // 定义变量存储平方根
        double square = 0.0;
        while (true) {
            if (square * square > num) {
                square -= 1;
                break;
            } else if (square * square == num) {
                break;
            } else {
                square++;
            }
        }
        System.out.println("数字" + num + "的平方根整数部分为: " + (int) square);
    }
    
    public static void loopExerciseDemo3() {
        /*
            需求:
                键盘录入一个数, 判断该整数是否为一个质数
                质数: 指一个整数只能被1和自己整除
         */
        // 创建Scanner对象
        Scanner sc = new Scanner(System.in);
        // 定义变量存储键盘录入数据
        System.out.println("请输入一个任意的整数: ");
        int num = sc.nextInt();
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                if (i == num) {
                    System.out.println(i);
                    System.out.println("数字" + num + "是质数");
                    break;
                } else if (i != 1 && i != num) {
                    System.out.println(i);
                    System.out.println("数字" + num + "是合数");
                    break;
                }
            }
        }
    }
    
    public static void loopExerciseDemo4() {
        /*
            需求:
                程序自动生成一个1~100之间的随机数字, 使用程序实现猜出这个数字是多少
         */
        // 创建Random对象
        Random random = new Random();
        // 定义变量存储随机数
        int num = random.nextInt(100) + 1; // 随机生成0~99的数字, +1将其改变为1~100的数字
        // 创建Scanner对象
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入要猜数字的次数:");
        int count = sc.nextInt();
        // 使用循环控制猜数字的次数
        for (int i = 0; i < count; i++) {
            // 定义变量存储键盘录入数据
            System.out.println("请输入一个0~100的数字, 您还可以输入 " + (count - i) + " 次:");
            int number = sc.nextInt();
            // 判断是否猜对数字
            if (number == num) {
                System.out.println("恭喜您, 猜对了！！");
                break;
            } else if (i == count - 1) {
                System.out.println("很遗憾, 您的次数已用完, 正确的数字是: " + num);
            } else if (number > 0 && number < num) {
                System.out.println("对不起, 您输入的数字偏小");
            } else if (number > num && number <= 100) {
                System.out.println("对不起, 您输入的数字偏大");
            } else {
                System.out.println("请输入一个1~100内的整数！！");
            }
        }
    }
}
