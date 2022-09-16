package com.$20_OtherKnowledge.Demo.$3_NoteDemo.$3_NoteAnalysis;

/*
    目标:
        完成注解的解析
    需求:
        注解解析的案例
        分析:
            1. 定义注解Book, 要求如下:
                1.1 包含属性: String value() 书名
                1.2 包含属性: double price() 价格, 默认值为 100
                1.3 包含属性: String[] authors() 多位作者
                1.4 限制注解使用的位置: 类和成员方法上
                1.5 指定注解的有效范围: RUNTIME
            2. 定义BookStore类, 在类和成员方法上使用Book注解
            3. 定义AnnotationDemo01测试类获取Book注解上的数据
 */

import java.lang.reflect.Method;

public class Test {
    // 解析类上面的注解
    @org.junit.Test
    public void parseClass() {
        // 1. 先得到类对象
        Class c = BookStore.class;
        // 2. 判断类上面是否存在注解
        if (c.isAnnotationPresent(Book.class)) {
            // 3. 获取注解对象
            Book book = (Book) c.getDeclaredAnnotation(Book.class);
            System.out.println(book.value());
            System.out.println(book.price());
            System.out.println(book.authors());
        }

    }

    // 解析方法上的注解
    @org.junit.Test
    public void parseMethod() throws Exception {
        // 1. 先得到类对象
        Class c = BookStore.class;
        // 2. 获取方法对象
        Method m = c.getDeclaredMethod("test");
        // 3. 判断方法是否有注解标记
        if (m.isAnnotationPresent(Book.class)) {
            Book book = (Book) m.getDeclaredAnnotation(Book.class);
            System.out.println(book.value());
            System.out.println(book.price());
            System.out.println(book.authors());
        }
    }
}
