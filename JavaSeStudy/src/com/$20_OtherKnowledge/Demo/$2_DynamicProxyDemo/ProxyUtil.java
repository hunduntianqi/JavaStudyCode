package com.$20_OtherKnowledge.Demo.$2_DynamicProxyDemo;

/*
    public static Object newProxyInstance(ClassLoader loader, Class<?>[] interfaces, InvocationHandler h):
            参数一: 类加载器, 负责加载代理类到内存中使用
            参数二: 获取被代理对象实现的全部接口, 代理要为全部接口的全部方法进行代理
            参数三: 代理的核心处理逻辑
 */

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class ProxyUtil {
    /**
     * 生成业务对象的代理对象
     */
    public static UserService getProxy(UserService obj) {
        return (UserService) Proxy.newProxyInstance(obj.getClass().getClassLoader(), obj.getClass().getInterfaces(), new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                // 参数一: 代理对象本身, 一般不管
                // 参数二: 正在被代理的方法
                // 参数三: 被代理方法应该传入的参数
                long startTimer = System.currentTimeMillis();
                // 触发方法的执行(触发真正的业务功能)
                Object result = method.invoke(obj, args);
                long endTimer = System.currentTimeMillis();
                System.out.println(method.getName() + "方法耗时: " + (endTimer - startTimer) / 1000.0 + "s");
                // 把业务功能方法执行的结果返回给调用者
                return result;
            }
        });
    }
}
