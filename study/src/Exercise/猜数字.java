package Exercise;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class 猜数字 {
    public static void main(String[] args) {
        //随机生成五个数字(1-20) 猜

        int[] i=new int[5];
        Random r=new Random();
        for (int j = 0; j <i.length ; j++) {
            i[j]=r.nextInt(20)+1;
        }

        Scanner s=new Scanner(System.in);

        OUT:
        while (true){
            System.out.println("请输入(1-20)");
            int ss=s.nextInt();
            for (int k = 0; k < i.length; k++) {
                if(ss==i[k]){
                    System.out.println("恭喜你猜中了第:"+ k);
                    break OUT;
                }
            }
            System.out.println("猜错了,再来一次吧");
        }

        for (int j = 0; j <i.length ; j++) {
            System.out.print(i[j]+"\t");
        }


    }
}
