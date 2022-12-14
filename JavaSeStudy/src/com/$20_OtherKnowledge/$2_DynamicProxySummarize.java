package com.$20_OtherKnowledge;

/*
    动态代理:
        指代理者没有能力或者不愿意去完成某件事情, 需要找个人去代替自己去完成这件事, 动态代理是用来对业务功能(方法)进行代理的
    关键步骤:
        1. 必须要有接口, 实现类要实现接口(代理通常是基于接口实现的)
        2. 创建一个实现类的对象, 该对象为业务对象, 然后为业务对象做一个代理对象
        public static Object newProxyInstance(ClassLoader loader, Class<?>[] interfaces, InvocationHandler h):
            参数一: 类加载器, 负责加载代理类到内存中使用
            参数二: 获取被代理对象实现的全部接口, 代理要为全部接口的全部方法进行代理
            参数三: 代理的核心处理逻辑
    动态代理的优点:
        1. 非常灵活, 支持任意接口类型的实现类对象做代理, 也可以直接为接口本身做代理
        2. 可以为被代理对象的所有方法做代理
        3. 可以在不改变方法源码的情况下, 实现对方法功能的增强
        4. 不仅简化了编程工作, 提高了软件系统的可扩展性, 同时也提高了开发效率
 */

public class $2_DynamicProxySummarize {
}
