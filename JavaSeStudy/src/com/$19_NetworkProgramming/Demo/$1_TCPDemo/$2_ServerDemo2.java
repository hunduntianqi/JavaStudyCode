package com.$19_NetworkProgramming.Demo.$1_TCPDemo;

/*
    开发Socket服务端, 多收
 */

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class $2_ServerDemo2 {
    public static void main(String[] args) throws Exception {
        System.out.println("====服务端启动成功====");
        // 注册端口
        ServerSocket serverSocket = new ServerSocket(8080);
        // 定义死循环由主线程不断接收客户端Socket连接
        while (true) {
            // 2. 调用accept方法等待客户端连接请求, 建立通信管道,
            Socket socket = serverSocket.accept();
            // 3. 从socket通信管道得到一个字节输入流
            InputStream is = socket.getInputStream();
            // 4. 把字节输入流包装成缓冲字符输入流
            BufferedReader br = new BufferedReader(new InputStreamReader(is));
            // 按行读取信息
            String msg;
            while ((msg = br.readLine()) != null) {
                System.out.println(socket.getRemoteSocketAddress() + "说了:" + msg);
            }
        }
    }
}
