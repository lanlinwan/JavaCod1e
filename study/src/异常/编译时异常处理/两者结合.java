package 异常.编译时异常处理;

import java.text.SimpleDateFormat;
import java.util.Date;

public class 两者结合 {
    //throws 与 try...catch 结合:
    //1、异常处理的总结
    //●在开发中按照规范来说第三种方式是最好的:底层的异常抛出去给最外层，最外层集中捕获处理。
    //●实际应用中， 只要代码能够编译通过，并且功能能完成，那么每- -种异常处理方式似乎也都是可以的。
    public static void main(String[] args) {
        System.out.println("开始 ");
        try {
            parse("2022-10-17 9:40:10");
            System.out.println("成功");
        }catch (Exception e){
            e.printStackTrace();
            System.out.println("失败");
        }
        System.out.println("结束");
    }

    public static void parse(String date) throws Exception {
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy/MM-dd HH:mm:ss");
        Date d=sdf.parse(date);
        System.out.println(d);
    }
}
