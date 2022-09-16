package com.$6_staticKeyWord.staticDemo;

public class $3_StaticDemo3 {
    private String name;
    
    /**
     *  构造代码块, 属于对象, 与对象一起加载, 自动触发执行
     */ {
        System.out.println("实例(构造)代码块被触发执行");
        name = "谁都不";
    }
    
    public void $3_StaticDemo3() {
        System.out.println("构造起被触发执行");
    }
    
    public static void main(String[] args) {
        // 学习构造代码块的特点, 作用
        
        $3_StaticDemo3 s = new $3_StaticDemo3();
        s.$3_StaticDemo3();
        System.out.println(s.name + "喜欢郭鹏涛");
    }
}

