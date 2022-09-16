package com.maven_project;/*
    Maven仓库:
        是基于简单文件系统存储的, 集中化管理Java API资源的一个服务
        Maven可以在某个位置统一存储所有的Maven项目共享的构件, 这个统一的位置就是仓库, 项目构建完成后生成的构件也可以部署到
        仓库中供其他项目使用
        仓库中的任何一个构件都有其唯一的坐标, 根据这个坐标可以定义仓库中的唯一存储路径, 得益于Maven的坐标机制, 任何Maven项目
        使用任何一个构件的方式都是完全相同的
        仓库的分类:
            1. 本地仓库:
                指本机的一份拷贝, 用来缓存远程下载, 包含你尚未发布的临时构件
            2. 远程仓库:
                不在本机中的一切仓库都可称为远程仓库, 分为中央仓库和本地私服仓库,
                远程仓库指通过各种协议如file://和http://访问的其他类型仓库, 这些仓库可能是第三方搭建的真实的远程仓库, 用来提供他们的
                构件下载(如repo.maven.apache.org和uk.maven.org是Maven的中央仓库), 其他远程仓库可能是公司拥有的建立在文件或HTTP
                服务器上的内部仓库, 用来在开发团队之间共享私有构件和管理发布的
        仓库配置:
            settings.xml文件配置本地仓库:
                找到localRepository:
                    <localRepository>/path/to/local/repo</localRepository>
                    该配置默认为注释掉, 取消注释, 将目标本地仓库路径复制到该标签之间
                    <localRepository>目标本地仓库路径</localRepository>
            settings.xml文件配置镜像仓库:
                由于在国内直接连接apache中央仓库下载依赖过慢, 可以将默认中央仓库设置为国内的镜像仓库, 如阿里云镜
                像:http://maven.aliyun.com/nexus/content/groups/public
                具体配置内容:
                <mirror>
                    <!--指定镜像ID(可以自己改名)-->
                    <id>nexus-aliyun</id>
                    <!--匹配中央仓库(阿里云的仓库名称, 不可以自己起名, 必须这么写) -->
                    <mirrorOf>central</mirrorOf>
                    <!--指定镜像名称(可以自己改名) -->
                    <name>Nexus aliyun</name>
                    <!-- 指定镜像路径(镜像地址)-->
                    <url>http://maven.aliyun.com/nexus/content/groups/public</url>
                </mirror>
            仓库优先级:
                1. 先在本地仓库寻找目标的jar包
                2. 本地仓库没找到, 到全局配置文件中找:
                    配置镜像仓库: 先到镜像仓库寻找
                    未配置镜像仓库: 到中央仓库中找
        Maven工程JDK配置:
            settings.xml全局配置文件中:
                配置前提是需要有对应版本的jdk
                <profile>
                      <!-- settings.xml中的id是不能随便起的 -->
                      <!-- 告诉maven使用的jdk版本-->
                      <id>jdk-17.0.1</id>
                      <!--开启编译器的使用-->
                      <activation>
                        <activeByDefault>true</activeByDefault>
                        <jdk>17.0.1</jdk>
                      </activation>
                      <properties>
                        <!--配置编译器信息-->
                        <maven.compiler.source>17.0.1</maven.compiler.source>
                        <maven.compiler.target>17.0.1</maven.compiler.target>
                        <maven.compiler.compilerVersion>17.0.1</maven.compiler.compilerVersion>
                      </properties>
                </profile>
            


 */


public class maven_warehouse {
}
