package 多线程.错误死锁;

public class main {
    public static void main(String[] args) {
       /*
          死锁:
              出现锁嵌套,会出现死锁,程序卡死
       */


        MyThread t1 = new MyThread();
        MyThread t2 = new MyThread();

        t1.setName("线程A");
        t2.setName("线程B");

        t1.start();
        t2.start();

    }
}
