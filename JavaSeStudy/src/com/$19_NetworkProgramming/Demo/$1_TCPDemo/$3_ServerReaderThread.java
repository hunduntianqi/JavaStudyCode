package com.$19_NetworkProgramming.Demo.$1_TCPDemo;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.Socket;

public class $3_ServerReaderThread extends Thread{
    private Socket socket;
    public $3_ServerReaderThread(Socket socket) {
        this.socket = socket;
    }
    @Override
    public void run() {
        try {
            InputStream is = this.socket.getInputStream();
            // 包装字符输入缓冲流
            BufferedReader bufIs = new BufferedReader(new InputStreamReader(is));
            String msg;
            while ((msg = bufIs.readLine()) != null) {
                System.out.println("收到了:" + this.socket.getRemoteSocketAddress() + ":" + msg);
            }
        } catch (Exception e) {
//            e.printStackTrace();
            System.out.println(this.socket.getRemoteSocketAddress() + "下线了~~");
        }
    }
}
