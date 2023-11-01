package io.ex;

import java.io.*;

public class copyFloder {
    public static void main(String[] args) throws IOException {
        //拷贝文件夹,考虑子文件夹
        //创建需要拷贝的对象
        File src = new File("B:\\demo");
        //创建对象 目的地
        File src1 = new File("B:\\demo1");

        copy(src,src1);
    }

    private static void copy(File src,File dest) throws IOException {
        //创建目标文件夹
        dest.mkdirs();
        //获取 数据源
        File[] files=src.listFiles();
        //遍历
        for (File file : files) {
            //是文件
            if (file.isFile()){
                //拷贝
                //被拷贝的文件
                FileInputStream fis= new FileInputStream(file);
                //拷贝的目标位置
                File f=new File(dest,file.getName());
                FileOutputStream fos=new FileOutputStream(f);
                byte[] bytes= new byte[1024];
                int len;
                while ((len=fis.read(bytes)) != -1){
                    fos.write(bytes,0,len);
                }
                fos.close();
                fis.close();
            }else {
                //是文件夹
                copy(file,new File(dest,file.getName()));
            }
        }
    }
}
