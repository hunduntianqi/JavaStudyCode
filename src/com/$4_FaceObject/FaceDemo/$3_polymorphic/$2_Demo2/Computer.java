package com.$4_FaceObject.FaceDemo.$3_polymorphic.$2_Demo2;

public class Computer {
    private String name;
    private double money;
    
    public Computer() {
    }
    
    public Computer(String name, double money) {
        this.name = name;
        this.money = money;
    }
    
    public void start () {
        System.out.println(name + "电脑开机中....");
        System.out.println(name + "已开机！！");
    }
    // 提供安装USB设备入口
    public void installUSB (USB u) {
        // 调用USB设备接入电脑功能
        u.connect();
        
        // 调用实现类独有功能, 需要先判断类型再强转
        if (u instanceof  KeyBoard) {
            KeyBoard k = (KeyBoard) u;
            ((KeyBoard) u).keyDown();
        } else if (u instanceof Mouse) {
            Mouse m = (Mouse) u;
            m.dbClick();
        }
        
        // 拔出电脑
        u.unConnect();
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
