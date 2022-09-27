package javabasic.c_javabasic_concept;

public class $4_VariableDemo {
    /*
        定义变量, 计算公交车到站后乘客人数:
            开始: 没有乘客
            第一站: 上去一位乘客
            第二站: 上去两位乘客, 下去一位乘客
            第三站: 上去两位乘客, 下去一位乘客
            第四战: 下去一位乘客
            第五战: 上去一位乘客
     */
    public static void main(String[] args) {
        // 定义变量存储乘客人数
        int a = 0;
        System.out.println("刚开始车上乘客人数为:" + a);
        System.out.println("过了第一站后车上人数为:" + (a + 1));
        a = a + 1;
        System.out.println("过了第二站后车上人数为:" + (a + 2 - 1));
        a = a + 2 - 1;
        System.out.println("过了第三站后车上人数为:" + (a + 2 - 1));
        a = a + 2 - 1;
        System.out.println("过了第四站后车上人数为:" + (a - 1));
        a = a - 1;
        System.out.println("过了第五站后车上人数为:" + (a + 1));
        a = a + 1;
        System.out.println("到达终点站后公交车上人数为:" + a);
    }
}
