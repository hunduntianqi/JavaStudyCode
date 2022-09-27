package javabasic.j_string.Demo.$3_SynthesizeExercise;

/*
    键盘录入任意字符串, 打乱里面的内容
 */

import java.util.Random;
import java.util.Scanner;

public class $2_DisorganizeString {
    public static void main(String[] args) {
        // 创建Scanner对象
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一段文字:");
        String str = sc.next();
        // 调用方法, 打乱字符串内容
        String transitionStr = disorganizeStr(str);
        System.out.printf("字符串'%s'打乱后的内容为:'%s'\n", str, transitionStr);
    }
    
    public static String disorganizeStr (String str) {
        // 创建Random对象
        Random random = new Random();
        // 将字符串转换为字符数组
        char[] strArray = str.toCharArray();
        // 打乱字符数组
        for (int i = 0; i < strArray.length; i++) {
            int index = random.nextInt(strArray.length);
            char temp = strArray[i];
            strArray[i] = strArray[index];
            strArray[index] = temp;
        }
        // 字符数组转换成字符串
        return new String(strArray);
    }
}
