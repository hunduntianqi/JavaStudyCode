package com.$16_FileAndIOClass;

/*
    File类:
        在java.io.File下, 代表操作系统的文件对象(文件, 文件夹)
        可以定位文件, 进行删除, 获取文本本身信息等操作, 但是不能读写文件内容
        File类提供了定位文件, 获取文件本身信息, 删除文件, 创建文件(文件夹)等功能
    IO流技术:
        可以对硬盘中的文件进行读写

    File类创建对象:
        1. public File (String pathname): 根据文件路径创建文件对象
        2. public File (String parent, String child): 从父路径名字符串和子路径名字符串创建文件对象
        3. public File (File parent, String child): 根据父路径对应文件对象和子路径名字符串创建文件对象
        File对象支持绝对路径, 也支持绝对路径
        File封装的对象仅仅是一个路径名, 这个路径可以是存在的, 也可以是不存在的
    File类常用方法:
        1. public boolean isDirectory(): 测试次抽象路径名表示的File是否为文件夹
        2. public boolean isFile(): 测试此抽象路径名表示的File是否为文件
        3. public boolean exists(): 测试此抽象路径名表示的File是否存在
        4. public String getAbsolutePath(): 返回此抽象路径名的绝对路径名字符串
        5. public String getPath(): 将此抽象路径名转换为路径名字符串
        6. public String getName(): 返回由此抽象路径名表示的文件或文件夹的名称
        7. public long lastModified(): 返回文件最后修改的时间毫秒值
    File类创建和删除文件方法:
        1. public boolean createNewFile(): 创建一个新的空文件
        2. public boolean mkdir(): 只能创建一级文件夹
        3. public boolean mkdirs(): 可以创建多级文件夹
        4. public boolean delete(): 删除由此抽象路径名表示的文件或空文件夹
        注意:
            1. delete方法默认只能删除文件和空文件夹
            2. delete方法直接删除不走回收站, 删除动作无法撤销
    File类遍历功能:
        1. public String[] list(): 获取当前目录下所有一级文件名称到一个字符串数组并返回
        2. public File[] listFiles()(常用): 获取当前目录下所有的一级文件对象到一个文件对象数组中去返回(重点)
            listFiles方法注意事项:
                1. 当调用者不存在时, 返回null
                2. 当调用者是一个文件时, 返回null
                3. 当调用者是一个空文件夹时, 返回一个长度为0的数组
                4. 当调用者是一个有内容的文件夹时, 将里面所有文件和文件夹的路径放在File数组中返回
                5. 当调用者是一个有隐藏文件的文件夹时, 将里面所有文件和文件夹的路径放在File数组中返回, 包含隐藏内容
                6. 当调用者是一个需要权限才能进入的文件夹时, 返回null
 */

import java.io.File;

public class $1_FileClassSummarize {
    public static void main(String[] args) {
        // 创建File对象
//        File f = new File("D:\\Users\\Administrator\\Desktop\\test\\微信图片_20210815132734.jpg");
        // 绝对路径
        File f = new File("D:/Users/Administrator/Desktop/test/微信图片_20210815132734.jpg");
        System.out.println(f);
        long size = f.length(); // 拿到文件的字节大小
        System.out.println(size);
        // 相对路径
        File f2 = new File("src/com/JavaGrammar/Dec_28_File_IO_Class/微信图片_2021081513274.jpg");
        System.out.println(f2.length());
        f2.delete();
        // 创建文件夹对象
        File f3 = new File("D:\\Users\\Administrator\\Desktop\\test");
        // 判断文件夹是否存在
        System.out.println(f3.exists()); // 存在返回true, 不存在返回false
        File[] f4 = f3.listFiles();
        for (File file : f4) {
            System.out.println(file.getAbsoluteFile());
        }
        f3.delete();
    }
}
