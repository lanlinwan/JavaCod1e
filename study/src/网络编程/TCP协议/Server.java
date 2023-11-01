package 网络编程.TCP协议;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketAddress;

public class Server {
    public static void main(String[] args)throws IOException {
        //TCP协议，接收数据

        //1.创建对象ServerSocker
        ServerSocket ss = new ServerSocket(10000);

        //2.监听客户端的链接
        Socket socket =ss.accept();


        //3.从连接通道中获取输入流读取数据
        InputStream is = socket.getInputStream();
        //转换流 字节 转 字符
        InputStreamReader isr = new InputStreamReader(is);
        // 缓冲流
        BufferedReader br = new BufferedReader(isr);

        // BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        int b;
        while ((b = br.read()) != -1){
            System.out.println((char) b);
        }

        //4.释放资源
        socket.close();
        ss.close();

    }
}
