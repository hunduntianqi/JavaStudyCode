package com.maven_project;

/*
    maven工程关系:
        1. 依赖关系:
            Maven工具基于POM模式实现的, 在Maven中每一个项目都相当于是一个对象, 项目和项目之间是有关系的, 关系包含了依赖, 继承, 聚合
            实现Maven项目可以更方便的实现导jar包, 拆分项目等效果
            注入依赖-导jar包:
                    在pom.xml文件根元素project下的dependdencies标签中配置依赖信息, 内可以包含多个dependence元素, 以声明多个依赖
                每个依赖dependence标签都应该依赖的基本坐标: groupId, artifactId, version; Maven根据坐标才能找到所需的依赖
            依赖的传递性:
                指如果项目1依赖于项目2, 项目2依赖于Mybatis工程, 那么项目1也可以直接使用Mybatis工程
            依赖的两个原则:
                1. 第一原则-最短路径优先原则:
                    项目依赖关系中路径最短的版本会被使用
                2. 第二原则-最先声明原则:
                    在依赖路径长度相等的情况下, 在POM中依赖声明的顺序决定了谁会被解析使用, 顺序最靠前的依赖会被使用
            排除依赖:
                在dependency中新建标签:
                    <exclusions>
                        <groupId>要排除依赖的域名</groupId>
                        <artifactId>要排除依赖的名称</artifactId>
                    </exclusions>
            依赖范围:
                在dependency中新建标签:
                <scope>范围等级</scope>
                compile: 默认范围, 表示该依赖在编译和运行时都生效
                provided: 编译和测试时有效, 当生成war包后不会加入war包
                runtime: 只在运行时有效
                system: 只在本机使用, 且需要设置本机jar包路径:
                    <systemPath>本机jar包路径<systemPath>
                test: 只在编译测试代码和运行测试时需要, 应用的正常运行不需要依赖
                import: 该范围只适用于pom文件中的<dependencyManagement>, 表明指定的POM必须使用<dependencyManagement>标签导入依赖
        2. 继承关系:
            如果A工程继承B工程, 则代表A工程默认依赖B工程依赖的所有资源, 且可以应用B工程中定义的所有资源信息
            注意: 被继承的工程只能是POM工程, 并且在父项目中, 在<dependencyManagement>中的内容不被子项目继承, 不可以直接使用
        3. 聚合工程:
            在创建聚合工程的过程中, 总工程必须是一个POM工程(Maven project), 聚合工程中的子模块可以是任意类型
            创建聚合工程的前提是继承, 聚合包含了继承的特性, 聚合时多个项目本质上还是一个项目, 这些项目被一个大的项目所包含, 这个大的
            项目为POM类型, 同时在项目的pom.xml文件中定义<modules>表示包含所有模块
                <modules>
                    <module>模块名<module>
                </modules>

 */

public class maven_project_relation {
    public static void main(String[] args) {

    }
}
