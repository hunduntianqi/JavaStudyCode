package com.$9_ArraysClass;

/*
    Arrays类:数组操作工具类, 专门用于操作数组元素
        常用方法:
            public static String toString(类型[] a):返回指定数组内容的字符串表示形式
            public static void sort(类型[] a):对于有值特性的数组进行默认升序排序
            public static <T> void sort(类型[] a, Comparator<? super T> c):使用比较器对象自定义排序
                自定义排序规则:
                    设置Comparator接口对应的比较器对象, 来定制比较规则
                        1. 认为数据 大于 右边数据, 返回正整数
                        2. 认为左边数据 小于 右边数据, 返回负整数
                        3. 认为左边数据 等于 右边数据, 返回0
            public static int binarySearch(int[] a, int key):二分搜索数组中的数据, 存在返回索引, 不存在返回-1
                二分查找:
                     前提:必须是排好序的数据
                     每次查询后去掉一半的数据后继续查找
 */

import java.util.Arrays;

public class $1_ArraysClassSummarize {
    public static void main(String[] args) {
        int[] arr = {10, 2, 55, 23, 24, 100};
        // 返回数组内容
        String rs = Arrays.toString(arr); // 返回包含数组内容的字符串
        System.out.println(rs);
        
        // 默认对数组进行升序排序
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        
        // 二分搜索技术(数组必须先排好序)
        System.out.println(Arrays.binarySearch(arr, 1000));
    }
}
