package File.ex1;

import java.io.File;

public class ex4 {
    public static void main(String[] args) {
        //删除多级文件夹

        delete(new File("B:\\StarRail"));


    }

    private static void delete( File src) {
        //先删除文件夹所有内容
        //进入Src
        File[] files=src.listFiles();
        //遍历
        for (File file : files) {
            //文件删除
            if (file.isFile()) {
                file.delete();
            }else {
                //文件夹 递归
                delete(file);
            }
        }
        //再删除自己
        src.delete();
    }
}
