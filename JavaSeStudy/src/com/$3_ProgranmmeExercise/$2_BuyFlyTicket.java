package com.$3_ProgranmmeExercise;

/*
    需求:
        1. 机票价格按照淡季旺季, 头等舱和经济舱收费, 输入机票原价, 月份和头等舱或经济舱
        2. 按照如下规则计算:旺季(5-10月)头等舱九折, 经济舱8.5折, 淡季(11-来年4月份)头等舱7折, 经济舱6.5折
    分析:
        1. 键盘录入机票原价, 月份和机舱类型
        2. 使用if判断月份是淡季还是旺季, 使用switch语句判断机舱是头等仓还是经济舱
        3. 选择对应折扣进行计算并返回计算结果

    判断值匹配:
        使用switch结构实现
    判断区间匹配:
        使用if分支结构实现
 */

import java.util.Scanner;

public class $2_BuyFlyTicket {
    public static void main(String[] args) {
        // 创建Scanner对象接收键盘录入结果
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入您购买的机票原价:");
        double money = sc.nextDouble();
        System.out.println("请输入您购买的机票月份(淡季/旺季):");
        int month = sc.nextInt();
        System.out.println("请输入您要购买的机舱类型(经济舱/头等舱):");
        String type = sc.next();
        double price = price(money, month, type);
        System.out.println("您购买的机票最终价格为:" + price + "元, 感谢您的使用, 祝您旅程愉快！！");
    }
    
    public static double price(double money, int month, String type) {
        double price = 0;
        // 判断月份是淡季还是旺季
        if (month >= 5 && month <= 10) {
            // 根据舱位判断价格折扣, 计算价格
            switch (type) {
                case "经济舱":
                    price = money * 0.85;
                    break;
                case "头等舱":
                    price = money * 0.9;
                    break;
                default:
                    price = -1;
            }
        } else if (month == 11 || month == 12 || month >= 1 && month <= 4) {
            // 根据舱位判断价格折扣, 计算价格
            switch (type) {
                case "经济舱":
                    price = money * 0.65;
                    break;
                case "头等舱":
                    price = money * 0.7;
                    break;
                default:
                    price = -1;
            }
        }
        return price;
    }
}
