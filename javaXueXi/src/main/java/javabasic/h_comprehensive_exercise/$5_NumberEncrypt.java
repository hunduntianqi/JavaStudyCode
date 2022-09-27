package javabasic.h_comprehensive_exercise;
/*
    练习五:数字加密
        需求: 某系统的数字密码(大于0), 比如1983, 采用加密方式进行传输
        加密规则:
            先得到每位数, 然后每位数都加上5, 再对10求余, 最后将所有数字反转, 得到一串新数
            分析:
                采用数组存储每一位数字, 然后对数组元素进行处理
 */

import java.util.Scanner;

public class $5_NumberEncrypt {
    public static void main(String[] args) {
        // 创建Scanner对象
        Scanner sc = new Scanner(System.in);
        // 定义字符串接收键盘录入数据
        System.out.println("请输入要加密的数字: ");
        String sNum = sc.next();
        // 定义数组存储字符串每一位的数字
        int[] arrayStr = new int[sNum.length()];
        // for循环为数组元素赋值
        for (int i = 0; i < arrayStr.length; i++) {
            arrayStr[i] = sNum.charAt(i) - 48;
        }
        arrayPrint(arrayStr);
        // 调用方法为数组元素进行加密处理
        int[] arrayAdd = arrayAddNumber(arrayStr); // 数组元素+5
        int[] arrayRemainder = arrayRemainder(arrayAdd); // 数组元素对10取余
        int[] arrayReversal = arrayReversal(arrayRemainder); // 数组元素进行反转
//        int numberEncrypt = Integer.parseInt(arrayPrintString(arrayReversal)); // 调用包装类将字符串转换为整数
        String numberStr = arrayPrintString(arrayReversal);
        System.out.println("加密后数字为: " + numberStr);
    }
    
    // 定义方法, 将数组各元素+5后返回新数组
    public static int[] arrayAddNumber(int[] array) {
        // 定义与传入数组参数同等长度的数组
        int[] arrayAdd = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            arrayAdd[i] = array[i] + 5;
        }
        arrayPrint(arrayAdd);
        return arrayAdd;
    }
    
    // 定义方法, 将数组各元素对10取余后返回新数组
    public static int[] arrayRemainder(int[] array) {
        // 动态初始化定义数组存储数据
        int[] arrayRemainder = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            arrayRemainder[i] = array[i] % 10;
        }
        arrayPrint(arrayRemainder);
        return arrayRemainder;
    }
    
    //定义方法, 将数组各元素进行反转
    public static int[] arrayReversal(int[] array) {
        for (int i = 0, j = array.length - 1; i <= j; i++, j--) {
            int temp = array[i];
            array[i] = array[j];
            array[j] = temp;
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
}
