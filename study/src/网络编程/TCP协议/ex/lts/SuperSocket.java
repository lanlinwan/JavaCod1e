package 网络编程.TCP协议.ex.lts;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

class SuperSocket extends Socket implements Runnable {
    InputStream is;
    byte[] buffer;
    Socket socket = null;
    ServerSocket serverSocket = null;

    public SuperSocket(int port) {
        try {
            //初始服务器型套接字
            serverSocket = new ServerSocket(port);
            buffer = new byte[1024];
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
        @Override
        public void run () {
            try {
                //等待端口连接
                socket = serverSocket.accept();
                //连接完成后创建输入流
                is = socket.getInputStream();
                //读取客户端传送信息
                int len = is.read(buffer);
                String str = new String(buffer, 0, len);
                System.out.println(str);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }




