package com.$11_Gather.GatherDemo.$2_MapGather;

/*
    统计投票人数:
        需求:
            某个班级80名学生, 现在需要组成秋游活动, 班长提供了四个景点依次是(A, B, C, D), 每个学生只能选择一个景点,
            请统计出最终那个景点想去的人数最多
        分析:
            1. 将80个学生选择的数据拿到程序中
            2. 定义Map集合存储最终统计的结果
            3. 遍历80个学生选择的数据, 看Map集合中是否存在, 不存在存入"数据=1", 存在则其对应值+1
 */

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class $2_MapGatherDemo2 {
    public static void main(String[] args) {
        String[] selects = {"A", "B", "C", "D"};
        StringBuilder sb = new StringBuilder();
        Random r = new Random();
        for (int i =0; i < 80; i++) {
            sb.append(selects[r.nextInt(selects.length)]);
        }
        System.out.println(sb);

        // 定义map集合记录最终统计结果
        Map<Character, Integer> infos = new HashMap<>();

        // 遍历80个学生选择的数据
        for (int i = 0; i < sb.length(); i++) {
            // 提取当前字符
            char ch = sb.charAt(i);
            if (infos.containsKey(ch)) {
                // 计算值+1
                infos.put(ch, infos.get(ch) + 1);
            } else {
                infos.put(ch, 1);
            }
        }

        System.out.println(infos);
        // 遍历集合输出结果
        infos.forEach((k, v) -> {
            System.out.println(k + ":" +v);
        });
    }
}
