package com.$12_StreamSystem.StreamDemo;

import java.util.*;
import java.util.stream.Stream;

public class $1_StreamDemo1 {
    public static void main(String[] args) {
        /** --------------------------------Collection集合获取Stream流-----------------------------*/
        Collection<String> list = new ArrayList<>();
        // 调用方法获取Stream流
        Stream<String> s = list.stream();
        /**----------------------------------Map集合获取Stream流-----------------------------------*/
        Map<String, Integer> maps = new HashMap<>();
        // 键流
        Stream<String> keyStream = maps.keySet().stream();
        // 值流
        Stream<Integer> valueStream = maps.values().stream();
        // 键值对流
        Stream<Map.Entry<String, Integer>> map = maps.entrySet().stream();

        /**------------------------数组获取Stream流----------------------*/
        String[] arr = {"赵敏", "小昭", "周芷若"};
        Stream<String> nameStream = Arrays.stream(arr);
        Stream<String> nameStream2 = Stream.of(arr);
    }
}
