package io.压缩流;

import java.io.*;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class 压缩 {
    public static void main(String[] args) throws IOException {
        //压缩本质:把每-个(文件/文件夹)看成ZipEntry对象放到压缩包中

        File src=new File("B:bbbb");
        File dest=new File("B:");
        toZip(src,dest);
    }

    private static void toZip(File src,File dest) throws IOException {
        //1.创建压缩流 关联 压缩包
        ZipOutputStream zos=new ZipOutputStream(new FileOutputStream(new File(dest,"a.zip")));
        //2.创建 ZipEntry 对象,表示压缩包每一个文件 和 文件夹
        ZipEntry entry= new ZipEntry("a.txt");
        //3.把ZIPEntry 对象放入压缩包中
        zos.putNextEntry(entry);
        //4.把文件中的数据 写到压缩包
        FileInputStream fis = new FileInputStream(src);
        int b;
        while ( (b=fis.read()) !=-1){
            zos.write(b);
        }

        zos.closeEntry();
        zos.close();
    }
}
