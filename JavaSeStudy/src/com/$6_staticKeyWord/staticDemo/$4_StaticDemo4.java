package com.$6_staticKeyWord.staticDemo;

/*
    需求:
        斗地主游戏牌的初始化操作
        模拟初始化牌操作
         点数: "3","4","5","6","7","8","9","10","J","Q","K","A","2"
         花色: "♠", "♥", "♣", "♦"
        在启动游戏房间时, 提前准备好54张牌, 后续才可以直接使用这些牌数据
    分析:
        1. 该房间只需要一副牌
        2. 定义一个静态的Array List集合储存54张牌对象, 静态的集合指只会加载一份
        3. 在启动游戏房间前, 应该将54张牌初始化好
        4. 当系统启动的同时需要准版好54张牌数据, 此时可以用静态代码块完成
 */

import java.util.ArrayList;

public class $4_StaticDemo4 {
    // 1.定义静态集合储存54张牌
    static ArrayList<String> cards = new ArrayList<>();
    
    // 2.在游戏启动前准备好54张牌, 使用静态代码块进行初始化
    static {
        // 3.加载54张牌
        // 4.准备4中花色, 类型确定, 个数确定
        String[] colors = {"♠", "♥", "♣", "♦"};
        // 5 定义点数
        String[] sizes = {"3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A", "2"};
        // 6.先遍历点数, 再组合花色
        for (int i = 0; i < sizes.length; i++) {
            for (int j = 0; j < colors.length; j++) {
                cards.add(sizes[i] + colors[j]);
            }
        }
        
        // 7.添加大小王
        cards.add("小🃏");
        cards.add("大🃏");
    }
    
    public static void main(String[] args) {
        System.out.println("新牌:" + cards);
    }
}
