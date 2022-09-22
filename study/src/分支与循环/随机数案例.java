package 分支与循环;

import java.util.Random;
import java.util.Scanner;

public class 随机数案例 {
    public static void main(String[] args) {
        //随机数对象
        Random r=new Random();
        int num=r.nextInt(10);//0-9
        int num1=r.nextInt(10)+1;//1-10
        //控制区间 3-17 ==> -3 ==> (0-14)+3
        for(int i=0;i<5;i++){
            int num2=r.nextInt(15)+3;
            System.out.println(num2);
        }


        //猜随机数 键盘输入值猜得到的随机数,直到猜中位置
        Random e=new Random();
        int n=e.nextInt(100)+1;

        Scanner s=new Scanner(System.in);
        while(true){
            System.out.println("请输入数据(1-100)");
            int ss=s.nextInt();

            if(ss>n){
                System.out.println("大了");
            }else  if(ss<n){
                System.out.println("小了");
            }else{
                System.out.println("恭喜你猜中了");
            }
        }



    }
}
