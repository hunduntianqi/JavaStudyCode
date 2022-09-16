package com.$8_Regex;

public class $2_RegexDemo1 {
    public static void main(String[] args) {
        // 只能是a, b, c
        System.out.println("a".matches("[abc]")); // true
        System.out.println("z".matches("[abc]")); // false
        
        // 不能是a, b, c
        System.out.println("a".matches("[^abc]")); // false
        System.out.println("z".matches("[^abc]")); // true
        
        // 以下匹配校验只能匹配单个字符
        System.out.println();
        System.out.println("a".matches("\\d")); // false
        System.out.println("3".matches("\\d")); // true
        System.out.println("333".matches("\\d")); // false, 默认只匹配一个字符
        System.out.println("z".matches("\\w")); // true
        System.out.println("2".matches("\\w")); // true
        System.out.println("21".matches("\\w")); // false
        System.out.println("你".matches("\\W")); // true
        System.out.println("--------------------------------");
        
        // 校验密码
        // 必须是数字, 字母, 下划线, 至少6位
        System.out.println("2251789949".matches("\\w{6,}")); // true
        System.out.println("22517@_acv".matches("\\w{6,}")); // false
        System.out.println("22517".matches("\\w{6,}")); // false
        
        // 验证码
        // 必须是数字和字母, 必须是4位
        System.out.println("sg54".matches("[a-zA-Z0-9]{4}")); // true
        System.out.println("sg547".matches("[a-zA-Z0-9]{4}")); // false
        System.out.println("sg54".matches("[\\w && [^_]]{4}")); // false
        System.out.println("sg547".matches("[\\w && [^_]]{4}")); // false
        
    }
}
