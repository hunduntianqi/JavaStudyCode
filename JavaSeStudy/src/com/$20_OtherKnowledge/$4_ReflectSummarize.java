package com.$20_OtherKnowledge;

/*
    反射概述:
        指对于任何一个类, 在"运行的时候"都可以直接得到这个类的全部成分
        运行时动态获取类信息以及动态调用类中成分的能力被称为Java的反射机制
        1. 在运行时可以直接得到这个类的构造器对象Constructor
        2. 在运行时可以直接得到这个类的成员变量对象Field
        2. 在运行时可以直接得到这个类的成员方法对象Method
        反射的关键:
            先得到编译后的class类对象(.class文件), 然后解析类中的全部成分
        反射的基本作用:
            在运行时可以获取类的字节码文件对象: 然后可以解析类中的全部成分
    反射第一步:
        反射获取类对象:
            1. 调用Class类中的静态方法forName(String className)获取Class类的对象
                Class c1 = Class.forName("全类名");
            2. 通过类名.class
                Class c2 = 类名.class
            3. 通过对象.getClass()
                Class c3 = 对象.getClass();
        反射获取构造器对象:
            作用: 创建对象
            1. 先获取class对象
            2. 通过class对象获取构造器对象
            Class类中获取构造器方法:
                1. Constructor<?>[] getConstructors(): 返回所有构造器对象的数组(只能拿public的)
                2. Constructor<?>[] getDeclaredConstructors(): 返回所有构造器对象的数组, 存在就能拿到
                3. Constructor<T> getConstructor(Class<?>... parameterTypes): 返回单个构造器对象(只能拿public的)
                3. Constructor<T> getDeclaredConstructor(Class<?>... parameterTypes): 返回单个构造器对象, 存在就能拿到
                Constructor类中用于创建对象的方法:
                    1. T newInstance(Object... initargs): 根据指定的构造器创建对象
                        例: Student s = 构造器对象.newInstance;
                    2. public void setAccessible(boolean flag): 设置为true, 表示取消访问检查, 进行暴力反射(除了构造器, 对成员变量也可进行此操作)
        反射获取成员变量:
            作用: 在某个对象中取值和赋值
            1. 先获取class对象
            2. 通过class对象获取成员变量
            Class类获取成员变量的方法:
                1. Field[] getFields(): 返回所有成员变量对象的数组(只能拿public的)
                2. Field[] getDeclaredFields(): 返回所有成员变量对象的数组, 存在就能拿到
                3. Field getField(String name): 返回单个成员变量对象(只能拿public的)
                4. Field getDeclaredField(String name): 返回单个成员变量对象, 存在就能拿到
                Field类中取值和赋值的方法:
                    1. void set(Object obj, Object value): 赋值
                    2. Object get(Object obj): 取值
        反射获取成员方法:
            作用: 在某个对象中执行此方法
            1. 先获取class对象
            2. 通过class对象获取成员方法
            Class类获取成员方法的方法:
                1. Method[] getMethods(): 返回所有成员方法对象的数组(只能拿public的)
                2. Method[] getDeclaredMethods(): 返回所有成员方法对象的数组, 存在就能拿到
                4. Method getDeclaredMethod(String name, Class<?>... parameterTypes): 返回单个成员方法对象, 存在就能拿到
                3. Method getMethod(String name, Class<?>... parameterTypes): 返回单个成员方法对象(只能拿public的)
                Method类中用于触发执行的方法:
                    Object invoke(Object obj, Object...args):
                        参数一: 用obj对象调用该方法
                        参数二: 调用方法需要传递的参数(没有可不写)
                        返回值: 指方法的返回值(没有可不写)
                    注意: 如果某个方法是非public的, 需要暴力打开权限, 再触发执行
    反射的具体作用:
        1. 绕过编译阶段为集合添加数据
            反射是作用在运行时的技术, 此时集合的泛型将不能产生约束了, 此时还可以为集合存入其他类型的元素, 泛型只是在编译阶段可以约束集合只能操作某种
        数据类型, 再编译成class文件进入运行阶段时, 其真实类型都是对应集合类型, 泛型约束相当于被擦除了, 所以可以向集合中添加任意类型的数据
        2. 通用框架的底层原理-做企业级通用框架
    反射作用总结:
        1. 可以在运行时得到一个类的全部成分并进行操作
        2. 可以破坏封装性
        3. 可以破坏泛型的约束性
        4. 可以做java的高级框架(更加重要)
 */

public class $4_ReflectSummarize {
}
