package 网络编程.TCP协议.ex.lts;

import java.io.IOException;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class TCPclient {
    public static void main(String[] args) {
        InetAddress address = null;
        Socket socket = null;
        OutputStream os = null;
        String message = null;
        Scanner sca = null;
        try {
            //得到本机IP地址
            address = InetAddress.getByName("127.0.0.1");
            //规定端口号，建立套接字
            int port = 9998;
            socket = new Socket(address, port);
            //绑定套接字的输出流
            os = socket.getOutputStream();
            sca = new Scanner(System.in);
            while (true) {
                message = sca.next();
            //写入输出流，在局域网中传输
                os.write(message.getBytes());
            }
        } catch
        (UnknownHostException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
            //关闭端口号，关闭io流
                os.close();
                socket.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
    }
}
