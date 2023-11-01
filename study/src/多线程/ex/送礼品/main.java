package 多线程.ex.送礼品;

public class main {
    public static void main(String[] args) {
         /*
            有100份礼品,两人同时发送，当剩下的礼品小于10份的时候则不再送出，
            利用多线程模拟该过程并将线程的名字和礼物的剩余数量打印出来.
        */
        MyThread myThread= new MyThread();
        MyThread myThread1= new MyThread();

        myThread.setName("兰本才");
        myThread1.setName("蓝翉财");

        myThread.start();
        myThread1.start();
    }
}
