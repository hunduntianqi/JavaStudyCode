package com.$19_NetworkProgramming;

/*
    网络通信基本模式:
        1. Client-Server(CS):
            客户端-服务端模式
        2. Browser-Server(BS):
            浏览器-服务端模式
    网络通信三要素:
        1. IP地址: 设备在网络中的地址, 是唯一标识
            IP常用命令:
                1. ipconfig: 查看本机IP
                2. ping IP地址: 检查网络是否连通
            特殊IP地址:
                本机IP地址:127.0.0.1或者localhost: 称为回送地址或本地回环地址, 只会寻找当前所在本机
            IP地址操作类:InetAddress
                常用方法:
                    1. public static InetAddress getLocalHost(): 返回本主机的地址对象
                    2. public static InetAddress getByName(String host): 得到指定主机的IP地址对象, 参数是域名或者IP地址
                    3. public String getHostName(): 获取此IP地址的主机名
                    4. public String getHostAddress(): 返回IP地址字符串
                    5. public boolean isReachable(int timeout): 在指定毫秒内连通该IP地址对应的主机, 连通返回true
        2. 端口: 应用程序在设备中的唯一标识
            标识正在计算机设备上运行的进程(程序), 被规定为一个16位的二进制, 范围是0-65535
            端口类型:
                1. 周知端口: 0-1023, 被预先定义的知名应用占用(如: HTTP占用80, FTP占用21)
                2. 注册端口: 1024- 49151, 分配给用户进程或某些应用程序(如: Tomcat占用8080, MySql占用3306)
                3. 动态端口: 49152-65535, 一般不固定分配某种进程, 而是动态分配
                注意: 我们自己开发的程序选择注册端口, 且一个设备中不能出现两个程序的端口号一样, 否则会出错
        3. 通信协议: 数据在网络中的传输规则, 常见的有UDP协议和TCP协议
            连接和通信数据的规则被称为网络通信协议
            传输层常见协议:
                1. TCP(Transmission Control Protocol): 传输控制协议
                    特点:
                        1. 使用时必须双方先建立连接, 是一种面向连接的可靠通信协议
                        2. 传输前, 采用"三次握手"方式建立连接, 所以可靠
                        3. 在连接中可进行大数据量的传输
                        4. 连接, 发送数据都需要确认, 且传输完毕后, 还需释放已建立的连接, 通信效率较低
                        5. "四次挥手"断开连接
                    通信场景:
                        对信息安全要求较高的场景, 例如: 文件下载, 金融等数据通信
                        客户端:
                            Socket类:
                                构造器:
                                    public Socket(String host, int port): 创建发送端的Socket对象与服务端连接, 参数为服务端的ip和端口
                                成员方法:
                                    1. OutputStream getOutputStream(): 获得字节输出流对象
                                    2. InputStream getInputStream(): 获得字节输入流对象
                        服务端:
                            ServerSocket类:
                                构造器:
                                    public ServerSocket(int port): 注册服务端端口
                                成员方法:
                                    public Socket accept(): 等待接收客户端的Socket通信连接, 连接成功返回Socket对象与客户端建立端到端通信
                         服务端同时处理多个客户端通信要求:
                            引入多线程
                2. UDP(User Datagram Protocol): 用户数据报协议
                    特点:
                        1. 是一种无连接, 不可靠传输的协议
                        2. 将数据源IP, 目的地IP和端口封装成数据包, 不需要建立连接
                        3. 每个数据包的大小限制在64KB内
                        4. 发送不管对方是否准备好, 接收方收到也不确认, 所以不可靠
                        5. 可以广播发送, 发送数据结束时无需释放资源, 开销小, 速度快
                    通信场景:
                        语音通话, 视频会话等
                    数据包对象: DatagramPacket
                        构造器:
                            1. public DatagramPacket(byte[] buf, int length, InetAddress address, int port): 创建发送端数据包对象
                                buf: 要发送的内容, 字节数组
                                length: 要发送内容的字节长度
                                address: 接收端的IP地址对象
                                port: 接收端的端口号
                            2. public DatagramPacket(byte[] buf, int length): 创建接收端的数据包对象
                                buf: 用来存储接收的内容
                                length: 能够接收内容的长度
                        常用方法:
                            public int getLength(): 获得实际接收到的字节个数
                    发送端和接收端对象:DatagramSocket:
                        构造器:
                            1. public DatagramSocket(): 创建发送端的Socket对象, 系统会随机分配一个端口号
                            2. public DatagramSocket(int port): 创建接收端的Socket对象并指定端口号
                        常用方法:
                            1. public void send(DatagramPacket dp): 发送数据包
                            2. public void receive(DatagramPacket p): 接收数据包
                    UDP接收端只负责接收数据包, 无所谓是哪个发送端的数据包, 所以接收端可以接收很多发送端的数据
                    UDP通信三种方式:
                        1. 单播: 单台主机与单台主机之间通信
                        2. 广播: 当前主机与所在网络中的所有主机通信
                        3. 组播: 当前主机与选定的一组主机的通信
 */

import java.net.InetAddress;

public class $1_NetworkProgrammingSummarize {
    public static void main(String[] args) throws Exception {
        // 1. 获取本机地址对象
        InetAddress ip = InetAddress.getLocalHost();
        System.out.println(ip.getHostName());
        System.out.println(ip.getHostAddress());
        System.out.println("===============");

        // 2. 获取域名IP对象
        InetAddress ip2 = InetAddress.getByName("www.baidu.com");
        System.out.println(ip2.getHostName());
        System.out.println(ip2.getHostAddress());
        System.out.println("===============");
        // 3. 获取公网IP对象
        InetAddress ip3 = InetAddress.getByName("39.156.66.14");
        System.out.println(ip3.getHostName());
        System.out.println(ip3.getHostAddress());
        System.out.println("===============");
        // 4. 判断是否能通
        System.out.println(ip3.isReachable(5000));
    }
}
