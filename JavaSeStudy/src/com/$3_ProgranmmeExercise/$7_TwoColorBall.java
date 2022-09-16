package com.$3_ProgranmmeExercise;

import java.util.Random;
import java.util.Scanner;

/*
    需求:
        双色球系统开发:随机生成一组中奖号码
        中奖条件和奖金表:
           1. 红6蓝1:一等奖, 奖金1000万;
           2. 红6蓝0:二等奖, 奖金500万;
           3. 红5蓝1:三等奖, 奖金3000元;
           4. 红5蓝0或红4蓝1:四等奖, 奖金200元;
           5. 红4蓝0或红3蓝1:五等奖, 奖金10元;
           6. 红2蓝1或红1蓝1或红0蓝1:六等奖, 奖金5元.
    分析:
        1. 投注号码由6个红色球号码和1个蓝色球号码组成, 红色球号码从1-33中选择; 蓝色球号码从1-16中选择(6个红球要求不能重复)
        2. 定义方法用于返回一组中奖号码(7个数据), 返回的形式是一个整型数组
 */
public class $7_TwoColorBall {
    public static void main(String[] args) {
        int[] luckarray = createLuckNumber();
        printArray(luckarray);
        int[] userarrey = userInputNumber();
//        printArray(userarrey);
        // 调用方法判断中奖情况
        judge(luckarray, userarrey);
    }
    
    public static int[] userInputNumber() {
        // 定义数组存储用户输入号码
        int[] userarray = new int[7];
        // 创建Scanner对象
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < userarray.length - 1; i++) {
            while (true) {
                System.out.println("请您输入第" + (i + 1) + "个红球号码(1-33, 要求不重复):");
                int data = sc.nextInt();
                if (data > 33 | data < 1) {
                    System.out.println("您输入的数据有误, 请重新输入！！");
                } else {
                    userarray[i] = data;
                    break;
                }
            }
        }
        while (true) {
            System.out.println("请您输入蓝球号码(1-16， 要求不重复): ");
            int data = sc.nextInt();
            if (data > 16 | data < 1) {
                System.out.println("您输入的数据有误, 请重新输入！！");
            } else {
                userarray[userarray.length - 1] = data;
                break;
            }
        }
        return userarray;
    }
    
    public static int[] createLuckNumber() {
        // 定义动态初始化数组, 数组长度为7
        int[] numbers = new int[7];
        // Random对象, 用于生成随机数
        Random rd = new Random();
        // 遍历数组, 为每个红球生成对应号码
        for (int i = 0; i < numbers.length - 1; i++) {
            // 为当前位置找出一个不重复的1-33之间的数字
            while (true) {
                int data = rd.nextInt(33) + 1;
                // 定义一个flag变量, 默认data没有重复
                boolean flag = true;
                for (int j = 0; j < i; j++) {
                    if (data == numbers[j]) {
                        flag = false;
                        break;
                    }
                }
                if (flag) {
                    numbers[i] = data;
                    break;
                }
            }
        }
        numbers[numbers.length - 1] = rd.nextInt(16) + 1;
        return numbers;
    }
    
    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }
        System.out.println();
    }
    
    public static void judge(int[] arr1, int[] arr2) {
        /**
         *         中奖条件和奖金表:
         *            1. 红6蓝1:一等奖, 奖金1000万;
         *            2. 红6蓝0:二等奖, 奖金500万;
         *            3. 红5蓝1:三等奖, 奖金3000元;
         *            4. 红5蓝0或红4蓝1:四等奖, 奖金200元;
         *            5. 红4蓝0或红3蓝1:五等奖, 奖金10元;
         *            6. 红2蓝1或红1蓝1或红0蓝1:六等奖, 奖金5元.
         */
        // 判断中奖情况
        int countred = 0; // 定义变量计算红色球中奖次数
        int countbule = 0; // 定义变量计算蓝色球中奖次数
        for (int i = 0; i < arr1.length - 1; i++) {
            for (int j = 0; j < arr2.length - 1; j++) {
                if (arr1[i] == arr2[j]) {
                    countred += 1;
                    break;
                }
            }
        }
        if (arr1[arr1.length - 1] == arr2[arr2.length - 1]) {
            countbule += 1;
        }
        // 红6蓝1:一等奖, 奖金1000万
        if (countred == 6 && countbule == 1) {
            System.out.println("恭喜您中了一等奖, 奖金1000万！！");
        }
        // 红6蓝0:二等奖, 奖金500万
        if (countred == 6 && countbule == 0) {
            System.out.println("恭喜您中了二等奖, 奖金500万！！");
        }
        // 红5蓝1:三等奖, 奖金3000元
        if (countred == 5 && countbule == 1) {
            System.out.println("恭喜您中了三等奖, 奖金3000元！！");
        }
        // 红5蓝0或红4蓝1:四等奖, 奖金200元
        if ((countred == 5 && countbule == 0) || (countred == 4 && countbule == 1)) {
            System.out.println("恭喜您中了四等奖, 奖金200元！");
        }
        // 红4蓝0或红3蓝1:五等奖, 奖金10元
        if ((countred == 4 && countbule == 0) || (countred == 3 && countbule == 1)) {
            System.out.println("恭喜您中了五等奖, 奖金10元！");
        }
        // 红2蓝1或红1蓝1或红0蓝1:六等奖, 奖金5元
        if ((countred == 2 && countbule == 1) || (countred == 1 && countbule == 1) || (countred == 0 && countbule == 1)) {
            System.out.println("恭喜您中了六等奖, 奖金5元");
        }
        if (countred == 0 && countbule == 0) {
            System.out.println("很遗憾, 你的运气不佳 , 这次没有中奖, 请继续努力~~");
        }
        
    }
}
