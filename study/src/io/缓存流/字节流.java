package io.缓存流;

import java.io.*;

public class 字节流 {
    //作用:缓冲流自带缓冲区 byte[8192]  8k、
    // 可以提高原始字节流、字符流读写数据的性能
    // BufferedInputStream(InputStream,int) 可以指定缓冲区大小

    public static void main(String[] args) {
        //字节缓冲输入流 实现类:BufferedInputStream  提高速度,读写功能不变
        //字节缓冲输出流 实现类:BufferedOutputStream
        try (
                InputStream is = new FileInputStream("B:\\双截棍_周杰伦_128k.mp3");
                //1.把原始的字节输入流包装成高级的缓冲字节输入流
                InputStream bis = new BufferedInputStream(is);

                OutputStream os = new FileOutputStream("B:\\sjg.mp3")) {
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

