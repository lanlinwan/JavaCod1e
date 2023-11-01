package 多线程.面试;

import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class 线程池 {
    //  //当进入线程池 的线程数量超过  核心线程数量,会被塞进 任务队列内等待 核心线程任务结束(先进入队列的,在有核心线程任务结束后 会先被执行)
    //        //当任务队列被塞满,还有任务 进入线程池,就会创建 空闲线程 并进入空闲线程,空闲线程任务结束后 会在设定的时间销毁
    //        //如果当 达到最大线程数量,还有 任务进入线程池,就会执行 任务的拒绝策略
    //
    //    /*
    //        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor
    //        (核心线程数量,最大线程数量,空闲线程最大存活时间,任务队列,创建线程工厂,任务的拒绝策略);
    //
    //        参数一：corePoolSize 核心线程数量             不能小于0
    //        参数二：maximumPoolSize 最大线程数           不能小于0，最大数量 >= 核心线程数量
    //        参数三：keepAliveTime 空闲线程最大存活时间     不能小于0
    //        参数四：unit 时间单位                       用TimeUnit指定
    //        参数五：workQueue 任务队列                  不能为null
    //        参数六：threadFactory 创建线程工厂           不能为null
    //        参数七：handler 任务的拒绝策略               不能为null
    //                AbortPolicy()         抛异常
    //                CallerRunsPolicy()    调用者自己运行
    //                DiscardPolicy()       把最后加入的任务丢弃
    //                DiscardOldestPolicy() 最先进入 任务队列的任务丢弃
    //-0p
    //    */
    public static void main(String[] args) {

    }
}
