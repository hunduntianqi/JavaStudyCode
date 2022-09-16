package com.$2_JavaBasicGrammar.$7_ArraySummarize;

/*
    使用Random生成随机数,使用Scanner录入用户输入数字,进行比较
 */

import java.util.Random;
import java.util.Scanner;

public class $5_Array_Random_Scanner {
    public static void main(String[] args) {
        // 定义数组,使用动态初始化
        int[] arr = new int[5];
        // 创建Random对象
        Random rd = new Random();
        for (int i = 0; i < arr.length; i++) {
            // 给数组每个元素赋值, 取值范围为1-50
            arr[i] = rd.nextInt(50) + 1;
        }
        // 创建Scanner对象
        Scanner sc = new Scanner(System.in);
        int count = 0;
        OUT:
        // 在此处定义OUT:语句,在while循环中任意位置使用break OUT语句皆可结束整个循环
        while (true) {
            count++;
            if (count == arr.length + 1) {
                System.out.println("很遗憾,您的机会已用尽,感谢您的参与！！");
                break;
            }
            // 定义变量接收键盘录入数据
            System.out.println("请输入一个1-50之间的整数:");
            int user = sc.nextInt();
            for (int i = 0; i < arr.length; i++) {
                if (user == arr[i]) {
                    System.out.println("恭喜您,您猜对了,获得精美礼品一份");
                    break OUT;//break后加OUT可以结束整个死循环！！
                }
            }
        }
    }
}
