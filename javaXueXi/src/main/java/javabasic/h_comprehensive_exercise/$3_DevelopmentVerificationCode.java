package javabasic.h_comprehensive_exercise;
/*
    练习三: 开发验证码
        需求:
            定义方法实现随机产生一个5位的验证码
            验证码格式:
                1. 长度为5
                2. 前四位是大写字母或小写字母
                3. 最后一位是数字
 */

import java.util.Random;

public class $3_DevelopmentVerificationCode {
    public static void main(String[] args) {
        // 定义变量接收方法生成的验证码
        String verificationCode = verificationCode();
        System.out.println("生成的验证码为: " + verificationCode);
    }
    
    public static String verificationCode() {
        // 创建Random对象, 产生随机数字
        Random random = new Random();
        // 动态初始化创建字符数组
        char[] arrayLetter = new char[52];
        // for循环为数组元素赋值大写字母
        char capitalLetter = 65;
        for (int i = 0; i < arrayLetter.length / 2; i++) {
            arrayLetter[i] = capitalLetter;
            capitalLetter++;
        }
        // for循环为数组元素赋值小写字母
        char smallLetter = 97;
        for (int i = 26; i < arrayLetter.length; i++) {
            arrayLetter[i] = smallLetter;
            smallLetter++;
        }
        // 定义字符串存储生成的验证码
        String verificationCode = "";
        // 生成验证码
        for (int i = 0; i < 5; i++) {
            if (i == 4) {
                verificationCode = verificationCode + random.nextInt(10);
            } else {
                verificationCode = verificationCode + arrayLetter[random.nextInt(52)];
            }
        }
        return verificationCode;
    }
}
