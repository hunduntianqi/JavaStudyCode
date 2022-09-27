package javabasic.h_comprehensive_exercise;

import java.util.Random;

/*
    练习七: 抢红包
        需求:
            一个大V直播抽奖, 奖品是现金红包, 分别有{2, 588, 888, 1000, 10000} 5个奖金, 请使用代码模拟抽奖,
            打印出每个奖项, 奖项的出现顺序要随机且不重复
 */
public class $7_RedWars {
    public static void main(String[] args) {
        // 静态初始化定义数组
        int[] arrayPrize = {2, 10, 50, 100, 300, 588, 888, 1000, 10000, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
                0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        // 创建Random对象
        Random random = new Random();
        // 调用方法打乱数组顺序
        arrayScrambled(arrayPrize, random);
        for (int i = 0; i < arrayPrize.length; i++) {
            if (arrayPrize[i] != 0) {
                System.out.println(arrayPrize[i] + "元的奖项被抽出！！");
            } else {
                System.out.println("很遗憾, 您没有中奖！！");
            }
        }
        
    }
    
    // 定义方法打乱数组顺序
    public static void arrayScrambled (int[] array, Random random) {
        for (int i = 0; i < array.length; i++) {
            int temp = random.nextInt(array.length);
            int temparray = array[i];
            array[i] = array[temp];
            array[temp] = temparray;
        }
    }
}
