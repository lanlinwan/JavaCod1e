package 设计模式.懒汉单例模式;

import java.io.Serializable;

public class 内部类 implements Serializable {
    //内部类 实现懒汉单例  推荐使用
    private 内部类(){
        System.out.println("private 内部类");
    }

    //内部类在使用的时候初始化 符合懒汉单例 且 静态资源保证了 线程安全
    private static class Holder{
        static 内部类 INSTANCE =new 内部类();
    }

    public static 内部类 getInstance(){
        return Holder.INSTANCE;
    }

    public static void Method() {
        System.out.println("method");

    }

}
