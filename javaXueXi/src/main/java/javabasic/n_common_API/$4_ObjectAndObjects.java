package javabasic.n_common_API;
/*
    Object:
        是Java中的顶级父类, 所有的类都直接或间接的继承与Object类, Object类中的方法可以被所有子类访问
        构造方法:
            Object无成员变量, 只有一个空参构造
            public Object(): 空参构造
        成员方法:
            public String toString(): 返回对象的字符串表示形式
                如果打印一个对象, 想要看到对象的属性值, 需要重写toString方法, 将属性拼接为字符串返回
            public boolean equals(Object obj): 比较两个对象是否相等
                如果没有重写equals方法, 默认使用Object中的方法进行比较, 比较的是地址值是否相等
            protected Object clone(int a): 对象克隆
 */
public class $4_ObjectAndObjects {
    public static void main(String[] args) {
        // 打印对象字符串表现形式
        Object obj = new Object();
        System.out.println(obj.toString());
    }
}
