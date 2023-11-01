package JVM;

public class 垃圾回收器 {
    //垃圾回收器:  停止所有业务线程(STW)

    //说一下JVM有哪些垃圾回收器？
    // ●Serial：最早的单线程串行垃圾回收器,暂停所有 Java 线程来进行垃圾回收,使用标记-复制算法来清理垃圾对象,用于小型服务器上的中等负载应用程序。

    // ●Serial Old：是 Serial 的老年代版本，同样也是单线程的，可以作为 CMS 垃圾回收器的备选预案。

    // ●ParNew：是 Serial 的多线程版本。它也使用标记-复制算法来清理垃圾对象，但它可以同时使用多个线程来进行清理，从而减少垃圾回收的停顿时间。
    //  ParNew 和 Parallel 收集器类似是多线程的，但 Parallel 是吞吐量优先的收集器，可以牺牲等待时间换取系统的吞吐量。

    // ●Parallel Scavenge 垃圾回收器是一种并行的垃圾回收器，它被设计用于处理大量的垃圾数据，可以最大限度地利用多核 CPU 的性能。
    //  并使用标记-复制算法来清理垃圾对象。主要用于高吞吐量的应用程序，例如 Web 应用程序或后端服务器。

    // ●Parallel Old 是 Parallel Scavenge 老生代版本，Parallel Scavenge使用的是复制的内存回收算法，Parallel Old 使用的是标记-整理的内存回收算法。

    // ●CMS：一种并发的垃圾回收器,以获得最短停顿时间为目标的收集器，非常适用 B/S 系统。

    // ●G1：一种面向服务端的垃圾回收器。兼顾吞吐量和停顿时间的 GC 实现，是 JDK 9 以后的默认 GC 选项。

    //新生代垃圾回收器和老生代垃圾回收器都有哪些？有什么区别？
    //●新生代回收器：Serial、ParNew、Parallel Scavenge
    //●老年代回收器：Serial Old、Parallel Old、CMS
    //●整堆回收器：G1
    // 新生代垃圾回收器一般采用的是复制算法，复制算法的优点是效率高，缺点是内存利用率低；
    // 老年代回收器一般采用的是标记-整理的算法进行垃圾回收。

    //●Parallel GC
    //①eden 内存不足发生Minor GC，标记复制STW
    //②old 内存不足发生Full GC,标记整理STW
    //③注重吞吐量

    //●ConcurrentMarkSweep GC
    //①old 并发标记，重新标记时需要STW,并发清除
    //②Fallback Full GC
    //③注重响 应时间

    //●G1 GC:G1是一款面向服务端应用的垃圾回收器。
    //①响应时间与吞吐量兼顾
    //②把连续的Java堆空间划分为多个大小相等的独立区域（Region)，每个区域都可以充当eden,survivor,old,humongous(巨型对象)
    //③新生代回收: eden内存不足，进行标记复制 会STW(暂停用户线程)
    //④并发标记: old 并发标记，重新标记时 会STW
    //⑤混合收集:并发标记完成，开始混合收集，参与复制的有eden、survivor、 old,
    // 其中old会根据暂停时间目标，选择部分回收价值高的区域，复制时STW
    //⑥Fallback Full GC

    //G1 垃圾回收器工作流程
    //1.初始标记(Initial Marking)：这阶段仅仅只是标记GC Roots能直接关联到的对象并修改TAMS(Next Top at Mark Start)的值，
    // 让下一阶段用户程序并发运行时，能在正确的可用的Region中创建新对象，这阶段需要停顿线程，但是耗时很短。而且是借用进行Minor GC的时候同步完成的，
    // 所以G1收集器在这个阶段实际并没有额外的停顿。
    //2.并发标记(Concurrent Marking)：从GC Roots开始对堆的对象进行可达性分析，递归扫描整个堆里的对象图，找出存活的对象，
    // 这阶段耗时较长，但是可以与用户程序并发执行。当对象图扫描完成以后，还要重新处理SATB记录下的在并发时有引用变动的对象。
    //3.最终标记(Final Marking)：对用户线程做另一个短暂的暂停，用于处理并发阶段结束后仍遗留下来的最后那少量的 SATB 记录。
    //4.筛选回收(Live Data Counting and Evacuation)：负责更新 Region 的统计数据，对各个 Region 的回收价值和成本进行排序，
    // 根据用户所期望的停顿时间来制定回收计划。可以自由选择多个Region来构成会收集，然后把回收的那一部分Region中的存活对象==复制==到空的Region中，
    // 在对那些Region进行清空。
    //除了并发标记外，其余过程都要 STW

    //*面试题:详细介绍一下 CMS 垃圾回收器:
    //CMS 是英文 Concurrent Mark-Sweep 的简称，是以牺牲吞吐量为代价来获得最短回收停顿时间的垃圾回收器。对于要求服务器响应速度的应用上，这种垃圾回收器非常适合。
    // 在启动 JVM 的参数加上“-XX:+UseConcMarkSweepGC”来指定使用 CMS 垃圾回收器。
    //CMS 使用的是标记-清除的算法实现的，所以在 gc 的时候回产生大量的内存碎片，当剩余内存不能满足程序运行要求时，
    // 系统将会出现 Concurrent Mode Failure，临时 CMS 会采用 Serial Old 回收器进行垃圾清除，此时的性能将会被降低。


}
