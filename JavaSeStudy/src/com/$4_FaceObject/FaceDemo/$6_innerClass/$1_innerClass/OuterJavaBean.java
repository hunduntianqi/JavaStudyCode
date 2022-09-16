package com.$4_FaceObject.FaceDemo.$6_innerClass.$1_innerClass;

// 外部类
public class OuterJavaBean {
    // 定义成员内部类
    public class Inner {
        private String name;
        private int age;
        public static int a; // JDK16开始支持静态成员
        
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
