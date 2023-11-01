package File;

import java.io.File;

public class main {
    public static void main(String[] args) {
        //File类概述
        //●File类在包java.io.File下、代表操作系统的文件对象(文件、文件夹)。
        //●File类提供 了诸如:定位文件,获取文件本身的信息、删除文件、创建文件(文件夹)等功能。
        //但是不能读写文件内容。

        //File(String,String) 给定的父级路径,与子路径

        //1.创建File对象
        File f=new File("B:\\锁屏图片\\src=http _gss0.baidu.com_94o3dSag_xI4khGko9WTAnF6hhy_zhidao_pic_item_3812b31bb051f8197673380dd7b44aed2e73e727.jpg&refer=http _gss0.baidu.com&app=2002&size=f9999,10000&q=a80&n=0&g=0n&fmt=jpeg.jpg");


        long size=f.length();//文件字节大小
        System.out.println(size);

        String B="B:\\";
        File f1=new File(B,"sjg.mp3");
        System.out.println(f1.getAbsolutePath());



        File f2=new File("logback.xml");
        System.out.println(f2.exists());

    }
}
