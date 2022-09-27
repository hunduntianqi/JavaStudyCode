package javabasic.e_judgments_and_loops;

import java.util.Scanner;

/*
    while循环语句:
        格式:
            初始化语句;
            while (条件判断语句) {
                循环体语句;
                条件控制语句;
            }
 */
public class $4_while {
    public static void main(String[] args) {
        // while语句打印九九乘法表
        int num1 = 1;
        while (num1 <= 9) {
            int num2 = 1;
            while (num2 <= num1) {
                System.out.print(num2 + " * " + num1 + " = " + (num2 * num1) + "\t");
                num2++;
            }
            System.out.println();
            num1++;
        }
        
        // whileDemo1();
        whileDemo2();
    }
    
    public static void whileDemo1() {
        /*
            需求: 给定一个整数x, 如果这个数是回文数, 则打印true, 否则打印false
            回文数: 指正序和倒序是一样的数字
         */
        // 创建Scanner对象
        Scanner sc = new Scanner(System.in);
        // 定义变量接收数字
        System.out.println("请输入一个任意数字:");
        int num = sc.nextInt();
        String str = num + "";
        System.out.println("str = " + str);
        int len = str.length();
        String str2 = "";
        while (len > 0) {
            str2 += str.charAt(len - 1);
            len--;
        }
        System.out.println("str2 = " + str2);
        if (str.equals(str2)) {
            System.out.println("数字" + num + "是回文数: true");
        } else {
            System.out.println("数字" + num + "不是回文数: false");
        }
    }
    
    public static void whileDemo2() {
        /*
            需求: 给定两个整数, 被除数和除数, 都是正数, 且不超过int的范围
                  将两数相除, 要求不使用除法, 乘法和 % 运算符, 得到商和余数
         */
        Scanner sc = new Scanner(System.in);
        // 定义变量存储被除数
        System.out.println("请输入被除数:");
        int dividend = sc.nextInt();
        // 定义变量存储除数
        System.out.println("请输入除数:");
        int divisor = sc.nextInt();
        // 定义变量存储商
        int consult = 0;
        // 定义变量存储余数
        int remainder = 0;
        // while循环计算商和余数
        while (dividend >= divisor) {
            consult++;
            dividend = dividend - divisor;
            if (dividend < divisor) {
                remainder = dividend;
            }
        }
        
        System.out.println("商是: " + consult + ", 余数是: " + remainder);
    }
}
