package com.$8_Regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class $3_RegexDemo2 {
    public static void main(String[] args) {
        // 使用正则表达式从字符串中解析出信息
        String rs = "来黑马程序学习Java,电话020-43422424,或者联系邮箱"
                + "itcast@itcast.cn,电话18762832633,0203232323"
                + "邮箱bozai@itcast.cn,400-100-3233 ,4001003232";
        
        // 1.定义解析规则, 字符串形式
        String regex = "(\\w{1,30}@[a-zA-Z0-9]{2,20}(\\.[a-zA-Z0-9]{2,20}){1,2})|(1[3-9]\\d{9})" +
                "|(0\\d{2,6}-?\\d{5,20})|(400-?\\d{3,9}-?\\d{3,9})";
        // 2. 编译正则表达式为一个匹配规则对象
        Pattern pattern = Pattern.compile(regex);
        
        // 3. 通过匹配规则对象得到一个匹配数据内容的匹配器对象
        Matcher matcher = pattern.matcher(rs);
        
        // 4. 通过匹配器从内容中解析出信息
        while (matcher.find()) {
            String rs1 = matcher.group();
            System.out.println(rs1);
        }
    }
}
