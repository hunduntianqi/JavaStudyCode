package javabasic.k_ArrayList.Demo.$1_ArrayListTraverse;

/*
    需求:
        定义一个集合, 添加一些学生对象, 并进行遍历
 */

import java.util.ArrayList;

public class $1_Test1 {
    public static void main(String[] args) {
        // 创建一个集合
        ArrayList<$1_Student> list = new ArrayList<>();
        // 向集合添加学生对象
        list.add(new $1_Student("郭鹏涛", 24));
        list.add(new $1_Student("张佳琪", 23));
        list.add(new $1_Student("郭鹏强", 21));
        // 遍历集合
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
