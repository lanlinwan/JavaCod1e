package Debug;

import java.util.Random;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        //idea自带的断点调试工具,可以控制代码从断点开始一行一行执行

        int[] i=new int[5];
        Random r=new Random();
        for (int j = 0; j <i.length ; j++) {
            i[j]=r.nextInt(20)+1;
        }


        for (int j = 0; j <i.length ; j++) {
            System.out.print(i[j]+"\t");
        }

    }
}
