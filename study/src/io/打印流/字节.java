package io.打印流;

import java.io.*;

public class 字节 {
    public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException {
        //打印流
        //分类:打印流一般是指: PrintStream, PrintWriter两 个类
        //特点1:打印流只操作文件目的地，不操作数据源
        //特点2:特有的写出方法可以实现，数据原样写出
        // 字节打印流没有缓冲区,开不开自动刷新都一样
        //例如:打印: 97
        //文件中: 97

        //构造方法
        //public PrintStream(OutputStream/File/String) 关联字节输出流/文件/文件路径
        //public PrintStream(String fileName, Charset charset) 指定字符编码
        //public PrintStream(OutputStream out, boolean autoFlush) 自动刷新
        //public PrintStream(OutputStream out, boolean autoFlush, String encoding) 指定字符编码且自动刷新

        //成贝力法
        //public void write(int b) 常规方法:规则跟之前一样，将指定的字节写出
        //public void println(Xxx xx) 特有方法:打印任意数据，自动刷新，自动换行
        //public void print(Xxx xx) 特有方法:打印任意数据，不换行
        //public void printf(String format, object... args) 特有方法:带有占位符的打印语句，不换行



        PrintStream outputStream=new PrintStream(new FileOutputStream("B:aaaa.txt"),true,"GBK");
        outputStream.println(97);//写出 + 自动刷新 + 自动换行
        outputStream.print(true);
        outputStream.printf("%s 55 %s ","44","66");
        outputStream.close();

    }
}
