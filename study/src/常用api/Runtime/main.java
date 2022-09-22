package 常用api.Runtime;

import java.io.IOException;

public class main {
    public static void main(String[] args) throws IOException {
        // availableProcessors()
        /**
         * Runtime:
         * public static Runtime getRuntime() 当前系统的运行环境对象
         * public void exit(int status ) 停止虚拟机
         * public int availableProcessors( ) 获得CPU的线程数
         * public long maxMemory() JVM能从系统中获取总内存大小(单位byte)
         * public long totalMemory( ) JVM已经从系统中获取总内存大小( 单位byte)
         * public long freeMemory() JVM剩余内存大小(单位byte)
         * public Process exec(String command) 运行cmd命令
         */
        //停止虚拟机
        //Runtime.getRuntime().exit(0);

        //获得CPU的线程数
        System.out.println(Runtime.getRuntime().availableProcessors());

        //JVM能从系统中获取总内存大小(单位byte)
        System.out.println(Runtime.getRuntime().maxMemory()/1024/1024);

        //JVM已经从系统中获取总内存大小( 单位byte)
        System.out.println(Runtime.getRuntime().totalMemory()/1024/1024);

        // 运行cmd命令
        //shutdown:关机
        //-s :默认一分钟后关机
        //-s -t 指定时间:指定关机时间
        //-a :取消关机操作
        //-r :关机并重启
        Runtime.getRuntime().exec("notepad");

    }
}
