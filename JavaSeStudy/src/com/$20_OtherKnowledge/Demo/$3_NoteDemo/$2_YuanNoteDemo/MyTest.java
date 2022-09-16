package com.$20_OtherKnowledge.Demo.$3_NoteDemo.$2_YuanNoteDemo;


import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.METHOD) // 元注解 指明只可以注解方法
@Retention(RetentionPolicy.RUNTIME)  // 元注解 指明注解的生命周期为一直存在
public @interface MyTest {
}
