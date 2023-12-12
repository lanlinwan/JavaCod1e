package 多线程.面试;

public class sleepVSwait {
//
    //面试题: sleep Vs wait
    //共同点: wait() ，wait(long) 和sleep(long)的效果都是让当前线程暂时放弃CPU的使用权，进入阻塞状态

    //方法归属不同
    //①sleep(long) 是Thread的静态方法
    //②而wait(), wait(long) 都是Object的成员方法,每个对象都有


    //醒来时机不同
    //①执行 sleep(long)和wait(long)的线程都会在等待相应毫秒后醒来
    //②wait(long) 和wait()还可以被notify唤醒, wait() 如果不唤醒就- -直等 下去
    //③它们都 可以被打断唤醒 ,调用interrupt() 打断

    //锁特性不同
    //①wait 方法的调用必须先获取wait对象的锁,所以 wait方法则必须放在 synchronized 块里面，
    //  notify唤醒同样需要放在 synchronized 块里面，且获取对象的锁
    //  而sleep则无此限制
    //②wait 方法执行后会释放对象锁，允许其它线程获得该对象锁( 我放弃，但你们还可以用),
    //  比如 被synchronized获取的锁,这个锁 在别的地方还能被获取,不会被synchronized 卡住
    //③而sleep如果在synchronized代码块中执行，并不会释放对象锁(我放弃,你们也用不了)

    //使用场景:
    //sleep 一般用于当前线程休眠，或者轮循暂停操作，wait 则多用于多线程之间的通信。


}
