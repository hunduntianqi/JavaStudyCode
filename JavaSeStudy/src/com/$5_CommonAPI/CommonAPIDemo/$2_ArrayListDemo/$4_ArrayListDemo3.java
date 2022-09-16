package com.$5_CommonAPI.CommonAPIDemo.$2_ArrayListDemo;

/*
    需求:
        后台程序需要存储学生信息并展示, 然后要提供按照学号搜索学生信息的功能
             学生类信息（学号，姓名，性别，班级）
             测试数据：
             "20180302","叶孤城",23,"护理一班"
             "20180303","东方不败",23,"推拿二班"
             "20180304","西门吹雪",26,"中药学四班"
             "20180305","梅超风",26,"神经科2班"
    分析:
        1. 定义$4_Student类, 定义ArrayList集合存储学生对象信息, 并遍历展示出来
        2. 定义方法, 传入ArrayList集合, 根据要搜索学生的学号, 返回搜索到学生的信息, 并展示出来
        3. 使用死循环, 让用户可以不停搜索
 */

import java.util.ArrayList;
import java.util.Scanner;

public class $4_ArrayListDemo3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 创建学生类对象集合
        ArrayList<$4_Student> $4_Student = new ArrayList<>();
        // 集合中添加学生对象
        $4_Student.add(new $4_Student("20180302", "叶孤城", 23, "护理一班"));
        $4_Student.add(new $4_Student("20180303", "东方不败", 23, "推拿二班"));
        $4_Student.add(new $4_Student("20180304", "西门吹雪", 26, "中药学四班"));
        $4_Student.add(new $4_Student("20180305", "梅超风", 26, "神经科2班"));
        
        // 定义方法展示学生信息
        // 为死循环定义信号位
        boolean flag = true;
        while (flag) {
            from($4_Student, sc);
            System.out.println("您是否继续搜索(是/否)？");
            String judg = sc.next();
            if (judg.equals("否")) {
                flag = false;
            }
        }
    }
    
    public static void from(ArrayList<$4_Student> s, Scanner sc) {
        System.out.println("请输入您要查询学生对应的学号:");
        String id = sc.next();
        System.out.println("========您查询的学生信息为========");
        System.out.println("学号\t\t\t\t姓名\t\t\t年龄\t\t班级");
        for (int i = 0; i < s.size(); i++) {
            if (id.equals(s.get(i).getStudyId())) {
                $4_Student stu = s.get(i);
                System.out.print(stu.getStudyId() + "\t\t");
                System.out.print(stu.getName() + "\t\t");
                System.out.print(stu.getAge() + "\t\t");
                System.out.println(stu.getClassName() + "\t\t");
                break;
            } else if (i == s.size() - 1) {
                System.out.println("您输入的学号不存在！！");
            }
        }
        
    }
}