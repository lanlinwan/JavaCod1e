package Exercise.homework;

import java.util.Scanner;

public class one {
    //        一：小中的三轮车1号。可以承载3个人，价格为：10元/小时；
    //        二：薇薇的自行车。可以承载5个人，价格为：15元/小时；

    static int tricycle = 10;
    static int cycling = 15;
    static boolean ComeUp = false;
    static boolean Tricycle = false;

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        while (true) {
            System.out.println("请输入用户个数（不多于5人）");
            int number = s.nextInt();
            boolean b = recommend(number);
            if (b) {
                break;

            }
        }

        System.out.println();
        System.out.println("输入目的地距离（小于100公里，价格不变；多于100公里，价格上浮20%）");
        double distance = s.nextDouble();
        priceFluctuation(distance);
        System.out.println("输入使用时间");
        double hours = s.nextDouble();
        price(hours);
    }

    //使用的车
    private static boolean recommend(int num) {
        if (num <= 0) {
            System.out.println("请输入正确的人数");
            return false;
        } else if (num <= 3) {
            System.out.println("千锋租车行推荐你使用小车的三轮车1号，可以承载3个人，价格为：10元/小时 ");
            Tricycle = true;
            return true;
        } else if (num <= 5) {
            System.out.println("千锋租车行推荐你使用薇薇的自行车,承载5个人，价格为：15元/小时");
            //Cycling = true;
            return true;
        } else {
            System.out.println("人数小于(大于)5人，请重新输入");
            return false;
        }

    }

    //价格是否上浮
    private static void priceFluctuation(double distance) {
        if (distance > 100) {
            ComeUp = true;
        }
    }

    //计算价格
    private static void price(double hours) {
        double finalPrice;
        if (Tricycle) {
           finalPrice=tricycle*hours;

        } else {
            finalPrice=cycling*hours;
        }
        if (ComeUp){
            finalPrice=finalPrice*1.2;
        }
        System.out.println("你即将使用价格是:"+finalPrice);
    }


}
