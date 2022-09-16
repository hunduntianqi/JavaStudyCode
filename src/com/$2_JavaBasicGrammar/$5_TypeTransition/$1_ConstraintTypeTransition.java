package com.$2_JavaBasicGrammar.$5_TypeTransition;
/*
    问题: 数据类型范围大的数据或者变量, 不能直接赋值给数据类型小的变量
    强制类型转换:
        可以将数据类型范围大的变量, 赋值给数据类型范围小的变量
        语法格式:
            数据类型 变量2 = (数据类型)变量1/数据;
    注意:
        1. 强制类型数据转换可能造成数据丢失
        2. 浮点数转换为整数, 直接丢掉小数部分, 保留整数部分返回
 */

public class $1_ConstraintTypeTransition {
    public static void main(String[] args) {
        int i = 10;
        byte b = (byte) i; //发生了强制数据类型转换
        System.out.println("变量b的值为:" + b);
    }
}
