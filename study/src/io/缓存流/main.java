package io.缓存流;

import java.io.*;

public class main {
    //作用:缓冲流自带缓冲区、可以提高原始字节流、字符流读写数据的性能

    public static void main(String[] args) {
        //字节缓冲输入流 实现类:BufferedInputStream  提高速度,读写功能不变
        //字节缓冲输出流 实现类:BufferedOutputStream
        try (
                InputStream is = new FileInputStream("D:\\steam\\steamapps\\workshop\\content\\431960\\825500653\\04.周杰伦 - 手写的从前.mp4");
                //1.把原始的字节输入流包装成高级的缓冲字节输入流
                InputStream bis = new BufferedInputStream(is);

                OutputStream os = new FileOutputStream("B:\\本机照片\\zjl.mp4")) {
            //2.把字节输出流管道包装成高级的缓冲字节输出流管道
            OutputStream bos=new BufferedOutputStream(os);

            byte[] buffer = new byte[1024];
            int len;
            while ((len = bis.read(buffer)) != -1) {
                bos.write(buffer, 0, len);
            }
            System.out.println("复制完成");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }






}

