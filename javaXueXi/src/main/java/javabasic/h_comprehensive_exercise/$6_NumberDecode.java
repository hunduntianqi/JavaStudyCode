package javabasic.h_comprehensive_exercise;

import java.util.Scanner;

/*
    练习六: 数字解密
    加密规则:
        先得到每位数, 然后每位数都加上5, 再对10求余, 最后将所有数字反转, 得到一串新数
    解密思路:
        1. 先将加密后的数字反转
        2. 原数字范围为0~9, 加5后数字范围为5~14, 对10取余后, 5~9 ==> 不变; 10-14 ==> 减10, 由此判断加密后数字是否大于5,
           大于5不变, 小于5加10
        3. 所有数字-5
 */
public class $6_NumberDecode {
    public static void main(String[] args) {
        // 创建Scanner对象
        Scanner sc = new Scanner(System.in);
        // 定义字符串接收键盘录入数据
        System.out.println("请输入要解密的数字: ");
        String sNum = sc.next();
        // 定义数组存储字符串每一位的数字
        int[] arrayStr = new int[sNum.length()];
        // for循环为数组元素赋值
        for (int i = 0; i < arrayStr.length; i++) {
            arrayStr[i] = sNum.charAt(i) - 48;
        }
        arrayPrint(arrayStr);
        int[] array = arrayReversal(arrayStr); // 反转数组元素
        array = judgeNumber(array); // 判断数组元素是否大于或等于5, 并对数组元素做相应处理
        array = arrayReduce(array); // 数组各元素-5
        String numberStr = arrayPrintString(array);
        System.out.println("解密后数字为: " + numberStr);
        
    }
    
    // 定义方法反转数组
    public static int[] arrayReversal(int[] array) {
        for (int i = 0, j = array.length - 1; i <= j; i++, j--) {
            int temp = array[i];
            array[i] = array[j];
            array[j] = temp;
        }
        arrayPrint(array);
        return array;
    }
    
    // 打印数组
    public static void arrayPrint(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (i == 0) {
                System.out.print("{" + array[i] + ", ");
            } else if (i == array.length - 1) {
                System.out.println(array[i] + "}");
            } else {
                System.out.print(array[i] + ", ");
            }
        }
    }
    
    // 定义方法处理反转后数组元素, 判断是否大于或等于5
    public static int[] judgeNumber(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] >= 0 && array[i] <= 4) {
                array[i] = array[i] + 10;
            }
        }
        arrayPrint(array);
        return array;
    }
    
    // 对数组元素-5, 得到原数组元素
    public static int[] arrayReduce(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = array[i] - 5;
        }
        arrayPrint(array);
        return array;
    }
    
    // 定义方法, 打印数组元素为字符串
    public static String arrayPrintString(int[] array) {
        String string = "";
        for (int i = 0; i < array.length; i++) {
            string += ""+ array[i];
        }
        return string;
    }
}
