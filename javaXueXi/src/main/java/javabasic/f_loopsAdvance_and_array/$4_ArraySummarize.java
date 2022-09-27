package javabasic.f_loopsAdvance_and_array;

/*
    数组概述:
        指一种容器, 可以用来存储同种数据类型的多个值
    数组定义:
        格式一:
            数据类型 [] 数组名;
            例: int[] arr1;
        格式二:
            数据类型 数组名[];
            例: int arr2[];
    数组的初始化:
        初始化: 在内存中, 为数组容器开辟空间, 并将数据存入容器中的过程
        静态初始化:
            完整格式:
                数据类型[] 数组名 = new 数据类型[] {元素1, 元素2, 元素3...};
                例: int[] array = new int[] {1, 2, 3, ...};
            简写格式:
                数据类型[] 数组名 = {元素1, 元素2, 元素3, ...};
                例: int[] array = {1, 2, 3, ...};
        动态初始化:
            初始化时只指定数组长度, 由系统为数组分配初始值
            格式:
                数据类型[] 数组名 = new 数据类型[数组长度];
                例: int[] arr = new int[3];
            动态初始化数组默认值:
                整数类型: 默认值为0
                小数类型: 默认值为0.0
                字符类型: 默认值为'/u0000' 空格
                布尔类型: 默认值为false
                引用数据类型: 默认值为null
    数组元素访问:
        格式: 数组名[索引];
        数组长度 = 数组名.length
    数组常见异常:
        1. 索引越界: 当访问了数组中不存在的索引时, 会发生索引越界异常
 */
public class $4_ArraySummarize {
    public static void main(String[] args) {
        // staticInitialize();
        // dynamicInitialize();
        arrayElementVisit();
    }
    
    public static void staticInitialize() {
        /*
            数组静态初始化练习
            完整格式: 数据类型[] 数组名 = new 数组类型[] {元素1, 元素2, ...};
            简写格式: 数据类型[] 数组名 = {元素1, 元素2, ...};
         */
        // 需求1: 定义数组存储5个学生的年龄
        int[] arrAge = {12, 13, 14, 15, 16};
        // 需求2: 定义数组存储三个学生的姓名
        String[] arrName = {"郭鹏涛", "张佳琪", "林薇"};
        // 需求3: 定义数组存储4个学生的身高
        double[] arrHeight = {169.2, 161.5, 156.7};
        // 打印三个数组
        System.out.println(arrAge);
        System.out.println(arrName);
        System.out.println(arrHeight);
    }
    
    public static void dynamicInitialize() {
        /*
            数组动态初始化练习
            格式: 数据类型[] 数组名 = new 数据类型[数组长度];
         */
        // 动态初始化定义数组
        int[] array = new int[3];
        // 为数组元素赋值
        array[0] = 1;
        array[1] = 2;
        array[2] = 3;
        System.out.println(array);
    }
    
    public static void arrayElementVisit() {
        // 定义一个数组, 并通过索引访问数组元素
        String[] arrayName = {"郭鹏涛", "张佳琪", "林薇"};
        // 访问数组元素
        System.out.println(arrayName[0]);
        System.out.println(arrayName[1]);
        System.out.println(arrayName[2]);
        // 修改数组元素
        arrayName[2] = "陈欣妮";
        System.out.println(arrayName[2]);
        // 通过for循环遍历数组
        for (int i = 0; i < arrayName.length; i++) {
            System.out.println(arrayName[i]);
        }
    }
}
