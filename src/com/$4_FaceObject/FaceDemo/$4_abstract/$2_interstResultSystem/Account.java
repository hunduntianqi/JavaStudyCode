package com.$4_FaceObject.FaceDemo.$4_abstract.$2_interstResultSystem;

public abstract class Account {
    private String cardId;
    private double money;
    
    public Account () {
    
    }
    
    public Account(String cardId, double money) {
        this.cardId = cardId;
        this.money = money;
    }
    
    // 登录结算利息
    public void handle(String loginName, String passWord) {
        
        if ("itheima".equals(loginName) && "123456".equals(passWord)) {
            System.out.println("登陆成功！！");
            // 调用方法, 结算利息:
            double resault = calc();
            // 输出利息详情
            System.out.println("本账户的利息是:" + resault + "元");
        } else {
            System.out.println("您输入的用户名或密码有误！！");
        }
    }
    
    // 定义抽象方法, 结算利息
    public abstract double calc();
    
    public String getCardId() {
        return cardId;
    }
    
    public void setCardId(String cardId) {
        this.cardId = cardId;
    }
    
    public double getMoney() {
        return money;
    }
    
    public void setMoney(double money) {
        this.money = money;
    }
}
