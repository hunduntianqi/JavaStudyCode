package com.$17_HighLevelIOStream.Demo.$1_BufferStreamDemo;

import java.io.*;

public class $2_CharDemo {
    public static void main(String[] args) {
        try (
                Reader fr = new FileReader("./字符写入缓冲.txt");
                // 包装字符缓冲输入流
                BufferedReader bfr = new BufferedReader(fr);
                Writer fw = new FileWriter("./字符写入缓冲2.txt");
                // 包装字符缓冲输出流
                BufferedWriter bfw = new BufferedWriter(fw);
        ) {
//            char[] buffer = new char[1024];
//            int len = bfr.read(buffer);
//            System.out.println(new String(buffer));
            String s;
            while ((s = bfr.readLine()) != null) {
                System.out.println(s);
                bfw.write(s);
                bfw.write(new String(s.getBytes(), "gbk"));
//                bfw.write("\n");
                bfw.newLine();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
