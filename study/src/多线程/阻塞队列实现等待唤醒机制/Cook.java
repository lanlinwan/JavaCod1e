package 多线程.阻塞队列实现等待唤醒机制;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class Cook extends Thread {
    //阻塞队列:底层是数组,有界
    ArrayBlockingQueue<String> queue;
    //底层是链表,无界,但是最大值为int的最大值
    //LinkedBlockingQueue

    public Cook(ArrayBlockingQueue<String> queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        while (true) {

            try {
                //不断把面条 放到阻塞队列中
                queue.put("面条");
                System.out.println("厨师做了一碗面条");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }


        }
    }

}
