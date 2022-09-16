package com.$5_CommonAPI.CommonAPIDemo.$7_ATMSystem;

/*
    账户类
 */

public class Account {
    // 账户类, 包含用户的卡号, 姓名, 密码, 余额, 取现额度
    private String cardId; // 卡号
    private String username; // 用户名
    private String password; // 密码
    private double money; // 余额
    private double quotaMoney; // 取现额度
    
    // 定义无参构造
    public Account() {
    
    }
    
    // 定义带参数构造方法
    
    public Account(String cardId, String username, String password, double money, double quotaMoney) {
        this.cardId = cardId;
        this.username = username;
        this.password = password;
        this.money = money;
        this.quotaMoney = quotaMoney;
    }
    
    public String getCardId() {
        return cardId;
    }
    
    public void setCardId(String cardId) {
        this.cardId = cardId;
    }
    
    public String getUsername() {
        return username;
    }
    
    public void setUsername(String username) {
        this.username = username;
    }
    
    public String getPassword() {
        return password;
    }
    
    public void setPassword(String password) {
        this.password = password;
    }
    
    public double getMoney() {
        return money;
    }
    
    public void setMoney(double money) {
        this.money = money;
    }
    
    public double getQuotaMoney() {
        return quotaMoney;
    }
    
    public void setQuotaMoney(double quotaMoney) {
        this.quotaMoney = quotaMoney;
    }
}
