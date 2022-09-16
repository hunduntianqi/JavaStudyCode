package com.$11_Gather.GatherDemo.$1_CollectionGather;

/*
 *  需求:
 *      在启动游戏房间时, 应该提前准备好54张牌, 完成洗牌, 发牌, 牌排序, 逻辑
 *  分析:
 *      1. 当系统启动需要准备好数据时, 可以使用静态代码块
 *      2. 洗牌:打乱牌的顺序
 *      3. 定义三个玩家, 依次发出51张牌
 *      4. 给玩家的牌进行排序
 *  功能:
 *      1. 做牌
 *      2. 洗牌
 *      3. 定义三个玩家
 *      4. 发牌
 *      5. 排序
 *      6. 看牌
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class $2_CollectionGatherDemo2 {
    /**
     * 1. 定义一个静态的集合存储54张牌对象
     */
    public static List<$2_Card> all$2_Cards = new ArrayList<>();

    /**
     * 2. 做牌, 定义静态代码块初始化牌数据
     * */
    static {
        // 3. 定义点数
        String[] sizes = {"3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A", "2"};
        // 4. 定义花色
        String[] colors = {"♠", "♥", "♣", "♦"};
        // 5. 结合点数和花色
        int index = 0;
        for (String size : sizes) {
            index++;
            for (String color : colors) {
                // 6. 封装牌对象
                $2_Card c = new $2_Card(size, color, index);
                // 7. 存入到集合容器中
                all$2_Cards.add(c);
            }
        }

        // 8. 大小王存入到集合对象中
        $2_Card c1 = new $2_Card("", "小🃏", ++index);
        $2_Card c2 = new $2_Card("", "大🃏", ++index);
        Collections.addAll(all$2_Cards, c1, c2);
        System.out.println("新牌:" + all$2_Cards);
    }


    public static void main(String[] args) {
        // 9. 洗牌
        Collections.shuffle(all$2_Cards);
        System.out.println("洗牌后:" + all$2_Cards);

        // 10. 发牌 (定义三个玩家, 每个玩家的牌也是一个集合容器)
        List<$2_Card> linghuchong = new ArrayList<>();
        List<$2_Card> jiumozhi = new ArrayList<>();
        List<$2_Card> renyingying = new ArrayList<>();

        // 11. 开始发牌(从牌集合中发出51张牌给三个玩家, 剩余三张牌作为底牌)
        for (int i = 0; i < all$2_Cards.size() - 3; i++) {
            // 先拿到当前牌对象
            $2_Card c = all$2_Cards.get(i);
            if (i % 3 == 0) {
                linghuchong.add(c);
            } else if (i % 3 == 1) {
                jiumozhi.add(c);
            } else if (i % 3 == 2) {
                renyingying.add(c);
            }
        }

        // 12 拿到最后三张底牌
        List<$2_Card> lastThree$2_Cards = all$2_Cards.subList(all$2_Cards.size() - 3, all$2_Cards.size());


        // 13. 给玩家的牌排序(从大到小)
        sort$2_Cards(linghuchong);
        sort$2_Cards(jiumozhi);
        sort$2_Cards(renyingying);


        // 14. 输出玩家的牌
        System.out.println(linghuchong);
        System.out.println(jiumozhi);
        System.out.println(renyingying);
        System.out.println(lastThree$2_Cards);
    }

    private static void sort$2_Cards(List<$2_Card> $2_Cards) {
        Collections.sort($2_Cards, new Comparator<$2_Card>() {
            @Override
            public int compare($2_Card o1, $2_Card o2) {
                return o2.getIndex() - o1.getIndex();
            }
        });
    }
}
