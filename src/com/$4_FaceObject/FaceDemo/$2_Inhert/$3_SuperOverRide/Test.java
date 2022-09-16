package com.$4_FaceObject.FaceDemo.$2_Inhert.$3_SuperOverRide;

/*
    案例:
        通过super关键字完成方法重写
            1.旧手机的功能只能是打电话和发短信
            2.新手机的功能需要能够:基本的打电话下支持视频通话, 基本的发信息下支持发送语音和图片
 */

public class Test {
    public static void main(String[] args) {
        // 方法重写测试
        NewPhone iphone = new NewPhone();
        iphone.call();
        iphone.sendMessage();
    }
}