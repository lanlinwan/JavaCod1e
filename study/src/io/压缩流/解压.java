package io.压缩流;

import java.io.*;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

public class 解压 {
    public static void main(String[] args) throws IOException {
        //要解压的
        File file = new File("B:\\aaaa.zip");
        //解压目的地
        File dest = new File("B:\\bbbb");
        unzip(file, dest);
    }

    //解压
    private static void unzip(File file, File dest) throws IOException {
        //解压本质: 所有文件按照层级关系 拷贝到目的地

        //创建一个解压流
        ZipInputStream zpi = new ZipInputStream(new FileInputStream(file));
        ZipEntry entry;
        //获取所有 层级目录
        while ((entry = zpi.getNextEntry()) != null) {
            System.out.println(entry);
            if (entry.isDirectory()) {
                //是文件夹,需要复制
                File file1 = new File(dest, entry.toString());
                System.out.println(file1);
                file1.mkdirs();
            } else {
                //是文件,直接放入文件夹中
                FileOutputStream fos = new FileOutputStream(new File(dest, entry.toString()));
                int b;
                while ((b = zpi.read()) != -1) {
                    fos.write(b);
                }
                fos.close();
                zpi.closeEntry();
            }
        }
        zpi.close();

    }
}
