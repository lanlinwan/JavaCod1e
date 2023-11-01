package 网络编程.TCP协议.ex.多发多收;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

public class client {
    public static void main(String[] args)throws IOException {
        //客户端：多次发送数据
        //服务器：接收多次接收数据，并打印


        //1. 创建Socket对象并连接服务端
        Socket socket = new Socket("127.0.0.1",10000);

        //2.写出数据
        Scanner scanner=new Scanner(System.in);
        OutputStream os=socket.getOutputStream();


        while (true){
            System.out.println("请输入信息");
            String str= scanner.nextLine();
             str= str + "\n";
            if("886".equals(str)){
                break;
            }
            os.write(str.getBytes());
        }

        //3.f=释放资源
        socket.close();
    }
}
