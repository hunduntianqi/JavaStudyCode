package com.$5_CommonAPI.CommonAPIDemo.$1_StringDemo;

/*
    创建String对象两种方式:
        1.通过构造方法创建:
            通过 new 创建的字符串对象，每一次 new 都会申请一个内存空间，虽然内容相同，但是地址值不同
        2.直接赋值方式创建:
            以""方式给出的字符串,只要字符序列相同(顺序和大小写),无论在程序代码中出现几次,JVM都只会建立一个 String 对象,
            并在字符串池中维护
 */

public class $0_StringTest {
    public static void main(String[] args) {
        // 方式一:直接使用双引号赋值得到字符串对象
        String s1 = "郭鹏涛";
        System.out.println(s1);
        
        // 方式2:无参构造创建字符串对象(基本不用)
        String s2 = new String();
        System.out.println(s2); // 输出无任何内容
        
        // 方式3:根据传入字符串内容创建字符串对象
        String s3 = new String("混沌天炁");
        System.out.println(s3);
        
        // 方式4:根据字符数组内容, 创建字符串对象
        char[] ch = {'A', 'B', 'C', '5', '6'};
        String s4 = new String(ch);
        System.out.println(s4);
        
        // 方式5:根据字节数组内容, 创建字符串对象
        byte[] by = {101, 100, 99, 98, 97};
        String s5 = new String(by);
        System.out.println(s5);
    }
}

