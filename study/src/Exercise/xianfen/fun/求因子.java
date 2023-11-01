package Exercise.xianfen.fun;

import java.util.Scanner;

public class 求因子 {
    static Scanner scanner=new Scanner(System.in);
    public static void main(String[] args) {
        //输出整数因子
        //改进前
        //yin1();
        //改进后
        yin();

    }

    public static void yin1() {
        System.out.println("输入一个整数");
        double num=scanner.nextDouble();
        long timePrint = System.currentTimeMillis();
        for (int i = 1; i <num; i++) {
            double nums=num/i;
            if (Math.round(nums) == nums){
                System.out.println(Math.round(num)+"的因子:"+Math.round(nums));
            }
        }
        long timeResult=System.currentTimeMillis();
        System.out.println("未改进"+(timeResult-timePrint)/1000+"s");
    }

    public static void yin() {
        System.out.println("输入一个整数");
        double num=scanner.nextDouble();
        long timePrint = System.currentTimeMillis();
        //优化思路:开根号 Math.sqrt(num),避免没必要进行运算的数,
        //因为一个数的两个因子,必有一个因子 小于等于 这个数的平方根,而另外一个因子 就会 大于于等于这个数的平方根
        //我们只需求得 小于等于这个数的平方根 的数,就可以用 这个数/小于等于这个数的平方根 的数=另外一个 大于于等于这个数的平方根 的数
        for (int i = 1; i < Math.sqrt(num)+1; i++) {
            double nums= num/i;
            if(Math.round(nums) == nums){
                System.out.println(Math.round(num)+"的因子:"+Math.round(num/nums));
                System.out.println(Math.round(num)+"的因子:"+Math.round(nums));
            }
        }
        long timeResult=System.currentTimeMillis();
        System.out.println("改进后"+(timePrint-timeResult)/1000+"s");
    }



}
