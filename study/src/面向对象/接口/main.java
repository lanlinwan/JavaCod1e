package 面向对象.接口;

public class main {
    public static void main(String[] args) {
        //接口:就是一种规则,是对行为的抽象
        //1. 接口不能示例化
        //2. 接口和类之间是实现关系, implements 接口名 {}
        //3. 接口的子类被 实现类实现
        //   要么重写接口中所有的抽象方法
        //   要么是抽象类
        //4. 当一个方法的参数是接口时，可以传递接口所有实现
        //   类的对象，这种方式称之为接口多态。

        //注意: 接口和类的实现关系,可以单实现,也可以多实现
        //     实现类还可以在继承一个类的同时实现多个接口
        //     实现多个接口遇到同名的方法只需要重写一次就行了
        Frog f=new Frog("兰",18);
        f.eat();
        f.swim();

        Rabbit r=new Rabbit("ben",1);
        r.eat();

        //接口中成员的特点:
        //●成员变量:只能是常量 默认修饰符: public static final
        System.out.println(Swim.a);
        //●构造方法:没有
        //●成员方法: 只能是抽象方法 默认修饰符: public abstract
        //●JDK7以前:接口中只能定义抽象方法。
        //●JDK8的新特性:接口中可以定义有方法体的方法。
        //●JDK9的新特性:接口中可以定义私有方法。



    }
}
