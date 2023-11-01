package 多线程.lock锁;

import jdk.dynalink.beans.StaticClass;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class MyThread extends Thread{

    static int ticket = 0;

    static Lock lock=new ReentrantLock();//Lock的实现类 ReentrantLock
   // static Lock lock1=new ReentrantLock(false); //非公平锁

    @Override
    public void run(){
        //1.循环
        while(true){

            //加锁
            lock.lock();

//            try {
//                lock.tryLock(10, TimeUnit.MILLISECONDS);//等待时间内 获取不到,不会继续等待
//                lock.tryLock()//使用无参的 底层会直接使用 非公平锁
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
            //
            try {

                //3.判断
                if(ticket == 100){
                    break;
                    //4.判断
                }else{
                    Thread.sleep(10);
                    ticket++;
                    System.out.println(getName() + "在卖第" + ticket + "张票！！！");
                }

            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                //解锁
                lock.unlock();
            }


        }
    }


}
