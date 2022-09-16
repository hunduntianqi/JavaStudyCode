package com.$4_FaceObject.FaceDemo.$6_innerClass.$3_StaticInterClass;

/*
    外部类
 */
public class Outer {
    public static int num = 100;
    // 定义内部类
    public static class Inner {
        private String name;
        private int age;
        public static String onLineNumber;
        
        public Inner() {
        }
        
        public Inner(String name, int age) {
            this.name = name;
            this.age = age;
        }
        
        public String getName() {
            return name;
        }
        
        public void setName(String name) {
            this.name = name;
        }
        
        public int getAge() {
            return age;
        }
        
        public void setAge(int age) {
            this.age = age;
        }
    }
}
