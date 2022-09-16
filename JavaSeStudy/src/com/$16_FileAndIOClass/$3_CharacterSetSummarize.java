package com.$16_FileAndIOClass;
/*
    字符集:
        计算机底层不可以直接存储字符, 计算机中底层只能存储二进制(0, 1)
        计算机可以给人类字符进行编号存储, 这套编号规则就是字符集
        ASCll字符集:
            美国信息交换标准代码:包括了数字, 英文, 符号
            ASCll使用1个字节存储一个字符, 一个字节是8位, 可以表示128个字符信息
        GBK字符集:
            兼容ASCll码表, 也包含了几万个汉字, 并支持繁体和部分日韩文字
            一个中文以两个字节的形式存储, 但不包含世界上所有国家的文字
        Unicode码表:
            1. unicode（又称统一码、万国码、单一码）是计算机科学领域里的一项业界字符编码标准
            2. 容纳世界上大多数国家的所有常见文字和符号
            3. 由于Unicode会先通过UTF-8, UTF-16, 以及 UTF-32的编码成二进制后再存储到计算机,
            其中最为常见的就是UTF-8
            注意:
            1. Unicode是万国码, 以UTF-8编码后一个中文以三个字节的形式存储
            2. UTF-8也兼容ASCll编码表
            3. 技术人员都应该使用UTF-8字符集编码
            4. 编码前和解码后的字符集需要一致, 否则会出现中文乱码
        字符集的编码解码操作:
            String 编码:
                1. byte[] getBytes(): 使用平台的默认字符集将String编码为一系列字节, 将结果存储到新的
                   字节数组中
                2. byte[] getBytes(String charsetName): 使用指定的字符集将该String编码为一系列字节, 将结果存储到
                   新的字节数组中
            String 解码:
                1. String(byte[] bytes): 通过使用平台的默认字符集解码指定的字节数组来构建新的String
                2. String(byte[] bytes, String charsetName): 通过指定的字符集解码指定的字节数组来构造新的String
*/

public class $3_CharacterSetSummarize {
}
