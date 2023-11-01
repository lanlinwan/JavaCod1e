package 多线程.ex.打印奇数;

public class MyRunable implements Runnable {

    //第二种方式实现多线程，测试类中MyRunable只创建一次，所以不需要加static
     int number = 1;

    @Override
    public void run() {
       while (true){
           synchronized (MyRunable.class){
               if (number>100){
                   break;
               }else {
                   try {
                       Thread.sleep(100);
                   } catch (InterruptedException e) {
                       e.printStackTrace();
                   }
                   if (number%2==1){
                       System.out.println(Thread.currentThread().getName()+"打印"+number);
                   }
                   number++;
               }
           }

       }
    }


}
