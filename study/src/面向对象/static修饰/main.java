package 面向对象.static修饰;

public class main {
    public static void main(String[] args) {
        //static 静态的意思,可以修饰成员变量和成员方法
        //static 修饰成员变量表示该成员变量在内存中只存储一份,可以被共享访问和修改
        //静态代码的执行处于类生命周期中的初始化阶段，由虚拟机保证其原子且安全执行。

        //访问:
        //1. 类名.静态成员变量
        System.out.println(User.online);

        //2. 对象.静态成员变量(不推荐)
        User u=new User();
        System.out.println(u.online);

        //static 修饰成员方法
        //1.类名.静态成员方法
        System.out.println(User.getMax(10,2));

        //对象.静态成员方法(不推荐)



    }
}
