package javabasic.j_string.Demo.$1_StringDemo;
/*
    金额转换:
        将小写的阿拉伯数字金额转换为大写的汉字金额
        分析思路:
            1. 先将数字转换为大写数字
            2. 判断是否满足七位, 不满足的高位补零
            3. 插入单位
 */

import java.util.Scanner;

public class $6_AmountConversion {
    public static void main(String[] args) {
        // 定义数组, 存储大写中文数字
        char[] arrayCapital = {'零', '壹', '贰', '叁', '肆', '伍', '陆', '柒', '捌', '玖'};
        // 创建Scanner对象
        Scanner sc = new Scanner(System.in);
        // 键盘录入数字
        System.out.println("请录入一个整数金额:");
        int money = sc.nextInt();
        // 判断数字是否有效
        if (money > 0 && money <= 9999999) {
            // 调用方法, 转换数字
            char[] arrayConversion = conversion(money, arrayCapital);
            System.out.printf("%d转换后的内容为: %s\n", money, new String(arrayConversion));
            char[] arrayZeroFill = judge(arrayConversion, arrayCapital);
            System.out.printf("%d补零后全部中文数字为: %s\n", money,new String(arrayZeroFill));
            // 调用方法, 添加单位
            String addUnitStr = addUnit(arrayZeroFill);
            System.out.printf("转换后的大写金额为%s元\n", addUnitStr);
        } else {
            System.out.println("金额异常, 请输入正确金额！！");
        }
    }
    
    // 定义方法, 将金额转换为大写数字
    public static char[] conversion (int num, char[] arrayCapital) {
        String string = num + "";
        // 定义数组, 存储转换后的字符
        char[] arrayConversion = new char[string.length()];
        for (int i = 0; i < string.length(); i++) {
            int temp = string.charAt(i) - 48;
            System.out.println(temp);
            arrayConversion[i] = arrayCapital[temp];
        }
        return arrayConversion;
    }
    
    // 定义方法, 判断是否满足七位, 不满足高位补零
    public static char[] judge (char[] array, char[] arrayCapital) {
        if (array.length == 7) {
            return array;
        } else {
            // 定义变量, 规定需要补零个数
            int count = 7 - array.length;
            // 定义新数组, 存储补零后数据
            char[] arrayZeroFill = new char[7];
            for (int i = 0; i < 7; i++) {
                if (i < count) {
                    arrayZeroFill[i] = arrayCapital[0];
                } else {
                    arrayZeroFill[i] = array[i - count];
                }
            }
            return arrayZeroFill;
        }
    }
    
    // 定义方法, 为大写数字添加单位
    public static String addUnit (char[] array) {
        String string = "";
        // 判断数组是否满足位数
        if (array.length == 7) {
            // 循环遍历, 判断位数, 添加单位
            for (int i = 0; i < array.length; i++) {
                switch (i) {
                    case 0, 4:
                        string += array[i] + "佰";
                        break;
                    case 1, 5:
                        string += array[i] + "拾";
                        break;
                    case 2:
                        string += array[i] + "萬";
                        break;
                    case 3:
                        string += array[i] + "仟";
                        break;
                    default:
                        if (array[i] == '零') {
                            break;
                        } else {
                            string += array[i];
                            break;
                        }
                }
            }
        } else {
            return "数组不满7位, 无法操作, 请补满！！";
        }
        return string;
    }
}
