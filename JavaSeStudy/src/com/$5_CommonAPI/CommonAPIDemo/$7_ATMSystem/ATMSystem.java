package com.$5_CommonAPI.CommonAPIDemo.$7_ATMSystem;

/*
    1.面向对象编程:
        每个用户账户都是一个对象, 需要设计账户类Account用于创建对象封装账户信息
    2.使用集合容器:
        系统需要提供一个容器用于存储账户对象的信息
    3.程序流程控制:
        需要结合分支, 循环, 跳转关键字等相关操作控制程序的业务逻辑
    4.使用常见API:
        登录信息的内容比较, 业务数据的分析, 处理等需要用到String等常用API来解决

    系统准备内容分析:
        1.每个用户的账户信息都是一个对象, 需要定义一个账户类
        2.需要提供一个容器, 用于存储系统全部账户对象信息
        3.首页需要包含:登录和注册两个功能
 */

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class ATMSystem {
    public static void main(String[] args) {
        // 创建集合存储账户类对象
        ArrayList<Account> acounts = new ArrayList<>();
        // 准备系统首页
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("========欢迎来到混沌ATM机系统========");
            System.out.println("请选择您要进行的操作:");
            System.out.println("1.账号登录");
            System.out.println("2.注册账户");
            System.out.println("您可以输入相应命令进行操作:");
            int command = sc.nextInt();
            switch (command) {
                case 1:
                    //调用登录方法
                    login(acounts, sc);
                    break;
                case 2:
                    //调用开户方法
                    start(acounts, sc);
                    break;
                default:
                    System.out.println("您输入的操作类型有误！！");
            }
        }
    }
    
    // 创建登录方法
    public static void login(ArrayList<Account> accounts, Scanner sc) {
        if (accounts.size() == 0) {
            System.out.println("当前系统还没有任何账户, 请先开通账号！！");
        } else {
            System.out.println("请输入您的卡号:");
            Account acc = searchAccount(accounts, sc);
            if (acc != null) {
                boolean flag1 = true;
                while (flag1) {
                    System.out.println("请输入您的登录密码:");
                    String pw = sc.next();
                    if (pw.equals(acc.getPassword())) {
                        System.out.println("恭喜您登录成功, 请选择要办理的业务:");
                        // 展示系统登录成功后的操作界面
                        showuserCommand(accounts, acc, sc);
                        flag1 = false;
                        break;
                    } else {
                        System.out.println("您输入的密码有误,请重新输入！！");
                    }
                }
            } else {
                System.out.println("您输入的卡号在系统中不存在！！");
            }
        }
    }
    
    // 展示用户操作界面
    private static void showuserCommand(ArrayList<Account> accounts, Account acc, Scanner sc) {
        while (true) {
            System.out.println("==========用户操作界面==========");
            System.out.println("1.查询账户");
            System.out.println("2.存款");
            System.out.println("3.取款");
            System.out.println("4.转账");
            System.out.println("5.修改密码");
            System.out.println("6.退出账户");
            System.out.println("7.注销账户");
            System.out.println("请输入相应序号选择您要办理的业务:");
            int command = sc.nextInt();
            // 使用switch语句, 选择实现对应的功能
            switch (command) {
                case 1:
                    // 查询账户
                    showAccount(acc);
                    break;
                case 2:
                    depositMoney(acc, sc);
                    // 存款
                    break;
                case 3:
                    // 取款
                    drawMoney(acc, sc);
                    break;
                case 4:
                    // 转账
                    transferMoney(accounts, acc, sc);
                    break;
                case 5:
                    // 修改密码
                    changepw(acc, sc);
                    return;
                case 6:
                    // 退出账户
                    System.out.println("欢迎下次光临！！");
                    return; // 结束当前方法的执行
                case 7:
                    // 注销账户
                    closeAccount(accounts, acc, sc);
                    return;
                default:
                    System.out.println("请您输入正确的命令进行操作！！");
            }
        }
        
    }
    
    // 注销账户
    private static void closeAccount(ArrayList<Account> accounts, Account acc, Scanner sc) {
        System.out.println("您在进行销户操作, 请输入您的密码进行验证:");
        String pw = sc.next();
        if (acc.getPassword().equals(pw)) {
            if (acc.getMoney() > 0) {
                System.out.println("您的账户还有余额" + acc.getMoney() + "元, 请先取出余额");
            } else {
                System.out.println("请再次确认是否要注销账户(此操作不可撤销, 请谨慎选择)");
                String result = sc.next();
                if (result.equals("是")) {
                    System.out.println("您的账户已注销！！");
                    accounts.remove(acc);
                } else {
                    System.out.println("感谢您的继续支持！！");
                }
            }
        } else {
            System.out.println("您输入的密码有误");
        }
    }
    
    // 转账功能
    private static void transferMoney(ArrayList<Account> accounts, Account acc, Scanner sc) {
        // 转账功能
        System.out.println("========混沌银行转帐界面========");
        if (acc.getMoney() == 0) {
            System.out.println("您自己都没钱, 就别转了...");
        } else if (accounts.size() >= 2) {
            while (true) {
                System.out.println("请输入您要转账的账户卡号:");
                Account account = searchAccount(accounts, sc);
                if (account != null) {
                    if (account.getCardId().equals(acc.getCardId())) {
                        System.out.println("您不能为自己转帐！！");
                        break;
                    } else {
                        String name = "*" + account.getUsername().substring(1);
                        System.out.println("您要转账的账户为:" + name);
                        System.out.println("请输入对方的姓氏进行验证:");
                        String surName = sc.next();
                        if (surName.equals(account.getUsername().substring(0, 1))) {
                            System.out.println("请输入您的转账金额:");
                            double money = sc.nextDouble();
                            if (money > acc.getMoney()) {
                                System.out.println("您的余额不足, 无法转账...");
                            } else if (money > acc.getQuotaMoney()) {
                                System.out.println("您的转账金额大于单次限额, 无法转账！！");
                            } else {
                                // 修改自己的账户余额
                                acc.setMoney(acc.getMoney() - money);
                                // 修改被转帐账户的余额
                                account.setMoney(account.getMoney() + money);
                                System.out.println("转账成功, 尊敬的客户, 您的当前的账户详情为:");
                                showAccount(acc);
                                return;
                            }
                        } else {
                            System.out.println("您输入对方的姓氏有误, 请重新验证！！");
                        }
                    }
                } else {
                    System.out.println("您输入的卡号有误, 请重新输入:");
                }
            }
        } else {
            System.out.println("当前系统中还没有其它账户, 请先创建账户！！");
        }
    }
    
    // 修改账户密码功能
    private static void changepw(Account acc, Scanner sc) {
        System.out.println("请输入您的当前密码:");
        String pw = sc.next();
        while (true) {
            if (pw.equals(acc.getPassword())) {
                System.out.println("请输入你的新密码:");
                String pwNew1 = sc.next();
                System.out.println("请确认您的最新密码:");
                String pwNew2 = sc.next();
                if (pwNew1.equals(pwNew2)) {
                    acc.setPassword(pwNew1);
                    System.out.println("您的密码修改成功, 请重新登录！！");
                    return;
                } else {
                    System.out.println("两次密码不一致！！！");
                }
            } else {
                System.out.println("密码错误, 退出系统！！");
            }
        }
    }
    
    // 取款功能
    private static void drawMoney(Account acc, Scanner sc) {
        // 取款方法
        System.out.println("========混沌银行取款界面========");
        while (true) {
            System.out.println("尊敬的" + acc.getUsername() + "先生/女士, 请输入您要取款的金额(元):");
            double money = sc.nextDouble();
            // 1. 先要判断账户余额是否有钱
            if (acc.getMoney() == 0) {
                System.out.println("您的账户当前余额为0, 无法取款！！");
                return;
            } else if (money > acc.getMoney()) {
                System.out.println("您的余额不足, 无法取出, 请修改后在输入！！");
            } else if (money > acc.getQuotaMoney()) {
                System.out.println("您输入的取款金额大于单次限额, 无法取出, 请修改后再输入！！");
            } else {
                acc.setMoney(acc.getMoney() - money);
                System.out.println("取款成功, 请收好您的现金！！");
                showAccount(acc);
                return;
            }
        }
    }
    
    // 存款功能
    private static void depositMoney(Account acc, Scanner sc) {
        // 存款功能
        System.out.println("========混沌银行存款界面========");
        System.out.println("请输入您要存取的金额(元):");
        double money = sc.nextDouble();
        // 修改账户中的余额
        money += acc.getMoney();
        acc.setMoney(money);
        System.out.println("您已存款成功, 您的账户余额为:" + acc.getMoney() + "元, 账户详情如下:");
        showAccount(acc);
    }
    
    // 显示账户信息
    private static void showAccount(Account acc) {
        System.out.println("========当前账户详情========");
        System.out.println("卡号:" + acc.getCardId());
        System.out.println("姓名:" + acc.getUsername());
        System.out.println("卡中余额:" + acc.getMoney());
        System.out.println("单次限额:" + acc.getQuotaMoney());
    }
    
    // 创建开户方法
    public static void start(ArrayList<Account> accounts, Scanner sc) {
        // 键盘录入姓名, 密码, 确认密码(需保证两次密码一致)
        System.out.println("请输入您的姓名:");
        String name = sc.next();
        System.out.println("请输入您的密码:");
        String password = sc.next();
        boolean flag1 = true;
        while (flag1) {
            System.out.println("请确认您输入的密码:");
            String pw = sc.next();
            if (password.equals(pw)) {
                password = pw;
                flag1 = false;
            } else {
                System.out.println("您两次输入密码不一致, 请再次输入");
            }
        }
        System.out.println("请输入您的单次取款限额:");
        double limit = sc.nextDouble();
        // 创建随机数对象
        Random rd = new Random();
        String id = "";
        // 循环遍历随机生成卡号, 且不能与系统已有的卡号重复
        boolean flag2 = true;
        while (flag2) {
            for (int i = 0; i < 8; i++) {
                id += rd.nextInt(10);
                if (i == 7) {
                    if (accounts.size() != 0) {
                        for (int j = 0; j < accounts.size(); j++) {
                            if (id.equals(accounts.get(j).getCardId())) {
                                break;
                            } else if (j == accounts.size() - 1) {
                                id = id;
                                flag2 = false;
                            }
                        }
                    } else {
                        id = id;
                        flag2 = false;
                    }
                }
                
                
            }
        }
        
        accounts.add(new Account(id, name, password, 0.0, limit));
        System.out.println("恭喜您已开户成功,尊敬的" + name + "先生/女士,您的卡号为:" + id);
    }
    
    // 创建方法根据卡号寻找对应账户
    public static Account searchAccount(ArrayList<Account> acc, Scanner sc) {
        String cardId = sc.next();
        Account account = new Account();
        if (acc.size() == 0) {
            account = null;
        } else {
            for (int i = 0; i < acc.size(); i++) {
                if (acc.get(i).getCardId().equals(cardId)) {
                    account = acc.get(i);
                    break;
                } else if (i == acc.size() - 1) {
                    account = null;
                }
            }
        }
        return account;
    }
}

