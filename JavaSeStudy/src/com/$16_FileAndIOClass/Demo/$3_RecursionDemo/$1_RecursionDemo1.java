package com.$16_FileAndIOClass.Demo.$3_RecursionDemo;

import java.io.File;

public class $1_RecursionDemo1 {
    /**
     *  需求:
     *      文件搜索: 从D:盘中搜索出某个文件名称并输出绝对路径
     *      分析:
     *          1. 先定位一级文件对象
     *          2. 遍历全部一级文件对象, 判断是否是文件
     *          3. 如果是文件, 判断是否是自己想要的
     *          4. 如果是文件夹, 需要继续递归进去重复上述流程
     *          注意:引用类型数据操作时必须先确认不为null！！
     */
    public static void main(String[] args) {
        File file = new File("D:/");
        System.out.println(file);
//        search("蜘蛛侠.xlsx", new File("D:/"));
//        searchFile(file, "蜘蛛侠.txt");
        search(file, "1613851054155.png");
    }

    public static void search(File filepath, String name) {
        if (filepath != null && filepath.isDirectory()) {
            File[] f = filepath.listFiles();
            // 必须先判断文件对象是否部位null, 才可继续其他条件的判断！！！
            if (f != null && f.length > 0) {
                for (File file : f) {
                    if (file.isFile()) {
                        if (file.getName().contains(name)) {
                            System.out.println("找到了:" + file.getAbsolutePath());
                        }
                    }else {
//                        System.out.println("继续寻找！！");
                        search(file, name);
                    }
                }
            }
        } else {
            System.out.println("当前位置不是文件夹！！");
//            return;
        }
    }

//    public static void searchFile(File dir,String fileName){
//        // 3、判断dir是否是目录
//        if(dir != null && dir.isDirectory()){
//            // 可以找了
//            // 4、提取当前目录下的一级文件对象
//            File[] files = dir.listFiles(); // null  []
//            // 5、判断是否存在一级文件对象，存在才可以遍历
//            if(files != null && files.length > 0) {
//                for (File file : files) {
//                    // 6、判断当前遍历的一级文件对象是文件 还是 目录
//                    if(file.isFile()){
//                        // 7、是不是咱们要找的，是把其路径输出即可
//                        if(file.getName().contains(fileName)){
//                            System.out.println("找到了：" + file.getAbsolutePath());
//                            // 启动它。
////                            try {
////                                Runtime r = Runtime.getRuntime();
////                                r.exec(file.getAbsolutePath());
////                            } catch (IOException e) {
////                                e.printStackTrace();
////                            }
//                        }
//                    }else {
//                        // 8、是文件夹，需要继续递归寻找
//                        searchFile(file, fileName);
//                    }
//                }
//            }
//        }else {
//            System.out.println("对不起，当前搜索的位置不是文件夹！");
//            return;
//        }
//    }
}
