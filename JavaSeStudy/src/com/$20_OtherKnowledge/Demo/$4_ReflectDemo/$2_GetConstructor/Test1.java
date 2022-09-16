package com.$20_OtherKnowledge.Demo.$4_ReflectDemo.$2_GetConstructor;

/*
    目标:
        通过反射获取类的构造器
        获取构造器的作用:
            初始化一个对象返回
 */

import org.junit.Test;

import java.lang.reflect.Constructor;

public class Test1 {
    // 编写测试方法测试获取全部构造器对象
    @Test
    /* 1. getConstruceors: 获取全部public修饰的构造器 */
    public void getConstructors () throws Exception{
        // 1. 获取类对象
        Class c = Class.forName("com.JavaGrammar.Jan_09_OtherKnowledge.ReflectSummarize.ReflectTest.Test2.Student");
        // 2. 提取类中全部的构造器对象
        Constructor[] constructors = c.getConstructors();
        System.out.println(constructors.length);
        // 遍历构造器
        for (Constructor constructor : constructors) {
            System.out.println(constructor.getName() + "===>" + constructor.getParameterCount());
        }

    }

    @Test
    /* 2. getDeclaredConstructors(): 获取全部构造器, 无论是否为public修饰 */
    public void getDeclaredConstructors() throws Exception{
        // 1. 获取类对象
        Class c = Class.forName("com.JavaGrammar.Jan_09_OtherKnowledge.ReflectSummarize.ReflectTest.Test2.Student");
        // 2. 提取类中全部的构造器对象
        Constructor[] constructors = c.getDeclaredConstructors();
        System.out.println(constructors.length);
        // 遍历构造器
        for (Constructor constructor : constructors) {
            System.out.println(constructor.getName() + "===>" + constructor.getParameterCount());
        }

    }

    @Test
    /* 3. getConstructor(): 获取public修饰的单个构造器 */
    public void getConstructor() throws Exception{
        // 1. 获取类对象
        Class c = Student.class;
        // 2. 提取类中的某个构造器(按照参数类别与参数个数定位, 注意: 无法获取私有构造器, 且无法获取构造器时会报错)
        Constructor constructor = c.getConstructor(String.class, int.class);
        System.out.println(constructor.getName() + "===>" + constructor.getParameterCount());
    }

    @Test
    /* 4. getDeclaredConstructor(): 获取单个构造器 */
    public void getDeclaredConstructor() throws Exception{
        // 1. 获取类对象
        Class c = Student.class;
        // 2. 提取类中的某个构造器(按照参数类别与参数个数定位, 且无法获取构造器时会报错)
        Constructor constructor = c.getDeclaredConstructor();
        System.out.println(constructor.getName() + "===>" + constructor.getParameterCount());
    }
}
