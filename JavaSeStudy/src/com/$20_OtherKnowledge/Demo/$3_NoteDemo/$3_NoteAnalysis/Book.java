package com.$20_OtherKnowledge.Demo.$3_NoteDemo.$3_NoteAnalysis;


import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.METHOD, ElementType.TYPE})  // 限制注解标记对象为类和成员方法
@Retention(RetentionPolicy.RUNTIME)  // 指明注解有效范围为一直有效
public @interface Book {
    String value();  // 书名
    double price() default 100.0;  // 价格
    String[] authors();  // 作者

}