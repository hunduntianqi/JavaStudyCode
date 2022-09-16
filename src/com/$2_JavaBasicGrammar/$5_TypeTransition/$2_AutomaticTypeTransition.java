package com.$2_JavaBasicGrammar.$5_TypeTransition;
/*
    自动类型转换:
        类型范围小的变量可以直接赋值给类型范围大的变量
    表达式的自动类型转换:
        在表达式中,小范围类型的变量会自动转换成当前较大范围类型的变量在运算
        注意事项:
            1.表达式的最终结果类型由表达式中的最高类型决定
            2.在表达式中, byte, short, char是直接转换成int类型参与运算的
 */

public class $2_AutomaticTypeTransition {
    public static void main(String[] args) {
        // 定义类型范围小的变量byte
        byte b = 2;
        // 定义类型范围大的变量, 并将变量b赋值给该变量
        int i = b; // 发生了自动类型转换
        // 输出两个变量的值
        System.out.println("输出变量b的值:" + b);
        System.out.println("输出变量i的值:" + i);
        // 变量i和变量b的值一样, 变量b在给i赋值时自动转换为int类型
        double d = i; //发生了自动类型转换
        System.out.println("变量d的值为:" + d);
        expressionAutoTypeTransition();
    }
    
    // 定义方法展示表达式自动类型转换
    public static void expressionAutoTypeTransition() {
        System.out.println("以下为表达式自动类型转换示例: ");
        byte b = 10;
        int i = 20;
        double d = 1.2;
        double rs = d + b + i; // 变量b和变量i发生了自动类型转换
        System.out.println("变量re的输出结果为:" + rs);
    
        // 面试题
        byte b1 = 10;
        byte b2 = 20;
        int b3 = b1 + b2; // byte/short/char在表达式中均转换为int类型
        System.out.println("变量b3的值为:" + b3);
    }
}
