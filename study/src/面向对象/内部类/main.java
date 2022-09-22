package 面向对象.内部类;

public class main {
    public static void main(String[] args) {
        //内部类: A类中有一个 B类,就是内部类
        //内部类表示的事物是外部类的一部分
        //内部类单独出现没有意义
        //内部类访问特点: 内部类可以直接访问外部类的成员,包括私有
        //外部类要访问内部类成员,必须创建对象
        //作用:
        Car c=new Car();
        c.carName="宝马";
        c.carAge=5;
        c.carColor="蓝色";
        c.show();
    }
}
