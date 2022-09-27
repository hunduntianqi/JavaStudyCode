package javabasic.k_ArrayList.Demo.$2_StudentManagerSystem;

import java.util.ArrayList;
import java.util.Scanner;

public class $1_StudentManageSystem {
    public static void main(String[] args) {
        // 创建集合对象
        ArrayList<Student> list = new ArrayList<>();
        // 创建Scanner对象
        Scanner sc = new Scanner(System.in);
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
    
    // 定义方法, 打印欢迎界面
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
}
