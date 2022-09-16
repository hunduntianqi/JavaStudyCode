package com.$2_JavaBasicGrammar.$7_ArraySummarize;

public class $3_ArrayError {
    public static void main(String[] args) {
        // 数组索引越界
        int[] arr = {11, 22, 33};
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
//        System.out.println(arr[3]); // 索引越界,发生异常
        // 数组空指针异常
        arr = null;
        System.out.println(arr);
        System.out.println(arr[1]); //数组被赋值为null, 不是数组地址, 访问数组元素会发生异常
    }
}
