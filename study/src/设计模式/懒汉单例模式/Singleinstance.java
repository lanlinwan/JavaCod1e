package 设计模式.懒汉单例模式;

public class Singleinstance {
    //2. 定义静态成员负责存储一个对象
    //注意:最好私有化
    private static Singleinstance instance;

    //3.提供一个方法,对外返回单例对象
    //Singleinstance.class  同步代码块 解决线程问题
    public static synchronized Singleinstance getInstance(){
        if(instance == null){
            //打一次拿对象,此时再创建
            instance = new Singleinstance();
        }
        return instance;
    }
    //1.私有化 构造器
    private Singleinstance(){
        System.out.println("private Singleinstance");
    }

    public static void otherMethod() {
        System.out.println("otherMethod()");
    }
}
