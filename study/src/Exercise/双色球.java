package Exercise;

import java.util.Random;
import java.util.Scanner;

public class 双色球 {
    public static void main(String[] args) {
        int[] dou= Doublecolor();
        int[] buy= buyno();
        judge(dou,buy);
    }
    public static void printArray(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void judge(int[] dou,int[] buy){
        int r = 0;
        int b = 0;
        for (int i = 0; i < dou.length-1; i++) {
            for (int i1 = 0; i1 < buy.length-1; i1++) {
                if(buy[i1]==dou[i]){
                    r+=1;
                    break;
                }
            }
        }
        b=buy[buy.length-1]==dou[dou.length-1]?1:0;
        System.out.println("中奖号码是："  );
        printArray(dou);
        System.out.println("您投注号码是："  );
        printArray(buy);
        System.out.println("您命中了几个红球：" + r);
        System.out.println("您是否命中蓝球：" + ( b == 1 ? "是": "否" ) );

        // 判断中奖情况了
        if(b== 1 && r < 3){
            System.out.println("恭喜您，中了5元小奖！");
        }else if(b== 1 && r == 3
                || b== 0 && r== 4){
            System.out.println("恭喜您，中了10元小奖！");
        }else if(b == 1 && r == 4
                || b == 0 && r == 5){
            System.out.println("恭喜您，中了200元！");
        }else if(b == 1 && r== 5){
            System.out.println("恭喜您，中了3000元大奖！");
        }else if(b == 0 && r == 6){
            System.out.println("恭喜您，中了500万超级大奖！");
        }else if(b == 1 && r == 6){
            System.out.println("恭喜您，中了1000万巨奖！可以开始享受人生，诗和远方！！");
        }else {
            System.out.println("感谢您为福利事业做出的突出贡献！！");
        }
    }
    public static int[] buyno(){
        int[] unm=new int[7];
        Scanner s=new Scanner(System.in);
        for (int i = 0; i < unm.length-1; i++) {
            while(true){
                System.out.println("请输入第"+(i+1)+"个不重复的红色球号码(1-33):");
                int ss=s.nextInt();
                //假设不重复
                boolean flag=true;
                //与unm数组 前面的数比较
                for (int j = 0; j <i ; j++) {
                    if(ss==unm[j]){
                        flag=false;
                        break;
                    }
                }
                if(flag){
                    unm[i]=ss;
                    break;
                }
            }

        }
        System.out.println("请输入蓝色球一个不重复的号码(1-16):");
        unm[unm.length-1]=s.nextInt();
        return unm;
    }
    public static int[] Doublecolor(){
        int[] red=new int[7];
        Random r=new Random();
        for (int i = 0; i < red.length-1; i++) {
            //死循环 进行判断 不允许有重复的数(1-33)
            while(true){
                //随机得到一个数
                int data=r.nextInt(33)+1;
                //假设不重复
                boolean flag=true;
                //与red数组 前面的数比较
                for (int j = 0; j <i ; j++) {
                    if(data==red[j]){
                        flag=false;
                        break;
                    }
                }
                if(flag){
                    red[i]=data;
                    break;
                }
            }
           //System.out.print(i>red.length?red[i]:red[i]+",");
        }
        red[red.length-1]=r.nextInt(16)+1;
        return red;
    }
}
