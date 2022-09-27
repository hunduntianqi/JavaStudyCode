package javabasic.j_string;

/*
    StringBuilder概述:
        可以看作是一个容器, 创建之后, 里面的内容是可变的
        作用:
            提高字符串的操作效率
        构造方法:
            1. public StringBuilder(): 创建一个空白可变的字符串对象, 不含有任何内容
            2. public StringBuilder(String str): 根据字符串的内容, 创建可变字符串对象
        常用方法:
            1. public StringBuilder append(任意类型): 添加数据, 并返回对象本身
            2. public StringBuilder reverse(): 反转容器内容
            3. public int length(): 返回容器长度
            4. public String toString(): 通过toString()可以实现将StringBuilder转换为String
        使用场景:
            1. 拼接字符串
            2. 反转字符串
 */

public class $3_StringBuilderSummarize {
    public static void main(String[] args) {
        // 创建StringBuilder对象
        StringBuilder sb = new StringBuilder("你好啊");
        // 添加元素
        sb.append("勇士");
        System.out.println(sb);
        // 反转元素
        sb.reverse();
        System.out.println(sb);
        // 获取容器长度
        System.out.println(sb.length());
        // toString()
        System.out.println(sb.getClass());
        String sbstr = sb.toString();
        System.out.println(sbstr.getClass());
    }
}
