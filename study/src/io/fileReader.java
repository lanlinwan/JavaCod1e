package io;

import java.io.FileReader;
import java.io.Reader;

public class fileReader {
    //FileReader 字符输入
    //字符流不会出现乱码,但是性能较慢
    public static void main(String[] args)throws Exception {
        //创建一个字符输入
        Reader fr=new FileReader("study\\src\\data.txt");
        //循环读取
        int code;
        while ((code=fr.read())!=-1) {
            System.out.println((char)code);
        }

        //循环每次读取一个字符数组
        char[] buffer=new char[1024];
        int len;
        while  ((len=fr.read(buffer))!=-1) {
            String re=new String(buffer,0,len);
            System.out.println(re);
        }
    }
}
