package com.$19_NetworkProgramming.Demo.$2_UDPDemo;
/*
    多收
 */

import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class $2_ServerDemo2 {
    public static void main(String[] args) throws Exception {
        // 1. 创建接收端对象
        DatagramSocket socket = new DatagramSocket(8080);

        // 2. 创建数据包对象接收数据
        byte[] buf = new byte[1024 * 64];
        DatagramPacket pack = new DatagramPacket(buf, buf.length);

        while (true) {
            // 3. 等待接收数据
            socket.receive(pack);
            int num = pack.getLength();
            // 4. 取出数据
            System.out.println("收到了:" + new String(buf, 0, num));

            // 获取发送端的IP和端口
            System.out.println("发送端IP:" + pack.getSocketAddress().toString());
            System.out.println("发送端端口:" + pack.getPort());
        }
    }
}
