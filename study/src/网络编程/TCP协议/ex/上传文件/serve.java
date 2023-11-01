package 网络编程.TCP协议.ex.上传文件;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class serve {
    public static void main(String[] args) throws IOException {
        //服务端:接受客户端发送的文件,上传完毕 发送消息

        //1创建对象绑定端口
        ServerSocket serverSocket=new ServerSocket(10100);
        //2.等待客户端连接
        Socket socket= serverSocket.accept();
        //3.读取文件并保存本地文件中
        BufferedInputStream bis=new BufferedInputStream(socket.getInputStream());
        BufferedOutputStream bos =new BufferedOutputStream(new FileOutputStream("JavaCode\\study\\thumb\\belle\\a.png"));
        int len;
        byte[] bytes=new byte[1024];
        while ((len=bis.read())!=-1){
            bos.write(bytes,0,len);
        }
        //4.回写数据
        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
        bw.write("上传成功");
        bw.newLine();
        bw.flush();

        socket.close();
        serverSocket.close();

    }
}
