package javabasic.e_judgments_and_loops;

/*
    if语句:
        条件判断语句
        格式一:
            if (关系表达式) {
                语句体;
            }
            说明: 关系表达式结果为真, 则执行{}内的语句体, 否则不执行
        格式二:
            if (关系表达式) {
                语句体1;
            } else {
                语句体2;
            }
            说明: 关系表达式结果为真, 执行语句体1; 关系表达式结果为假, 执行语句体2
        格式三:
            if (关系表达式1) {
                语句体1;
            } else if (关系表达式2) {
                语句体2;
            }
            ....
            else {
                语句体n+1;
            }
            说明: 当关系表达式1为真, 执行语句体1; 关系表达式1为假, 判断关系表达式2是否为真, 若为真, 执行语句体2;
                  依次类推, 当所有关系表达式都为假, 执行语句体n+1
 */

import java.util.Scanner;

public class $1_If {
    public static void main(String[] args) {
        // 判断输入的数字是否大于100
        // 创建Scanner对象
        Scanner sc = new Scanner(System.in);
        // 定义变量接收键盘录入数据, 模拟电影院票号(1~100)
        System.out.println("请输入电影票票号:");
        int num = sc.nextInt();
        // 判断数字是否大于100
        if (num > 100 || num < 1) {
            System.out.println("输入的电影票票号有误");
        } else {
            System.out.println("电影票号正确");
            // 判断输入的数字是奇数还是偶数, 奇数打印做左边, 偶数打印坐右边
            if (num % 2 == 0) {
                System.out.println("偶数坐右边");
            } else {
                System.out.println("奇数坐左边");
            }
        }
    }
}
