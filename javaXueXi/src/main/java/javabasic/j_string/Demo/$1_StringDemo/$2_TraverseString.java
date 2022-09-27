package javabasic.j_string.Demo.$1_StringDemo;

/*
    遍历字符串:
        键盘录入一个字符串, 使用程序在控制台遍历该字符串
 */

import java.util.Scanner;

public class $2_TraverseString {
    public static void main(String[] args) {
        // 创建Scanner对象
        Scanner sc = new Scanner(System.in);
        // 定义变量接收键盘录入字符串
        System.out.println("请输入一段文字:");
        String string = sc.next();
        // 遍历字符串
        System.out.println("遍历字符串结果如下: ");
        for (int i = 0; i < string.length(); i++) {
            System.out.printf("string[%d] = %c\n", i, string.charAt(i));
        }
    }
}
