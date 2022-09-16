package com.$16_FileAndIOClass.Demo.$2_CharacterSetDemo;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;

public class $1_CharacterSetDemo {
    public static void main(String[] args) {
        // 1. 编码: 把文字转换成字节
        String name = "徐冬梅我爱你";
        byte[] bytes = name.getBytes(); // 以当前代码默认字符集编码
        System.out.println(bytes.length);
        System.out.println(Arrays.toString(bytes));

        byte[] by2 = new byte[0];
        try {
            by2 = name.getBytes("utf-8");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        System.out.println(by2.length);
        System.out.println(Arrays.toString(by2));
        // 解码把字节转换成对应中文形式
        String rs = new String(by2); // 解码与编码字符集不一致, 会导致中文乱码
        System.out.println(rs);
        try {
            String rs2 = new String(by2, "utf-8");
            System.out.println(rs2);
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
    }
}
