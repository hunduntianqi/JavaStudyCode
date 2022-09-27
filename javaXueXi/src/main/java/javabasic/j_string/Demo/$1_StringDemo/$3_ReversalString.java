package javabasic.j_string.Demo.$1_StringDemo;

import java.util.Scanner;

/*
    字符串反转
 */
public class $3_ReversalString {
    public static void main(String[] args) {
        // 定义一个字符串
        String string;
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一段文字:");
        string = sc.nextLine();
        // 调用方法, 反转字符串
        reversalString(string);
    }
    
    // 定义方法, 反转字符串
    public static void reversalString(String str) {
        // 创建字符数组
        char[] chs = new char[str.length()];
        // 遍历字符串, 将字符拆分存入字符数组
        for (int i = 0; i < chs.length; i++) {
            chs[i] = str.charAt(i);
        }
        
        // 将字符数组反转
        for (int i = 0; i < chs.length / 2; i++) {
            char temp;
            temp = chs[i];
            chs[i] = chs[(chs.length - 1) - i];
            chs[(chs.length - 1) - i] = temp;
        }
        
        // 根据String构造器创建String
        String string = new String(chs);
        System.out.println(string);
    }
}
