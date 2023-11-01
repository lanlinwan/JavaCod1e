package 网络编程.UDP协议.ex聊天室;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Scanner;

public class 发送 {
    public static void main(String[] args) throws IOException {
           /*
            按照下面的要求实现程序
                UDP发送数据：数据来自于键盘录入，直到输入的数据是886，发送数据结束
                UDP接收数据：因为接收端不知道发送端什么时候停止发送，故采用死循环接收
        */

        //1.创建对象DatagramSocket的对象
        DatagramSocket ds = new DatagramSocket(10086);

        //2.打包数据
        Scanner s=new Scanner(System.in);
        while (true){
            System.out.println("请输入要说的话/886(退出)");
            String str=s.nextLine();

            byte[] bytes=str.getBytes();
            //127.0.0.1
            InetAddress address=InetAddress.getByName("10.36.108.127");
            int port=10286;
            DatagramPacket dp=new DatagramPacket(bytes,bytes.length,address,port);
            //3.发送数据
            ds.send(dp);
            if("886".equals(str)){
                break;
            }

        }

    }
}
