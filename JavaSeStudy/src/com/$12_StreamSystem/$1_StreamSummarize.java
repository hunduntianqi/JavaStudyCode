package com.$12_StreamSystem;

/*
    Stream流概述:
        在Java8中, 得益于Lambda所带来的函数式编程, 引入了一个全新的Stream流概念
        目的:
            用于简化集合和数组操作的API, 结合了Lambda表达式
        思想和使用步骤:
            1. 先得到集合或者数组的Stream流(类似一根传送带)
                获取Stream流:
                    1. 集合:使用Collection接口中的默认方法tream()生成流
                        default Stream<E> stream():获取当前对象的Stream流
                    2. 数组:
                        public static <T> Stream<T> stream(T[], array): 获取当前数组的Stream流
                        public static <T> Stream<T> of(T...values): 获取当前数组或可变数据的Stream流
                Stream流常用API:
                    1. Stream<T> filter(Predicate<? super T> predicate): 用于对流中的数据进行过滤
                    2. Stream<T> limit(long maxSize):获取前几个元素
                    3. Stream<T> skip(long n): 跳过前几个元素
                    4. Stream<T> distinct(): 去除流中重复的元素(依赖hashCode和equals方法)
                    5. static <T> Stream<T> concat(Stream a, Stream b): 合并a和b两个流为一个流
            2. 把元素放上去
            3. 使用Stream流简化的API操作元素
        stream流常用方法:
            forEach:遍历
            count:统计个数
                --  long count()
            map:加工方法
            1. Stream<T> filter(Predicate<? super T> predicate): 用于对流中的数据进行过滤
            2. Stream<T> limit(long maxSize):获取前几个元素
            3. Stream<T> skip(long n): 跳过前几个元素
            4. Stream<T> distinct(): 去除流中重复的元素(依赖hashCode和equals方法)
            5. static <T> Stream<T> concat(Stream a, Stream b): 合并a和b两个流为一个流
 */

public class $1_StreamSummarize {
}
