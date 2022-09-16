package com.$4_FaceObject.FaceDemo.$5_interface;

public class Test {
    public static void main(String[] args) {
        PingPangMan pm = new PingPangMan("张继科");
        pm.eat();
        pm.run();
        
        // 实现类对象调用接口默认方法
        pm.pao();
        // 接口名调用接口静态方法
        SportManInterface.inAddr();
    }
}
