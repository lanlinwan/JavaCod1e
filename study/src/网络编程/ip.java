package 网络编程;

public class ip {
    //IP:设备在网络上的地址,是唯一标识
    //特殊的ip: 127.0.0.1 也是 localhost:本机ip
    //cmd: ip config:查看本机ip; ping:检查网络是否连通

    //端口号:应用程序在设备中唯一的标识。
    //端口号:由两个字节表示的整数，取值范围: 0~65535
    //其中0~1023之间的端口号用于一些知名的网络服务或者应用。
    //我们自己使用1024以.上的端口号就可以了。
    //注意:一个端口号只能被一个应用程序使用。


    //协议:计算机网络中,连接和通信的规则被称为网络通信协议
    //IPv4
    //全称: Internet Protocol version 4,互联网通信协议第四版。
    //采用32位地址长度，分成4组  2^ 32
    //32bit (4字节)
    //11000000 10101000 0000001 01000010 点分十进制表示法 --> 192.168.1.66

    //IPv6
    //全称: Internet Protocol version 6,互联网通信协议第六版。
    //由于互联网的蓬勃发展，IP地址的需求量愈来愈大，而IPv4的模式下IP的总数是有限的。
    //采用128位地址长度，分成8组。 2^ 128
    //00100000 00000001   00001101 10111000   00000000 00000000   00000000 001 00011
    //00000000 00001000   00001000 0000000    00100000 00001100   01000001 01111010
    //十六进制 -->  2001:0DB8:0000:0023:0008:Q800:200C:417A
    // 省略前面的0  2001:DB8:0:23:8:800:200C:417A
 }

