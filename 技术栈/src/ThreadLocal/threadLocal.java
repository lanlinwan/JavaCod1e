package ThreadLocal;

public class threadLocal {
    /*
        ThreadLocal并不是一个Thread, 而是Thread的局部变量。
        ThreadLocal为每个线程提供单独一份存储空间，具有线程隔离的效果，
        只有在线程内才能获取到对应的值，线程外则不能访问。

        ThreadLocal常用方法:
        ●public void set(T value)设置 当前线程的线程局部变量的值
        ●public T get()返回当前线程所对应的线程局部变量的值
        ●public void remove()移除当前线程的线程局部变量

     */
}
