package com.$19_NetworkProgramming.Demo.$1_TCPDemo;

/*
    开发Socket服务端, 多收
 */

import java.net.ServerSocket;
import java.net.Socket;

public class $3_ServerDemo3 {
    public static void main(String[] args) throws Exception {
        System.out.println("====服务端启动成功====");
        // 注册端口
        ServerSocket serverSocket = new ServerSocket(8080);
        // 定义死循环由主线程不断接收客户端Socket连接
        while (true) {
            // 2. 接受到的Socket连接交给子线程负责处理
            Socket socket = serverSocket.accept();
            // 3. 创建独立线程处理socket
            new $3_ServerReaderThread(socket).start();
        }
    }
}
