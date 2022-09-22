package 面向对象.内部类.静态内部类;

public class main {
    public static void main(String[] args) {
        //静态内部类:
        //1. 静态内部类也是成员内部类的一种
        //2. 静态内部类只能访问外部类中的静态变量和静态方法,如果想要访问非静态的需要创建对象。

        //创建静态内部类对象的格式:外部类名.内部类名 对象名= new 外部类名.内部类名();
        Car.Engine ce=new Car.Engine();
        ce.show();
        //调用非静态方法的格式:先创建对象，用对象调用
        //调用静态方法的格式:外部类名.内部类名.方法名();
        Car.Engine.show1();

    }

}
