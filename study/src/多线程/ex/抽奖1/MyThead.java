package 多线程.ex.抽奖1;

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
        //每次 不同的线程都会执行run方法 创建属于自己的集合
       ArrayList<Integer> list=new ArrayList<>();

        while (true) {
            synchronized (MyThead.class) {
                if (arrayList.size() == 0) {
                    System.out.println(getName()+list);
                    break;
                } else {
                    //继续抽奖
                    //打乱集合
                    Collections.shuffle(arrayList);
                    //删除并获取返回值
                    int prize = arrayList.remove(0);
                    //把 抽奖结果 放入属于自己的 集合中
                   list.add(prize);
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
