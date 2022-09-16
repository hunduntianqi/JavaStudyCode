package com.$5_CommonAPI;

/*
    集合:
        一种容器, 提供一种存储空间可变的存储模型, 存储的数据容量可以发生改变
        集合的特点:
            1.大小不固定, 类型也可以选择不固定
            2.集合适合做元素个数不确定, 且要进行增删操作的业务场景
            3.集合提供了许多丰富好用的功能
        注:集合中存储对象时, 存储的时对象的地址, 而不是对象的内容
    ArrayList:一种集合类, 底层是数组实现的，长度可以变化
    泛型:用于约束集合中存储元素的数据类型
        ArrayList<E>:泛型类, 可以在编译阶段约束集合对象只能操作某种数据类型
            例:ArrayList<String>:此集合只能操作字符串类型的元素
          注意:集合中只能存储引用数据类型, 不支持基本数据类型
    ArrayList类常用方法:
        1.构造方法:
            public ArrayList():创建一个空的集合对象
        2.成员方法:
            public boolean remove(object o):删除指定的元素, 返回删除是否成功
            public E remove(int index):删除指定索引的元素, 返回被删除的元素
            public E set(int index, E element):修改指定索引处的元素, 返回被修改的元素
            public E get(int index):返回指定索引处的元素
            public int size():返回集合中的元素个数
            public boolean add(E e):将指定的元素追加到集合末尾
            public void add(int index,E element):在集合指定位置插入指定元素
 */

import java.util.ArrayList;

public class $3_ArrayListSummarize {
    public static void main(String[] args) {
        // 创建ArrayList集合对象
        ArrayList list = new ArrayList();
        
        // 集合中添加数据
        list.add("java");
        list.add(" 永远的神！！");
        System.out.println(list);
        
        // 集合指定索引位置插入元素
        list.add(1, "python");
        System.out.println(list);
        
        list.remove(0);
        System.out.println(list);
    }
}
