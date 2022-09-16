package com.$15_ComprehensiveCase_MovieBuyTicketSystem.JavaBean;

/*
    商家角色
 */

public class Business extends User {
    // 店铺名称
    private String shopName;
    // 店铺地址
    private String address;

    public Business() {
    }

    public Business(String shopName, String address) {
        this.shopName = shopName;
        this.address = address;
    }

    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Business{" +
                "shopName='" + shopName + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}