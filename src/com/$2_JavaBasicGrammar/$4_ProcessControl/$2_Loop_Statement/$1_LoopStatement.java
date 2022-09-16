package com.$2_JavaBasicGrammar.$4_ProcessControl.$2_Loop_Statement;
/*
    for 循环格式:
        for (初始化语句; 条件判断语句; 条件控制语句) {
            循环体语句;
        }
        格式解释：
            * 初始化语句:用于表示循环开启时的起始状态，简单说就是循环开始的时候什么样
            * 条件判断语句:用于表示循环反复执行的条件，简单说就是判断循环是否能一直执行下去
            * 循环体语句:用于表示循环反复执行的内容，简单说就是循环反复执行的事情
            * 条件控制语句:用于表示循环执行中每次变化的内容，简单说就是控制循环是否能执行下去
    while 循环语句:
        格式:
            初始化语句;
            while (条件判断语句) {
                循环体语句;
                条件控制语句;
            }

    do...while循环语句:
        格式:
            初始化语句;
            do {
                循环体语句;
                条件控制语句;

            } while (条件判断语句);
    三种循环区别:
        * for循环和while循环先判断条件是否成立，然后决定是否执行循环体（先判断后执行）
        * do...while循环先执行一次循环体，然后判断条件是否成立，是否继续执行循环体（先执行后判断）
    for循环和while循环的区别:
        * 条件控制语句所控制的自增变量，因为归属for循环的语法结构中，在for循环结束后，就不能再次被访问到了
        * 条件控制语句所控制的自增变量，对于while循环来说不归属其语法结构中，在while循环结束后，该变量还可以继续使用
    死循环的三种格式:
        1. for (;;){}
        2. while (true) {}
        3. do {} while (true);
 */

public class $1_LoopStatement {
    public static void main(String[] args) {
        fordemo();
        whiledemo();
        dowhiledemo();
        shuixianhua();
        
    }
    
    public static void fordemo() {
        for (int i = 0; i <= 3; i++) {
            System.out.println("HelloWorld" + i);
        }
    }
    
    public static void whiledemo() {
        double high = 0.0001;
        int count = 0;
        while (high < 8844.43) {
            high *= 2;
            System.out.println("纸张当前厚度为:" + high + "米");
            count += 1;
        }
        System.out.println("需要折叠" + count + "次");
        
    }
    
    public static void dowhiledemo() {
        int i = 0;
        do {
            if (i == 5) {
                break;
            }
            i++;
        } while (i < 6);
        
        if (i == 5) {
            System.out.println("恭喜你,计算正确！！");
        } else {
            System.out.println("您的理解有误, 计算错误！！");
        }
    }
    
    public static void shuixianhua() {
        // 寻找水仙花数并输出
        int i = 100;
        int count = 0;
        while (i < 1000) {
            int ge = i % 10;
            int shi = i / 10 % 10;
            int bai = i / 100;
            if ((ge * ge * ge + shi * shi * shi + bai * bai * bai) == i) {
                System.out.println("水仙花数:" + i);
                count++;
            }
            i++;
        }
        System.out.println("水仙花数的个数为:" + count);
    }
}
