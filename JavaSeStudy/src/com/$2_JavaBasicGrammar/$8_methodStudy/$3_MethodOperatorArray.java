package com.$2_JavaBasicGrammar.$8_methodStudy;

public class $3_MethodOperatorArray {
    public static void main(String[] args) {
        arrayMethodTest();
    }
    
    public static void arrayMethodTest() {
        int[] arr = {1, 2, 3, 4, 5};
        int index = arrayIndex(arr, 1);
        System.out.println("元素索引值为:" + index);
        arrPrint(arr);
    }
    // 定义方法查找数组元素的索引值
    public static int arrayIndex(int[] arr, int num) {
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == num) {
                index = i;
                break;
            } else if (i == arr.length - 1 & arr[i] != num) {
                index = -1;
            }
        }
        return index;
    }
    
    // 定义方法打印数组
    public static void arrPrint(int[] arr) {
        String str = "[";
        if (arr != null & arr.length > 0) {
            for (int i = 0; i < arr.length; i++) {
                if (i < arr.length - 1) {
                    str = str + arr[i] + ", ";
                } else {
                    str = str + arr[i] + "]";
                }
            }
            System.out.println("数组str:" + str);
        } else {
            System.out.println("数组异常！！");
        }
    }
}
