package 面向对象.内部类.静态内部类;

public class Car {//外部类
    String carName;
    static int carAge;
    static class Engine{//静态内部类
        String engineName;
        int engineAge;
        public void show(){
            System.out.println("非静态方法");
        }
        public static void show1(){
            System.out.println("静态方法");
        }
    }
}
