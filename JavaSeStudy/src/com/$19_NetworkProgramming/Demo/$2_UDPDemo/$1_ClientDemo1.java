package com.$19_NetworkProgramming.Demo.$2_UDPDemo;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class $1_ClientDemo1 {
    public static void main(String[] args) throws Exception {
        // 1. 创建发送端对象
        DatagramSocket socket = new DatagramSocket(6666);

        // 2. 创建数据包对象封装数据
        /**
         *  public DatagramPacket(byte buf[], int offset, int length,
         *          InetAddress address, int port) {
         *         setData(buf, offset, length);
         *         setAddress(address);
         *         setPort(port);
         *     }
         */
        byte[] buf = "我是一颗快乐的韭菜".getBytes();
        DatagramPacket pack = new DatagramPacket(buf, buf.length, InetAddress.getLocalHost(), 8888);

        // 3. 发送数据
        socket.send(pack);

        // 4. 关闭管道
        socket.close();
    }
}
