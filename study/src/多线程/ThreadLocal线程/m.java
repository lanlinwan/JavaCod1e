package 多线程.ThreadLocal线程;

public class m {
    public static void main(String[] args) {
        /*
        ThreadLocal与Synchronized的区别
        ThreadLocal<T>其实是与线程绑定的一个变量。ThreadLocal和Synchronized都用于 解决多线程并发访问。
        但是ThreadLocal与synchronized有本质的区别:
        1、Synchronized用于线程间的数据共享,而ThreadLocal则用于线程间的数据隔离。
        2、Synchronized是利用锁的机制,使变量或代码块在某-时该只能被一个线程访问。而ThreadLocal为每一个线程都提供了变量的副本
        使得每个线程在某--时间访问到的并不是同一个对象，这样就隔离了多个线程对数据的数据共享。
        而Synchronized却正好相反，它用于在多个线程间通信时能够获得数据共享。

        - -句话理解ThreadLocal,threadlocl是作为当前线程中属性ThreadLocalMap集合中的某一个Entry
        的key值Entry (threadlocal,value) ，虽然不同的线程之间threadlocal这个key值是一样，但是不同
        的线程所拥有的ThreadLocalMap是独一无二的，也就是不同的线程间同-个ThreadLocal (key)
        对应存储的值(value)不一样,从而到达了线程间变量隔离的目的，但是在同-个线程中这个value变
        量地址是- -样的。

         */
        ThreadLocal<String> threadLocal=new ThreadLocal<>();
        threadLocal.set("lan");
        String a=threadLocal.get();
        System.out.println(a);
        threadLocal.remove();

    }
}
