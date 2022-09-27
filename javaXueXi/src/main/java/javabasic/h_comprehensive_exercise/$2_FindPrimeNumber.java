package javabasic.h_comprehensive_exercise;

/*
    练习二:
        找质数==>判断101-200由多少个质数, 并输出所有质数
 */
public class $2_FindPrimeNumber {
    public static void main(String[] args) {
        // 定义变量存储质数的个数
        int count = 0;
        // for循环找出101-200之间的所有质数
        for (int i = 101; i <= 200; i++) {
            for (int num = 2; num < i; num++) {
                if (i % num == 0) {
                    System.out.println("不是质数！！");
                    break;
                } else if (num == i -1){
                    System.out.println("数字" + i + "是质数");
                    count++;
                }
            }
        }
        System.out.println("101-200之间质数的个数为: " + count);
    }
    
}
