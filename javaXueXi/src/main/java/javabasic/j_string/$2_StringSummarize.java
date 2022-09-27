package javabasic.j_string;

/*
    字符串概述:
        java不会字符串, 开发凉一半~~~
        字符串学习内容:
            String
            StringBuilder
            StringJonier
            StringBuffer
            Pattern
            Matcher
        String类:
            位于Java.lang包下, Java程序中所有的字符串文字都为String类的对象
            字符串被创建后, 其内容不能发生改变
            创建String对象的两种方式:
                1. 直接赋值 == String var_name = value;
                2. 使用new关键字调用构造方法
                    常用构造方法:
                        a. public String(): 创建空白字符串, 不含任何内容
                        b. public String(String original): 根据传入的字符串, 创建字符串对象
                        c. public String(char[] chs): 根据字符数组, 创建字符串对象
                        d. public String(byte[] chs): 根据字节数组, 创建字符串对象
        Java常用方法==比较:
            "==": 基本数据类型, 比较的是具体的值
                  引用数据类型, 比较的是地址值
            字符串比较:
                boolean equals(要比较的字符串): 完全一样返回true, 否则返回false
                boolean equalslgnoreCase(要比较的字符串): 忽略大小写的比较
        String常用方法:
            1.public boolean equals(Object anObject):比较字符串的内容, 严格区分大小写
              public boolean equalsIgnoreCase(String anotherString):比较字符串的内容, 忽略大小写
            2.public char charAt(int index):返回指定索引处的char值
            3.public int length():返回字符串的长度
            4.public char[] toCharArray():将字符串转换成数组返回
            5.public String substring(int beginIndex, int endIndex):根据开始和结束索引进行截取, 得到新的字符串(包前不包后)
            6.public String substring(int beginIndex):从传入的索引位置开始截取, 截取到末尾, 得到新的字符串
            7.public String replace(CharSequence target, CharSequence replacement):使用新值, 将字符串中的旧值替换,
                                                                                   得到新的字符串
            8.public String[] split(String regex):根据传入的规则切割字符串, 得到字符串数组返回
 */

public class $2_StringSummarize {
    public static void main(String[] args) {
        // 直接赋值创建字符串对象
        String str1 = "这是直接赋值创建的字符串";
        System.out.println(str1);
        // 调用构造方法创建字符串对象
        // 空参
        String str2 = new String();
        System.out.println("@" + str2 + "!");
        // 以字符串为参数
        String str3 = new String("这是创建字符串的参数字符串");
        System.out.println(str3);
        // 以字符数组为参数
        char[] chs = {'你', '好', ',', '我', '是', '字', '符', '数', '组', '创', '建', '的', '字', '符', '串'};
        String str4 = new String(chs);
        System.out.println(str4);
        // 以字节数组为参数
        byte[] bys = {65, 66, 67, 68, 69, 70, 71};
        String str5 = new String(bys);
        System.out.println(str5);
        
        stringCompare();
    }
    
    public static void stringCompare() {
        // 比较字符串
        // 创建字符串
        String s1 = new String("郭鹏涛");
        String s2 = "郭鹏涛";
    
        System.out.println("s1 == s2 比较结果为: " + (s1 == s2));
        System.out.println("s1.equals(s2)比较结果为: " + s1.equals(s2));
    }
}
