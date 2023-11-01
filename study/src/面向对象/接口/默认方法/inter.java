package 面向对象.接口.默认方法;

public interface inter {
    public static int a = 0;
    public abstract void m();
    //默认方法
    public default void show(){
        System.out.println("jeiko");
    }
}
