package 异常.编译时异常处理;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
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
        parse1("2022-10-17 9:23:00");
        //建议格式:
        parse2("2022-10-17 9:23:00");
    }
    public static void parse1(String date)  {
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy/MM-dd HH:mm:ss");
        Date d= null;
        try {
            d = sdf.parse(date);
        } catch (ParseException e) {
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
}
