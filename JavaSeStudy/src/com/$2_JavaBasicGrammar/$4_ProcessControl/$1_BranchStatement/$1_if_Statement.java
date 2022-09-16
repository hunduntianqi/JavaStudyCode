package com.$2_JavaBasicGrammar.$4_ProcessControl.$1_BranchStatement;
/*
    if 语句:
        根据判定的结果决定执行某个分支的代码
        格式1:
            if (条件表达式) {
                语句体;
            }
        格式2:
            if (条件表达式) {
                语句体1;
            } else {
                语句体2;
            }
        格式3:
            if (表达式1) {
                语句体1;
            } else if (表达式2) {
                语句体2;
            }
            ...
            else {
                语句体n;
            }
 */

import java.util.Scanner;

public class $1_if_Statement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入今天星期几:");
        int date = sc.nextInt();
        if (date == 1) {
            System.out.println("今天星期一");
        } else if (date == 2) {
            System.out.println("今天星期二");
        } else if (date == 3) {
            System.out.println("今天星期三");
        } else if (date == 4) {
            System.out.println("今天星期四");
        } else if (date == 5) {
            System.out.println("今天星期五");
        } else if (date == 6) {
            System.out.println("今天星期六");
        } else if (date == 7) {
            System.out.println("今天星期日");
        } else {
            System.out.println("您输入的星期数有误！！");
        }
    }
}
