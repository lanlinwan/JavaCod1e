package 多线程.ex.卖电影票;

public class MyThread implements Runnable {

    //
     int ticket = 100;


    @Override
    public void run() {

        while (true) {
            synchronized (MyThread.class) {
                if (ticket == 0) {
                    break;
                } else {
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    ticket--;
                    System.out.println(Thread.currentThread().getName() + "卖出一张票,剩余" + ticket + "张票");
                }
            }

        }


    }


}
