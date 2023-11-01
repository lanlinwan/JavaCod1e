package io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.nio.charset.StandardCharsets;

public class fileOutputSteam {
    //字节输出流:
    //    new FileOutputStream(" ")
    //    new FileOutputStream(File)
    //    new FileOutputStream(File,boolean)
    //  1.参数可以是 字符串表示的路径 或者 File对象
    //  2.如果文件不存在会创建一个新的文件,但是要保证父级路径存在
    //  3.第二个参数不写默认 为false,是覆盖管道,会清空文件原来的数据
    //    为true ,是追加管道,会在 文件原数据中追加数据
    //  4.write()参数是整数的,会按照 ASCII中对应的字符
    //    write()参数也可以是一个 Byte数组
    //  5.用完需要释放资源
    public static void main(String[] args) throws Exception {
        //FileOutputStream(File,false) 覆盖管道,清空之前的数据,写新数据, 不写默认是false
        OutputStream os1=new FileOutputStream("study\\src\\data.txt");
        //FileOutputStream(File,true) 追加管道
        OutputStream os=new FileOutputStream("study\\src\\data.txt",true);
        //写入数据
        os.write('a');
        os.write(98);//b
        os.write("\r\n".getBytes());//换行符
        //os.write('兰');

        byte[] buffer={'a',97,98,99};
        //写入一个byte数组
        os.write(buffer);

        byte[] buffer2="蓝本".getBytes();
        os.write(buffer2);

        os.flush();//写数据必须刷新数据
        os.close();//关闭,包括刷新
    }
}
