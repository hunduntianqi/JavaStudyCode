package javabasic.e_judgments_and_loops;

/*
    switch分支语句:
        语句格式:
            switch (表达式) {
                case 值1:
                    语句体1;
                    break;
                case 值2:
                    语句体2;
                    break;
                ....
                case 值n:
                    语句体n;
                    break;
                default:
                    语句体n+1;
                    break;
            }
            说明: 先计算表达式的值, 然后该值与case后的值进行比对, 当比对的值相同时, 则执行该case的语句体,
                  遇到break语句后, 结束switch语句; 如果所有case的值都不匹配, 则执行default中的语句体
            注意:
                case后面的值只能是字面量, 不能是变量, 而且不能重复
                case穿透:
                    如果case语句体中没有break, 在语句体执行完毕后, switch语句不会结束, 会继续执行下一个case语句
                    的语句体, 直到遇到break或所有switch语句执行结束才会停止
 */

import java.util.Scanner;

public class $2_Switch {
    public static void main(String[] args) {
        // 创建Scanner对象
        Scanner sc = new Scanner(System.in);
        // 定义变量接收键盘录入数据
        System.out.println("请输入你想要吃的面条:");
        String noodles = sc.next();
        // 使用switch语句进行判断选择
        switch (noodles) {
            case "兰州拉面":
                System.out.println("今天吃兰州拉面");
                break;
            case "武汉热干面":
                System.out.println("今天吃武汉热干面");
                break;
            case "北京炸酱面":
                System.out.println("今天吃北京炸酱面");
                break;
            case "陕西油泼面":
                System.out.println("今天吃陕西油泼面");
                break;
            default:
                System.out.println("这个没有, 今天只能吃方便面了。。。");
                break;
        }
    }
}
