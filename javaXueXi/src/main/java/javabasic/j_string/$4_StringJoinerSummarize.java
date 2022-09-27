package javabasic.j_string;

/*
    StringJoiner:
        可以看成是一个容器, 创建之后内容也是可变的
        作用:
            提高字符串的操作效率, 代码编写简洁, 但目前市场上很少有人使用
        构造方法:
            1. public StringJoiner(间隔符号): 创建一个StringJoiner对象, 指定使用间隔符号进行拼接字符串
            2. public StringJoiner(间隔符号, 开始符号, 结束符号): 创建一个StringJoiner对象, 指定拼接字符串
                                                                时使用的间隔符号, 开始符号, 结束符号
        常用方法:
            1. public StringJoiner add(添加的内容): 添加数据, 并返回对象本身
            2. public int length(): 返回长度(容器中元素个数, 包括间隔符号, 开始 / 结束符号)
            3. public String toString(): 将StringJoiner对象转换为String对象返回
 */

import java.util.StringJoiner;

public class $4_StringJoinerSummarize {
    public static void main(String[] args) {
        // 创建StringJoiner对象
        StringJoiner sj = new StringJoiner(", ", "[", "]");
        // 定义数组
        int[] array = {1, 2, 3};
        for (int i = 0; i < array.length; i++) {
            sj.add(array[i] + "");
        }
        System.out.println(sj.toString());
    }
}
