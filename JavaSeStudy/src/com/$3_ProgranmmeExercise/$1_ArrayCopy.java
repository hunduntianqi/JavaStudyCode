package com.$3_ProgranmmeExercise;

/*
    数组元素复制:
        创建新数组, 把原来数组元素的内容复制过去
 */

public class $1_ArrayCopy {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 5};
        int[] arr2 = new int[arr1.length];
        copy(arr1, arr2);
        printarray(arr1);
        printarray(arr2);
    }
    
    public static void copy(int[] arr1, int[] arr2) {
        
        for (int i = 0; i < arr1.length; i++) {
            arr2[i] = arr1[i];
        }
        
    }
    
    public static void printarray(int[] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(i == arr.length - 1 ? arr[i] : arr[i] + ", ");
        }
        System.out.println("]");
    }
}
