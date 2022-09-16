package com.$4_FaceObject.FaceDemo.$6_innerClass.$2_interClassAnonymous;

/*
    目标:掌握匿名内部类使用形式(语法)
 */
public class Test2 {
    public static void main(String[] args) {
        Swimming s = new Swimming(){
            @Override
            public void swimming() {
                System.out.println("学生快乐的自由泳??");
            }
        };
        go(s);
        System.out.println("------------------");
        Swimming t = new Swimming() {
            @Override
            public void swimming() {
                System.out.println("老师游得非常快??");
            }
        };
        go(t);
    }
    
    /*
        学生, 老师, 运动员一起参加游泳比赛
     */
    public static void go(Swimming s) {
        System.out.println("开始比赛...");
        s.swimming();
        System.out.println("比赛结束...");
    }
}

//class Student implements Swimming {
//    @Override
//    public void swimming () {
//        System.out.println("学生快乐的自由泳~~");
//    }
//}

interface Swimming {
    void swimming();
}
