package com.$16_FileAndIOClass.Demo.$3_RecursionDemo;

public class $2_RecursionDemo2 {
    // 定义一个静态成员变量存储可以买的酒数量
    public static int totalNumber;
    // 记录每次剩余的瓶子个数
    public static int lastBottleNumber;
    // 记录每次剩余的盖子个数
    public static int lastCoverNumber;

    public static void main(String[] args) {
        buy(10);
    }

    /**
     *      目标:
     *          啤酒2元1瓶, 4个盖子可以换一瓶, 2个空瓶可以换一瓶,
     *          请问10元可以喝多少瓶酒, 剩余多少空瓶和盖子
     */
    public static void buy(int money) {
        // 开始可以买多少瓶酒
        int buyNumber = money / 2;
        totalNumber += buyNumber;

        // 统计本轮剩余的盖子数
        int coverNumber = lastCoverNumber + buyNumber;
        // 统计本轮剩余瓶子数
        int bottleNumber = lastBottleNumber + buyNumber;

        // 将瓶子和盖子换算成钱
        int allMoney = 0;
        if (coverNumber >= 4) {
            allMoney += (coverNumber / 4) * 2;
        }
        lastCoverNumber = coverNumber % 4;

        if (bottleNumber >= 2) {
            allMoney += (bottleNumber / 2) * 2;
        }
        lastBottleNumber = bottleNumber % 2;

        if (allMoney >= 2) {
            buy(allMoney);
        }

        System.out.println("可以买的酒数量为:" + totalNumber + "剩余盖子数量为:" + lastCoverNumber
                + "剩余空瓶数量为:" + lastBottleNumber);
    }
}
