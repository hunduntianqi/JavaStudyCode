package javabasic.h_comprehensive_exercise;

import java.util.Random;

/*
    练习四: 评委打分
        需求:
            在唱歌比赛中, 由6名评委给选手打分, 分数范围是0-100之间的整数,
            选手的最后得分为: 去掉最高分和最低分后四个评委的平均分
 */
public class $4_JudgeScore {
    public static void main(String[] args) {
        // 动态初始化定义数组
        int[] array = new int[6];
        // 创建Random对象, 随机生成六个评委的打分结果
        Random random = new Random();
        // for循环为数组元素赋值
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(41) + 60;
        }
        // 调用方法打印数组
        arrayPrint(array);
        // 调用方法计算数组最大值
        int max = maxScore(array);
        // 调用方法计算数组最小值
        int min = minScore(array);
        // 调用方法计算数组元素之和
        int sum = sumScore(array);
        // 计算评委最终打分结果
        double score = (sum - max - min) / 4.0;
        System.out.println("选手的最终得分为: " + score);
    }
    
    // 定义方法计算数组最大值
    public static int maxScore(int[] array) {
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            max = max > array[i] ? max : array[i];
        }
        return max;
    }
    
    // 定义方法计算数组最小值
    public static int minScore(int[] array) {
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            min = min < array[i] ? min : array[i];
        }
        return min;
    }
    
    // 定义方法计算数组所有元素之和
    public static int sumScore(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return sum;
    }
    
    // 定义方法打印数组
    public static void arrayPrint(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (i == 0) {
                System.out.print("{" + array[i] + ", ");
            } else if (i == array.length - 1) {
                System.out.println(array[i] + "}");
            } else {
                System.out.print(array[i] + ", ");
            }
        }
    }
}
