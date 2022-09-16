package com.maven_project;

/*
    Maven-常见插件:
        1. 编译器插件:
            配置maven的编译器插件:
                <build>
                    <plugins>
                        <!-- jdk编译插件-->
                        <plugin>
                            <!-- 插件坐标 -->
                            <groupId>org.apache.maven.plugins</groupId>
                            <artifactId>maven-compiler-plugin</artifactId>
                            <version>3.2</version>

                            <configuration>
                            <!-- 源代码使用JDK版本-->
                                <source>1.7</source>
                            <!-- 源代码编译为class文件的版本, 要保持跟上面版本一致-->
                                <target>1.7</target>
                                <encoding>UTF-8</encoding>
                            </configuration>
                        </plugin>
                    </plugins>
                </build>
        2. 资源拷贝插件:
             <build>
                <resources>
                    <resource>
                        <directory>src/main/java</directory>
                        <includes>
                            <include>,,/,.xml</include> // 配置非resources下的配置文件打包到target/classes中
                        </includes>
                    </resource>
                    <resource>
                        <directory>src/main/resources</directory>
                        <includes>
                            <include>,,/,.xml</include> // 配置resources中的配置文件打包到target/classes中
                            <include>,,/,.properties</include> // 配置resources中的配置文件打包到target/classes中
                        </includes>
                    </resource>
                </resources>
             </build>
         3. Tomcat插件:
            <build>
                <plugins>
                <!-- 配置Tomcat插件-->
                    <plugin>
                         <!-- 插件坐标 -->
                            <groupId>org.apache.tomcat.maven</groupId>
                            <artifactId>tomcat7-maven-plugin</artifactId>
                            <version>2.2</version>

                            <configuration>
                                <!-- 配置Tomcat监听端口-->
                                <port>8080</port>
                                <!--配置项目的访问路径(Application Context) -->
                                <path> / </path>
                            </configuration>
                    </plugin>
                </plugins>
            </build>
 */

public class maven_common_plug {
}
