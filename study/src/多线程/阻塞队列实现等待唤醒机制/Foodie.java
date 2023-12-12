package 多线程.阻塞队列实现等待唤醒机制;

import 多线程.面试.threadLocal;

import java.util.concurrent.ArrayBlockingQueue;

public class Foodie extends Thread {
    ArrayBlockingQueue<String> queue;

    public Foodie(ArrayBlockingQueue<String> queue) {
        this.queue = queue;
    }


    @Override
    public void run() {
        while (true) {

            try {
                //不断从阻塞队列中获取面条
                String food = queue.take();
                System.out.println(food);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
