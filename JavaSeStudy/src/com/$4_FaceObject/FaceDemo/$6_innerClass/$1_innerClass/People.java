package com.$4_FaceObject.FaceDemo.$6_innerClass.$1_innerClass;

public class People {
    private int heartbeat = 150;
    
    public class Heart {
        private int heartbeat = 110;
        
        public void show() {
            int hearteat = 78;
            System.out.println(hearteat); // 输出78
            System.out.println(this.heartbeat); // 输出110
            System.out.println(People.this.heartbeat); // 输出150
        }
    }
}