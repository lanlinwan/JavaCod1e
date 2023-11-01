package Exercise.xianfen.人机猜拳;

import java.util.Random;

public class robot {
     String name;
     int integral;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getIntegral() {
        return integral;
    }

    public void setIntegral(int integral) {
        this.integral = integral;
    }

    //出拳
     public int punch(){
        Random r=new Random();
        int a= r.nextInt(3)+1;
         switch (a){
             case 1:
                 System.out.println(getName()+"出的是剪刀");
                 break;
             case 2:
                 System.out.println(getName()+"出的是石头");
                 break;
             case 3:
                 System.out.println(getName()+"出的是布");
                 break;
         }

         return a;
     }
}
