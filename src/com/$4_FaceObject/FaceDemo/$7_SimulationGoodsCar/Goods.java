package com.$4_FaceObject.FaceDemo.$7_SimulationGoodsCar;

public class Goods {
    /**
     * 商品类
     */
    
    private int id; // 商品id, 商品的唯一标识
    private String name; // 商品名称
    private double price; // 商品价格
    private int buyNumber; // 购买商品数量
    
    // 定义无参构造
    public Goods() {
    
    }
    
    // 定义带参数构造
    public Goods(int id, String name, double price, int buyNumber) {
    
    }
    
    public int getId() {
        return id;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public double getPrice() {
        return price;
    }
    
    public void setPrice(double price) {
        this.price = price;
    }
    
    public int getBuyNumber() {
        return buyNumber;
    }
    
    public void setBuyNumber(int buyNumber) {
        this.buyNumber = buyNumber;
    }
}


