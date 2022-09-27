package javabasic.k_ArrayList.Demo.$1_ArrayListTraverse;

/*
    定义集合, 存入三个用户对象
    要求:
        定义一个方法, 根据id查找对应的用户信息
        存在则返回true, 不存在则返回false
 */

import java.util.ArrayList;
import java.util.Scanner;

public class $2_Test1 {
    public static void main(String[] args) {
        // 创建集合
        ArrayList<$2_User> list= new ArrayList<>();
        // 添加用户对象
        list.add(new $2_User(1, "郭鹏涛", "19980128"));
        list.add(new $2_User(2, "张佳琪", "19981028"));
        list.add(new $2_User(3, "郭鹏强", "20001003"));
        // 创建Scanner对象
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入查询对象的id值:");
        int id = sc.nextInt();
        // 调用方法判断id是否存在
        boolean flag = byIdQuery(id, list);
        if (flag) {
            System.out.println("存在此id的对象");
        } else {
            System.out.println("不存在此id的对象");
        }
    }
    
    // 定义方法, 根据id查询集合元素是否存在
    public static boolean byIdQuery (int id, ArrayList<$2_User> list) {
        // 判断集合是否为空
        if (list.size() == 0) {
            return false;
        } else {
            for (int i = 0; i < list.size(); i++) {
                $2_User user = list.get(i);
                if (id == user.getId()) {
                    System.out.println(user);
                    int index = i;
                    System.out.println("index = " + i);
                    return true;
                }
            }
        }
        return false;
    }
}
