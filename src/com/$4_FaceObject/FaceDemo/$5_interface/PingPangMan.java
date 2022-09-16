package com.$4_FaceObject.FaceDemo.$5_interface;

public class PingPangMan implements SportManInterface{
    private String name;
    
    public PingPangMan(String name) {
        this.name = name;
    }
    
    @Override
    public void run() {
        System.out.println(this.name + "要跑步锻炼！！");
    }
    
    @Override
    public void eat() {
        System.out.println(this.name + "必须要吃营养餐, 不能吃垃圾食品！！");
    }
}
