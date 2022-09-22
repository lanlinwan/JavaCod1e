package 面向对象.构造器;

public class car {
    String name;
    double price;

//    无参数构造器  默认有的
//    使用 有参数构造器后 无参数构造器消失,需要使用 要写出来
    public car(){
        System.out.println("无参数构造器");
    }
//    有参数构造器
    public car(String n,double p){
        System.out.println("有参数构造器");
        name=n;
        price=p;
    }
}
