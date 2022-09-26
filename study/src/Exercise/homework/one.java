package Exercise.homework;

import java.util.Scanner;

public class one {

    static int tricycle = 10;
    static int cycling = 15;
    static boolean ComeUp = false;
    static boolean Tricycle = false;
    static boolean b = true;
    static boolean c = true;
    static boolean d = true;

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        while (b) {
            System.out.println("请输入用户个数（不多于5人）");
            String number = s.next();
            recommend(number);
        }

        while (c) {
            System.out.println();
            System.out.println("请输入公里数");
            String km = s.next();
            priceFluctuation(km);
        }

        while (d) {
            System.out.println("输入使用时间");
            String hours = s.next();
            price(hours);
        }

    }

    //使用的车
    private static void recommend(String number) {
        if (!number.matches("^\\+?[1-5][0-5]*$")) {
            System.out.println("请输入正确的人数");
            return;
        }
        int num = Integer.parseInt(number);
        if (num <= 3 && num > 0) {
            System.out.println("千锋租车行推荐你使用小车的三轮车1号，可以承载3个人，价格为：10元/小时 ");
            Tricycle = true;
        } else if (num <= 5) {
            System.out.println("千锋租车行推荐你使用薇薇的自行车,承载5个人，价格为：15元/小时");
            //Cycling = true;
        }
        b = false;
    }

    //价格是否上浮
    private static void priceFluctuation(String distance) {
        if (!distance.matches("^\\+?[1-9][0-9]*$")) {
            System.out.println("请输入正确的公里数");
            return;
        }
        int dis = Integer.parseInt(distance);
        if (dis >= 100) {
            ComeUp = true;
        }
        c = false;
    }

    //计算价格
    private static void price(String Hours) {
        if (Hours.matches("^(([0-9]+\\.[0-9]*[1-9][0-9]*)|([0-9]*[1-9][0-9]*\\.[0-9]+)|([0-9]*[1-9][0-9]*))$") || Hours.matches("^\\+?[1-9][0-9]*$")) {
            double hours = Double.parseDouble(Hours);
            double finalPrice;
            if (Tricycle) {
                finalPrice = tricycle * hours;

            } else {
                finalPrice = cycling * hours;
            }
            if (ComeUp) {
                finalPrice = finalPrice * 1.2;
            }
            System.out.println("你即将使用价格是:" + finalPrice);
            d = false;
        } else {
            System.out.println("请输入正确的时间");
        }
    }
}
