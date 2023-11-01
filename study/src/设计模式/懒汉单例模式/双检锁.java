package 设计模式.懒汉单例模式;

public class 双检锁 {

    //CPU指令重排是处于性能优化的考虑，可以提高吞吐率，volatile防止指令重排，
    // 会降低吞吐率，也就会降低性能，不过跟线程安全比起来牺牲一点性能也是应该的
    private static volatile 双检锁 instance;// 可见性，有序性


    //Singleinstance.class  同步代码块 解决线程问题
    public static 双检锁 getInstance() {
        if (instance == null) {//减少不必要的线程堵塞(同步代码块会对线程进行堵塞)
            synchronized (双检锁.class) {
                if (instance == null) {//这里才是对单例进行检测(因为线程可能同时通过第一层if判断,所以需要再进行判断)
                    instance = new 双检锁();
                }
            }
        }

        return instance;
    }

    //1.私有化 构造器
    private 双检锁() {
        System.out.println("private 双检锁");
    }

    public static void otherMethod() {
        System.out.println("otherMethod()");
    }
}
