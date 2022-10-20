package 异常.编译时异常处理;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Throws {
    public static void main(String[] args) throws Exception {
        //官方处理异常:
        //①默认会在出现异常的代码那里自动的创建一一个异 常对象: ArithmeticException。
        //②异常会从方法中出现的点这里抛出给调用者，调用者最终抛出给JVM虚拟机。
        //③虚拟机接收到异常对象后,先在控制台直接输出异常栈信息数据。
        //④直接从当前执行的异常点干掉当前程序。
        //⑤后续代码没有机会执行了，因为程序已经死亡。
        //默认的异常处理并不好,会引起程序死亡

        //编译时异常是编译阶段就出错的，所以必须处理，否则代码根本无法通过
        //编译时异常的处理形式有三种:
        //●出现异常直接抛出去给调用者,调用者也继续抛出去。
        //●出现异常自己捕获处理，不麻烦别人。
        //●前两者结合,出现异常直接抛出去给调用者,调用者捕获处理。


        //异常处理方式1一- throws
        //●throws: 用在方法上，可以将方法内部出现的异常抛出去给本方法的调用者处理。
        //●这种方式并不好，发生异常的方法自己不处理异常,如果异常最终抛出去给虚拟机将引起程序死亡。
        //抛出异常格式:
        //方法 throws异常1，异常2，异常3 ..{}
        //规范做法:
        //方法 throws Exception{}
        parse("2022-10-17 9:15:00");


    }

    public static void parse(String date) throws Exception {
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy/MM-dd HH:mm:ss");
        Date d=sdf.parse(date);
        System.out.println(d);
    }



}
