package com.$11_Gather.GatherDemo.$2_MapGather;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/*
    目标:认识Map体系的特点:按照键无序, 不重复, 无索引, 值不做要求
 */
public class $1_MapGatherDemo1 {
    public static void main(String[] args) {
        // 1. 创建一个Map集合对象
        Map<String, Integer> maps = new HashMap<>(); // 一行经典代码
        // 2. 添加元素
        maps.put("鸿星尔克", 3);
        maps.put("Java", 1);
        maps.put("枸杞", 100);
        maps.put("Java", 100); // 键名相同. 会覆盖该键原来的值
        maps.put(null, null);
        System.out.println(maps);

        // 1. 创建一个Map集合对象
        Map<String, Integer> maps2 = new LinkedHashMap<>(); // 一行经典代码
        // 2. 添加元素
        maps2.put("鸿星尔克", 3);
        maps2.put("Java", 1);
        maps2.put("枸杞", 100);
        maps2.put("Java", 100); // 键名相同. 会覆盖该键原来的值
        maps2.put(null, null);
        System.out.println(maps2);

        // 键找值遍历Map集合:
        // 1. 先获取键的Set集合
        Set<String> keys = maps.keySet();
        // 2. 遍历每个键, 根据键提取对应的值
        for (String key : keys) {
            System.out.println(key + ":"+maps.get(key));
        }

        System.out.println("-----------------------------------");

        // 键值对遍历集合
        // 1. 先将Map集合转换成Set集合
        Set<Map.Entry<String, Integer>> entries = maps.entrySet();
        // 2. 遍历Set集合
        for (Map.Entry<String, Integer> set : entries) {
            System.out.println(set.getKey() + ":" + set.getValue());
        }
        System.out.println("------------------------------------");
        // lambda表达式遍历
//        maps.forEach(new BiConsumer<String, Integer>() {
//            @Override
//            public void accept(String key, Integer value) {
//                System.out.println(key + ":" + value);
//
//            }
//        });
        // lambda表达式简化代码
        maps.forEach((k, v) -> {
            System.out.println(k + ":" + v);
        });
    }
}
