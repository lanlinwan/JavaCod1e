package 多线程.面试;

public class lockVSsyuchronized {

    //synchronized 关键字可以将对象或者方法标记为同步，以实现对对象和方法的互斥访问
    //可以用 synchronized(对象) { … }定义同步代码块，
    //或者在声明方法时将 synchronized 作为方法的修饰符。

    //可重入锁:
    //可重入锁指的是该线程获取了该锁之后，可以无限次的进入该锁锁住的代码。

    //公平锁与非公平锁：
    //锁Lock分为公平锁和非公平锁。
    //公平锁：表示线程获取锁的顺序是按照加锁的顺序来分配的，及先来先得，先进先出的顺序。
    //非公平锁：表示获取锁的抢占机制，是随机获取锁的，和公平锁不一样的就是先来的不一定能拿到锁，
    //有可能一直拿不到锁，所以结果不公平。


    //悲观锁:
    // 悲观锁认为对于同一个数据的并发操作，一定是会发生修改的，哪怕没有修改，也会认为修改。
    // 因此对于同一个数据的并发操作，悲观锁采取加锁的形式。悲观地认为，不加锁的并发操作一定会出问题。
    //乐观锁:
    // 乐观锁正好和悲观锁相反，它获取数据的时候，并不担心数据被修改，每次获取数据的时候也不会加锁,
    // 只是在更新数据的时候,通过判断现有的数据是否和原数据一致来判断数据是否被其他线程操作，
    // 如果没被其他线程修改则进行数据更新,如果被其他线程修改则不进行数据更新,并重写进行数据更新;

    //面试题: lock vs synchronized

    //语法层面
    //synchronized是关键字，源码在jvm中，用C++语言实现
    //Lock是接口，源码由jdk提供，用java语言实现
    //使用synchronized时，退出同步代码块锁会自动释放，而使用Lock时，需要手动调用unlock方法释放锁

    //功能层面.
    //1. 二者均属于悲观锁 与 非公平锁、都具备基本的互斥、同步、锁重入功能
    //2. Lock提供了许多synchronized不具备的功能，例如获取等待状态、可公平锁、可打断、可超时、多条件变量
    //3. Lock有适合不同场景的实现，如ReentrantLock(是可重入的互斥锁), ReentrantReadWriteLock(写锁)
    //4. lock等待锁过程中可以用interrupt来中断等待，而synchronized只能等待锁的释放，不能响应中断；
    //  5. synchronized在发生异常时候会自动释放占有的锁，因此不会出现死锁；
    //   而lock发生异常时候，不会主动释放占有的锁，必须手动unlock来释放锁，可能引起死锁的发生。
    //   （所以最好将同步代码块用try catch包起来，finally中写入unlock，避免死锁的发生。）

    //性能层面
    //在没有竞争时，synchronized 做了很多优化，如偏向锁、轻量级锁，性能不赖
    //在竞争激烈时，Lock 的实现通常会提供更好的性能
}
