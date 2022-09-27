package javabasic.j_string.Demo.$2_StringBuilderDemo;

import java.util.Scanner;

/*
    对称字符串, 键盘录入一个字符串, 判断是否为对称字符串
 */
public class $1_SymmetryString {
    public static void main(String[] args) {
        // 创建Scanner对象
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串:");
        String str = sc.next();
        // 创建StringBuilder对象
        StringBuilder strBuilder = new StringBuilder(str);
        // 将StringBuilder对象反转
        strBuilder.reverse();
        // 判断是否为对称字符串
        if (str.equals(strBuilder.toString())) {
            System.out.printf("%s是对称字符串\n", str);
        } else {
            System.out.printf("%s不是对称字符串\n", str);
        }
    }
}
