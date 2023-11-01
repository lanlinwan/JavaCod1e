package 网络编程.TCP协议.ex.线程池文件上传;

import java.io.*;
import java.net.Socket;

public class client {
    public static void main(String[] args) throws IOException {
        //客户端:将本地文件上传到服务器,接受服务器的反馈

        //1.Socket对象 连接服务器
        Socket socket =new Socket("127.0.0.1",10100);

        //2.读取本地文件,写入服务器
        BufferedInputStream bis=new BufferedInputStream(new FileInputStream("study\\thumb\\wallhaven-vg3k1m_2560x1600.png"));
        BufferedOutputStream bos=new BufferedOutputStream(socket.getOutputStream());
        byte[] bytes=new byte[1024];
        int len;
        while ((len=bis.read())!=-1){
            bos.write(bytes,0,len);
        }
        //结束标记
        socket.shutdownOutput();

        //3.接受服务器回写数据
        BufferedReader br=new BufferedReader(new InputStreamReader(socket.getInputStream()));
        String line=br.readLine();
        System.out.println(line);

        bis.close();
        socket.close();
    }
}
