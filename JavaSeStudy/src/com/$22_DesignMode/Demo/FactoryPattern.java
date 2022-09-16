package com.$22_DesignMode.Demo;

public class FactoryPattern {
    // 定义一个方法创建对象返回
    public static Computer createComputer(String info) {
        switch(info) {
            case "华为":
                Computer c = new Huawei();
                c.setName("huawei pro 16");
                c.setPrice(5999);
                return c;
            case "苹果":
                Computer mac = new Mac();
                mac.setName("iPhone 13 pro");
                mac.setPrice(12999);
                return mac;
            default:
                return null;
        }
    }
}
