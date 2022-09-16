package com.$22_DesignMode.Demo;

public class Mac extends Computer{
    @Override
    public void start() {
        System.out.println(getName() + "以非常优雅的方式启动, 展示了一个苹果logo");
    }
}
