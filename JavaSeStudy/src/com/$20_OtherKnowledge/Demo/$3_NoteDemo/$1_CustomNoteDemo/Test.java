package com.$20_OtherKnowledge.Demo.$3_NoteDemo.$1_CustomNoteDemo;

/*
    目标: 学会自定义注解, 掌握其定义格式和语法
 */
@MyBook(name="《精通javaSe》", authors = {"黑马", "dlei"}, price=199.5)
public class Test {
    @Book("郭鹏涛")
    private Test() {}

    @MyBook(name="《精通javaSe》", authors = {"黑马", "dlei"}, price=199.5)
    public static void main(String[] args) {

    }
}
