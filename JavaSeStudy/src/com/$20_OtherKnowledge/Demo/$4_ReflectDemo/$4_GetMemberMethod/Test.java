package com.$20_OtherKnowledge.Demo.$4_ReflectDemo.$4_GetMemberMethod;

import java.lang.reflect.Method;

public class Test {
    /**
     * 1. 获取类中所有的成员方法对象
     */
    @org.junit.Test
    public void getDeclaredMethods() {
        // 1. 获取类对象
        Class dog = Dog.class;
        // 2. 获取全部成员方法对象
        Method[] methods = dog.getDeclaredMethods();
        // 3. 遍历全部方法:
        for (Method method : methods) {
            System.out.println(method.getName() + " ===> 返回值类型:" + method.getReturnType() + " ===> 参数个数:" + method.getParameterCount());
        }
    }

    /**
     * 2. 获取类中的某一个方法
     */
    @org.junit.Test
    public void getDeclaredMethod() throws Exception {
        // 1. 获取类对象
        Class dog = Dog.class;

        // 2. 获取指定方法对象
        Method m = dog.getDeclaredMethod("eat");  // 获取无参方法
        Method m2 = dog.getDeclaredMethod("eat", String.class);  // 获取带参数的方法
        // 私有属性暴力反射打开权限
        m.setAccessible(true);
        m2.setAccessible(true);
        // 3. 执行方法
        Dog d = new Dog();
        Object result = m.invoke(d);  // 注意: 若被执行的方法没有返回值, 则会返回null
        System.out.println(result);
        m2.invoke(d, "骨头");
    }
}
