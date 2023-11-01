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


        //   throw ：写在方法内，结束方法。手动抛出异常对象，交给调用者。方法中下面的代码不再执行了。
        //异常处理方式1一- throws
        //●throws: 用在方法上，可以将方法内部出现的异常抛出去给本方法的调用者处理。
        //●这种方式并不好，发生异常的方法自己不处理异常,如果异常最终抛出去给虚拟机将引起程序死亡。
        //抛出异常格式:
        //方法 throws异常1，异常2，异常3 ..{}
        //规范做法:
        //方法 throws Exception{}
        parse("2022-10-17 9:15:00");

        // throw 关键字用于在当前方法中抛出一个异常。
        // 通常情况下，当代码执行到某个条件下无法继续正常执行时，可以使用 throw 关键字抛出异常，以告知调用者当前代码的执行状态。
        // 例如，下面的代码中，在方法中判断 num 是否小于 0，如果是，则抛出一个 IllegalArgumentException 异常。

        int num=-1;
            if (num < 0) {
                throw new IllegalArgumentException("Number must be positive");
            }



    }

    public static void parse(String date) throws Exception {
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy/MM-dd HH:mm:ss");
        Date d=sdf.parse(date);
        System.out.println(d);
    }



}
