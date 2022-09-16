package com.$3_ProgranmmeExercise;

/*
    数字加密:
        需求:
            某系统的数字密码, 比如1983, 采用加密方式进行传输, 规则如下:先得到每位数, 然后每位数都加上5, 再对10求余,
            最后将所有数字反转, 得到一串新数
        分析:
            1. 将每位数据存入到数组中
            2. 遍历数组按照规则更改每位数据
            3. 把更改后的数据重新存入数组
 */

public class $6_NumberEncryption {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        printArray(arr);
        encryption(arr);
        printArray(arr);
        printStr(arr);
        decode(arr);
        printArray(arr);
    }
    
    public static void encryption(int[] arr) {
        //遍历数组每位元素
        for (int i = 0; i < arr.length; i++) {
            // 根据加密规则, 对数据进行处理
            arr[i] = (arr[i] + 5) % 10;
        }
        printArray(arr);
        // 调用函数对数组进行翻转
        reversal(arr);
        
    }
    
    public static void reversal(int[] arr) {
        for (int i = 0; i < arr.length / 2; i++) {
            int num = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = num;
        }
    }
    
    public static void printArray(int[] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(i == arr.length - 1 ? arr[i] : arr[i] + ", ");
        }
        System.out.println("]");
    }
    
    public static void decode(int[] arr) {
        reversal(arr);
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i] + 10 - 5;
            if (arr[i] >= 10) {
                arr[i] -= 10;
            }
        }
    }
    
    public static void printStr(int[] arr) {
        String str = "";
        for (int i = 0; i < arr.length; i++) {
            str += arr[i];
        }
        System.out.println(str);
    }
}
