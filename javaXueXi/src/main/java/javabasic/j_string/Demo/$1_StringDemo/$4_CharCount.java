package javabasic.j_string.Demo.$1_StringDemo;

import java.util.Scanner;

/*
    统计字符个数:
        键盘录入一个字符, 统计该字符中大写字母个数, 小写字母个数, 数字字符出现的次数
 */
public class $4_CharCount {
    public static void main(String[] args) {
        // 创建Scanner对象
        Scanner sc = new Scanner(System.in);
        // 创建String
        String string;
        System.out.println("// 请输入一段文字:");
        string = sc.nextLine();
        // 定义变量, 分别记录大写字母, 小写字母, 数字字符的个数
        int capitalCount = 0;  // 大写字母
        int lowercaseCount = 0;  // 小写字母
        int numberCount = 0;  // 数字字符
        // 遍历字符串
        for (int i = 0; i < string.length(); i++) {
            if ((byte) string.charAt(i) >= 65 && (byte) string.charAt(i) <= 90) {
                // 判断字符为大写字符
                capitalCount++;
            } else if ((byte) string.charAt(i) >= 97 && (byte) string.charAt(i) <= 122) {
                // 判断字符为小写字符
                lowercaseCount++;
            } else if ((byte) string.charAt(i) >= 48 && (byte) string.charAt(i) <= 57) {
                // 判断字符为数字字符
                numberCount++;
            }
        }
        System.out.printf("字符中的大写字母个数为:%d, 小写字母个数为:%d, 数字字符个数为:%d\n", capitalCount,
                lowercaseCount, numberCount);
    }
}
