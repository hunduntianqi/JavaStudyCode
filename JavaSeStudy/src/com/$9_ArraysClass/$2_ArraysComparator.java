package com.$9_ArraysClass;

/*
    自定义数组排序规则, Comparator比较器对象
 */

import java.util.Arrays;
import java.util.Comparator;

public class $2_ArraysComparator {
    public static void main(String[] args) {
        // 1. 对于有值特性的数组, Arrays的sort方法默认进行升序排序
        int[] arr = {10, 20, 11, 3, 9, 5, 15, 88, 999};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        
        // 2.需求:降序排序(自定义比较器对象, 只能支持引用类型的排序)
        Integer[] arr2 = {10, 20, 11, 3, 9, 5, 15, 88, 999};
        
        /**
         *  参数一:被排序的数组, 必须是引用数组
         *  参数二:匿名内部类对象, 代表了一个比较器对象
         */
        Arrays.sort(arr2, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                // 指定比较规则
                /**
                 * 1. 认为数据 大于 右边数据, 返回正整数
                 *2. 认为左边数据 小于 右边数据, 返回负整数
                 * 3. 认为左边数据 等于 右边数据, 返回0
                 */
//                return 0;
//                return o1 - o2; // 默认升序
                return o2 - o1; // 默认降序
            }
        });
        
        System.out.println(Arrays.toString(arr2));
    }
}
