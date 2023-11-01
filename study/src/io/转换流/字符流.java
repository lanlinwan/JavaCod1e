package io.转换流;

import java.io.*;
import java.nio.charset.Charset;

public class 字符流 {
    public static void main(String[] args) throws IOException {
        //InputStreamReader()   可以指定 编码格式,jdk11 被 淘汰了
        // InputStreamReader() 字符转换输入流 可以包装一个 字节流,使一个字节流 使用字符流的方法
//        InputStreamReader isr= new InputStreamReader(new FileInputStream("B:\\"),"GBK");
//        OutputStreamWrite osw=new OutputStreamWrite((new FileOutputStream());
//        int ch;
//        while((ch = isr.read()) != -1){
//            System.out.println((char)ch);
//        }
//        isr.close();

        //新写法
        FileReader fr=new FileReader("", Charset.forName("GBK"));
        int ch;
        while((ch = fr.read()) != -1){
            System.out.println((char)ch);
        }
        fr.close();


//        OutputStreamWriter osw =new OutputStreamWriter(new FileOutputStream(""),"GBK");
//        osw.write(" ");
//        osw.close();

        FileWriter fileWriter = new FileWriter("",Charset.forName("GBK"));





    }
}
