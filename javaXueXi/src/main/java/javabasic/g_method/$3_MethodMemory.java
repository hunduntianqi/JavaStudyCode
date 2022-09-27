package javabasic.g_method;

/*
    方法调用内存的基本原理:
        传递基本数据类型: 传递的是真实数据, 形参的改变不会影响到实参变量, 属于值传递
        传递引用数据类型: 传递的是地址值, 会改变引用数据的内容
 */

public class $3_MethodMemory {
    public static void main(String[] args) {
        // 基本数据类型是值传递
        int number = 100;
        System.out.println("number的数据是: " + number);
        // 调用函数传入number
        change(number);
        // 打印number, 数据不会因调用方法而改变
        System.out.println("number调用方法后的数值是: " + number);
        System.out.println("-------------------");
        // 引用数据类型是引用传递
        // 定义数组
        int[] array = {10, 20, 30};
        System.out.println("调用方法前array[1]的数据为: " + array[1]);
        // 引用传递调用方法后会改变原来引用空间的数据内容
        changeArray(array);
        System.out.println("调用方法后array[1]的数据为: " + array[1]);
    }
    
    public static void change (int number) {
        number = 200;
    }
    
    public static void changeArray (int[] array) {
        array[1] = 200;
    }
}
