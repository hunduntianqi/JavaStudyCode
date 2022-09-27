package javabasic.j_string.Demo.$3_SynthesizeExercise;

import java.util.Scanner;
import java.util.StringJoiner;

/*
    要求:
        键盘录入字符串, 长度小于或等于9, 只能是数字, 将阿拉伯数字转换成罗马数字
        阿拉伯数字-罗马数字:
            1-I, 2-II, 3-III, 4-IV, 5-V, 6-VI, 7-VII, 8-VIII, 9-IX
            注意:
                罗马数字不包含0, 如果键盘录入0, 可以变成""
 */
public class $1_TransitionRomeNumber {
    public static void main(String[] args) {
        // 定义数组, 存储罗马数字
        String[] arrayRome = {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};
        // 创建Scanner对象
        Scanner sc = new Scanner(System.in);
        // 键盘录入字符串
        System.out.println("请输入一段数字: ");
        String str = sc.next();
        // 判断字符串是否满足要求
        boolean flag = judgeStr(str);
        if (flag) {
            String string = transitionNumber(str, arrayRome);
            System.out.println(string);
        } else {
            System.out.printf("字符串%s不满足要求!!\n", str);
        }
    }
    
    // 定义方法, 转换数字
    public static String transitionNumber (String str, String[] array) {
        // 创建StringJoiner对象
        StringJoiner sj = new StringJoiner("-");
        for (int i = 0; i < str.length(); i++) {
            int temp = str.charAt(i) - 48;
            sj.add(array[temp]);
        }
        return sj.toString();
    }
    
    // 定义方法, 判断字符串是否满足规则
    public static boolean judgeStr (String str) {
        // 判断字符串长度
        if (str.length() > 9 || str.length() == 0) {
            return false;
        } else {
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) < 48 || str.charAt(i) > 57) {
                    return false;
                }
            }
        }
        return true;
    }
}
