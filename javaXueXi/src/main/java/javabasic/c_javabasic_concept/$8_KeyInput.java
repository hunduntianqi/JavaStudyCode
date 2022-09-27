package javabasic.c_javabasic_concept;

/*
    键盘录入:
        Scanner类:
            该类可以接收键盘输入的字符
            1. 导包 -- Scanner这个类在哪里？
            2. 创建对象 -- 开始使用Scanner类
            3. 接收数据
 */

import java.util.Scanner;

public class $8_KeyInput {
    public static void main(String[] args) {
        // 实例化Scanner对象
        Scanner sc = new Scanner(System.in);
        // 定义变量接收数据
        System.out.print("请输入你要输入的内容:\n");
        String str = sc.next();
        // 输出数据
        System.out.println(str);

        // 使用Scanner进行数字输入求和
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        System.out.println("num1 和 num2 之和为:" + (num1 + num2));
    }
}
