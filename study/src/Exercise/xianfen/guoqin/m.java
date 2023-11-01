package Exercise.xianfen.guoqin;

import java.util.Scanner;

public class m {
    public static void main(String[] args) {

        System.out.println("输入一个整数");
        int nn = new Scanner(System.in).nextInt();

        for (int i=2; i <=nn; i++) {
            if (extract(nn)){
                System.out.println(i);
            }
        }
    }

    private static boolean extract(int n) {
        for (int i = 2; i <= n; i++) {
            if(i==n){
                return true;
            }else if (n % i == 0) {
               return false;
            }
        }
     return true;
    }
}
