package javabasic.j_string.Demo.$1_StringDemo;

/*
    拼接字符串:
        定义一个方法, 把数组中的数据按照指定格式拼接成一个字符串返回
        例:
            数组 int[] arr= {1, 2, 3};
            拼接后为: [1, 2, 3]
 */

public class $5_JointString {
    public static void main(String[] args) {
        // 定义数组
        int[] arr = {1, 2, 3, 4, 5, 6};
        jointString(arr);
    }
    
    // 定义方法, 拼接字符串
    public static String jointString (int[] array) {
        if (array == null) {
            return "";
        }
        
        if (array.length == 0) {
            return "[]";
        }
        String str = "[";
        for (int i = 0; i < array.length; i++) {
            if (i == array.length - 1) {
                str = str + array[i] + "]";
            } else {
                str = str + array[i] + ", ";
            }
        }
        System.out.println(str);
        return str;
    }
}
