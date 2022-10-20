package 异常;

public class main {
    public static void main(String[] args) {
        //Throwable
        //异常是程序在“编译”或者"执行”的过程中可能出现的问题,注意:语法错误不算在异常体系中。
        //比如:数组索引越界、空指针异常、日期格式化异常, 等..
        //异常一旦出现了，如果没有提前处理，程序就会退出JVM虚拟机而终止.
        //研究异常并且避免异常,然后提前处理异常，体现的是程序的安全，健壮性。

        //          ->Error:系统级别问题、 JVM退出等，代码无法控制。
        //Throwable
        //                       ->RuntimeException及其子类:运行时异常,编译阶段不会报错。(空指针异常, 数组索引越界异常)
        //          ->Exception: java.lang包下， 称为异常类，它表示程序本身可以处理的问题
        //                       ->除RuntimeException之外所有的异常:编译时异常,编译期必须处理的，否则程序不能通过编译。(日 期格式化异常)。

    }
}
