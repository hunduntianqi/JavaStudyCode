package com.$5_CommonAPI.CommonAPIDemo.$4_BigDecimalDemo;

import java.math.BigDecimal;

public class BigDecimalDemo {
    public static void main(String[] args) {
        // 浮点型数据运算时直接 + * / 可能会出现数据失真(精度问题)
        System.out.println(0.09 + 0.01);
        System.out.println(1.0 - 0.32);
        System.out.println(1.015 * 100);
        System.out.println(1.301 / 100);
        
        System.out.println("--------------------------");
        double a = 0.1;
        double b = 0.2;
        double c = a + b;
        System.out.println(c);
        System.out.println("--------------------------");
        
        // 包装浮点型数据为大数据对象:BigDecimal
        BigDecimal b1 = BigDecimal.valueOf(a);
        BigDecimal b2 = BigDecimal.valueOf(b);
        BigDecimal b3 = b1.add(b2);
        BigDecimal b4 = b1.subtract(b2);
        BigDecimal b5 = b1.multiply(b2);
        BigDecimal b6 = b1.divide(b2);
        System.out.println(b3);
        System.out.println(b4);
        System.out.println(b5);
        System.out.println(b6);
        System.out.println("--------------------------");
    }
}

