package 网络编程.TCP协议.ex.线程池文件上传;

import 网络编程.TCP协议.ex.多线程文件上传.MyRunnable;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class serve {
    public static void main(String[] args) throws IOException {
        //服务端:接受客户端发送的文件,上传完毕 发送消息

        //创建线程池
        ThreadPoolExecutor pool = new ThreadPoolExecutor(
                3,//核心线程数量
                16,//线程池总大小
                60,//空闲时间
                TimeUnit.SECONDS,//空闲时间单位
                new ArrayBlockingQueue<>(2),//阻塞队列
                Executors.defaultThreadFactory(), //线程工厂,让线程池如何创建线程
                new ThreadPoolExecutor.AbortPolicy()//拒绝策略
        );

        //1创建对象绑定端口
        ServerSocket serverSocket=new ServerSocket(10100);
        //2.等待客户端连接

        while (true) {
            Socket socket= serverSocket.accept();

            //有一个用户连接开启一个线程
            //new Thread(new MyRunnable(socket)).start();
            pool.submit(new MyRunnable(socket));
        }


    }
}
