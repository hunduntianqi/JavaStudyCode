package com.$6_staticKeyWord;

/*
    设计模式:
        指一套被前人反复使用, 多数人知晓, 经过分类编目的代码设计经验的总结, 后来者可以直接拿来解决问题
    单例模式:
        可以保证系统中, 应用该模式的类永远只有一个实例, 即一个类只能创建一个对象
    单例实现方式:
        1. 饿汉单例:
            指在用类获取对象时, 对象已经提前创建好了
            设计步骤:
                1.1 定义一个类, 把构造器私有
                1.2 在类中定义一个静态变量存储一个对象
        2. 懒汉单例
            指在真正需要该对象时, 才去创建一个对象(延迟加载对象)
            设计步骤:
                2.1 定义一个类, 把构造器私有
                2.2 在类中定义一个静态变量存储一个对象
                2.3 提供一个返回单例对象的方法
 */

public class $2_SingleInstance {
    public static void main(String[] args) {
        /**
         *  饿汉单例
         */
        $2_SingleTest1 s11 = $2_SingleTest1.instance;
        $2_SingleTest1 s12 = $2_SingleTest1.instance;
        $2_SingleTest1 s13 = $2_SingleTest1.instance;
        
        System.out.println(s11);
        System.out.println(s12);
        System.out.println(s13);
        System.out.println(s13 == s12);
        
        /**
         *  懒汉单例
         */
        
        $2_SingleTest2 s21 = $2_SingleTest2.getInstance();
        $2_SingleTest2 s22 = $2_SingleTest2.getInstance();
        $2_SingleTest2 s23 = $2_SingleTest2.getInstance();
        
        System.out.println(s21);
        System.out.println(s22);
        System.out.println(s23);
        System.out.println(s21 == s23);
    }
}
