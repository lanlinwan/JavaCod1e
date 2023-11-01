package 多线程.ex.卖电影票;

public class main {
    public static void main(String[] args) {

           /*
            一共有1000张电影票,可以在两个窗口领取,假设每次领取的时间为3000毫秒,
            要求:请用多线程模拟卖票过程并打印剩余电影票的数量
        */



        MyThread myThread = new MyThread();

        Thread thread1= new Thread(myThread);
        Thread thread2= new Thread(myThread);


        thread1.setName("窗口一");
        thread2.setName("窗口2");

        thread1.start();
        thread2.start();

    }
}
