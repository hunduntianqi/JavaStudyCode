package com.$19_NetworkProgramming.Demo.$1_TCPDemo;

import java.io.OutputStream;
import java.io.PrintStream;
import java.net.InetAddress;
import java.net.Socket;

public class $1_ClientDemo1 {
    public static void main(String[] args) throws Exception {
        System.out.println("====客户端启动====");
        // 1. 创建客户端对象
        Socket socket = new Socket(InetAddress.getLocalHost(), 8080);
        // 2. 得到一个字节输出流用于发送数据
        OutputStream os = socket.getOutputStream();
        // 3. 把字节流包装成打印流
        PrintStream ps = new PrintStream(os);
        // 4. 发送消息
        ps.println("我是TCP的客户端, 已与你对接, 并发出邀请: 约吗?");
        ps.flush();
    }
}
