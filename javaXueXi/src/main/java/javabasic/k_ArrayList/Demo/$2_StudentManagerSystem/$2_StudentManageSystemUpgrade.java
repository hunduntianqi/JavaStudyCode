package javabasic.k_ArrayList.Demo.$2_StudentManagerSystem;

/*
    学生管理系统升级版
 */

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class $2_StudentManageSystemUpgrade {
    public static void main(String[] args) {
        // 创建集合存储用户对象
        ArrayList<User> listUser = new ArrayList<>();
        // 创建集合存储学生对象
        ArrayList<Student> listStudent = new ArrayList<>();
        // 创建Scanner对象, 接收键盘录入信息
        Scanner sc = new Scanner(System.in);
        while (true) {
            // 打印欢迎界面
            System.out.println("==========欢迎来到学生管理系统==========");
            System.out.println("请选择你要进行的操作:");
            System.out.println("1. 登录");
            System.out.println("2. 注册");
            System.out.println("3. 忘记密码");
            System.out.println("4. 退出系统");
            String choose = sc.next();
            switch (choose) {
                case "1":
                    login(listUser, listStudent, sc); // 用户登录操作
                    break;
                case "2":
                    userRegistration(listUser, sc); // 用户注册
                    break;
                case "3":
                    forgotPassword(listUser, sc); // 用户忘记密码重置密码操作
                    break;
                case "4":
                    System.out.println("感谢您的使用, 下次再见~~"); // 退出系统
                    return;
                default:
                    System.out.println("请输入正确的操作选项: ");
            }
        }
    }
    
    // 定义方法, 实现登录操作
    public static void login(ArrayList<User> listUser, ArrayList<Student> listStudent, Scanner sc) {
        // 判断集合是否为空
        if (listUser.size() == 0) {
            System.out.println("当前无任何用户, 请先注册, 谢谢！！");
            return;
        }
        // 定义变量, 接收用户输入用户名和密码
        System.out.println("请输入用户名:");
        String userName = sc.next();
        // 循环遍历用户名是否存在
        for (int i = 0; i < listUser.size(); i++) {
            if (listUser.get(i).getUserName().equals(userName)) {
                for (int num = 0; num < 3; num++) {
                    // 调用方法, 生成验证码
                    String verificationCode = verificationCode();
                    System.out.printf("验证码为:%s\n", verificationCode);
                    System.out.println("请输入验证码:");
                    String userVer = sc.next();
                    if (userVer.equalsIgnoreCase(verificationCode)) {
                        System.out.println("验证码正确, 请输入密码:");
                        String passWord = sc.next();
                        if (listUser.get(i).getPassWord().equals(passWord)) {
                            System.out.println("登陆成功！！");
                            // 调用登陆成功后的欢迎界面
                            loginSuccess(listStudent, sc);
                            return;
                        } else {
                            System.out.println("密码错误！！");
                        }
                    } else {
                        System.out.println("验证码错误!!");
                    }
                }
                System.out.println("账户已锁定, 请稍后再试！！");
                return;
            }
        }
        System.out.println("用户未注册, 请先注册！！");
    }
    
    // 定义方法, 生成验证码
    public static String verificationCode() {
        // 创建Random对象
        Random random = new Random();
        char[] ch = new char[5];
        for (int i = 0; i < 5; i++) {
            if (i == 4) {
                ch[i] = (char) (random.nextInt(10) + 48);
            } else {
                int type = random.nextInt(2);
                switch (type) {
                    case 0:
                        ch[i] = (char) (random.nextInt(26) + 65);
                        break;
                    case 1:
                        ch[i] = (char) (random.nextInt(26) + 97);
                        break;
                }
            }
        }
        // 打乱数组
        for (int i = 0; i < ch.length; i++) {
            int temp = random.nextInt(ch.length);
            char flag = ch[temp];
            ch[temp] = ch[i];
            ch[i] = flag;
        }
        // 根据字符数组创建字符串
        String verificationCode = new String(ch);
        return verificationCode;
    }
    
    // 定义方法, 实现注册操作
    public static void userRegistration(ArrayList<User> listUser, Scanner sc) {
        // 创建一个User对象
        User user = new User();
        while (true) {
            System.out.println("请输入用户名:");
            String userName = sc.next();
            // 定义变量, 来判断以下循环是否被中断
            int count = 0;
            // 循环判断用户名是否唯一
            for (int i = 0; i < listUser.size(); i++) {
                if (listUser.get(i).getUserName().equals(userName)) {
                    System.out.println("用户名已存在, 请重新输入！！");
                    break;
                }
                count++;
            }
            if (count == listUser.size()) {
                boolean flag = checkUserName(userName);
                if (flag) {
                    user.setUserName(userName);
                    // 密码验证判断
                    while (true) {
                        System.out.println("请输入密码");
                        String passWord = sc.next();
                        System.out.println("请再次输入密码:");
                        String passWord2 = sc.next();
                        if (passWord2.equals(passWord)) {
                            System.out.println("两次密码一致, 可以使用！！");
                            user.setPassWord(passWord);
                            break;
                        } else {
                            System.out.println("两次输入密码不一致, 请重新输入！！");
                        }
                    }
                    // 身份证验证判断
                    while (true) {
                        System.out.println("请输入您的身份证信息:");
                        String idCard = sc.next();
                        // 调用方法判断身份证是否合法
                        boolean flagId = checkIdCard(idCard);
                        if (flagId) {
                            user.setIdCard(idCard);
                            break;
                        }
                    }
                    // 手机号验证判断
                    while (true) {
                        System.out.println("请输入您的手机号码:");
                        String phone = sc.next();
                        boolean flagPhone = checkPhone(phone);
                        if (flagPhone) {
                            user.setPhoneNumber(phone);
                            break;
                        }
                    }
                    break;
                }
            }
        }
        // 所有信息添加完毕后, 将User对象添加进集合, 完成注册
        listUser.add(user);
        System.out.printf("用户'%s'注册成功！！", user.getUserName());
    }
    
    // 定义方法, 验证用户名是否可用
    public static boolean checkUserName(String userName) {
        if (userName.length() >= 3 && userName.length() <= 15) {
            // 定义变量存储用户名中字母和数字字符的个数
            int num = 0;
            int letter = 0;
            for (int i = 0; i < userName.length(); i++) {
                char ch = userName.charAt(i);
                // 判断是否为字母字符或数字字符
                if (ch >= 65 && ch <= 90 || ch >= 97 && ch <= 122) {
                    letter++;
                } else if (ch >= 48 && ch <= 57) {
                    num++;
                }
            }
            if ((num + letter) == userName.length()) {
                if (num > 0 && letter > 0) {
                    // 用户名合法, 可以使用
                    return true;
                } else {
                    System.out.println("用户名必须同时包含字母和数字, 请重新输入:");
                    return false;
                }
            } else {
                System.out.println("用户名只能由字母和数字组成, 请重新输入:");
                return false;
            }
        } else {
            System.out.println("用户名长度为3~15, 请重新输入:");
            return false;
        }
    }
    
    // 定义方法, 验证身份证是否正确
    public static boolean checkIdCard(String idCard) {
        // 判断身份证字符长度是否满足18位
        if (idCard.length() == 18) {
            if (idCard.charAt(0) == '0') {
                System.out.println("身份证不能以'0'开头, 请输入正确的身份证信息: ");
                return false;
            }
            char endChar = idCard.charAt(idCard.length() - 1);
            if (endChar >= 48 && endChar <= 57 || endChar == 'X' || endChar == 'x') {
                for (int i = 0; i < idCard.length() - 2; i++) {
                    if (idCard.charAt(i) < 48 || idCard.charAt(i) > 57) {
                        System.out.println("身份证前17位只能为数字, 请输入正确的身份证信息!!");
                        return false;
                    }
                }
                return true;
            } else {
                System.out.println("身份证信息最后一位不正确, 请输入正确的身份证信息!!");
                return false;
            }
        } else {
            System.out.println("身份证信息长度为18位, 请输入正确的身份证信息!!");
            return false;
        }
    }
    
    // 定义方法, 验证手机号是否正确
    public static boolean checkPhone(String phone) {
        if (phone.length() == 11) {
            if (phone.charAt(0) == '0') {
                System.out.println("手机号不能以'0'开头, 请重新输入: ");
                return false;
            } else {
                for (int i = 0; i < phone.length(); i++) {
                    if (phone.charAt(i) < 48 || phone.charAt(i) > 57) {
                        System.out.println("手机号必须全部为数字, 请重新输入:");
                        return false;
                    }
                }
                return true;
            }
        } else {
            System.out.println("手机号长度为11位, 请重新输入: ");
            return false;
        }
    }
    
    // 定义方法, 操作登陆成功后的步骤
    public static void loginSuccess(ArrayList<Student> list, Scanner sc) {
        while (true) {
            // 调用方法, 展示欢迎界面
            printWelcome();
            int num = sc.nextInt();
            switch (num) {
                case 1:
                    addStudent(list, sc);
                    break;
                case 2:
                    deleteStudent(list, sc);
                    break;
                case 3:
                    changeStudent(list, sc);
                    break;
                case 4:
                    viewStudent(list);
                    break;
                case 5:
                    System.out.println("感谢您的使用, 下次再见~~");
                    return;
                default:
                    System.out.println("请输入正确的选择数字, 谢谢~~");
                    break;
            }
        }
    }
    
    // 定义方法, 打印登陆成功后的欢迎界面
    public static void printWelcome() {
        // 初始菜单
        System.out.println("======欢迎来到混沌学生管理系统======");
        System.out.println("1. 添加学生");
        System.out.println("2. 删除学生");
        System.out.println("3. 修改学生信息");
        System.out.println("4. 查询学生信息");
        System.out.println("5. 退出");
        System.out.println("请输入您的选择:");
    }
    
    // 定义方法, 添加学生信息
    public static void addStudent(ArrayList<Student> list, Scanner sc) {
        // 创建学生对象
        Student student = new Student();
        int id;
        System.out.println("请输入添加学生的id:");
        boolean flag = true;
        while (flag) {
            id = sc.nextInt();
            // for循环判断id是否重复
            if (list.size() == 0) {
                student.setId(id);
                System.out.println("id可以使用, 请继续添加其他信息:");
                flag = false;
            } else {
                for (int i = 0; i < list.size(); i++) {
                    if (list.get(i).getId() == id) {
                        System.out.println("学生id重复, 请重新输入学生id:");
                        break;
                    } else if (i == list.size() - 1) {
                        student.setId(id);
                        System.out.println("id可以使用, 请继续添加其他信息:");
                        flag = false;
                    }
                }
            }
        }
        System.out.println("请输入学生姓名:");
        String name = sc.next();
        student.setName(name);
        System.out.println("请输入学生年龄:");
        int age = sc.nextInt();
        student.setAge(age);
        System.out.println("请输入学生家庭地址:");
        String address = sc.next();
        student.setAddress(address);
        // 将对象添加集合中
        list.add(student);
        System.out.println("学生信息添加成功!!");
    }
    
    // 定义方法, 删除学生信息
    public static void deleteStudent(ArrayList<Student> list, Scanner sc) {
        if (list.size() == 0) {
            System.out.println("系统中暂无学生数据, 请先添加数据！！");
            return;
        }
        // 定义变量, 记录要删除学生信息的id
        System.out.println("请输入要删除学生信息的id:");
        int id = sc.nextInt();
        // for循环遍历id是否存在
        for (int i = 0; i < list.size(); i++) {
            if (id == list.get(i).getId()) {
                System.out.printf("已删除id为%d的学生信息\n", id);
                list.remove(i);
                return;
            }
        }
        System.out.printf("id为%d的学生信息不存在！！\n", id);
    }
    
    // 定义方法, 修改学生信息
    public static void changeStudent(ArrayList<Student> list, Scanner sc) {
        if (list.size() == 0) {
            System.out.println("系统中暂无学生数据, 请先添加数据！！");
            return;
        }
        // 定义变量, 记录要删除学生信息的id
        System.out.println("请输入要修改学生信息的id:");
        int id = sc.nextInt();
        // for循环遍历id是否存在
        for (int i = 0; i < list.size(); i++) {
            if (id == list.get(i).getId()) {
                System.out.println("请输入修改后的学生姓名(不做修改请输入n / N):");
                String name = sc.next();
                if (name.equals("n") || name.equals("N")) {
                    list.get(i).setName(list.get(i).getName());
                } else {
                    list.get(i).setName(name);
                }
                System.out.println("请输入修改后的学生年龄(不做修改请输入-1):");
                int age = sc.nextInt();
                if (age == -1) {
                    list.get(i).setAge(list.get(i).getAge());
                } else {
                    list.get(i).setAge(age);
                }
                System.out.println("请输入修改后的学生家庭地址(不做修改请输入n / N):");
                String address = sc.next();
                if (address.equals("n") || address.equals("N")) {
                    list.get(i).setAddress(list.get(i).getAddress());
                } else {
                    list.get(i).setAddress(address);
                }
                System.out.printf("id为%d的学生信息已修改！！\n", id);
                return;
            }
        }
        System.out.println("学生id不存在, 请检查系统数据！！");
    }
    
    // 定义方法, 查看所有学生信息
    public static void viewStudent(ArrayList<Student> list) {
        if (list.size() == 0) {
            System.out.println("系统中暂无学生数据, 请先添加数据！！");
            return;
        }
        // 循环遍历集合, 打印所有学生信息
        System.out.println("id\t\tname\t\tage\t\taddress");
        for (int i = 0; i < list.size(); i++) {
            Student student = list.get(i);
            System.out.printf("%d\t\t%s\t\t%d\t\t%s\n", student.getId(), student.getName(),
                    student.getAge(), student.getAddress());
        }
    }
    
    // 定义方法, 执行忘记密码后的重置密码动作
    public static void forgotPassword (ArrayList<User> listUser, Scanner sc) {
        System.out.println("请输入您的用户名:");
        String userName = sc.next();
        // 循环判断用户名是否存在
        for (int i = 0; i < listUser.size(); i++) {
            if (listUser.get(i).getUserName().equals(userName)) {
                System.out.println("请输入您的身份证信息:");
                String idCard = sc.next();
                System.out.println("请输入您的手机号码:");
                String phone = sc.next();
                if (idCard.equals(listUser.get(i).getIdCard())) {
                    if (phone.equals(listUser.get(i).getPhoneNumber())) {
                        for (int num = 0; num < 3; num++) {
                            System.out.println("请输入新的密码:");
                            String passWord = sc.next();
                            System.out.println("请再次确认密码:");
                            String passWord2 = sc.next();
                            if (passWord.equals(passWord2)) {
                                listUser.get(i).setPassWord(passWord);
                                System.out.println("您的密码已重置!!");
                                return;
                            } else {
                                System.out.println("两次密码不一致, 修改失败, 请重试！！");
                            }
                        }
                        System.out.println("多次修改失败, 您的账户已被锁定, 请稍后再试！！");
                        return;
                    } else {
                        System.out.println("您输入的手机号不匹配, 修改失败");
                        return;
                    }
                } else {
                    System.out.println("您输入的身份信息不匹配, 修改失败!!");
                    return;
                }
            }
        }
        System.out.println("用户未注册, 请检查用户名是否正确!!");
    }
}
