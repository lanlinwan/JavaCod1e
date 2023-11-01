package 网络编程.TCP协议.ex.lts;

import java.io.IOException;
import java.util.Scanner;

import java.net.Socket;

public class TCPserver {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //实例化具有多线程功能的服务器专用 socket类
        //需要传递端口号作为初始化变量
        SuperSocket socket_1 = new SuperSocket(9996);
        SuperSocket socket_2 = new SuperSocket(9998);
        SuperSocket socket_3 = new SuperSocket(9997);

        //建立三个子线程
        Thread s1 = new Thread(socket_1);
        Thread s2 = new Thread(socket_2);
        Thread s3 = new Thread(socket_3);
        try {
            while (true) {//开启线程s1.start();s2.start();
                s3.start();
                if (scan.next() == "123") {
                    //结束线程
                    break;
                }
            }
        } finally {
            try {
                //关闭套接字
                socket_1.close();
                socket_2.close();
                socket_3.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
