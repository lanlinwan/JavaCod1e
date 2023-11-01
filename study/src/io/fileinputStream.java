package io;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

public class fileinputStream {
    //FileInputStream 输入流 字节读取数据
    //细节:
    //①创建字节输入流对象
    //细节1:如果文件不存在，就直接报错。
    //②读取数据
    //细节1:-次读一 个字节，读出来的是数据在ASCII.上对应的数字
    //细节2:读到文件末尾了 ，read方法返回-1。
    //③释放资源
    //细节1:每次使用完流必须要释放资源。
    public static void main(String[] args) throws Exception {
        InputStream is = new FileInputStream("study\\src\\data.txt");
        //1.读取一个字节 读取完毕返回-1
//        int b=is.read();
//        System.out.println((char) b);
//        //循环读取
//        int a;
//        while ((a= is.read()) !=-1){
//            System.out.println((char) a);
//        }
//
//        //2.每次读取一个字节数组的数据
//        byte[] buffer=new byte[3];
//        int len=is.read(buffer);
//        System.out.println("读取了几个字节"+len);
//        String rs=new String(buffer);
//        System.out.println(rs);

//        int len1=is.read(buffer);
//        System.out.println("读取了几个字节"+len1);
//        //读取多少倒出多少
//        String rs1=new String(buffer,0,len1);
//        System.out.println(rs1);

//          //循环每次读取一个字节数组
//          byte[] buffer1=new byte[3];
//          int len3;
//          while ((len3=is.read(buffer1))!=-1){
//              //读取多少倒出多少
//              System.out.println(new String(buffer1,0,len3));
//          }

        //全部读取
        File f=new File("study\\src\\data.txt");
        InputStream is1=new FileInputStream(f);

        byte[] buffer1=is1.readAllBytes();
        System.out.println(new String(buffer1));
    }

}
