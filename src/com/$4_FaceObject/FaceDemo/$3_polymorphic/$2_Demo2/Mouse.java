package com.$4_FaceObject.FaceDemo.$3_polymorphic.$2_Demo2;

public class Mouse implements USB{
    private String name;
    private double money;
    
    public Mouse() { }
    
    public Mouse(String name, double money) {
        this.name = name;
        this.money = money;
    }
    
    @Override
    public void connect() {
        System.out.println(name + "成功接入电脑~");
    }
    
    @Override
    public void unConnect () {
        System.out.println(name + "已成功拔出电脑");
    }
    
    // 鼠标独有功能:点击
    public void dbClick () {
        System.out.println(name + "双击点亮小红心！！");
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public double getMoney() {
        return money;
    }
    
    public void setMoney(double money) {
        this.money = money;
    }
}
