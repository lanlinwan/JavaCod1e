package io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class main {
    //io流:用于读写文件中的数据(可以读写文件或者网络上的数据)
    // 字节流:读取所有的文件

    // 字符流:读取纯文本文件
    //   底层: 字符流=字节流+字符集
    //   输入流:一次读取一个字节,遇到中文,一次读取多个字节
    //   输出流:底层把数据按照指定的编码格式进行编码,变成字节在写到文件中

    //                   ->inputStream 字节输入流 实现类:FileInputStream
    //         ->字节流   ->OutputStream 字节输出流 实现类:FileOutputStream
    // io流体系
    //         ->字符流   ->Reader 字符输入出流 实现类:FileReader
    //                   ->Writer 字符输出出流 实现类:FileWriter


    //使用 BufferedReader 在控制台读取字符
    public static void main(String[] args) throws IOException {
        // 使用 System.in 创建 BufferedReader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str;
        System.out.println("Enter lines of text.");
        System.out.println("Enter 'end' to quit.");
        do {
            str = br.readLine();//标准输入读取一个字符串
            System.out.println(str);
        } while (!str.equals("end"));
    }
}
