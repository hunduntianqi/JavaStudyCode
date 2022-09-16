package com.$3_ProgranmmeExercise;

import java.util.Scanner;

/*
    需求:
        评委打分, 在唱歌比赛中, 有六名评委给选手打分, 分数范围是0-100之间的整数, 选手的最后得分为:去掉最高分, 最低分
        后的4个评委的平均分
    分析:
        1. 使用数据把六个评委的分数录入到程序中 --> 动态初始化数组
        2. 遍历数组中的元素, 对数据进行累加求和, 找出最高分, 最低分
        3. 按照分数的计算规则算出平均分
 */

public class $5_JudgeGrade {
    public static void main(String[] args) {
        // 创建Scanner对象接收键盘录入数据
        Scanner sc = new Scanner(System.in);
        // 定义数组存入评委打分
        int[] scores = new int[6];
        // 循环录入每位评委的分数
        for (int i = 0; i < scores.length; i++) {
            System.out.println("请输入第" + (i + 1) + "位评委的打分:");
            scores[i] = sc.nextInt();
        }
        // 调用函数计算选手成绩
        int grade = (sum(scores) - max(scores) - min(scores)) / 4;
        System.out.println("选手的最终成绩为:" + grade + "分");
    }
    
    public static int sum(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }
    
    public static int max(int[] arr) {
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            max = max > arr[i] ? max : arr[i];
        }
        return max;
    }
    
    public static int min(int[] arr) {
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            min = min < arr[i] ? min : arr[i];
        }
        return min;
    }
}
