package 多线程.ex.num;



import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class m {
    public static void main(String[] args) {
        /*1.准备数组和数据*/
        //声明数组分配空间
        int[] nums=new int[2000];

        //初始化数组
        for (int i=0;i<nums.length;i++){
            nums[i]=i+1;
        }

        /*2.接收线程个数*/
        //声明变量存线程个数
        int count=0;

        //声明变量作标记,标记输入线程个数是否正确
        boolean flag=false;
        do {
            flag=false;
            try {
                //创建对象接收用户输入线程个数
                Scanner input=new Scanner(System.in);
                System.out.println("请输入线程个数(整数):");
                count=input.nextInt();
            }catch (InputMismatchException e){
                System.out.println("你输入线程个数有误,请重新输入!");
                flag=true;
            }
        }while (flag);

        /*3.计算每个线程负责计算数字长度*/
        int len=nums.length/count;


        /*5.调用线程计算*/
        for(int i=1;i<=count;i++){
            //创建线程对象
            myThread t1=null;
            if(i==count){//最后一个线程对象,计算到数组末尾
                //任务类的构造方法中传了三个参数,第一个参数要计算数组名,第二个参数计算起始索引,第三个参数计算终止索引,计算时,包头不包尾
                t1=new myThread(nums,(i-1)*len,nums.length);

            }else{
                t1=new myThread(nums,(i-1)*len,i*len);
            }
            Thread thread1= new Thread(t1);
            thread1.setName("线程"+i+":  ");
            thread1.start();
        }



    }
}
