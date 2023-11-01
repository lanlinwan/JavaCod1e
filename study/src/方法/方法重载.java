package 方法;

public class 方法重载 {
    public static void main(String[] args) {
        //方法重载:同一个类,多个方法名相同,但是 形参列表不同,这个方法就叫重载方法
        //调用时会根据 参数区分调用的是 哪个方法

        //重载规则:
        //    被重载的方法必须改变参数列表(参数个数或类型不一样)；
        //    被重载的方法可以改变返回类型；
        //    被重载的方法可以改变访问修饰符；
        //    被重载的方法可以声明新的或更广的检查异常；
        //    方法能够在同一个类中或者在一个子类中被重载。
        //    无法以返回值类型作为重载函数的区分标准。
        fire();
        fire("岛国");
        fire("岛国", 1000);
        fire( 1000,"岛国");
    }

    public static void fire(){
        fire("米国");
    }

    public static void fire(String location){
        fire(location, 1);
    }

    public static void fire(String location, int number){
        System.out.println("默认发射"+number+"枚武器给"+location+"~~~");
    }

    public static void fire( int number,String location){
        System.out.println("默认发射"+number+"枚武器给"+location+"~~~");
    }

    //重载和重写的区别
    //重载:发生在同一个类中,方法名必须相同，参数类型不同、个数不同、顺序不同，方法返回值和访问修饰符可以不同，发生在编译时。
    //重写:发生在父子类中，方法名、参数列表必须相同，返回值范围小于等于父类,抛出的异常范围小于等父类,
    //    访问修饰符范围大于等于父类;如果父类方法访问修饰符为private则子类就不能重写该方法。

}
