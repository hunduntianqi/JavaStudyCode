package javabasic.k_ArrayList;

/*
    泛型:
        用来限制集合中存储的数据类型
    ArrayList集合:
        构造方法:
            ArrayList(): 创建一个空的初始容量为10的ArrayList集合容器
            ArrayList(int initialCapacity): 创建一个空的指定初始容量的ArrayList集合容器
            ArrayList(Collection<? extends E> c): 创建一个包含指定集合元素的ArrayList集合容器
        常用方法:
            1. void add(int index, E element): 在此集合中的指定位置插入指定的元素
            2. E remove(int index): 删除指定索引处的元素, 返回被删除的元素
            3. E set(int index, E element): 修改指定索引处的元素, 返回被修改的元素
            4. E get(int index): 返回指定索引处的元素
            5. int size(): 返回集合的长度, 即: 集合中元素的个数
        
 */

import java.util.ArrayList;

public class $2_ArrayList {
    public static void main(String[] args) {
        // 创建集合对象, 限制存储数据对象为String
        ArrayList<String> list = new ArrayList<String>();
        System.out.println(list);
        // 向集合添加元素
        list.add("添加一个元素");
        list.add("添加两个元素");
        list.add("添加三个元素");
        list.add("添加四个元素");
        System.out.println(list);
        // 根据索引删除一个元素
        list.remove(0);
        System.out.println(list);
        // 修改元素
        list.set(1, "索引一的元素被修改");
        System.out.println(list);
        // 查看集合元素个数
        System.out.println(list.size());
        // 遍历查询
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
