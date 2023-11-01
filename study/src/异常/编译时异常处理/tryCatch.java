package 异常.编译时异常处理;

import java.io.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class tryCatch {
    public static void main(String[] args) {
        //异常处理方式2一try..catch...
        //监视捕获异常，用在方法内部，可以将方法内部出现的异常直接捕获处理。
        //●这种方式还可以，发生异常的方法自己独立完成异常的处理，程序可以继续往下执行。

        //格式:
        //try{
        //监视可能出现异常的代码!
        //}catch(异常类型1变量){
        //处理异常
        //}catch(异常类型2变量){
        //处理异常
        //}..


        // 细节：
        //    如果我们要捕获多个异常，这些异常中如果存在父子关系的话，那么父类一定要写在下面
        // 了解性：
        //     在JDK7之后，我们可以在catch中同时捕获多个异常，中间用|进行隔开
        //     表示如果出现了A异常或者B异常的话，采取同一种处理方案

        parse1("2022-10-17 9:23:00");
        //建议格式:
        parse2("2022-10-17 9:23:00");

        parse3();
    }
    public static void parse1(String date)  {
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy/MM-dd HH:mm:ss");
        Date d= null;
        try {
            d = sdf.parse(date);//此处出现了异常，ParseException
                                //new ParseException();
                                //拿着这个对象到catch的小括号中对比，看括号中的变量是否可以接收这个对象
                                //如果能被接收，就表示该异常就被捕获（抓住），执行catch里面对应的代码
                                //当catch里面所有的代码执行完毕，继续执行try...catch体系下面的其他代码
        } catch (ParseException e) {
            //出现ParseException 类型异常时
            System.out.println("解析出现问题");
        }
        System.out.println(d);


        try {
            InputStream is=new FileInputStream("E:/java.jpg");
        } catch (FileNotFoundException e) {
            System.out.println("没有这个文件");
        }

    }


    public static void parse2(String date)  {
       try {
           SimpleDateFormat sdf=new SimpleDateFormat("yyyy/MM-dd HH:mm:ss");
            Date d= sdf.parse(date);
           System.out.println(d);

           InputStream is=new FileInputStream("E:/java.jpg");
       }catch (Exception e){
           e.printStackTrace();//打印异常栈信息
       }
    }
    //try-catch-finally
    //●finally: 在异常处理时提供finally块来执行所有清除操作，比如说I0流中的释放资源
    //特点:被finally控制的语句最终一定 会执行，除非JVM退出
    //●异常处理标准格式: try..c..finally
    //try-catch-finally格式:
    // try {
    //
    // }catch{
    //
    // }finally{
    //
    // }


//    JDK7 之后，Java 新增的 try-with-resource 语法糖来打开资源，
//    并且可以在语句执行完毕后确保每个资源都被自动关闭 。
//    JDK7 之前所有被打开的系统资源，比如流、文件或者 Socket 连接等，
//    都需要被开发者手动关闭，否则将会造成资源泄露。
public static void parse3() {
    String line;
    try (BufferedReader br = new BufferedReader(new FileReader("test.txt"))) {
        while ((line = br.readLine()) != null) {
            System.out.println("Line =>" + line);
        }
    } catch (IOException e) {
        System.out.println("IOException in try block =>" + e.getMessage());
    }

}
    //不使用 try-with-resources 而改成 finally 来关闭资源
//      try {
//        System.out.println("Entering try block");
//        br = new BufferedReader(new FileReader("test.txt"));
//        while ((line = br.readLine()) != null) {
//            System.out.println("Line =>"+line);
//        }
//    } catch (IOException e) {
//        System.out.println("IOException in try block =>" + e.getMessage());
//    } finally {
//        System.out.println("Entering finally block");
//        try {
//            if (br != null) {
//                br.close();
//            }
//        } catch (IOException e) {
//            System.out.println("IOException in finally block =>"+e.getMessage());
//        }
//    }



}
