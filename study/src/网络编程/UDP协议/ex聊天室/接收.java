package 网络编程.UDP协议.ex聊天室;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class 接收 {
    public static void main(String[] args) throws IOException {
           /*
            按照下面的要求实现程序
                UDP发送数据：数据来自于键盘录入，直到输入的数据是886，发送数据结束
                UDP接收数据：因为接收端不知道发送端什么时候停止发送，故采用死循环接收
        */

        //1.创建对象DatagramSocket的对象
        DatagramSocket ds = new DatagramSocket(10286);

        //2.接收数据包
        byte[] bytes=new byte[1024];
        DatagramPacket dp=new DatagramPacket(bytes,bytes.length);

        while (true){
            //接收数据
            ds.receive(dp);

            //3.解析数据包
            byte[] data = dp.getData();
            int len = dp.getLength();
            String ip = dp.getAddress().getHostAddress();
            String name = dp.getAddress().getHostName();
            if (new String(data, 0, len).equals("886")){
                break;
            }


            //4.打印数据
            System.out.println("ip为：" + ip + ",主机名为：" + name + "的人，发送了数据：" + new String(data,0,len));
        }

    }
}
