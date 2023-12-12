package 多线程.阻塞队列实现等待唤醒机制;

import java.util.concurrent.ArrayBlockingQueue;

public class ThreadDemo {
    public static void main(String[] args) {
        /*
         *
         *    需求：利用阻塞队列完成生产者和消费者（等待唤醒机制）的代码
         *    细节：
         *           生产者和消费者必须使用同一个阻塞队列
         *           阻塞队列 中实现了 lock锁
         *
         * */

        //1.创建阻塞队列的对象
        ArrayBlockingQueue<String> queue = new ArrayBlockingQueue<>(1);
        ThreadLocal<Integer> threadLocal=new ThreadLocal<>();
        threadLocal.set(10);

        //2.创建线程的对象，并把阻塞队列传递过去
        Cook c = new Cook(queue);
        Foodie f = new Foodie(queue);

        //3.开启线程
        c.start();
        f.start();

        System.out.println("--------------------------------------");

    }
}
