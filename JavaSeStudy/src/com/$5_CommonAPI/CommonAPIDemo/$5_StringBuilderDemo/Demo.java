package com.$5_CommonAPI.CommonAPIDemo.$5_StringBuilderDemo;

/*
    需求:
        设计一个方法用于输出任意整形数组的内容, 要求输出成如下格式:
            "该数组内容为: [11, 22, 33, 44, 55]"
 */
public class Demo {
    public static void main(String[] args) {
        int[] arr1 = null;
        System.out.println(arr(arr1));
        
        int[] arr2 = {10, 88, 100, 99};
        System.out.println(arr(arr2));
        
    }
    
    public static String arr(int[] arr) {
        StringBuilder sb = new StringBuilder();
        sb.append("该数组内容为:[");
        if (arr != null) {
            for (int i = 0; i < arr.length; i++) {
                if (i == arr.length - 1) {
                    sb.append(arr[i]);
                } else {
                    sb.append(arr[i] + ", ");
                }
            }
            sb.append("]");
        } else {
            return null;
        }
        return sb.toString();
    }
}

