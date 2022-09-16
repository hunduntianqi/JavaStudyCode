package com.$14_LogFramework;

/*
    日志:
        程序中的日志可以用来记录程序运行过程中的信息, 并进行永久存储
    日志技术的优势:
        1. 可以将系统执行的信息选择性的记录到指定的位置(控制台, 文件, 数据库中)
        2. 可以随时以开关的形式控制是否记录日志, 无需修改源代码
        3. 多线程性能好

    日志规范: 一些接口, 提供给日志的实现框架设计的标准
        1. Commons Logging: 简称JCL
        2. Simple Logging Facade for Java: 简称slf4j

    日志框架:
        1. Log4j
        2. JUL(java.util.logging)
        3. Logback(重点学习)
        4. 其他实现类

    Logback日志框架:
        是基于slf4j日志规范实现的框架
        三个技术模块:
            1. logback-core: 此模块为其他两个模块奠定基础, 必须有
            2. logback-classic: 是log4j的一个改良版本, 同时完整实现了slf4j API
            3. logback-access: 模块与 Tomcat 和 Jetty 等 Servlet 容器集成, 以提供 HTTP 访问日志功能
    Logback快速入门:
        导入Logback日志技术到项目中, 用于记录系统的日志信息
        1. 在项目下新建文件夹lib, 导入Logback的相关jar包到该文件夹下, 并添加到项目依赖库中去
            1.1 logback-classic-1.2.3.jar
            1.2 logback-core-1.2.3.jar
            1.3 slf4j-api-1.7.26.jar
        2. 将Logback的核心配置文件logback.xml直接拷贝到src目录下(必须是src下)
        3. 创建日志对象:
            public static final Logger LOGGER = LoggerFactory.getLogger("类对象");
        4. 使用日志对象LOGGER调用方法输出日志信息
        Logback配置详解:
            Logback日志系统的特性都是通过核心配置文件logback.xml控制的
            1. Logback日志输出位置, 格式设置
                1.1 通过logback.xml中的<appender>标签可以设置输出位置和日志信息的详细格式
                1.2 通常可以设置2个日志输出位置: 控制台中和系统文件中
                    输出到控制台的配置标志:
                        <appender name="CONSOLE" class="ch.qos.logback.core.ConsoleAppender">
                    输出到系统文件的配置标志:
                        <appender name="FILE" class="ch.qos.logback.core.rolling.RollingFileAppender">
            2. 设置日志输出级别:
                用于控制系统中哪些日志级别是可以输出的
                1. 级别程度:TRACE < DEBUG < INFO < WARN < ERROR
                2. 默认级别:DEBUG(忽略大小写), 只输出不低于当前级别的日志
                3. ALL和OFF分别是打开全部日志和关闭全部日志
                    日志级别的配置信息:
                        <root level="日志级别">
                        <root >: 代表默认级别debug
 */
public class $1_LogSummarize {
}
