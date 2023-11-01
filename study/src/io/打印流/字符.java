package io.打印流;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class 字符 {
    public static void main(String[] args) throws IOException {
        //字符打印流
        //构造方法
        // public PrintWriter(Write/File/String) 关联字节输出流/文件/文件路径
        // public PrintWriter(String fileName, Charset charset) 指定字符编码
        // public PrintWriter(Write W, boolean autoFlush) 自动刷新
        // public PrintWr iter(OutputStream out, boolean autoFlush, Charset charset) 指定字符编码且自动刷新
        //*字符流底层有缓冲区，想要自动刷新需要开启


        PrintWriter printWriter=new PrintWriter(new FileWriter("B:aaaa.txt"),true);

        //成员方法一致
        printWriter.println("我什么都不知道,呜呜呜");
        printWriter.print("nn");


    }
}
