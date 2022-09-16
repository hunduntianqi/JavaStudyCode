package com.$16_FileAndIOClass.Demo.$1_IOStreamDemo;

import java.io.*;

public class $5_CopyFile {
    public static void main(String[] args) throws Exception {
        for(int i = 2; i < 3; i++) {
            String path1 = "D:\\Users\\Administrator\\Desktop\\test\\图片备份";
            String path2 = "D:\\Users\\Administrator\\Desktop\\test\\图片备份" + i;
            File file = new File(path1);
            File file2 = new File(path2);
            file2.mkdir();
            File[] fliearray = file.listFiles();
            for (File file1 : fliearray) {
                System.out.println(file1.getName());
                // 创建字节输入流管道与源文件路径接通
                InputStream infile = new FileInputStream(path1 + "\\" + file1.getName());
                // 获取与源文件字节大小相同的字节数组
                byte[] buffer = infile.readAllBytes();
                int len = infile.read(buffer);
                // 字节数据解码 // 音视频文件不需要进行字节解码, 直接写入即可, 文本文件才需要解码操作
//            String rs = new String(buffer, "utf-8");
//            System.out.println(rs);
//             创建字节输出流管道与源文件相通
                OutputStream outfile = new FileOutputStream(path2 + "\\" + file1.getName());
                outfile.write(buffer);
                outfile.close();

            }
        }
    }
}
