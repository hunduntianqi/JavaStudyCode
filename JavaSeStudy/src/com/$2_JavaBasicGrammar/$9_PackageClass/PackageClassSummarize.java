package com.$2_JavaBasicGrammar.$9_PackageClass;

/*
    包装类概述:
        指8中基本数据类型对应的引用类型:
            byte-Byte
            short-Short
            int-Integer
            long-Long
            char-Character
            float-Float
            double-Double
            boolean-Boolean
        提供包装类的原因:
            1. Java为了实现一切皆对象, 为8中基本数据类型提供了对应的引用类型
            2. 集合和泛型只支持包装类型, 不支持基本数据类型
        自动装箱:基本类型的数据和变量可以直接赋值给包装类型的变量
        自动拆箱:包装类型的变量可以直接赋值给基本数据类型的变量
        包装类的特有功能:
            1. 包装类的变量的默认值可以是null, 容错率更高
            2. 可以把基本数据类型转换成字符串类型(用处不大):
                2.1. 调用tiString()方法得到字符串结果
                2.2. 调用Integer.toString(基本类型数据)
            3. 可以把字符串类型的数值转换成真实的数据类型(有用):
                例:
                    Integer.parseInt("字符串类型的整数");
                    Double.parseDouble("字符串类型的小数");
                注意:数据转换时字符串内数值必须与要转换的类型一致！！
 */

public class PackageClassSummarize {
    public static void main(String[] args) {
        String num = "23";
        System.out.println(num.getClass());
        int age = Integer.parseInt(num);
        int age2 = Integer.valueOf(num);
        System.out.println(age);
        System.out.println(age2);
    }
}
