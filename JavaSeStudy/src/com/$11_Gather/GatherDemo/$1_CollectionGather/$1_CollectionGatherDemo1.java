package com.$11_Gather.GatherDemo.$1_CollectionGather;

/*
    目标:明确Collection集合体系特点
 */

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

public class $1_CollectionGatherDemo1 {
    public static void main(String[] args) {
        // 有序, 可重复, 有索引
        Collection list = new ArrayList();
        list.add("Java");
        list.add("Java");
        list.add("Mybatis");
        list.add(23);
        list.add(23);
        list.add(false);
        list.add(false);
        System.out.println(list);

        // 无序, 不重复, 无索引
        Collection list2 = new HashSet();
        list2.add("Java");
        list2.add("Java");
        list2.add("Mybatis");
        list2.add(23);
        list2.add(23);
        list2.add(false);
        list2.add(false);
        System.out.println(list2);
    }
}
