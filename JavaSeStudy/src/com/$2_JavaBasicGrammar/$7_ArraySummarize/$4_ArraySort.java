package com.$2_JavaBasicGrammar.$7_ArraySummarize;

public class $4_ArraySort {
    public static void main(String[] args) {
        int[] arr = {-5, 15, 9000, 10000, 20000, 9500, 1000, 5000};
        sortMin(arr);
        sortMax(arr);
    }
    
    public static void sortMin(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                int num = 0;
                if (arr[j] < arr[j + 1]) {
                    arr[j] = arr[j];
                } else {
                    num = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = num;
                }
            }
        }
        
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        System.out.println("-----------------");
    }
    
    public static void sortMax(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                int num = 0;
                if (arr[j] > arr[j + 1]) {
                    arr[j] = arr[j];
                } else {
                    num = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = num;
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        
        System.out.println("-----------------");
    }
}
