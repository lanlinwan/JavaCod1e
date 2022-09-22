package 面向对象.this1;

public class Car1 {
    String name;
    double price;
    //this 在有参数构造器中
    public Car1(String name, double price){
        this.name=name;
        this.price=price;
    }
    //this  方法中
    public void go(String name){
        System.out.println(this.name+"正在与"+name+"比赛中");
    }
}
