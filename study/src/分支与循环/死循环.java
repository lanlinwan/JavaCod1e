package 分支与循环;

import java.util.Scanner;

public class 死循环 {
    public static void main(String[] args) {
        //1.
//        for ( ; ; ){
//            System.out.println(0);
//        }
        //2. 经典写法
//        while (true){
//            System.out.println(1);
//        }
        //3.
//        do{
//            System.out.println(2);
//        }while(true);


        //案例: 循环让用户输入密码
        int mm=520;
        while(true){
            System.out.println("请输入密码");
            Scanner zqm=new Scanner(System.in);
            int zqmm= zqm.nextInt();

            if (zqmm ==mm){
                System.out.println("密码正确");
                break;
            }else{
                System.out.println("密码错误");
            }
        }



    }
}
