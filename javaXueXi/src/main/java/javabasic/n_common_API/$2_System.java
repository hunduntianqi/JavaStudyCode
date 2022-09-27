package javabasic.n_common_API;
/*
    System:
        是一个工具类, 提供了一些与系统相关的方法
        常见方法:
            public static void exit (int status): 中止当前运行的Java虚拟机
            public static long currentTimeMillis(): 返回当前系统的时间毫秒值形式
            public static void arraycopy (数据源数组, 起始索引, 目的地数组, 起始索引, 拷贝元素个数): 数组拷贝
 */

import java.util.Arrays;

public class $2_System {
    public static void main(String[] args) {
        System.out.println("当前时间毫秒值为:%d".formatted(System.currentTimeMillis()));
        int[] startArray = {1, 2, 3, 4, 5, 6};
        int[] destinationArray = new int[4];
        // 拷贝数组
        System.arraycopy(startArray, 1, destinationArray, 0, 4);
        System.out.println(Arrays.toString(destinationArray));
        System.exit(0); // 中止当前运行的Java虚拟机
        System.out.println("=====================");
    }
}
