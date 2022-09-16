package com.$2_JavaBasicGrammar.$8_methodStudy;

public class $2_MethodDemo {
    public static void main(String[] args) {
        // 调用方法sum
        int sum = sum(100);
        System.out.println("1-100的和是:" + sum);
        // 调用方法judge
        for (int i = 0; i < 100; i++) {
            judge(i);
        }
        // 定义整型数组, 调用方法max, min
        int[] arr = {1, 4, 9, 2, 3, 6, 0, 10000};
        int max = max(arr);
        System.out.println("数组最大值为:" + max);
        int min = min(arr);
        System.out.println("数组最小值为:" + min);
    }
    
    public static int sum(int n) {
        /**
         求和方法
         */
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }
    
    public static void judge(int num) {
        /**
         *  判断一个数是整数还是奇数
         */
        if (num % 2 == 0) {
            System.out.println("整数" + num + "是偶数");
        } else {
            System.out.println("整数" + num + "是奇数");
        }
    }
    
    public static int max(int[] arr) {
        int max = arr[0];
        for (int i = 0; i < arr.length - 1; i++) {
            max = max > arr[i + 1] ? max : arr[i + 1];
            
        }
        return max;
    }
    
    public static int min(int[] arr) {
        int min = arr[0];
        for (int i = 0; i < arr.length - 1; i++) {
            min = min < arr[i + 1] ? min : arr[i + 1];
        }
        return min;
    }
}
