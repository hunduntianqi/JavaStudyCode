package javabasic.c_javabasic_concept;
/*
    变量:
        指在程序执行过程中可能发生改变的量(数据)
        定义格式:
            数据类型 变量名 = 数据值;
            数据类型: 限定该变量可以存储的数据类型
            变量名: 存储空间的名字
            数据值: 指真正存在变量中的数据
        变量的使用方式:
            1. 输出打印
            2. 参与计算
            3. 修改变量记录的值
        变量注意事项:
            1. 一个变量只能存储一个数据
            2. 变量名不能重复
            3. 一条语句可以定义多个变量
            4. 变量在使用之前一定要进行赋值
            5. 变量的作用域范围
 */

public class $4_Variable {
    public static void main(String[] args) {
        // 变量定义演示
        int a = 10;
        System.out.println(a);  // 变量打印输出
        int b = 20;
        int c = a + b; // 变量参与计算
        System.out.println(c);

        a = 30; // 修改变量 a 记录的值
        System.out.println(a);

        // 一条语句定义多个变量
        int d = 100, e = 200, f = 300;
        System.out.println(d + e + f);

        /*
         仅定义变量
         double g;
         System.out.println(g); // 变量未初始化赋值, 会报错！！
        */
    }
}
