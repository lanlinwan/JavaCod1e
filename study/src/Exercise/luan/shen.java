package Exercise.luan;

import java.util.Random;

public class shen {
    public static void main(String[] args) {
        java1();
        //spring1();
    }
    static void java1(){
        Random r=new Random();
        int n=r.nextInt(95);
        System.out.println(n);
    }

    static void spring1(){
        Random r=new Random();
        int n=r.nextInt(7);

        Random rr=new Random();
        int nn=rr.nextInt(8);
        System.out.println(Integer.toString(n)+"."+Integer.toString(nn));
    }

}
