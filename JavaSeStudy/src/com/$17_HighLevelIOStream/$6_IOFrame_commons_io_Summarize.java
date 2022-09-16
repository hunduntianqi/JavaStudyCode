package com.$17_HighLevelIOStream;

/*
    IO流框架-commons-io:
        是apache开源基金组织提供的一组有关IO操作的类库, 可以提高IO功能开发的效率
        下载地址:https://commons.apache.org/proper/commons-io/
        导入commons-io做开发:
            1. 在项目中创建一个文件夹:lib
            2. 将commons-io-2.6.jar文件复制到lib文件夹
            3. 在jar文件上点右键, 选择Add as Library -> 点击OK
            4. 在类中导包使用
        FileUtils:
            主要方法:
                1. String readFileToStream(File file, String encoding): 读取文件中的数据, 返回字符串
                2. void copyFile(File srcFile, File destFile): 复制文件
                3. void copyDirectoryToDirect(File srcDir, File destDir): 复制文件夹
        IOUtils:
 */

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;

public class $6_IOFrame_commons_io_Summarize {
    public static void main(String[] args) throws IOException {
//        // 使用commons-io框架复制文件夹
//        FileUtils.copyDirectory(new File("D:\\Users\\Administrator\\Desktop\\test"),
//                new File("D:\\Users\\Administrator\\Desktop\\test1"));
        // 复制文件夹到另一个文件夹
//        FileUtils.copyDirectoryToDirectory(new File("D:\\Users\\Administrator\\Desktop\\test1"),
//                new File("D:\\Users\\Administrator\\Desktop\\test"));
        // 删除文件夹
//        FileUtils.deleteDirectory(new File("D:\\Users\\Administrator\\Desktop\\test1"));
        // 删除文件
        FileUtils.delete(new File("D:\\Users\\Administrator\\Desktop\\test\\蒋大为 - 最美的歌儿唱给妈妈2.mp3"));
    }
}
