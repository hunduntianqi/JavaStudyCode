package com.$19_NetworkProgramming.Demo.$1_TCPDemo;

import java.io.OutputStream;
import java.io.PrintStream;
import java.net.InetAddress;
import java.net.Socket;
import java.util.Scanner;

/*
    socket客户端多发
 */
public class $2_ClientDemo2 {
    public static void main(String[] args) throws Exception {
        System.out.println("====客户端启动====");
        // 1. 创建客户端对象
        Socket socket = new Socket(InetAddress.getLocalHost(), 8080);
        // 2. 得到一个字节输出流用于发送数据
        OutputStream os = socket.getOutputStream();
        // 3. 把字节流包装成打印流
        PrintStream ps = new PrintStream(os);
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("请输入您要说的内容:");
            String msg = sc.nextLine();
            if ("exit".equals(msg)) {
                System.out.println("离线成功！！");
                break;
            }
            // 4. 发送消息
            ps.println(msg);
            ps.flush();
        }
    }
}
