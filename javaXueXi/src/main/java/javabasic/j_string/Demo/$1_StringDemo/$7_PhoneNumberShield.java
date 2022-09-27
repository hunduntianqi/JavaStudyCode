package javabasic.j_string.Demo.$1_StringDemo;

/*
    手机号屏蔽
    截取字符串方法:
        String subString(int beginIndex, int endIndex): 截取字符串, 包左不包右
 */

import java.util.Scanner;

public class $7_PhoneNumberShield {
    public static void main(String[] args) {
        // 创建Scanner对象
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个手机号码: ");
        String phoneNumber = sc.nextLine();
        if (phoneNumber.length() == 11) {
            String string = shieldPhoneNumber(phoneNumber);
            System.out.println("手机号加密后为:" + string);
        } else {
            System.out.println("手机号码格式不合法！！");
        }
    }
    
    // 定义方法, 屏蔽手机号码
    public static String shieldPhoneNumber (String phoneNumber) {
        // 截取开头三位字段
        String beginStr = phoneNumber.substring(0, 3);
        // 截取后四位字段
        String endStr = phoneNumber.substring(7, 11);
        // 拼接字符串
        String string = beginStr + "****" + endStr;
        return string;
    }
}
