package JVM;

import 多线程.面试.LoggerUtils;

import java.io.IOException;

public class finalize1 {
    static class Dog{
        private String name;
        public Dog(String name){
            this.name=name;
        }

        @Override
        protected void finalize() throws Throwable {
            LoggerUtils.get().debug("{}被干掉了",this.name);
            //异常不会进行处理
            int i=1/0;
        }
    }
    public static void main(String[] args) throws IOException {
        new Dog("小白");
        new Dog("小黑");
        new Dog("阿虎");
        System.gc();
        System.in.read();

    }
      /*
      第一，finalize方法的调用次序并不能保证
      第二，日志中的Finalizer 表示输出日志的线程名称，是这个叫做Finalizer 的线程调用的finalize方法
      第三，你不能注释掉、System.in.read()，否则会发现(绝大概率)并不会有任何输出结果了，从这我们看出finalize 中的代码并不能保证被执行
      第四，如果將finalize中的代码出现异常， 会发现根本没有异常输出
      第五，还有个疑问，垃圾回收时就会立刻调用finalize 方法吗?
    */

    //两个重要队列
    //1、unfinalized队列
    //  当重写了finalize方法的对象，在构造方法调用之时，JVM都会将其包装成一个Finalizer对象，并加入unfinalized 队列中
    //  (静态成员变量、双向链表结构)。
    //2、ReferenceQueue队列
    //  第二个重要的队列，也是Finalizer类中一个静态成员变量，名为queue (是一个单向链表结构)，刚开始它是空的。当狗
    //  对象可以被当作垃圾回收时，就会把这些狗对象对应的Finalizer对象加入这个队列。

    //真正回收时机
    //即使Dog对象没人引用，垃圾回收时也没法立刻回收它，因为Finalizer还在引用它嘛， 为的是 [等调完finalize方法，再回收 ] 。
    //查看FinalizerThread线程内的代码，这个线程从ReferenceQueue中逐一取出每个Finalizer对象，
    //把它们从链表断开，这样没谁能引用到它，以及其对应的狗对象，所以下次GC时就可以被回收了。

    //*面试题: finalize 的理解
    //●- 般的回答是:它是Object中的一一个方法，子类重写它，垃圾回收时此方法会被调用，可以在其中进行一些资源释放和清理工作
    //●较为优秀的回答是:将资源释放和清理放在finalize方法中非常不好，非常影响性能，严重时甚至会引起00M,从
    // Java9开始就被标注为@Deprecated,不建议被使用了


    //*面试题:为什么finalize 方法非常不好，非常影响性能
    //●非常不好
    // ①FinalizerThread 是守护线程，代码很有可能没来得及执行完，线程就结束了,造成资源没有正确释放
    // ②底层捕获异常后进行空处理,导致异常被吞掉，你甚至不能判断有没有在释放资源时发生错误
    //●影响性能
    // ①重写了finalize方法的对象在第一次被gc时，并不能及时释放它占用的内存，因为要等着FinalizerThread调用完finalize,
    //  把它从第一个unfinalized队列移除后，第二次gc时才能真正释放内存
    // ②可以想象 gc本就因为内存不足引起，finalize 调用又很慢(两个队列的移除操作,都是串行执行的，用来释放连接类的资源也
    //  应该不快) ,不能及时释放内存，对象释放不及时就会逐渐移入老年代，老年代垃圾积累过多就会容易full gc, full gc后释放
    //  速度如果仍跟不上创建新对象的速度，就会00M
    //●质疑
    // ①有的文章提到 [Finalizer 线程会和我们的主线程进行竞争，不过由于它的优先级较低,获取到的CPU时间较少，因此它永远也起
    //  不上主线程的步伐]这个显然是错误的，FinalizerThread 的优先级较普通线程更高，赶不上步伐的原因应该是finalize执行慢
    //  等原因综合导致

}
