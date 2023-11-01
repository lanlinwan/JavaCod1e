package Exercise.xianfen.人机猜拳;

import java.util.Scanner;

public class user {
     String name;
     int integral;

    public String getName() {
        return name;
    }

    public  void setName(String name) {
        this.name = name;
    }

    public int getIntegral() {
        return integral;
    }

    public void setIntegral(int integral) {
        this.integral = integral;
    }

    //出拳
     int punch(){
        Scanner s=new Scanner(System.in);
        int quan=0;
        //出的不是 1 || 2 || 3  重新输入
        boolean t=true;
        while (t){
             quan=s.nextInt();
            switch (quan){
                case 1:
                    System.out.println("你出的是剪刀");
                    t=false;
                    break;
                case 2:
                    System.out.println("你出的是石头");
                    t=false;
                    break;
                case 3:
                    System.out.println("你出的是布");
                    t=false;
                    break;
                default:
                    System.out.println("请输入对应的数字");
                    System.out.println("请出拳:1:剪刀 2:石头 3:布");
            }
        }
        return quan;
    }
}
