package com.$3_ProgranmmeExercise;

/*
    需求:
        判断101-200之间有多少个素数, 并输出所有素数
        素数: 除1和它本身外, 不能被其他正整数整除的数叫做素数
    分析:
        1. 采用循环拿到101-200之间的每一个数据
        2. 判断该数据是否为素数, 判断规则为:从2开始遍历到该数的一般数据, 看是否有数据可以整除他, 有则不是素数, 没有则是素数, 并输出
           该素数
        3. 输出所有素数
 */

public class $4_FindPrimeNumber {
    public static void main(String[] args) {
        for (int i = 101; i < 201; i++) {
            // 定义信号位
            boolean flag = true;
            for (int j = 2; j <= i / 2; j++) {
                if (i % j == 0) {
                    flag = false;
                    break;
                }
            }
            if (flag == true) {
//                System.out.println("数据" + i + "是素数");
                System.out.print(i + "\t");
            }
        }
    }
}
