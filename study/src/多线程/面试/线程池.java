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

    /*
        使用线程池的主要原因是为了提高程序的性能和效率。直接使用new线程的方式可能会导致以下问题：

        1.资源消耗：每次创建一个新线程都需要分配内存和其他资源，如果频繁创建和销毁线程，会消耗大量的系统资源。
        2.上下文切换开销：线程的切换需要保存和恢复线程的上下文信息，这个过程会带来一定的开销。
          如果线程频繁切换，会导致系统性能下降。
        3.线程生命周期管理：手动管理线程的生命周期比较复杂，需要考虑线程的创建、启动、执行、结束和资源释放等过程。
          而线程池可以自动管理线程的生命周期，减少了开发人员的工作量。
        4.控制并发度：线程池可以限制并发线程的数量，避免系统资源被过度占用，提高系统的稳定性和可靠性。
        5.提供任务队列：线程池通常会提供一个任务队列，用于存储待执行的任务。
          当线程池中的线程空闲时，可以从任务队列中获取任务进行执行，提高了任务的处理效率
          。
        综上所述，使用线程池可以有效地管理线程资源，提高程序的性能和效率。
     */
    public static void main(String[] args) {

    }
}
