package io;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public  class fileWriter {

    //字符输出流
    //①创建字符输出流对象
    //细节1:参数是字符串表示的路径或者File对象都是可以的
    //细节2:如果文件不存在会创建一个新的文件， 但是要保证父级路径是存在的
    //细节3:如果文件已经存在，则会清空文件，如果不想清空可以打开续写开关
    //②写数据
    //细节:如果write方 法的参数是整数,但是实际上写到本地文件中的是整数在字符集_上对应的字符

    //public FileWriter(File )           创建字符输出流关联本地文件,覆写
    //public FileWriter(String )         创建字符输出流关联本地文件,覆写
    //public FileWriter(File , boolean ) 创建字符输出流关联本地文件，续写
    //public FileWriter(String , boolean)创建字符输出流关联本地文件，续写
    public static void main(String[] args) throws Exception {
        Writer wr=new FileWriter("study\\src\\data.txt");//覆盖管道
        wr.write(98);
        wr.write("蓝本才");
        byte[] b={};
        wr.write('兰');
        //写字符数组
        char[] chars="abc蓝本才".toCharArray();
        wr.write(chars);
        //写字符一部分 
        wr.write("abc蓝本才",0,3);

        wr.flush();
        wr.close();
        //字符输出流 也有缓存区  byte[8192]
        //缓存区内装满了 再添加内容 会自动将内容写入文件
        //flush() close()也会将 缓存区内的 内容写入文件
        //flush()可以继续写入文件,close()会结束 无法写入



    }
}
