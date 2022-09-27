package javabasic.k_ArrayList.Demo.$1_ArrayListTraverse;

/*
    需求:
        定义一个集合, 存入三个手机对象
        定义方法, 将价格低于3000的手机信息返回
 */

import java.util.ArrayList;

public class $3_Test1 {
    public static void main(String[] args) {
        ArrayList<$3_Phone> list = new ArrayList<>();
        list.add(new $3_Phone("小米", 1000));
        list.add(new $3_Phone("苹果", 8000));
        list.add(new $3_Phone("锤子", 2999));
        // 调用方法, 返回价格低于3000的手机信息
        ArrayList<$3_Phone> listPhone = phoneMessage(list);
        System.out.println("价格低于3000的手机有:\n" + listPhone);
    }
    
    // 定义方法, 返回价格低于3000的手机信息
    public static ArrayList<$3_Phone> phoneMessage (ArrayList<$3_Phone> list) {
        // 创建集合, 存储满足条件的手机对象
        ArrayList<$3_Phone> listPhone = new ArrayList<>();
        // 遍历集合
        for (int i = 0; i < list.size(); i++) {
            double price = list.get(i).getPrice();
            if (price < 3000) {
                listPhone.add(list.get(i));
            }
        }
        return listPhone;
    }
}
