package 语法.Volatile;

public class Volatile {

    //面试题: volatile 能否保证线程安全
    //1. 线程安全要考虑三个方面:可见性、有序性、原子性
    //①可见性指,一个线程对共享变量修改，另一个线程能看到最新的结果(没有volatile不代表其他线程一定无法读取到变化.)
    //②有序性指, 一个线程内代码按编写顺序执行
    //③原子性指, 一个线程内多行代码以一-个整体运行，期间不能有其它线程的代码插队

    //可见性问题:
    //可见性问题的造成就是因为各自从缓存取数据，而不从内存取数据，如果缓存都没有数据，
    //大家都使用内存的值，那么就不存在可见性问题。
    //在线程中使用的sleep()会释放cpu执行权，然后CPU有时间去更新工作缓存和主存内容
    //这个时候就会导致 线程读取不到 其他线程修改的最新数据

    //2. volatile 能够保证共享变量的可见性与有序性，但并不能保证原子性
    //可见性: volatile会强制使其他线程的本地变量失效而去重新读取,
    //       volatile修改数据相当于volatile写线程向某个读线程发送了修改共享变量的信息
    //有序性: volatile通过内存屏障禁止指令重排序，读放上，写放下

    //某些情况下，volatile 还能提供原子性
    //volatile 修饰 long 和 double 变量，使其能按原子类型来读写。
    //double 和 long 都是 64 位宽，因此对这两种类型的读是分为两部分的，第一次
    //读取第一个 32 位，然后再读剩下的 32 位，这个过程不是原子的



    //不加 volatile 下面的while循环不会停止
    //事实上这个现象是和JVM的JIT实现有关的，您可以在运行的时候使用JVM参数：-Xint 来关闭JIT，用纯解释模式运行这段代码试试看。
    //而在这段代码的运行过程中，JVM发现了这个循环是一个热点任务，一直在运行，于是将其进行JIT编译
    //编译时它发现变量stop可以不遵循可见性原则，那么如果不保证可见性，那么这段代码事实上就是一个死循环。
    static volatile boolean stop = false;

    public static void main(String[] args) {
        new Thread(() -> {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            stop = true;
            System.out.println("modify stop to true...");
        }).start();

        new Thread(() -> {
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }).start();

        new Thread(() -> {
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }).start();

        foo();
    }

    static void foo() {
        int i = 0;
        while (!stop) {
            i++;
        }

    }
}
