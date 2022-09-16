package com.$5_CommonAPI.CommonAPIDemo.$5_StringBuilderDemo;

/*
    目标:学会使用StringBuilder操作字符串,并知道性能好的原因
 */

public class StringBuilderDemo {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        sb.append("a");
        sb.append("b");
        sb.append("c");
        sb.append("d");
        sb.append(1);
        sb.append(false);
        sb.append(3.3);
        System.out.println(sb);
        System.out.println(sb.reverse());
        System.out.println(sb.length());
        System.out.println(sb.toString());
        String re = sb.toString();
        System.out.println(re);
    }
}
