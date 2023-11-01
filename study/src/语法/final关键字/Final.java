package 语法.final关键字;

public class Final {
    private static final int a ;
    private  final int ab ;
    private  final int ac ;
    static {
        a=0;
    }
    {
        ab=0;
    }

    Final(){
        ac=0;
    }
    public static void main(String[] args) {
        //final 最终的意思,可以修饰(类,方法,变量)


        //1. 修饰成员变量:表示该第一次赋值后,不能再次被赋值(有且只能被赋值一次)
        //    如果final修饰的是类变量，只能在静态初始化块中指定初始值 或者 声明该类变量时指定初始值。
        //    如果final修饰的是成员变量，可以在非静态初始化块，声明该变量或者构造器中执行初始值
        //注意:final 修饰基本类型变量,那么存储的 数据值不能发生改变
        //    final 修饰引用类型变量,那么变量存储的 地址值不能发生改变,但是地址指向的对象内容是可以改变
        //(2)修饰局部变量
        //系统不会为局部变量进行初始化,局部变必须由程序员显示初始化。因此使用final修饰局部变量时,
        //可以不指定默认值,但是使用前 必须进行赋值,而在后面的代码中不能再对final变量赋值

        final int aa;
        aa=50;
//        aa=44;
        buy(0.8);

        final int[] a={1,2,3,4};
        a[0]=0;  //合法
        //a=null;//非法

    }
    public static  void buy(final double z){
        //z=0.1;// 第二次赋值,无法修改
    }


    //2. 修饰类:表明该类是最终类,不能被继承
    public final class a{
        public static void main(String[] args) {
            System.out.println(a);
            System.out.println("工具类可以使用 final 不被继承");
        }
    }

//    class b extends a{
//
//    }

    //3. 修饰方法:表明该方法是最终方法,不能被重写
    class c{
       public  final void v(){
           System.out.println(a);
       }
       public static void v(int a){

       }
    }
    class d extends c{
//        public static void v(){
//
//        }
    }

}
//final finally finalize区别　＊＊＊
//
//    final主要用于修饰类，变量，方法
//    finally一般作用在try-catch代码块中，在处理异常的时候，通常我们将一定要执行的代码方法finally代码块 中，
//    表示不管是否出现异常，该代码块都会执行，一般用来存放一些关闭资源的代码。
//    finalize是一个属于Object类的一个方法，该方法一般由垃圾回收器来调用，当我们调用System.gc()方法的时候，
//    由垃圾回收器调用finalize()，回收垃圾，但Java语言规范并不保证inalize方法会被及时地执行、而且根本不会保证它们会被执行


