package com.$5_CommonAPI;

/*
    Object类作用:
        1. 一个类要么默认继承了object类, 要么间接继承了object类, Object类是Java中的祖宗类
        2.Object类的方法是一切子类都可以直接使用的
        常用方法:
            1.public String toString():默认返回当前对象在堆内存中的地址信息:类的全限名@内存地址
            2.public Boolean equals(Object o):默认是比较当前对象与另一个对象的地址是否相同, 相同返回true, 不同返回false
            toString()方法:
                1.默认是打印当前对象的地址
                2.父类toString()方法存在的意义就是为了被子类重写, 以便返回对象的内容信息, 而不是地址信息
            equals()方法:
                1.默认是与另一个对象比较地址是否一样
                2.一般使用时让子类重写, 以便比较2个子类对象的内容是否相同
    Objects类:
        与Object类是继承关系, Objects类从JDK1.7开始才有的
        常见方法:
            1.public static boolean equals(Object a, Object b):比较两个对象, 底层会先进行非空判断, 避免空指针异常, 在进行equals比较
            2.public static boolean isNull(Object obj):判断变量是否为null, 为null返回true, 反之返回false
        注意:
            对象进行内容比较时, 建议使用Objects类, 比较结果与Object一样, 但是更安全, 可以避免空指针异常
 */

public class $4_ObjectClassSummarize {
}
