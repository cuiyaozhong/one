package com.example.one.tcpServer;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author 崔耀中
 * @since 2020-11-03
 */
public class Server {

    private static int count;
    private static Socket socket;

    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(2001);
        System.out.println("服务器已启动,等待客户连接...");
        while(true){
            //接收客户端的TCP连接请求，获取具体的连接socket对象
            socket = serverSocket.accept();
            ServerThread st = new ServerThread(socket);
            st.start();
            System.out.println("这是第"+(count++)+"位用户");
            System.out.println("此用户的IP地址为"+socket.getInetAddress().getHostAddress());
        }
    }


}
