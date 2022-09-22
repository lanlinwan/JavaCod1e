package 方法;

public class 方法重载 {
    public static void main(String[] args) {
        //方法重载:同一个类,多个方法名相同,但是 形参列表不同,这个方法就叫重载方法
        //调用时会根据 参数区分调用的是 哪个方法
        fire();
        fire("岛国");
        fire("岛国", 1000);
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
}
