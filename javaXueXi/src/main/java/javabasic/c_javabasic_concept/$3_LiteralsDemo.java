package javabasic.c_javabasic_concept;

public class $3_LiteralsDemo {
    // 目标: 掌握常见字面量在代码中如何书写
    public static void main(String[] args) {
        // 定义整数
        int age = 10;
        System.out.println("我的年龄是:" + age + "岁");
        // 定义小数
        float money = 12.5F;
        double price = 15.5;
        System.out.println("我的口袋里面只有" + money + "元, 但是这顿饭花了" + price + "元");
        // 定义字符串变量
        String str = "我是一个单身狗";
        System.out.println(str);
        // 定义字符变量
        char ch = 'A';
        System.out.println("字符" + ch + "的Ascii码是65");
        // 定义Boolean变量
        boolean bl = 1 > 2;
        boolean bl2 = 1 < 2;
        System.out.println("1 > 2 是 " + bl + " , 1 < 2 是 " + bl2);

        System.out.println("name" + "\t" + "age");
        System.out.println("tom" + "\t\t" + "23");
    }
}
