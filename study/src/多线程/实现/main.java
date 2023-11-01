package 多线程.实现;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class main {
    public static void main(String[] args)throws ExecutionException, InterruptedException {
        /*
         * 多线程的第一种启动方式：
         *   1. 自己定义一个类继承Thread
         *   2. 重写run方法
         *   3. 创建子类的对象，并启动线程
         * */

        MyThread t1 = new MyThread();
        MyThread t2 = new MyThread();

        t1.setName("线程1");
        t2.setName("线程2");
        //启动线程
        t1.start();
        t2.start();

        /*
         * 多线程的第二种启动方式：
         *   1.自己定义一个类实现Runnable接口
         *   2.重写里面的run方法
         *   3.创建自己的类的对象
         *   4.创建一个Thread类的对象，并 开启线程
         * */
        //创建MyRun的对象
        //表示多线程要执行的任务
        MyRunnable mr = new MyRunnable();
        //创建线程对象
        Thread t3 = new Thread(mr);
        Thread t4 = new Thread(mr);
        //给线程设置名字
        t3.setName("线程1");
        t4.setName("线程2");
        //开启线程
        t3.start();
        t4.start();


        /*
         *   多线程的第三种实现方式：
         *       特点：可以获取到多线程运行的结果
         *
         *       1. 创建一个类MyCallable实现Callable接口
         *       2. 重写call （是有返回值的，表示多线程运行的结果）
         *
         *       3. 创建MyCallable的对象（表示多线程要执行的任务）
         *       4. 创建FutureTask的对象（作用管理多线程运行的结果）
         *       5. 创建Thread类的对象，并启动（表示线程）
         * */

        //创建MyCallable的对象（表示多线程要执行的任务）
        MyCallable mc = new MyCallable();
        //创建FutureTask的对象（作用管理多线程运行的结果）
        FutureTask<Integer> ft= new FutureTask<>(mc);
        //创建线程的对象
        Thread t5 = new Thread(ft);
        //启动线程
        t5.start();

        //获取多线程运行的结果
        Integer result = ft.get();
        System.out.println(result);

        //多线程三种实现方式对比
        //                  优点                               缺点
        //继承Thread类    编程比较简单，可以直接使用 Thread类中的方法  可以扩展性较差,不能再继承其他的类
        //实现Runnable接口   扩展性强，实现该接口的同时还可继承其他的类  编程相对复杂，不能直接使用Thread类中的方法
        //实现Callable接口    同上 ,并且可以有返回值                 同上


    }


}
