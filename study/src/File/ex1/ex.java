package File.ex1;

import java.io.File;
import java.io.IOException;

public class ex {
    public static void main(String[] args) throws IOException {
        //当前模块 文件夹aaa 创建一个文件a.txt
        File f=new File("File\\abmaa");
        f.mkdirs();
        File src=new File(f,"a4.txt");
        boolean b= src.createNewFile();

        if (b){
            System.out.println("创建成功");
        }else {
            System.out.println("创建失败");
        }

    }
}
