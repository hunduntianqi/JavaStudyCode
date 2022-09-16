package com.$2_JavaBasicGrammar.$6_OperatiorCharacter;
/*
    算数运算符:
        | 符号 | 作用 | 说明                         |
        | ---- | ---- | --------------------------|
        | +    | 加   | 参看小学一年级               |
        | -    | 减   | 参看小学一年级               |
        | *    | 乘   | 参看小学二年级，与“×”相同    |
        | /    | 除   | 参看小学二年级，与“÷”相同    |
        | %    | 取余 | 获取的是两个数据做除法的余数 |
        注意:
            "+"符号参与字符串运算,可以作为连接符,其运算结果依然为字符串
                运算规则:能算则算, 不能算就在一起！！
    自增自减运算符:
        1. ++ :自增运算符, 变量自身的值加一
        2. -- :自减运算符, 变量自身的值减一
        注意:
            1. ++ 和 -- 即可以放在变量的后边, 也可以放在变量的前边
            2. ++ 、 -- 只能操作变量, 不能直接操作数据
    赋值运算符:
        "=":基本赋值运算符
    扩展赋值运算符:
        | +=   | 加后赋值   | a+=b，将a+b的值给a   |
        | ---- | ---------- | -------------------- |
        | -=   | 减后赋值   | a-=b，将a-b的值给a   |
        | *=   | 乘后赋值   | a*=b，将a×b的值给a   |
        | /=   | 除后赋值   | a/=b，将a÷b的商给a   |
        | %=   | 取余后赋值 | a%=b，将a÷b的余数给a |
      注意:扩展赋值运算符隐含有强制类型转换
    关系运算符:
        | 符号 | 说明                                                    |
        | ---- | ------------------------------------------------------- |
        | ==   | a==b，判断a和b的值是否相等，成立为true，不成立为false   |
        | !=   | a!=b，判断a和b的值是否不相等，成立为true，不成立为false |
        | >    | a>b，判断a是否大于b，成立为true，不成立为false          |
        | >=   | a>=b，判断a是否大于等于b，成立为true，不成立为false     |
        | <    | a<b，判断a是否小于b，成立为true，不成立为false          |
        | <=   | a<=b，判断a是否小于等于b，成立为true，不成立为false     |
    逻辑运算符:
        | 符号 | 作用     | 说明                                         |
        | ---- | -------- | -------------------------------------------- |
        | &    | 逻辑与   | a&b，a和b都是true，结果为true，否则为false   |
        | |    | 逻辑或   | a\|b，a和b都是false，结果为false，否则为true |
        | ^    | 逻辑异或 | a^b，a和b结果不同为true，相同为false         |
        | !    | 逻辑非   | !a，结果和a的结果正好相反                    |
    短路逻辑运算符:
        | 符号 | 作用   | 说明                         |
        | ---- | ------ | ---------------------------- |
        | &&   | 短路与 | 作用和&相同，但是有短路效果  |
        | ||   | 短路或 | 作用和|相同，但是有短路效果 |
        注意:
            - 逻辑与&，无论左边真假，右边都要执行
            - 短路与&&，如果左边为真，右边执行；如果左边为假，右边不执行
            - 逻辑或|，无论左边真假，右边都要执行
            - 短路或||，如果左边为假，右边执行；如果左边为真，右边不执行
    三元运算符:
        格式:条件表达式?值1:值2;
        首先计算表达式的值,条件成立,返回值1, 条件不成立,返回值2
 */

public class $1_OperatorCharactor {
    public static void main(String[] args) {
        int a = 10;
        int b = 3;
        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println(a * 1.0 / b);
        System.out.println(a % b);
        
        str();
        
        int c = max();
        System.out.println(c);
    }
    
    // ‘+’符号参与字符串运算
    public static void str() {
        // 目标：+符号做连接符的识别
        int a = 5;
        System.out.println("abc" + 'a'); // abca
        System.out.println("abc" + a);   // abc5
        System.out.println(5 + a); // 10
        System.out.println("abc" + 5 + 'a'); // abc5a
        System.out.println(15 + "abc" + 15); // 15abc15
        System.out.println(a + 'a'); // 102
        System.out.println(a + "" + 'a'); // 5a
        System.out.println(a + 'a' + " itheima "); // 102 itheima
        System.out.println("itheima" + a + 'a'); // itheima5a
        System.out.println("itheima" + (a + 'a'));// itheima102
    }
    
    // 三元运算符练习
    public static int max() {
        int a = 10;
        int b = 20;
        int c = 30;
        int max;
        max = a > b ? a : b;
        max = max > c ? max : c;
        System.out.println("最大值为:" + max);
        return max;
    }
}
