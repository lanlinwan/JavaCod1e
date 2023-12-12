package 多线程.面试;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class threadLocal {
    public static void main(String[] args) {
        test2();
    }

    // 一个线程内调用, 得到的是同一个 Connection 对象
    private static void test2() {
        for (int i = 0; i < 2; i++) {
            new Thread(() -> {
                LoggerUtils.get("t").debug("{}", Utils.getConnection());
                LoggerUtils.get("t").debug("{}", Utils.getConnection());
                LoggerUtils.get("t").debug("{}", Utils.getConnection());
            }, "t" + (i + 1)).start();
        }
    }

    // 多个线程调用, 得到的是自己的 Connection 对象
    private static void test1() {
        for (int i = 0; i < 5; i++) {
            new Thread(() -> {
                LoggerUtils.get("t").debug("{}", Utils.getConnection());
            }, "t" + (i + 1)).start();
        }
    }

    static class Utils {
        //面试题:谈一谈对ThreadLocal的理解
        //1. ThreadLocal可以实现[资源对象]的 线程隔离,让每个线程各用各的[资源对象] ,避免争用引发的线程安全问题
        //2. ThreadLocal 同时实现了线程内的资源共享
        //3. 其原理是，每个线程内有一个ThreadLocalMap类型的成员变量,用来存储资源对象
        //①调用set 方法,就是以ThreadLocal自己作为key,资源对象作为value,放入当前线程的ThreadLocalMap集合中
        //②调用get方法，就是以ThreadLocal自己作为key,到当前线程中查找关联的资源值
        //③调用remove方法,就是以ThreadLocal自己作为key,移除当前线程关联的资源值

        //ThreadLocalMap插入:它使用的是简单的线性探测法，如果发生了元素冲突，那么就使用下一个槽位存放：

        //为什么 ThreadLocalMap中的key ( 即ThreadLocal )要设计为弱引用?
        //①Thread 可能需要长时间运行(如线程池中的线程) , 如果key不再使用，需要在内存不足(GC)时释放其占用的内存
        //②但GC仅是让key的内存释放，后续还要根据key是否为null来进一 步释放值的内存，释放时机有
        //(a) 获取key发现null key
        //(b) set key时，会使用启发式扫描，清除临近的null key,启发次数与元素个数,是否发现null key有关
        //(C) remove时(推荐)，因为-般使用ThreadLocal时都把它作为静态变量，因此GC无法回收
        private static final ThreadLocal<Connection> tl = new ThreadLocal<>();


        public static Connection getConnection() {
            Connection conn = tl.get(); // 到当前线程获取资源
            if (conn == null) {
                conn = innerGetConnection(); // 创建新的连接对象
                tl.set(conn); // 将资源存入当前线程
            }
            return conn;
        }

        private static Connection innerGetConnection() {
            try {
                return DriverManager.getConnection("jdbc:MysqlS.mysql://localhost:3306/lan?useSSL=false", "root", "admin123");
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
