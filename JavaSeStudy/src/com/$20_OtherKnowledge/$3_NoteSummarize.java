package com.$20_OtherKnowledge;

/*
    注解:
        Java注解(Annotation) 又称Java标注, 时JDK5.0引入的一种注释机制
        Java语言中的类, 构造器, 方法, 成员变量, 参数等都可以被注解进行标注
        作用:
            对Java中的类, 方法, 成员变量做标记, 然后进行特殊处理(由业务需求来决定)
        自定义注解:
            格式:
                public @interface 注解名称 {
                    public 属性类型 属性名() default 默认值;
                }
            特殊属性:
                value属性: 如果只有一个value属性, 使用value属性的时候可以省略value名称不写
                          如果存在多个属性且多个属性没有默认值, 那么value名称是不能省略的
                注: 有默认值的属性可以省略不写
        元注解:
            就是注解注解的注解(指放在自定义注解上面的注解)
            常见元注解:
                @Target: 约束自定义注解只能在哪些地方使用
                    可使用的值定义在ElementType枚举类中, 常用值如下:
                        TYPE: 类, 接口
                        FIELD: 成员变量
                        METHOD: 成员方法
                        PARAMETER: 方法参数
                        CONSTRUCTOR: 构造器
                        LOCAL_VARIABLE: 局部变量
                @Retention: 申明注解的生命周期
                    可使用的值定义在RetentionPolicy枚举类中, 常用值如下:
                        SOURCE: 注解只作用在源码阶段, 生成的字节码文件中不存在
                        CLASS: 注解作用在源码阶段, 字节码文件阶段, 运行阶段不存在, 是默认值
                        RUNTIME: 注解作用在源码阶段, 字节码文件阶段, 运行阶段(开发常用)
        注解解析:
            指判断是否存在注解, 存在注解就解析出内容
            注解解析相关的接口:
                Annotation: 注解的顶级接口, 注解都是Annotation类型的对象
                AnnotatedElement: 该接口定义了与注解解析相关的解析方法
            相关方法:
                Annotation[] getDeclaredAnnotations(): 获得当前对象上使用的所有注解, 返回注解数组
                T getDeclaredAnnotation(Class<T> annotationClass): 根据注解类型获得对应注解对象
                boolean isAnnotationPresent(Class<Annotation> annotationClass): 判断当前对象是否使用了指定的注解, 如果
                                                                                使用了返回true, 否则返回false
                注意: 所有的类成分Class, Method, Field, Constructor, 都实现了AnnotatedElement接口, 他们都拥有解析注解的能力
            解析注解的技巧:
                注解在那个成份上, 就先拿那个成分的对象:
                    1. 注解作用在成员方法上, 要获得该成员方法对应的Method对象, 再来拿上面的注解
                    2. 注解作用在类上, 则需要先拿到类的Class对象, 再来拿上面的注解
                    3. 注解作用在成员变量上, 则要获得该成员变量对应的Field对象, 再来拿上面的注解
 */

public class $3_NoteSummarize {
}
