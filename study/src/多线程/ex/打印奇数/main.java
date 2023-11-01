package 多线程.ex.打印奇数;

public class main {
    public static void main(String[] args) {
           /*
           同时开启两个线程，共同获取1-100之间的所有数字。
           要求：将输出所有的奇数。
        */


        MyRunable m=new MyRunable();

        Thread myThread= new Thread(m,"兰");
        Thread myThread1= new Thread(m,"蓝");


        myThread.start();
        myThread1.start();
    }
}
