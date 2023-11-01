package 多线程.ex.num;

public class myThread  implements Runnable {
    //线程共享数组
    int[] arr;
     //总和
     int num;
     int i;
     int length;

    public myThread(int[] nums, int i, int length) {
        this.arr=nums;
        this.i=i;
        this.length=length;
    }


    @Override
    public void run() {
            for (int j = i; j < length; j++) {
                    if (j==length-1){
                        num += arr[j];

                        break;
                    }
                    num += arr[j];
                    System.out.print(Thread.currentThread().getName());
                    System.out.println(num);

        }
    }
}
