package 面向对象.构造器;

public class main {
    public static void main(String[] args) {
        //无参数构造器
        car c=new car();

        //有参数构造器
        car c1=new car("宝马",66.6);
        System.out.println(c1.name);
        System.out.println(c1.price);
    }
}
