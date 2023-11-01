package io;

import java.io.FileReader;
import java.io.Reader;

public class fileReader {
    fileReader(){

    }
    //
    //FileReader 字符输入
    //字符流不会出现乱码,但是性能较慢
    //细节1:按字节进行读取,遇到中文,一次读多个字节，读取后解码，返回一个整数
    //细节2:读到文件末尾了，read方法返回-1。
    //     read()可以读取多个数据
    public static void main(String[] args)throws Exception {
        //创建一个字符输入
        Reader fr=new FileReader("study\\src\\data.txt");
        //循环读取
//        int code;
//        while ((code=fr.read())!=-1) {
//            System.out.println((char)code);
//        }

        //循环每次读取一个字符数组
        char[] buffer=new char[1024];
        int len;
        while  ((len=fr.read(buffer))!=-1) {
            String re=new String(buffer,0,len);
            System.out.println(re);
        }
        fr.close();
    }

    //字符流原理解析
    //①创建字符输入流对象
    //  底层:关联文件,并创建缓冲区(长度为8192的字节数组)
    //  read()会创建缓冲区,在程序没有执行完之前都可以读取到缓存区中的文件
    //②读取数据
    //底层:1.判断缓冲区中是否有数据可以读取
    //    2.缓冲区没有数据:就从文件中获取数据，装到缓冲区中，每次尽可能装满缓冲区
    //      如果文件中也没有数据了，返回-1
    //    3.缓冲区有数据:就从缓冲区中读取。
    //  空参的read方法: - -次读取-一个字节,遇到中文一-次读多个字节，把字节解码并转成十进制返回.
    //  有参的read方法:把读取字节，解码，强转三步合并了,强转之后的字符放到数组中
}
