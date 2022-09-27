package javabasic.h_comprehensive_exercise;

import java.util.Random;
import java.util.Scanner;

/*
    练习八: 模拟双色球系统
        规则: 投注号码由6个红色球号码和1个蓝色球号码组成, 红色球号码从1-33中选择, 蓝色球号码从1-16中选择
        中奖条件和奖金:
            1. 红6蓝1 ==> 一等奖, 奖金1000万
            2. 红6蓝0 ==> 二等奖, 奖金500万
            3. 红5蓝1 ==> 三等奖, 奖金3000元
            4. 红4蓝1 / 红5蓝0 ==> 四等奖, 奖金200元
            5. 红3蓝1 / 红4蓝0 ==> 五等奖, 奖金10元
            6. 红1蓝1 / 红0蓝1 / 红2蓝1 ==> 六等奖, 奖金5元
        思路:
            1. 随机生成七位中奖号码, 用数组存储
            2. 用户输入七位号码
            3. 比较号码中红球数字和篮球数字相同的个数, 得出中奖情况
 */
public class $8_SimulationUnionLotto {
    public static void main(String[] args) {
        // 创建Random对象
        Random random = new Random();
        // 创建Scanner对象
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入您的双色球号码(7位数字): ");
        // 调用方法将用户号码拆分并存储数组中
        int[] userNumberArray = userInput(sc);
        // 定义数组存储中奖号码
        int[] prizeNumberArray = arrayPrizeNumber(random);
        // 定义变量存储红球号码相同个数
        int redNumber = 0;
        // 定义变量存储篮球号码相同个数
        int blueNumber = 0;
        // 循环比较用户号码和中奖号码, 得出红球和篮球各自相同个数
        for (int i = 0; i < prizeNumberArray.length; i++) {
            if (prizeNumberArray.length == userNumberArray.length) {
                if (i == prizeNumberArray.length - 1) {
                    if (prizeNumberArray[i] == userNumberArray[i]) {
                        blueNumber++;
                    }
                } else {
                    if (prizeNumberArray[i] == userNumberArray[i]) {
                        redNumber++;
                    }
                }
            } else {
                System.out.println("请用户输入正确的双色球号码！！");
                break;
            }
        }
        // 判断中奖情况
        if (redNumber == 6 && blueNumber == 1) {
            System.out.println("恭喜您中了1000万超级大奖！！");
        } else if (redNumber == 6 && blueNumber == 0) {
            System.out.println("恭喜您中了500万大奖!!");
        } else if (redNumber == 5 && blueNumber == 1) {
            System.out.println("恭喜您中奖3000元！！");
        } else if ((redNumber == 4 && blueNumber == 1) || (redNumber == 5 && blueNumber == 0)) {
            System.out.println("恭喜您中了四等奖, 奖金200元");
        } else if ((redNumber == 3 && blueNumber == 1) || (redNumber == 4 && blueNumber == 0)) {
            System.out.println("恭喜您你中了五等奖, 虽然奖金只有10元...");
        } else if ((redNumber == 1 && blueNumber == 1) || (redNumber == 0 && blueNumber == 1) || (redNumber == 2
                && blueNumber == 1)) {
            System.out.println("恭喜您中了六等奖, 奖金5元...");
        } else {
            System.out.println("很遗憾, 您没有中奖, 请下次继续。。。");
        }
    }
    
    // 定义方法生成中奖号码
    public static int[] arrayPrizeNumber(Random random) {
        // 动态初始化定义数组
        int[] array = new int[7];
        // 使用for循环对数组元素进行初始化
        for (int i = 0; i < array.length; i++) {
            if (i == array.length - 1) {
                array[i] = random.nextInt(16) + 1;
            } else {
                boolean flag = true;
                while (flag) {
                    int number = random.nextInt(33) + 1;
                    for (int j = 0; j <= i; j++) {
                        if (array[j] == number) {
                            break;
                        } else if (j == i) {
                            array[i] = number;
                            flag = false;
                        }
                    }
                }
            }
        }
        arrayPrint(array);
        return array;
    }
    
    // 定义方法将用户输入数字存储进数组
    public static int[] userInput(Scanner sc) {
        int[] array = new int[7];
        for (int i = 0; i < 7; i++) {
            if (i == 6) {
                while (true) {
                    System.out.println("请输入蓝球号码: ");
                    int userNumber = sc.nextInt();
                    if (userNumber >= 1 && userNumber <= 16) {
                        array[i] = userNumber;
                        break;
                    } else {
                        System.out.println("您输入的蓝球号码不合法, 请重新输入: ");
                    }
                }
            } else {
                while (true) {
                    System.out.println("请输入第" + (i + 1) + "位红球号码: ");
                    int userNumber = sc.nextInt();
                    if (userNumber >= 1 && userNumber <= 33) {
                        array[i] = userNumber;
                        break;
                    } else {
                        System.out.println("您输入的红球号码不合法, 请重新输入: ");
                    }
                }
            }
        }
        arrayPrint(array);
        return array;
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
