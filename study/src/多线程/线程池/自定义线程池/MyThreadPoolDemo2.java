package 多线程.线程池.自定义线程池;

public class MyThreadPoolDemo2 {
    public static void main(String[] args) {
        //向Java虚拟机返回可用处理器的数目 最大并行数
        int count = Runtime.getRuntime().availableProcessors();
        System.out.println(count);
    }
}
