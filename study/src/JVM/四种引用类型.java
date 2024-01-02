package JVM;

public class 四种引用类型 {
    //面试题:对象引用类型分为哪几类?
    //1.强引用
    //①普通变量赋值即为强引用， 如A a = new A();
    //②通过GC Root的引用链，如果强引用不到该对象,该对象才能被回收

    //2.软引用(SoftReference)
    //①例如: SoftReference a= new SoftReference(new A())
    //②如果仅有 软引用该对象时，首次垃圾回收不会回收该对象，如果内存
    // 仍不足，再次回收时才会释放对象
    //③软引用 自身需要配合引用队列来释放
    //④典型例子 是反射数据

    //3.弱引用(WeakReference)
    //①例如: WeakReference a = new WeakReference(new A());
    //②如果仅有 弱引用引用该对象时，只要发生垃圾回收,就会释放该对象
    //③弱引用自身需要配合引用队列来释放
    //④典型例子 是ThreadLocalMap中的Entry对象

    //4.虚引用( PhantomReference)
    //①例如: PhantomReference a = new PhantomReference(new A());
    //②必须配合引用队列一 起使用，当虚引用引用的对象被回收时，会将虚
    // 引用对象入队，由Reference Handler线程释放其关联的外部资源
    //③典型例子 是Cleaner释放DirectByteBuffer占用的直接内存
}
