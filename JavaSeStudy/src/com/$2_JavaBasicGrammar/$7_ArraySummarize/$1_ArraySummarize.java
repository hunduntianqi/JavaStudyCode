package com.$2_JavaBasicGrammar.$7_ArraySummarize;
/*
    数组概述:
        用来存储一批同种类型数据的内存区域(可以理解成容器)
        数组是引用类型数据,数组名中存储的是数组在内存中的地址信息
        数组长度方法:数组名.length, 数组最大索引:数组名.length - 1
    数组定义格式:
        格式一:
            数据类型[] 数组名;
            实例:
                int[] arr;
                double[] arr;
                char[] arr;
        格式二:
            数据类型 数组名[];
            实例:
                int arr[];
                double arr[];
                char arr[];
    数组访问格式:
        数组[索引值(index)];
        arr[5];
    数组动态初始化:
        格式:
            数据类型[] 数组名 = new 数据类型[数组长度];
        实例:
            int[] arr = new int[5];
    数组静态初始化:
        完整版格式:
            数据类型[] 数组名 = new 数据类型[] {元素1, 元素2, 元素3...};
        简化版格式:
            数据类型[] 数组名 = {元素1, 元素2, 元素3...};
    数组操作常见异常:
        1.索引越界:
            解决方案:将错误的索引修改为正确索引即可
        2.空指针异常:
            解决方案:给数组一个真正的堆内存空间引用
    两种初始化方法使用场景:
        动态初始化:只指定数组长度, 后期赋值, 适合开始知道数据数量, 不知道数据内容
        静态初始化:开始就存入元素值, 适合开始就知道元素值的场景使用
        注意:两种初始化定义格式独立书写, 不能混用！！
    数组动态初始化默认值:
        基本类型:
            1.byte, short, char, int, long:动态初始化默认值为0;
            2.float, double:动态初始化默认值为0.0;
            3.boolean:动态初始化默认值为false
        引用类型:
            类, 接口, 数组, String:默认值为null(不一定是数组)
 */
public class $1_ArraySummarize {
    public static void main(String[] args) {
        // 数组静态初始化
        int[] arr = {1, 2, 3, 4};
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        
        //数组动态初始化并赋值
        int[] arr2 = new int[10];
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = i;
        }
        System.out.println("-----------");
        //遍历动态初始化赋值后数组内容
        for (int i = 0; i < arr2.length; i++) {
            System.out.println(arr2[i]);
        }
        
        arrayDynamicInitialize();
    }
    
    // 动态初始化各类数组
    public static void arrayDynamicInitialize() {
        // 动态初始化定义整数数组, 输出数组默认值
        int[] arr_int = new int[1];
        System.out.println(arr_int[0]);// 整数数组默认值为0 , short, long, char, int均为整数数组
    
        // 动态初始化定义字符数组
        char[] arr_char = new char[1];
        System.out.println((int) arr_char[0]);
    
        // 动态初始化定义浮点型数组
        double[] arr_double = new double[1];
        System.out.println(arr_double[0]); // 浮点型数组默认值为0.0
    
        // 动态初始化定义布尔类型数组
        boolean[] arr_boo = new boolean[1];
        System.out.println(arr_boo[0]); // 布尔型数组默认值为false
    
        // 动态初始化定义引用类型数组
        String[] arr_str = new String[1];
        System.out.println(arr_str[0]); //引用类型数组初始值为null
    }
    
}
