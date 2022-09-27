package javabasic.j_string.Demo.$1_StringDemo;

import java.util.Scanner;

public class $1_UserLogin {
    public static void main(String[] args) {
        // 定义用户名和密码
        String userName = "17320101759";
        String passWord = "2251789949gpt";
        // 创建Scanner对象
        Scanner sc = new Scanner(System.in);
        // 定义变量, 接收用户输入
        String userNameSc;
        String passWordSc;
        for (int i = 0; i < 3; i++) {
            System.out.printf("请输入用户名和密码, 您还有%d次机会！！\n",(3 - i));
            System.out.println("用户名:");
            userNameSc = sc.next();
            System.out.println("密码:");
            passWordSc = sc.next();
            // 判断用户名与密码是否正确
            if (userName.equals(userNameSc)) {
                if (passWord.equals(passWordSc)) {
                    System.out.println("恭喜您登陆成功！！");
                    return;
                } else {
                    System.out.println("密码错误！！");
                }
            } else {
                System.out.println("用户名不存在！！");
            }
        }
    }
}
