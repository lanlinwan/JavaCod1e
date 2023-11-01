package File.ex1;

import java.io.File;

public class ex5 {
    public static void main(String[] args) {
        //获取文件大小
        Long a= getLen(new File("D:"));
        System.out.println(a);
    }

    private static long getLen(File src) {
        //文件大小变量累加
        long len = 0;
        //进入文件夹
        File[] files=src.listFiles();
        //遍历
        for (File file : files) {
            //是文件 累加大小
            if(file.isFile()){
                len+=file.length();
            }else {
                //递归
                len+=getLen(file);
            }
        }
        return len;
    }
}
