package 常用api.System;

import java.util.Arrays;

public class main {
    public static void main(String[] args) {
        //System是一个工具类,提供了一些与系统相关的方法
        //public static void exit(int status) 终止当前运行的Java 虚拟机
//        System.exit(0);
//        System.out.println("无法执行");

        //public static long currentTimeMillis() 返回当前系统的时间毫秒值形式
         long data= System.currentTimeMillis();
        System.out.println(data);
        //public static long arraycopy(数据原数组,起始索引,目的地数组,起始索引,拷贝个数)  拷贝索引(两个数组数据类型必须一样)
        int[] a=new int[]{2,5,4};
        int[] b=new int[]{1,1,1};
        System.arraycopy(a,0,b,1,a.length-1);
        System.out.println(Arrays.toString(b));
        //如果数据原数组 与 目的地数组 都是引用数据类型,那么子类可以复制给父类类型




    }
}
