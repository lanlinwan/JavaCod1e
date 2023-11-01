package 网络编程.TCP协议.ex.线程池文件上传;

import java.io.*;
import java.net.Socket;
import java.time.LocalDateTime;

public class MyRunnable implements Runnable{

    Socket socket;
    public MyRunnable(Socket socket){
        this.socket=socket;
    }

    @Override
    public void run() {
        //3.读取文件并保存本地文件中
        try {
            BufferedInputStream bis=new BufferedInputStream(socket.getInputStream());
            LocalDateTime nowDateTime = LocalDateTime.now();
            BufferedOutputStream bos =new BufferedOutputStream(new FileOutputStream("JavaCode\\study\\thumb\\belle\\"+nowDateTime+".png"));
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


        }catch (Exception e){
            e.printStackTrace();
        }
        finally {
            if (socket!=null){
                try {
                    socket.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

        }
    }
}
