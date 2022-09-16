package com.$20_OtherKnowledge.Demo.$4_ReflectDemo.$5_ReflectDemo;

import java.lang.reflect.Method;
import java.util.ArrayList;

public class ReflectDemo1 {
    public static void main(String[] args) throws Exception {
        // 需求: 反射实现泛型擦除后, 加入其它类型的元素
        ArrayList<String> lists_str = new ArrayList<>();
        ArrayList<Integer> lists_int = new ArrayList<>();

        System.out.println(lists_int.getClass());
        System.out.println(lists_str.getClass());
        System.out.println(lists_int.getClass() == lists_str.getClass());  // 结果为true, 证明泛型被擦除

        System.out.println("---------------------------------------");
        // 向Integer类型集合添加整型数据
        lists_int.add(24);
        lists_int.add(25);
        lists_int.add(26);
        // 添加str类型数据会报错
        // lists_int.add("郭鹏涛");
        // 利用反射向集合中添加其他类型数据
        Class c = lists_int.getClass();
        // 定位方法
        Method add = c.getDeclaredMethod("add", Object.class);
        add.invoke(lists_int, "郭鹏涛");
        System.out.println(lists_int);
    }
}
