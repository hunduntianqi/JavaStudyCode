package javabasic.h_comprehensive_exercise;

/*
    练习一:
        买飞机票:
            需求: 输入机票原价, 月份和经济舱, 头等舱等信息, 获取机票最终价格
            机票按照淡季旺季, 头等舱和经济舱进行收费, 按照如下规则计算机票价格:
            旺季(5-10月)==>头等舱9折, 经济舱8.5折; 淡季(11-4月)==>头等舱7折, 经济舱6.5折
            1. 根据月份判断淡旺季
            2. 根据机舱类型判断折扣
            3. 计算票价
 */

import java.util.Scanner;

public class $1_BuyTicket {
    public static void main(String[] args) {
        // 创建Scanner对象
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入机票原价: ");
        double price = sc.nextDouble();
        System.out.println("请输入购买舱型(经济舱==1 / 头等舱==0): ");
        int cabinType = sc.nextInt();
        System.out.println("请输入购买机票的时间(月份): ");
        int month = sc.nextInt();
        // 调用方法计算机票价格
        double ticketPrice = imputedPrice(price, month, cabinType);
        if (ticketPrice == 0.0) {
            System.out.println("您输入的数据有误！！");
        } else {
            System.out.println("您购买机票的价格是: " + ticketPrice + "元");
        }
    }
    
    public static double imputedPrice(double price, int month, int cabinType) {
        /* 根据输入的机票原件, 月份, 机舱类型, 计算实际票价 */
        if (month >= 5 & month <= 10) {
            System.out.println("旺季购票头等舱9折, 经济舱8.5折");
            if (cabinType == 0) {
                double ticketPrice = price * 0.9;
                return ticketPrice;
            } else if (cabinType == 1) {
                double ticketPrice = price * 0.85;
                return ticketPrice;
            } else {
                System.out.println("请输入正确的舱型！！");
                return 0.0;
            }
        } else if ((month >= 1 && month <= 4) || (month >= 11 && month <= 12)) {
            System.out.println("淡季购票头等舱7折, 经济舱6.5折");
            if (cabinType == 0) {
                double ticketPrice = price * 0.7;
                return ticketPrice;
            } else if (cabinType == 1) {
                double ticketPrice = price * 0.65;
                return ticketPrice;
            } else {
                System.out.println("请输入正确的舱型！！");
                return 0.0;
            }
        } else {
            System.out.println("输入月份错误！！");
            return 0.0;
        }
    }
}
