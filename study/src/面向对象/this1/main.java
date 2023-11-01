package 面向对象.this1;

public class main {
    public static void main(String[] args) {
        //this 用于指定访问当前对象的成员变量 成员方法
        //谁调用 指向谁

        //1.this关键字可用来引用当前类的实例变量。主要用于形参与成员名字重名，用this来区分。
        //2.this关键字可用于调用当前类方法。
        //3.this()可以用来调用当前类的构造函数。(注意：this()一定要放在构造函数的第一行，否则编译不通过)
        Car1 c=new Car1("宝马",88.88);
        System.out.println(c.name);
        System.out.println(c.price);

        c.go("奔驰");
    }


}