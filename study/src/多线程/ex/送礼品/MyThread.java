package 多线程.ex.送礼品;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class MyThread extends Thread{

    static int present=100;

    static Lock lock=new ReentrantLock();

    @Override
    public void run(){
        while (true){

            lock.lock();

            try{
                if(present == 10){
                    System.out.println("礼物还剩下" + present + "不再赠送");
                    break;
                }else {
                    present--;
                    System.out.println(getName()+"送出礼品一份,剩余礼品"+present+"份");
                }
            }catch (Exception exception){
                exception.printStackTrace();
            }finally {
                lock.unlock();

            }


        }
    }
}
