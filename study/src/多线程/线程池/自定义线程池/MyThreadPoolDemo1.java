package 多线程.线程池.自定义线程池;


import static 多线程.线程池.自定义线程池.LoggerUtils.*;
import 多线程.线程池.MyRunnable;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;
import java.util.stream.IntStream;


public class MyThreadPoolDemo1 {
    public static void main(String[] args){

        //当进入线程池 的线程数量超过  核心线程数量,会被塞进 任务队列内等待 核心线程任务结束(先进入队列的,在有核心线程任务结束后 会先被执行)
        //当任务队列被塞满,还有任务 进入线程池,就会创建 空闲线程 并进入空闲线程,空闲线程任务结束后 会在设定的时间销毁
        //如果当 达到最大线程数量,还有 任务进入线程池,就会执行 任务的拒绝策略

    /*
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor
        (核心线程数量,最大线程数量,空闲线程最大存活时间,任务队列,创建线程工厂,任务的拒绝策略);

        参数一：corePoolSize 核心线程数量             不能小于0
        参数二：maximumPoolSize 最大线程数           不能小于0，最大数量 >= 核心线程数量
        参数三：keepAliveTime 空闲线程最大存活时间     不能小于0
        参数四：unit 时间单位                       用TimeUnit指定
        参数五：workQueue 任务队列                  不能为null
        参数六：threadFactory 创建线程工厂           不能为null
        参数七：handler 任务的拒绝策略               不能为null
                AbortPolicy()         抛异常
                CallerRunsPolicy()    调用者自己运行
                DiscardPolicy()       把最后加入的任务丢弃
                DiscardOldestPolicy() 最先进入 任务队列的任务丢弃

    */
        AtomicInteger c = new AtomicInteger(1);
        ArrayBlockingQueue<Runnable> queue = new ArrayBlockingQueue<>(2);
        ThreadPoolExecutor threadPool = new ThreadPoolExecutor(
                2,  //核心线程数量，能小于0
                3,  //最大线程数，不能小于0，最大数量 >= 核心线程数量
                0,//空闲线程 最大存活时间
                TimeUnit.MILLISECONDS,//时间单位
                queue,//任务队列
                r -> new Thread(r, "myThread" + c.getAndIncrement()),//创建线程工厂 可以为线程创建时取名字
                new ThreadPoolExecutor.CallerRunsPolicy()//任务的拒绝策略 4种
        );

        showState(queue, threadPool);
        threadPool.submit(new MyTask("1", 3600000));
        showState(queue, threadPool);
        threadPool.submit(new MyTask("2", 3600000));
        showState(queue, threadPool);
        threadPool.submit(new MyTask("3"));
        showState(queue, threadPool);
        threadPool.submit(new MyTask("4"));
        showState(queue, threadPool);
        threadPool.submit(new MyTask("5", 3600000));
        showState(queue, threadPool);
        threadPool.submit(new MyTask("6"));
        showState(queue, threadPool);

    }

    private static void showState(ArrayBlockingQueue<Runnable> queue, ThreadPoolExecutor threadPool) {
        try {
            Thread.sleep(300);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        List<Object> tasks = new ArrayList<>();
        for (Runnable runnable : queue) {
            try {
                Field callable = FutureTask.class.getDeclaredField("callable");
                callable.setAccessible(true);
                Object adapter = callable.get(runnable);
                Class<?> clazz = Class.forName("java.util.concurrent.Executors$RunnableAdapter");
                Field task = clazz.getDeclaredField("task");
                task.setAccessible(true);
                Object o = task.get(adapter);
                tasks.add(o);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        main.debug("pool size: {}, queue: {}", threadPool.getPoolSize(), tasks);
    }

    static class MyTask implements Runnable {
        private final String name;
        private final long duration;

        public MyTask(String name) {
            this(name, 0);
        }

        public MyTask(String name, long duration) {
            this.name = name;
            this.duration = duration;
        }

        @Override
        public void run() {
            try {
                LoggerUtils.get("myThread").debug("running..." + this);
                Thread.sleep(duration);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        @Override
        public String toString() {
            return "MyTask(" + name + ")";
        }
    }
}