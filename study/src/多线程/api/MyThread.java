package 多线程.api;

public class MyThread extends Thread{
    MyThread(){

    }

   public MyThread(String s){
       super(s);
   }


    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(getName() + "@" + i);
        }
    }
}
