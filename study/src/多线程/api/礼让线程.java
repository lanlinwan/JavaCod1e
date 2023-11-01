package 多线程.api;

public class 礼让线程 {
    public static void main(String[] args) {
       /*
            public static void yield()      出让线程/礼让线程
            在 线程类中实现

       */

        Mythread3 t1 = new Mythread3();
        Mythread3 t2 = new Mythread3();

        t1.setName("飞机");
        t2.setName("坦克");

        t1.start();
        t2.start();


    }
}
