package com.$2_JavaBasicGrammar.$2_VariableAndBasicDataType;

/*
     注:数据在底层的存储形式均为二进制！！！
 *   变量:用来存储一个数据的内存区域,且里面存储的数据可变
 *   变量定义格式:
 *       数据类型 变量名称 = 变量初始值;
 *   变量定义注意事项:
 *      1. 什么类型变量存储什么类型数据
 *      2. 同一个范围内变量名不能重复
 *      3. 变量定义时可以不赋值,但在使用时必须要有初始值
 *      4. 变量存在访问范围,超出访问范围不能访问变量
 *   基本数据类型:
 *      用来约束变量存储数据的形式
 *      1. 整数:
 *          1.1 byte:内存占用-1字节, 取值范围:负的2的7次方 ~ 2的7次方-1(-128~127)
 *          1.2 short:内存占用-2字节, 取值范围:负的2的15次方 ~ 2的15次方-1(-32768~32767)
 *          1.3 int:内存占用-4字节, 取值范围:负的2的31次方 ~ 2的31次方-1
 *          1.4 long:内存占用-8字节, 取值范围:负的2的63次方 ~ 2的63次方-1
 *              注意:在Java中,整数数字默认为int类型数据,在定义long类型数据时,需要在整数后面加L/l
 *      2. 浮点数(小数):
 *          2.1 float:内存占用-4字节, 取值范围:1.401298e-45 ~ 3.402823e+38
 *              注意:定义float类型数据需要在数值侯加F/f
 *          2.2 double:内存占用-8字节, 取值范围:4.9000000e-324 ~ 1.797693e+308
 *      3. 字符:
 *          char:内存占用-2字节, 取值范围:0-65535
 *      4. 布尔:
 *          boolean:内存占用-1字节, 取值范围:true/false
 */

public class VariableAndDataType {
    public static void main(String[] args) {
        // 定义byte数据类型并输出
        byte by = 1;
        System.out.println("这是一个byte类型数据:" + by);
        System.out.println("----------");
        
        // 定义short类型数据并输出
        short sh = 2;
        System.out.println("这是一个short类型的数据:" + sh);
        System.out.println("----------");
        
        // 定义int类型数据并输出
        int i = 4;
        System.out.println("这是一个int类型的数据:" + i);
        System.out.println("----------");
        
        // 定义long类型的数据并输出
        long l = 131488888888888888L;
        System.out.println("这是一个long类型的数据");
        System.out.println("----------");
        
        // 定义float类型数据并输出
        float f = 3.14f;
        System.out.println("这是一个float类型的数据:" + f);
        System.out.println("----------");
        
        //定义double类型的数据并输出
        double d = 13.14;
        System.out.println("这是一个double类型的数据:" + d);
        System.out.println("----------");
        
        // 定义char类型的数据并输出
        char c = 'a';
        System.out.println("这是一个char类型的数据:" + c);
        System.out.println("----------");
        
        // 定义Boolean类型数据并输出
        boolean b1 = true;
        boolean b2 = false;
        System.out.println("这是两个布尔类型数据:" + b1 + "," + b2);
    }
}
