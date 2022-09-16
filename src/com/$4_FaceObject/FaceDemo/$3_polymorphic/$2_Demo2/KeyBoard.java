package com.$4_FaceObject.FaceDemo.$3_polymorphic.$2_Demo2;

public class KeyBoard implements USB{
    private String name;
    private double money;
    
    public KeyBoard() {
    
    }
    
    public KeyBoard(String name, double money) {
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
    
    // 键盘独有功能:打字
    public void keyDown () {
        System.out.println(name + "敲击了 :来了老弟~~");
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
