package com.$19_NetworkProgramming.Demo.$2_UDPDemo;

/*
    多发
 */

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Scanner;

public class $2_ClientDemo2 {
    public static void main(String[] args) throws Exception {
        // 1. 创建发送端对象
        DatagramSocket socket = new DatagramSocket();

        Scanner sc = new Scanner(System.in);


        while (true) {
            System.out.println("请输入您要发送的数据:");
            String msg = sc.nextLine();

            if ("exit".equals(msg)) {
                System.out.println("您已成功离线！");
                socket.close();
                break;
            }
            // 2. 创建数据包对象封装数据
            /**
             *  public DatagramPacket(byte buf[], int offset, int length,
             *          InetAddress address, int port) {
             *         setData(buf, offset, length);
             *         setAddress(address);
             *         setPort(port);
             *     }
             */
            byte[] buf = msg.getBytes();
            DatagramPacket pack = new DatagramPacket(buf, buf.length, InetAddress.getLocalHost(), 8080);
            // 3. 发送数据
            socket.send(pack);

        }
    }
}
