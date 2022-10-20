package 异常.自定义异常;

/**
 * 自定义编译异常:
 * 1.继承Exception
 * 2.重写构造器
 */
public class compile extends Exception {
   public compile(){

   }
   public compile(String message){
       super(message);
   }

}
