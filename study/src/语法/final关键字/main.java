package 语法.final关键字;

public class main {
    public static void main(String[] args) {
        //final 最终的意思,可以修饰(类,方法,变量)


        //1. 修饰变量:表示该第一次赋值后,不能再次被赋值(有且只能被赋值一次)
        //注意:final 修饰基本类型变量,那么存储的 数据值不能发生改变
        //    final 修饰引用类型变量,那么变量存储的 地址值不能发生改变,但是地址指向的对象内容是可以改变
        final int aa=45;
//        aa=44;
        buy(0.8);
    }
    public static  void buy(final double z){
//        z=0.1; 第二次赋值,无法修改
    }


    //2. 修饰类:表明该类是最终类,不能被继承
    public final class a{
        public static void main(String[] args) {
            System.out.println("工具类可以使用 final 不被继承");
        }
    }

//    class b extends a{
//
//    }

    //3. 修饰方法:表明该方法是最终方法,不能被重写
    class c{
       public static final void v(){

       }
    }
    class d extends c{
//        public static void v(){
//
//        }
    }


}



