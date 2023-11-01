package 多线程.ex.抢红包;

import java.text.DecimalFormat;
import java.util.Random;

public class MyThread extends Thread {

    //共享数据
    //100块，分成了3个包
    static float money = 100;
    static int count = 3;

    //最小的中奖金额
    static final double MIN = 0.01;

    @Override
    public void run() {
        //同步代码块
        synchronized (MyThread.class) {
            if (count == 0) {
                //判断，红包个数抢完了,是否到了末尾（已经到末尾）
                System.out.println(getName() + "没有抢到红包！");
            } else {
                //判断，红包还没枪完（没有到末尾）
                //定义一个变量，表示中奖的金额
                float prize = 0;

                if (count == 1) {
                    //表示此时是最后一个红包
                    //就无需随机，剩余所有的钱都是中奖金额
                    prize = money;
                } else {
                    //表示第一次，第二次（随机）
                    //取 随机数 100*100 再 *0.01 就有随机两位小数
                     int l= (int)money* 100;
                    Random r = new Random();
                    int bounds = r.nextInt(l);
                     prize= (float) (bounds*0.01);


                }
              //  String p=String.format("%.2f", prize);
                //从money当中，去掉当前中奖的金额
                money =  money - prize;
                //红包的个数-1
                count--;
                //本次红包的信息进行打印
                DecimalFormat df = new DecimalFormat("#.00");
                System.out.println(getName() + "抢到了" +df.format(prize)+ "元");
            }
        }

    }
}
