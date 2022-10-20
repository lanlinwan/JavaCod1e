package io;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class fileWriter {
    //字符输出流
    public static void main(String[] args) throws Exception {
        Writer wr=new FileWriter("study\\src\\data.txt");//覆盖管道
        wr.write(98);
        wr.write("蓝本才");
        wr.write('兰');
        //写字符数组
        char[] chars="abc蓝本才".toCharArray();
        wr.write(chars);
        //写字符一部分 
        wr.write("abc蓝本才",0,3);

        wr.flush();
        wr.close();



    }
}
