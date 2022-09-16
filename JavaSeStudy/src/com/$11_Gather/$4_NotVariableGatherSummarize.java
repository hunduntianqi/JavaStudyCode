package com.$11_Gather;

/*
    不可变集合对象:
        指不可被修改的集合, 也不可被添加和删除元素
        集合的数据项在创建的时候提供, 并且在整个生命周期中都不可改变！！
        为何使用不可变集合:
            1. 如果某个数据不可被修改, 把它防御性的拷贝到不可变集合是一个很好的实践
            2. 当集合对象被不可信的库调用时, 不可变形式是安全的
        创建不可变集合:
            在List, Set, Map集合接口中存在of方法, 可以创建一个不可变集合
            1. static <E> List<E> of(E...elements): 创建一个具有指定元素的List集合对象
            2. static <E> Set<E> of(E...elements): 创建一个具有指定元素的Set集合对象
            3. static <K, V> Map<K, V> of(E...elements): 创建一个具有指定元素的Map集合对象
 */

public class $4_NotVariableGatherSummarize {
}
