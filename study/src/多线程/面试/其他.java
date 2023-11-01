package 多线程.面试;

public class 其他 {

    //1.线程的 join() 方法是干啥用的？
    //用于等待当前线程终止。
    //如果一个线程A执行了 threadB.join() 语句，其含义是：当前线程A等待 threadB 线程终止之后才从 threadB.join() 返回继续往下执行自己的代码。

    //2.编写多线程程序有几种实现方式？
    //通常来说，可以认为有三种方式：(1）继承 Thread 类；
    //                        (2）实现 Runnable 接口；
    //                        (3）实现 Callable 接口。
    //其中，Thread 其实也是实现了 Runnable 接口。Runnable 和 Callable 的主要区别在于是否有返回值。

    //3.Thread 调用 start() 方法和调用 run() 方法的区别
    //run()：普通的方法调用，在主线程中执行，不会新建一个线程来执行。
    //start()：新启动一个线程，这时此线程处于就绪（可运行）状态，并没有运行，一旦得到 CPU 时间片，就开始执行 run() 方法。











}
