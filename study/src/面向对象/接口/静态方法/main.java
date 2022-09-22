package 面向对象.接口.静态方法;

public class main {
    public static void main(String[] args) {
        //接口中静态方法的定义格式:
        //格式: public static返回值类型方法名(参数列表) { }
        //范例: public static void show() { }
        //接口中静态方法的注意事项:
        //静态方法只能通过接口名调用，不能通过实现类名或者对象名调用
        //public可以省略，static不能省略

        //接口的静态方法
        inter.show();
        //实现类中的静态方法
        in.show();

    }
}
