package javabasic.n_common_API;

/*
    Math:
        是一个用于进行数学计算的工具类, 构造方法私有, 所有方法都是静态的
        public static int abs (int a): 获取参数的绝对值
        public static double ceil (double): 向上取整
        public static double floor (double): 向下取整
        public static int round (float a): 四舍五入
        public static double pow (double a, double b): 返回a的b次幂的值
        public static double random (): 返回类型为double的随机值, 范围为[0.0, 1.0)
        
 */

public class $1_Math {
    public static void main(String[] args) {
        System.out.println("-3的绝对值为:" + Math.abs(-3)); // 3
        System.out.println("1.25向上取整为:" + Math.ceil(1.25)); // 2.0
        System.out.println("1.25向下取整为:" + Math.floor(1.25)); // 1.0
        System.out.println("4.2四舍五入为:" + Math.round(4.2)); // 4
        System.out.println("4.7四舍五入为:" + Math.round(4.7)); // 5
        System.out.println("4的3次幂为:" + Math.pow(4, 3)); // 64.0
        System.out.println("3开平方为:%.2f".formatted(Math.sqrt(3)));
        System.out.println("获取一个0-1的随机值:%.2f".formatted(Math.random()));
    }
}
