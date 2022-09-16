package com.$10_LambdaExpression;

/*
    lambda表达式概述:
        JDK8开始后的一种新的语法形式
        作用:简化匿名内部类的代码写法
        lambda表达式的简化格式:
            (匿名内部类被重写方法的形参列表) -> {
                被重写方法的方法体代码;
            }
            注: -> 是语法形式, 无实际含义
        注意:lambda表达式只能简化函数式接口的匿名内部类的写法形式
        函数式接口:
            1. 必须是接口
            2. 有且仅有一个抽象方法
            3. 通常会在接口上加上一个@FunctionalInterface, 标记该接口必须满足函数式接口
 */

public class $1_LambdaExpressionSummarize {
    public static void main(String[] args) {
        // 学会使用lambda的标准格式简化匿名内部类的代码形式
        Animal a = new Animal() {
            @Override
            public void run() {
                System.out.println("乌龟跑的很慢！！");
            }
        };
        a.run();
        // Lambda表达式代码格式
        Animal a2 = () -> {
            System.out.println("老虎跑的特别快！！");
        };
        a2.run();
    }
}
