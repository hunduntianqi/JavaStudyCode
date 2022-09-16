package com.$16_FileAndIOClass;

/*
    方法递归:
        方法直接或间接调用自己的形式称为方法递归(recursion)
        形式和特点:
            形式:
                1. 直接递归: 方法自己调用自己
                2. 间接递归: 方法调用其他方法, 其他方法又回调方法自己
                注意:
                    递归如果没有控制好终止条件, 会出现递归死循环现象, 导致栈内存溢出
        递归解决问题的思路:
            把一个复杂的问题层层转化为一个与原问题相似的规模较小的问题求解
        规律化递归算法三要素:
            1. 递归公式: f(n) = f(n - 1) * n;
            2. 递归的终结点: f(1);
            3. 递归的方向必须走向终结点
 */

public class $4_MethodRecursion {
    public static void main(String[] args) {
//        test();
        long num = f(10);
        System.out.println(num);
        System.out.println(sum(10));
        System.out.println(number(1) / 2 + 1);
    }
//
//    public static void test() {
//        System.out.println("test方法被执行");
////        test(); // 直接递归
//        System.out.println("================");
//        show(); // 间接递归
//    }
//
//    public static void show() {
//        test();
//    }

    // 递归计算!n
    public static long f(int num) {
        if (num == 1) {
            return 1;
        } else {
            return f(num - 1) * num;
        }
    }
    // 递归计算1-n的和
    public static long sum (int num) {
        if (num == 1) {
            return 1;
        } else {
            return f(num - 1) + num;
        }
    }

    // 猴子吃桃
    public static long number(int num) {
        if (num == 10) {
            return 1;
        } else {
            return (number(num + 1) + 1) * 2;
        }
    }
}
