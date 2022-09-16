package com.$4_FaceObject.FaceDemo.$2_Inhert.$3_SuperOverRide;

public class NewPhone extends OldPhone{
    @Override // 重写注解, 可帮忙检查重写是否正确
    public void call () {
        super.call();
        System.out.println("可以打视频电话~~");
    }
    
    @Override
    public void sendMessage () {
        super.sendMessage();
        System.out.println("可以发送图片和语音~~");
    }
}
