package javabasic.c_javabasic_concept;

/*
    数据类型:
        基本数据类型:
            数据值存储在自己的空间中, 赋值给其他变量时, 赋的是真实的值
            1. 整数:
                1.1 byte: -128~127, 内存占用-1字节
                1.2 short: -32768~32767, 内存占用-2字节
                1.3 int: -2147483648~2147483647, 内存占用-4字节
                1.4 long: -9223372036854775808~9223372036854775807, 内存占用-8字节
                    注意: 如果要定义long类型变量, 需要在变量值后加一个"L", 否则默认为int类型变量
            2. 浮点数:
                2.1 float: -3.401298e^~38~3.402823e^38, 内存占用-4字节
                    注意: 如果要定义float类型变量, 需要在变量值后加一个"F", 否则默认为double类型变量
                2.2 double: -4.9000000e^-324~1.797693e^308, 内存占用-8字节
            3. 字符: char, 内存占用-2字节
            4. 布尔: boolean, 内存占用-1字节
        引用数据类型:
            变量中存储的是地址值, 赋值给其他变量时, 赋的是地址值
 */

public class $6_DataType {
    public static void main(String[] args) {
        // byte数据
        byte b = 10;
        System.out.println(b);
        // short数据
        short s = 20;
        System.out.println(s);
        // int数据
        int i = 30;
        System.out.println(i);
        // long
        long l = 100000000000L;
        System.out.println(l);
        // float数据
        float f = 1.3F;
        System.out.println(f);
        // double数据
        double d = 1.5;
        System.out.println(d);
        // char数据
        char c = 90;
        System.out.println(c);
        // boolean数据
        boolean bl = true;
        System.out.println(bl);
    }
}
