package com.$6_staticKeyWord;

public class $3_StaticMethod {
    private String name;
    private int age;
    
    /**
     * 实例方法:无static修饰, 属于对象的, 通常表示对象自己的行为
     */
    public void study() {
        System.out.println(this.name + "在好好学习, 努力修炼~~");
    }
    
    /**
     * 静态方法:有static修饰, 属于类, 可以被类和对象共享访问
     */
    public static void getMax(int a, int b) {
        System.out.println(a > b ? a : b);
    }
    
    public static void main(String[] args) {
        // 访问静态方法:类名.静态方法
        $3_StaticMethod.getMax(5, 10);
        // 在类中访问静态方法, 类名可省略不写
        getMax(10, 5);
        
        // 实例成员方法: 对象.成员方法
        $3_StaticMethod s1 = new $3_StaticMethod();
        s1.name = "郭鹏涛";
        s1.study();
        
        // 对象.静态方法
        s1.getMax(5, 7);
    }
}

