package 网络编程.inetAddress;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class main {
    public static void main(String[] args) throws UnknownHostException {
        //InetAddress 互联网协议ip地址
        // 通过静态方法创建,会自动判断系统是 IP4 IP6,来创建子类
    /*
        static InetAddress getByName(String host)确定 主机名称的IP地址。主机名称可以是机器名称，也可以是IP地址
        String getHostName( )  获取此IP地址的主机名
        String getHostAddress()  返回文本显示中的IP地址字符串
      */

        //1.获取InetAddress的对象
        //IP的对象 --> 一台电脑的对象
        InetAddress address = InetAddress.getByName("LAPTOP-L82BRRVH");
        System.out.println(address);

        String name = address.getHostName();
        System.out.println(name);//LAPTOP-L82BRRVH

        String ip = address.getHostAddress();
        System.out.println(ip);//192.168.1.100

    }
}
