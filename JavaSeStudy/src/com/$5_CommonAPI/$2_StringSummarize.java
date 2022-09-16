package com.$5_CommonAPI;

/*
    String类定义的变量可以用于存储字符串, 同时String类提供了很多操作字符串的功能, 可以直接使用
    String类特点:
        1.字符串不可变，它们的值在创建后不能被更改
            1.1 String变量每次的修改其实都是产生并指向新的字符串对象
            1.2 原来的字符串对象都是没有改变的, 所以称为不可变字符串
        2.虽然String 的值是不可变的，但是它们可以被共享
        3.字符串效果上相当于字符数组( char[] ),但是底层原理是字节数组( byte[] )
    String类常用构造方法:
        1.public String():创建一个空白字符串对象，不含有任何内容
        2.public String(char[] chs):根据字符数组的内容，来创建字符串对象
        3.public String(byte[] bys):根据字节数组的内容，来创建字符串对象
        4.String s = "abc":直接赋值的方式创建字符串对象，内容就是abc
    String常用方法:
        1.public boolean equals(Object anObject):比较字符串的内容, 严格区分大小写
          public boolean equalsIgnoreCase(String anotherString):比较字符串的内容, 忽略大小写
        2.public char charAt(int index):返回指定索引处的char值
        3.public int length():返回字符串的长度
        4.public char[] toCharArray():将字符串转换成数组返回
        5.public String substring(int beginIndex, int endIndex):根据开始和结束索引进行截取, 得到新的字符串(包前不包后)
        6.public String substring(int beginIndex):从传入的索引位置开始截取, 截取到末尾, 得到新的字符串
        7.public String replace(CharSequence target, CharSequence replacement):使用新值, 将字符串中的旧值替换, 得到新的字符串
        8.public String[] split(String regex):根据传入的规则切割字符串, 得到字符串数组返回
    创建字符串对象两种方式的区别:
        1.通过构造方法创建:
            通过 new 创建的字符串对象，每一次 new 都会申请一个内存空间，虽然内容相同，但是地址值不同
        2.直接赋值方式创建:
            以""方式给出的字符串,只要字符序列相同(顺序和大小写),无论在程序代码中出现几次,JVM都只会建立一个 String 对象,
            并在字符串池中维护
    字符串的比较:
        1."=="号的作用:
            基本数据类型:比较的是具体的值
            引用数据类型:比较的是数据中存储的地址信息
        2.equals方法:
            public boolean equals(String s)
            字符串1.equals(字符串2):用于比较两个字符串内容是否相同, 区分大小写, 返回值为true或false
*/

public class $2_StringSummarize {
}
