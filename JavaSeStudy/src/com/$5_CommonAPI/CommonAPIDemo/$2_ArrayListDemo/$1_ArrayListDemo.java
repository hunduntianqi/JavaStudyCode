package com.$5_CommonAPI.CommonAPIDemo.$2_ArrayListDemo;

import java.util.ArrayList;

public class $1_ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Java");
        list.add("Java");
        list.add("MySQL");
        list.add("MyBatis");
        list.add("HTML");
        
        // 1、public E get(int index)：获取某个索引位置处的元素值
        System.out.println(list.get(0));
        
        // 2、public int size()：获取集合的大小（元素个数）
        System.out.println(list.size());
        
        // 3、完成集合的遍历
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        
        
        // 4、public E remove(int index)：删除某个索引位置处的元素值,并返回被删除的元素值
        String re = list.remove(0);
        System.out.println(re);
        System.out.println(list);
        // 5、public boolean remove(Object o):直接删除元素值，删除成功返回true，删除失败返回false
        list.remove("MySQL"); // 只会删除第一次出现的这个元素值，后面的不删除
        System.out.println(list);
        
        // 6、public E set(int index,E element)：修改某个索引位置处的元素值,返回被修改的元素值
        String se = list.set(0, "python");
        System.out.println(se);
        System.out.println(list);
        
    }
}
