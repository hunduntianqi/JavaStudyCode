package javabasic.k_ArrayList.Demo.$1_ArrayListTraverse;

import java.util.ArrayList;
import java.util.Scanner;

/*
    需求:
        定义一个集合, 添加一些学生对象, 对象的数据来自键盘录入
 */
public class $1_Test2 {
    public static void main(String[] args) {
        // 创建集合
        ArrayList<$1_Student> list = new ArrayList<>();
        // 创建Scanner对象
        Scanner sc = new Scanner(System.in);
        // 定义变量接收键盘录入数据
        String name;
        int age;
        for (int i = 0; i < 3; i++) {
            System.out.printf("请输入第%d个Student对象的name: \n", i + 1);
            name = sc.next();
            System.out.printf("请输入第%d个Student对象的age: \n", i + 1);
            age = sc.nextInt();
            // 创建学生对象并存入集合
            list.add(new $1_Student(name, age));
        }
        
        // 遍历集合
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
