package 多线程.线程池;


import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MyThreadPoolDemo {
    public static void main(String[] args) throws InterruptedException {
    /*
        public static ExecutorService newCachedThreadPool()             创建一个没有上限的线程池
        public static ExecutorService newFixedThreadPool (int nThreads) 创建有上限的线程池
    */


        //1.获取线程池对象
        ExecutorService pool1 = Executors.newFixedThreadPool(3);
        //2.提交任务
        pool1.submit(new MyRunnable());
        pool1.submit(new MyRunnable());
        pool1.submit(new MyRunnable());


        while (true){
            //任务做完返回ture
            if (pool1.isTerminated()){
                pool1.shutdown();
                break;
            }
        }
        //3.销毁线程池
        //pool1.shutdown();


    }
}
