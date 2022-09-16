package com.$11_Gather.GatherDemo.$3_SetGatherDemo;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class $2_TreeSetGatherDemo {
    /**
     *  目标:观察TreeSet对于有值特性的的数据如何排序
     *          学会对自定义类型的对象进行制定规则排序
     */
    public static void main(String[] args) {
        Set<Integer> sets1 = new TreeSet<>();
        sets1.add(2);
        sets1.add(12);
        sets1.add(22);
        sets1.add(13);
        sets1.add(25);
        System.out.println(sets1);

        Set<String> sets2 = new TreeSet<>();
        sets2.add("Java");
        sets2.add("Java");
        sets2.add("About");
        sets2.add("Python");
        sets2.add("UI");
        sets2.add("about");
        sets2.add("黑马");
        sets2.add("break");
        System.out.println(sets2);

        System.out.println("----------------------------");
        // 使用TreeSet有参构造器定义比较规则
        Set<Student> study = new TreeSet<>(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o2.getAge() - o1.getAge() >=0 ? 1 : -1;
            }
        });
        Student s1 = new Student("郭鹏涛", 23, '男');
        Student s2 = new Student("徐冬梅", 23, '女');
        Student s3 = new Student("陈欣妮", 23, '女');
        Student s4 = new Student("卢雨", 21, '女');
        Student s5 = new Student("张雪", 22, '女');

        study.add(s1);
        study.add(s2);
        study.add(s3);
        study.add(s4);
        study.add(s5);
        System.out.println(study);
    }
}
