package com.$2_JavaBasicGrammar.$6_OperatiorCharacter;
/*
    自增自减运算符计算演示！！
 */
public class $2_AutoIncreaseAndDecrease {
    public static void main(String[] args) {
        int a = 1;
        int i = a++; // a = a + 1, 变量a的值先赋给i,再加一
        System.out.println("变量i的值为:" + i);
        i = ++a; // 变量a的值先加一,再赋值给i
        System.out.println("变量i的值为:" + i);
        i = a--; // a = a - 1, 变量a的值先赋给i, 再减一
        System.out.println("变量i的值为:" + i);
        i = --a; // 变量a的值先减一, 再赋值给i
        System.out.println("变量i的值为:" + i);
    
        // 拓展案例
        int k = 3;
        int p = 5;
        int rs = k++ + ++k - --p + p-- - k-- + ++p + 2;
        System.out.println(k);
        System.out.println(p);
        System.out.println(rs);
    }
}
