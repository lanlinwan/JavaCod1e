package File.ex1;

import java.io.File;

public class ex3 {
    public static void main(String[] args) {
        //找到电脑中所有以 .avi结尾的文件(考虑子文件)
        File file=new File("B:");

        //b盘
        //findTxt(file);
        //c b d盘
        AllfindTxt();
    }
    private static void AllfindTxt() {
        //获取所有盘符
        File[] f=File.listRoots();
        for (File file : f) {
            findTxt(file);
        }
    }

    private static void findTxt(File src) {
        //进入文件夹 src
        File[] f =src.listFiles();
        //遍历数组,依次得到里面的 文件与文件夹
        if (f!=null){
            for (File file : f) {
                //判断是文件夹 还是 文件
                if(file.isFile()){
                    //如果是文件
                    String name=file.getName();
                    if (name.endsWith(".txt")){
                        System.out.println(file);
                    }
                }else {
                    //是文件夹,递归
                    findTxt(file);

                }
            }
        }
        }

}
