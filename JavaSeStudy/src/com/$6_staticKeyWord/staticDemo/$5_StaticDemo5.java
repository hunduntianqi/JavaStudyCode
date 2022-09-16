package com.$6_staticKeyWord.staticDemo;

import java.util.Random;

public class $5_StaticDemo5 {
    public static void main(String[] args) {
        //调用静态方法生成随机验证码
//        String validation = Validation.creatCode(6);
        // 构造器私有, 无法创建对象
//        Validation va = new Validation();
        System.out.println("验证码:" + Validation.creatCode(100));
    }
}

class Validation {
    
    /**
     * 私有构造器
     */
    private Validation() {
    
    }
    
    public static String creatCode(int num) {
        String ch = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        
        // 定义变量用于存储随机字符作为验证码
        String code = "";
        Random rd = new Random();
        for (int i = 0; i < num; i++) {
            int index = rd.nextInt(ch.length());
            code += ch.charAt(index);
        }
        return code;
    }
}
