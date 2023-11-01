package File.ex1;

import java.io.File;

public class ex2 {
    public static void main(String[] args) {
        //在文件夹B: 中 寻找以 .txt 结尾的文件
        boolean a= txtFile(new File("B:"));
        if (a){
            System.out.println("有");
        }else {
            System.out.println("没有");
        }
    }

    private static boolean txtFile(File file) {
        File[] listFiles= file.listFiles();

        for (File f : listFiles) {
            //是否有这个文件 并且 名字后缀为 .txt
            if (f.isFile() && f.getName().endsWith(".txt")){
                return true;
            }
        }
        return false;
    }
}
