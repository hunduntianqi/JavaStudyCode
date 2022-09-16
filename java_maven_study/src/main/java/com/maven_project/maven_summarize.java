package com.maven_project;/*
    Maven:
        作为Apache中的一个开源项目, 主要服务于基于Java平台的的项目构建, 依赖管理和项目信息管理
        无论是小型的开源类库项目, 还是大型的企业级应用, 无论是传统的瀑布式开发, 还是流行的敏捷开发, Maven都能大显身手
        项目构建工具:
            Ant构建:
                最早的构建工具, 基于IDE, 对工程构建过程中的过程控制特别好, 但是其XML脚本编写格式使得XML文件特别大
            Maven:
                项目对象模型, 通过其描述信息来管理项目的构建, 报告和文档的软件项目管理工具, 填补了Ant的缺点, 第一次支持了
            从网络上下载的功能, 仍然采用XML作为配置文件格式, Maven专注的是依赖管理, 使用java编写
            Gradle:
                结合Ant和Maven的优点, 继承了Ant的灵活和Maven的生命周期管理, 最后被google作为了Android的御用管理工具, 采用
            DSL作为配置文件格式, 使得脚本更加简洁
        Maven的四大特性:
            1. 依赖管理系统:
                    Maven为java引入了一个新的依赖管理系统jar包管理, jar升级时修改配置文件即可, 再Java中可以用groupId, artifactId,
                version组成的Coordination(坐标)标识一个唯一的依赖
                任何基于Maven构建的项目自身也必须定义这三项属性, 生成的包可以是jar包, 也可以是war包或jar包, 一个典型的依赖引用如下图
                <dependency>
                    <groupId>javax.servlet</groupId>
                    <artifactId>javax.servlet-api</artifactId>
                    <version>3.1.0<version>
                </dependency>
                坐标属性的理解:
                    Maven坐标为各种组件引入了秩序, 任何一个组件都必须明确定义自己的坐标
                        GroupId:定义当前Maven项目隶属的实际项目-公司名称(jar包所在的仓库路径)
                        artifactId: 定义实际项目中的一个Maven模块-项目名
                        version: 定义Maven项目当前所处的版本
            2. 多模块构建:
                在Maven中需要定义一个parent POM作为一组module的聚合POM, 在该POM中可以使用<module>标签来定义一组子模块,
            parent POM中的build配置和依赖配置都会自动继承给子module
            3. 一致的项目结构
            4. 一致的构建模型和插件机制:
                <plugin>
                    <groupId>org.mortbay.jetty</groupId>
                    <artifactId>maven-jetty-plugin</artifactId>
                    <version>6.1.25</version>
                    <configuration>
                        <scanIntervalSeconds>10</scanIntervalSeconds>
                        <contextPath>/test</contextPath>
                    <configuration>
                </plugin>
        Maven工程类型:
            1. POM工程:
                是逻辑工程, 用在父级工程或聚合工程中, 用来做jar包的版本控制
            2. JAR工程:
                将会打包成jar, 用作jar包使用, 即常见的本地工程
            4. WAR工程:
                会打包成war, 发布在服务器上的工程

 */

public class maven_summarize {
}
