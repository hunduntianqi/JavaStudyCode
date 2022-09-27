package javabasic.e_judgments_and_loops;

import java.util.Scanner;

/*
    for 循环语句:
        格式:
            for (初始化语句; 条件判断语句; 条件控制语句) {
                循环语句体;
            }
 */
public class $3_for {
    public static void main(String[] args) {
        // for循环打印九九乘法表
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " * " + i + " = " + (j * i) + "\t");
            }
            System.out.println();
        }
        System.out.println("-------------------");
        // for 循环计算0~100之间偶数和
        // 定义变量存储求和数据
        int sum = 0;
        for (int i = 0; i <= 100; i++) {
            if (i % 2 == 0) {
                sum += i;
            }
        }
        System.out.println("0~100之间的偶数和是:" + sum);
        System.out.println("-------------------------");
        
        // for 循环统计符合条件的数字
        /*
            键盘录入两个数字, 作为一个范围, 统计该范围内既能被3整除, 又能被5整除的数字个数
         */
        // 创建Scanner对象
        Scanner sc = new Scanner(System.in);
        // 定义变量接收数字
        System.out.println("请输入数字范围的下限值:");
        int lowerLimit = sc.nextInt();
        System.out.println("请输入数字范围的上限值:");
        int upperLimit = sc.nextInt();
        // 定义变量存储符合条件的数字个数
        int num = 0;
        for (int i = lowerLimit; i <= upperLimit; i++) {
            if ((i % 3 == 0) && (i % 5 == 0)) {
                num++; // 符合条件, 计数+1
                System.out.println(i);
            }
        }
        System.out.println("数字范围" + lowerLimit + "~" + upperLimit + "之间既能被3整除, 又能被5整除的数字个数为:" + num);
    }
}
