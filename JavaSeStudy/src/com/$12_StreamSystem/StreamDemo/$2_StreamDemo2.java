package com.$12_StreamSystem.StreamDemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

public class $2_StreamDemo2 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        Collections.addAll(list, "张无忌", "周芷若", "赵敏", "张强", "张三丰", "张三丰");

        // 获取集合Stream流
        Stream<String> streamList = list.stream();
        // 调用方法过滤元素
        streamList.filter((String s) -> s.startsWith("张")).forEach(s -> System.out.println(s));
        long size = list.stream().filter(s -> s.length() == 3).count();
        System.out.println(size);

        list.stream().filter(s -> s.startsWith("张")).limit(2).forEach(s -> System.out.println(s));
        list.stream().filter(s -> s.startsWith("张")).skip(2).forEach(s -> System.out.println(s));
    }
}
