package com.$5_CommonAPI.CommonAPIDemo.$2_ArrayListDemo;

/*
    需求:
        某个班级的考试在系统上进行, 成绩大致为:98, 77, 66, 89, 79, 50, 100
        现在需要把成绩低于八十分以下的数据去掉
    分析:
        定义ArrayList集合存储多名学员的成绩
        遍历集合中每个元素, 如果元素值低于80分, 删除该元素
 */

import java.util.ArrayList;

public class $2_ArrayListDemo1 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(98);
        list.add(77);
        list.add(66);
        list.add(89);
        list.add(79);
        list.add(50);
        list.add(100);
        System.out.println(list);
        // 遍历集合中每一个元素
        // 由于集合大小可变, 正向遍历删除同时进行会改变集合大小, 同时索引对应元素也会发生改变
//        for(int i = 0; i < list.size(); i++) {
//            int score = list.get(i);
//            System.out.println(score);
//            if (score < 80) {
//                list.remove(score);
//            }
//        }
        // 对于集合, 遍历删除同时进行, 需从后往前进行遍历操作
        for (int i = list.size() - 1; i >= 0; i--) {
            if (list.get(i) < 80) {
                list.remove(i);
            }
        }
        
        System.out.println(list);
    }
}
