package 面向对象.static修饰;

public class User {
    //一. 静态成员变量: 有 static 修饰,属于类,内存中加载一次:常用于表示在线人数,等需要被共享的信息
    //访问:1. 类名.静态成员变量
    //    2. 对象.静态成员变量(不推荐)
    public static int online = 166;

    //示例成员变量: 无 static 修饰,存在于每个对象中:常用于表示 姓名,年龄,等属于每个对象的信息
    //访问: 类名.示例成员变量
    private String name;

    //二. 静态成员方法: 有 static 修饰,属于类,建议用类名访问,也可以用对象访问
    public static int getMax(int age1, int age2) {
        return age1 > age2 ? age1 : age2;
    }

    //示例成员方法 无 static 修饰,存在于每个对象中,只能用对象访问
    public void study() {
        System.out.println(name +online+ "好好享受");
    }

    //注意:使用场景中,表示对象自己的行为,且方法中需要访问示例成员的,该方法必须声明成实例方法
    //             如果该方法是以执行一个共用功能为目的,则声明为静态方法

    //1. 静态方法只能访问静态的成员,不可以访问 实例成员
    //2. 实例方法可以访问 静态的成员,也可以访问示例成员
    //3. 静态方法中不可以出现 this 关键字`
}