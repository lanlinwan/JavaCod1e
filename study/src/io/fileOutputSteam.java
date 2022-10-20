package io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.nio.charset.StandardCharsets;

public class fileOutputSteam {
    //字节写入数据
    public static void main(String[] args) throws Exception {
        OutputStream os1=new FileOutputStream("study\\src\\data.txt");//覆盖管道,清空之前的数据,写新数据
        OutputStream os=new FileOutputStream("study\\src\\data.txt",true);//追加管道
        //写入数据
        os.write('a');
        os.write(98);
        os.write("\r\n".getBytes(StandardCharsets.UTF_8));//换行
        //os.write('兰');

        byte[] buffer={'a',97,98,99};
        os.write(buffer);

        byte[] buffer2="蓝本才".getBytes();
        os.write(buffer2);

        os.flush();//写数据必须刷新数据
        os.close();//关闭,包括刷新
    }
}
