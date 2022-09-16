package com.$4_FaceObject.FaceDemo.$7_SimulationGoodsCar;

import java.util.Scanner;

/*
    需求分析:
        使用面向对象编程, 模拟购物车模块的功能, 需要实现添加商品到购物车中, 同时需要提供修改商品的购买数量,
        结算商品价格功能
    分析:
        1. 购物车中的每个商品都是一个对象, 需要定义一个商品类
        2. 购物车本身为一个对象, 可以使用数组对象代表购物车
        3. 完成界面架构, 让用户选择操作功能
 */
public class GoodsCar {
    public static void main(String[] args) {
        // 定义购物车对象, 使用数组表示
        Goods[] shopcar = new Goods[100];
        
        // 搭建操作架构
        boolean flag = true;
        while (flag) {
            System.out.println("请您选择如下命令进行操作:");
            System.out.println("1.添加商品到购物车:add");
            System.out.println("2.查询购物车商品展示:query");
            System.out.println("3.修改商品购买数量:update");
            System.out.println("4.结算购买商品金额:pay");
            System.out.println("5.退出:exit");
            Scanner sc = new Scanner(System.in);
            System.out.println("请您输入相关功能命令:");
            String command = sc.next();
            
            switch (command) {
                case "add":
                    // 添加商品到购物车
                    addgoods(shopcar, sc);
                    break;
                case "query":
                    // 查询购物车中的商品
                    querygoods(shopcar);
                    break;
                case "update":
                    // 修改商品的购买数量
                    updategoods(shopcar, sc);
                    break;
                case "pay":
                    // 结算购买商品金额
                    paygoods(shopcar, sc);
                    break;
                case "exit":
                    // 退出系统
                    System.out.println("感谢您的使用！！");
                    flag = false;
                    break;
                default:
                    System.out.println("请输入正确的命令！！");
            }
        }
    }
    
    private static void paygoods(Goods[] goods, Scanner sc) {
        // 结算商品金额
        System.out.println("请您输入要结算金额的商品编号:");
        int id = sc.nextInt();
        for (int i = 0; i < goods.length; i++) {
            if (goods[i].getId() == id) {
                double pay = 0;
                pay = goods[i].getBuyNumber() * goods[i].getPrice();
                System.out.println("您要购买的商品总价为:" + pay + "元");
                break;
            } else if (goods[i] == null) {
                System.out.println("您输入的编号有误!!");
            }
        }
        
    }
    
    private static void updategoods(Goods[] goods, Scanner sc) {
        // 修改商品的购买数量
        System.out.println("请输入您要修改商品的编号:");
        int userid = sc.nextInt();
        for (int i = 0; i < goods.length; i++) {
            if (userid == goods[i].getId()) {
                System.out.println("您要修改的商品是:" + goods[i].getName());
                System.out.println("请输入您要修改商品的购买数量:");
                goods[i].setBuyNumber(sc.nextInt());
                break;
            } else if (goods[i] == null) {
                System.out.println("您输入的商品id不存在");
            }
        }
        
    }
    
    private static void querygoods(Goods[] goods) {
        // 查看购物车商品信息
        System.out.println("===========您购买的商品信息如下===========");
        System.out.println("编号\t\t名称\t\t价格(元)\t\t购买数量");
        // 遍历商品对象数组, 显示所有商品信息
        for (int i = 0; i < goods.length; i++) {
            if (goods[0] == null) {
                System.out.println("您的购物车还没有任何商品！！");
                break;
            } else if (goods[i] != null) {
                System.out.print(goods[i].getId() + "\t\t");
                System.out.print(goods[i].getName() + "\t\t");
                System.out.print(goods[i].getPrice() + "\t\t");
                System.out.println(goods[i].getBuyNumber() + "\t\t");
            } else {
                break;
            }
        }
        System.out.println();
    }
    
    private static void addgoods(Goods[] goods, Scanner sc) {
        // 录入用户输入的购买商品信息
        System.out.println("请输入您购买商品的编号(不重复):");
        int id = sc.nextInt();
        System.out.println("请输入您购买商品的名称:");
        String name = sc.next();
        System.out.println("请输入您购买商品的数量:");
        int buyNumber = sc.nextInt();
        System.out.println("请输入您购买商品的价格:");
        double price = sc.nextDouble();
        // 将商品信息封装为商品对象
        Goods g = new Goods();
        g.setId(id);
        g.setName(name);
        g.setBuyNumber(buyNumber);
        g.setPrice(price);
        // 将商品对象添加到购物车数组中
        for (int i = 0; i < goods.length; i++) {
            if (goods[i] == null) {
                goods[i] = g;
                break;
            }
        }
        System.out.println("您的商品" + g.getName() + "已成功添加至购物车中");
    }
}

