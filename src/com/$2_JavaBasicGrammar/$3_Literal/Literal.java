package com.$2_JavaBasicGrammar.$3_Literal;
/*
    字面量:
        数据在Java程序中的书写格式
        字面量类型:
            1.整数:不带小数的数字,例:666,-888
            2.小数:带小数的数字,例:13.14, 3.1415926, -5.21
            3.字符:必须使用单引号,有且只能有一个字符, 例:'A', 'a', '1', '我'
            4.字符串:必须使用双引号,内容可有可无, 例:"HelloWorld"
            5.布尔值:表示真假,只有两个值,true,false
            6.空值:一个特殊的值,值为:null
 */

public class Literal {
    public static void main(String[] args) {
        System.out.println("以上注释为字面量的分类！！");
        //输出整数
        System.out.println(66);
        //输出小数
        System.out.println(13.14);
        //输出字符
        System.out.println('0');
        //输出字符串
        System.out.println("郭鹏涛");
        //输出布尔值
        System.out.println(true);
        System.out.println(false);
    }
}
