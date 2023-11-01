package 网络编程.TCP协议.ex.多线程文件上传;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.time.LocalDateTime;

public class serve {
    public static void main(String[] args) throws IOException {
        //服务端:接受客户端发送的文件,上传完毕 发送消息

        //1创建对象绑定端口
        ServerSocket serverSocket=new ServerSocket(10100);
        //2.等待客户端连接

        while (true) {
            Socket socket= serverSocket.accept();

            //有一个用户连接开启一个线程
            new Thread(new MyRunnable(socket)).start();
        }


    }
}
