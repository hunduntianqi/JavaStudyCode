package com.$4_FaceObject.FaceDemo.$3_polymorphic.$2_Demo2;

/*
    需求:
        1. 使用面向对象编程:设计一个电脑对象, 可以安装2个USB设备
        2. 鼠标:被安装时可以完成接入, 调用点击功能, 拔出功能
        3. 键盘:被安装时可以完成接入, 调用打字功能, 拔出功能
    分析:
        1. 定义一个USB接口, (申明USB设备的规范必须是:可以接入和拔出)
        2. 提供2个USB接口实现类代表鼠标和键盘, 让其实现USB接口, 并分别定义独有功能
        3. 创建电脑对象, 创建2个USB实现类对象, 分别安装到电脑中并触发功能的执行
 */
public class Test {
    public static void main(String[] args) {
        // 1. 创建电脑对象
        Computer c = new Computer("混沌天炁",2500 );
        c.start();
        
        // 2.创建鼠标对象和键盘对像
        USB m = new Mouse("混沌炁", 50);
        c.installUSB(m);
        USB k = new KeyBoard("混沌天", 100);
        c.installUSB(k);
    }
}
