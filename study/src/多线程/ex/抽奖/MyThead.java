package 多线程.ex.抽奖;

import java.util.ArrayList;
import java.util.Collections;

public class MyThead extends Thread{

    static  ArrayList<Integer> arrayList=new ArrayList<>();
    //创建奖池
    static {

        Collections.addAll(arrayList,10,5,20,50,100,200,500,800,2,80,300,700);

    }

    @Override
    public void run() {
        //1.循环
        //2.同步代码块
        //3.判断
        //4.判断

        while (true) {
            synchronized (MyThead.class) {
                if (arrayList.size() == 0) {
                    break;
                } else {
                    //继续抽奖
                    //打乱集合
                    Collections.shuffle(arrayList);
                    //删除并获取返回值
                    int prize = arrayList.remove(0);
                    System.out.println(getName() + "又产生了一个" + prize + "元大奖");
                }
            }
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }


}
