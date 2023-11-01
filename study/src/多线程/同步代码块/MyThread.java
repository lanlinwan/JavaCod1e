package 多线程.同步代码块;

public class MyThread extends Thread{

    //表示这个类所有的对象，都共享ticket数据
    static int ticket = 0;//0 ~ 99

    @Override
    public void run() {
        while (true) {
            //同步代码块
            // 锁默认打开,有一个线程进去了,锁关闭
            // 里面的代码执行完毕,线程出来,锁打开
            //细节:1. 锁 不能写在循环体外,否则 其他线程无法参与到循环中
            //    2. 锁对象需要是唯一的
            synchronized (MyThread.class) {
                if (ticket < 100) {
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    ticket++;
                    System.out.println(getName() + "正在卖第" + ticket + "张票！！！");
                } else {
                    break;
                }
            }
        }
    }




}
