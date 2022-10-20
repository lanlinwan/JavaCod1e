package io.copy;

import java.io.*;

public class 字节流 {
    //任何文件的底层都是字节，拷贝是一字不漏的转移字节，只要前后文件格式、编码一致没有任何问题。
    public static void main(String[] args) {
//        InputStream is=null;
//        OutputStream os=null;
//        try {
//            //1.字节输入流管道
//             is=new FileInputStream("D:\\steam\\steamapps\\workshop\\content\\431960\\825500653\\04.周杰伦 - 手写的从前.mp4");
//            //2.字节输出流管道
//             os=new FileOutputStream("B:\\本机照片\\zjl.mp4");
//            //3.字节数组转移数据
//            byte[] buffer=new byte[1024];
//            int len;//每次读取的字节树
//            while ((len=is.read(buffer))!=-1){
//                os.write(buffer,0,len);
//            }
//            System.out.println("复制完成");
//
//
//        } catch (Exception e) {
//            e.printStackTrace();
//        }finally {
//            System.out.println("=======finally=======");
//            //4.关闭
//            try {
//                if(os!=null)os.close();
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//            try {
//                if(is!=null)is.close();
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//        }
        //改进:
        try ( //这里面只能放置资源对象，用完会自动关闭:自动调用资源对象的close方法关闭资源(即使出现异常也会做关闭操作)
              InputStream is=new FileInputStream("D:\\steam\\steamapps\\workshop\\content\\431960\\825500653\\04.周杰伦 - 手写的从前.mp4");
              OutputStream  os=new FileOutputStream("B:\\本机照片\\zjl.mp4");){
            byte[] buffer=new byte[1024];
            int len;//每次读取的字节树
            while ((len=is.read(buffer))!=-1){
                os.write(buffer,0,len);
            }
            System.out.println("复制完成");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
