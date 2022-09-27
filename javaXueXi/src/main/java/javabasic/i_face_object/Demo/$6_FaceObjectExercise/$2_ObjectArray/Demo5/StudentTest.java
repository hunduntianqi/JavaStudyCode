package javabasic.i_face_object.Demo.$6_FaceObjectExercise.$2_ObjectArray.Demo5;

/*
    定义一个长度为3的数组, 存储1~3名学生对象作为初始数据, 学生对象的学号, 姓名各不相同
    学生属性: 学号, 姓名, 年龄
    要求:
        1. 再次添加一个学生对象, 并在添加的时候进行唯一性判断
        2. 添加完毕之后, 遍历所有学生信息
        3. 通过id删除学生信息., 如果存在, 则删除, 如果不存在, 则提示删除失败
        4. 删除完毕之后, 遍历所有学生信息
        5. 查询数组id为"xxx"的学生, 如果存在, 则将他的年龄+1岁
 */

import java.util.Scanner;

public class StudentTest {
    public static void main(String[] args) {
        // 创建Scanner对象
        Scanner sc = new Scanner(System.in);
        // 定义数组, 存储学生对象
        Student[] array = new Student[3];
        // 调用方法创建学生对象
        creatObject(array, sc);
        creatObject(array, sc);
        // 调用方法遍历数组
        traverse(array);
        // 调用方法删除学生信息
        System.out.println("请输入要删除学生信息的id:");
        int id = sc.nextInt();
        byIdDelete(id, array);
        traverse(array);
        System.out.println("请输入要查询学生信息的id:");
        id = sc.nextInt();
        byIdInquire(id, array);
        traverse(array);
    }
    
    // 定义方法, 给数组添加学生对象
    public static boolean addObject(Student student, Student[] array) {
        // for循环判断学号是否重复
        for (int i = 0; i < array.length; i++) {
            // 判断数组元素是否为null
            if (array[i] != null) {
                if (array[i].getId() == student.getId()) {
                    System.out.println("学号已存在, 请重新输入:");
                    return true;
                }
            }
        }
        // 程序运行到此, 说明学号无重复, 判断数组元素值为null的元素, 添加元素
        for (int i = 0; i < array.length; i++) {
            // 判断数组元素是否为null
            if (array[i] == null) {
                array[i] = student;
                System.out.println("学生" + student.getName() + "信息添加成功！！");
                return false;
            }
        }
        System.out.println("数组元素已满, 无法继续添加！！");
        return false;
    }
    
    // 定义方法, 遍历所有学生信息
    public static void traverse (Student[] students) {
        System.out.println("========当前所有学生信息如下========");
        for (int i = 0; i < students.length; i++) {
            if (students[i] != null) {
                System.out.println(students[i]);
            }
        }
    }
    
    // 定义方法, 通过id删除学生信息
    public static void byIdDelete (int id, Student[] array) {
        for (int i = 0; i < array.length; i++) {
            if (id == array[i].getId()) {
                array[i] = null;
                System.out.printf("id为%d的学生信息已删除！！\n", id);
                return;
            }
        }
        System.out.printf("系统中无id为%d的学生, 删除失败！！\n", id);
    }
    
    // 定义方法, 通过id查询学生是否存在
    public static void byIdInquire (int id, Student[] students) {
        for (int i = 0; i < students.length; i++) {
            if (students[i] != null) {
                if (id == students[i].getId()) {
                    students[i].setAge(students[i].getAge() + 1);
                    System.out.printf("查询到id为%d的学生, 年龄+1", id);
                    return;
                }
            }
        }
        System.out.println("系统无此学生信息！！");
    }
    
    // 定义方法, 创建学生对象
    public static void creatObject (Student[] array, Scanner sc) {
        // 定义符号位
        boolean flag = true;
        // while循环保证在添加对象失败时, 可以重新输入数据
        while (flag) {
            System.out.println("请输入学生id:");
            int id = sc.nextInt();
            System.out.println("请输入学生姓名:");
            String name = sc.next();
            System.out.println("请输入学生年龄:");
            int age = sc.nextInt();
            // 创建学生对象, 并添加数组
            Student student1 = new Student(id, name, age);
            // 调用方法添加数组元素
            flag = addObject(student1, array);
        }
    }
}
