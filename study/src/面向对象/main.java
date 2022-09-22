package 面向对象;

public class main {
    public static void main(String[] args){
        Car c =new Car();
        c.name="宝马";
        c.price=66.6;
        System.out.println(c.name);
        System.out.println(c.price);
        c.starrt();
        c.run();
    }

}
