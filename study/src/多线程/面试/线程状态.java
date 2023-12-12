package 多线程.面试;

import static 多线程.面试.LoggerUtils.*;

public class 线程状态 {
    /*
   Java中的线程状态是由Thread类中的几种状态来表示的：

    新建 (NEW)：线程对象被创建但尚未启动的状态。
    就绪 (RUNNABLE)：线程已经被启动，但由于线程调度，该线程暂时处于等待状态，以便分配CPU时间。
    运行 (RUNNING)：线程正在运行。
    阻塞 (BLOCKED)：线程正在等待某个锁，以便能够继续运行。阻塞状态是运行状态的一种特殊形式。
    等待 (WAITING)：线程正在等待另一个线程做出某些条件判断。
    超时等待 (TIMED_WAITING)：线程正在等待另一个线程做出某些条件判断，但是有时间限制。
    终止 (TERMINATED)：线程已经结束。

 这些状态可以通过Thread类的几种方法来查看和控制：

    Thread.getState() 可以获取线程的状态。
    Thread.start() 可以启动一个线程。
    Thread.stop() 可以停止一个正在运行的线程（不推荐使用，因为可能会引起不安全和不一致的结果）。
    Thread.join() 可以让一个线程等待另一个线程完成。
    Thread.sleep() 可以让当前线程暂停一段时间。
    Thread.isAlive() 可以判断一个线程是否在运行。
    Thread.interrupt() 可以中断一个线程的执行。

     */
    static final Object LOCK = new Object();
    public static void main(String[] args) throws InterruptedException {
        //testWaiting();
        testNewRunnableTerminated();
    }

    private static void testWaiting() {
        Thread t2 = new Thread(() -> {
            synchronized (LOCK) {
                logger1.debug("before waiting"); // 1
                try {
                    LOCK.wait(); // 3
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        },"t2");

        t2.start();
        main.debug("state: {}", t2.getState()); // 2
        synchronized (LOCK) {
            main.debug("state: {}", t2.getState()); // 4
            LOCK.notify(); // 5
            main.debug("state: {}", t2.getState()); // 6
        }
        main.debug("state: {}", t2.getState()); // 7
    }

    private static void testBlocked() {
        Thread t2 = new Thread(() -> {
            logger1.debug("before sync"); // 3
            synchronized (LOCK) {
                logger1.debug("in sync"); // 4
            }
        },"t2");

        t2.start();
        main.debug("state: {}", t2.getState()); // 1
        synchronized (LOCK) {
            main.debug("state: {}", t2.getState()); // 2
        }
        main.debug("state: {}", t2.getState()); // 5
    }

    private static void testNewRunnableTerminated() {
        Thread t1 = new Thread(() -> {
            logger1.debug("running..."); // 3
        },"t1");

        main.debug("state: {}", t1.getState()); // 1
        t1.start();
        main.debug("state: {}", t1.getState()); // 2

        main.debug("state: {}", t1.getState()); // 4
    }
}
