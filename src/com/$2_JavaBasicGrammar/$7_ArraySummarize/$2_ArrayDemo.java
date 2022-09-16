package com.$2_JavaBasicGrammar.$7_ArraySummarize;
/*
    数组各种操作
 */
public class $2_ArrayDemo {
    public static void main(String[] args) {
        arrayMax();
        arraySum();
    }
    
    // 数组求和
    public static void arraySum() {
        int[] arr = {1, 2, 3, 4, 5};
    
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.println("数组" + arr + "元素求和为:" + sum);
    }
    
    // 数组求最值
    public static void arrayMax() {
        int[] arr = {-5, 15, 9000, 10000, 20000, 9500};
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            max = max > arr[i] ? max : arr[i];
        }
        System.out.println("数组" + arr + "的最大值为:" + max);
    }
}
