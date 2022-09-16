package com.$11_Gather.GatherDemo.$4_NotVariableGatherDemo;

import java.util.List;
import java.util.Map;
import java.util.Set;

/*
    创建不可变集合
 */
public class $1_NotVariableGatherDemo {
    public static void main(String[] args) {
        // 1. List不可变集合
        List<String> lists = List.of("郭鹏涛", "陶静", "陈欣妮", "徐冬梅");
        System.out.println(lists);
//        lists.set(2, "刘思思"); // 创建的集合不可变, 此行代码执行时会报错！！
//        lists.add("郭鹏强"); // 创建的集合不可变, 此行代码执行时会报错！！
        System.out.println("---------------");

        // 2.String变集合
        Set<String> sets = Set.of("郭鹏涛", "陈欣妮", "徐冬梅", "李灵");
        System.out.println(sets);

        System.out.println("-----------------------");
        // 3. Map不可变集合
        Map<String, Integer> maps = Map.of("郭鹏涛", 23, "陈欣妮", 23, "徐冬梅", 23);
        System.out.println(maps);
    }
}
