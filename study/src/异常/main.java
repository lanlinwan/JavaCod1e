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

        //Throwable 成员方法:
        //public String getMessage()    返回此throwable的详细消息字符串
        //public String toString()      返回此可抛出的简短描述
        //public void printStackTrace() 把异常的错误信息输出在控制台,仅仅是打印信息 不会结束程序运行
        int[] arr={1,2,3,4,5};

        try{
            System.out.println(arr[10]);
        }catch (ArrayIndexOutOfBoundsException e){
            String a=e.getMessage();
            System.out.println(a);

            String b=e.toString();
            System.out.println(b);

            e.printStackTrace();
        }

        System.out.println("后面的执行");

    }
}
