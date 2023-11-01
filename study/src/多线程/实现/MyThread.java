package 多线程.实现;

public class MyThread extends Thread{
    static int num=0;

    @Override
    public void run(){
        //书写线程要执行的代码
        for (int i = 0; i < 20; i++) {
            System.out.println(getName());
        }
    }
}
