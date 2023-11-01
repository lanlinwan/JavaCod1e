package 网络编程.UDP协议.单播组播广播;

import java.io.IOException;
import java.net.*;

public class 广播 {
    public static void main(String[] args) throws IOException {

        DatagramSocket ds=new DatagramSocket();

        String str = "你好威啊！！！";
        byte[] bytes = str.getBytes();
        //改为 255.255.255.255 即使 广播
        InetAddress address = InetAddress.getByName("255.255.255.255");
        int port = 10086;
        //
        DatagramPacket dp=new DatagramPacket(bytes,bytes.length,address,port);

        //3.发送数据
        ds.send(dp);

        //4.释放数据
        ds.close();
    }
}
