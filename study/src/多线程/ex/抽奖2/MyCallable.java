package 多线程.ex.抽奖2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.Callable;

public class MyCallable implements Callable<Integer> {

    static ArrayList<Integer> arrayList=new ArrayList<>();

    //创建奖池
    static {
        Collections.addAll(arrayList,10,5,20,50,100,200,500,800,2,80,300,700);
    }

    @Override
    public Integer call() throws Exception {
        //每次 不同的线程都会执行call()方法 创建属于自己的集合
        ArrayList<Integer> boxList = new ArrayList<>();
        while (true){
            synchronized (MyCallable.class){
                if (arrayList.size() == 0) {
                    System.out.println(Thread.currentThread().getName() + boxList);
                    break;
                } else {
                    //继续抽奖
                    Collections.shuffle(arrayList);
                    int prize = arrayList.remove(0);
                    boxList.add(prize);
                }
            }
            Thread.sleep(10);
        }

        //把集合中的最大值返回
        if(boxList.size() == 0){
            return null;
        }else{
            return Collections.max(boxList);
        }
    }
}
