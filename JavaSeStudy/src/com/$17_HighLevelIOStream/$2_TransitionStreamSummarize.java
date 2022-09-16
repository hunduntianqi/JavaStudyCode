package com.$17_HighLevelIOStream;

/*
    转换流概述:
        字符输入转换流:
            InputStreamReader:
            1. 先提取文件的原始字节流, 原始字节不会存在问题
            2. 将原始字节流以指定编码转换成字符输入流
            构造器:
                1. public InputStreamReader(InputStream is): 可以把原始字节流按照默认编码转换成字符输入流, 几乎不用, 与默认FileReader一样
                2. public InputStreamReader(InputStream is, String charset): 可以把原始字节流按照指定编码转换成字符输入流,
        字符输出转换流:
            OutputStreamWrite:
            构造器:
                public OutputStreamWriter(OutputStream os, String charset): 以指定编码把字节输出流转换成字符输出流, 从而指定
                                                                                                          写出去的字符编码
                注意:
                    写入数据时, 转换流必须在字节流之前关闭
 */

public class $2_TransitionStreamSummarize {
}
