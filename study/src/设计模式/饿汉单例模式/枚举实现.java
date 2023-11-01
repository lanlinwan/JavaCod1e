package 设计模式.饿汉单例模式;

//枚举实现单例模式 反射 和 序列化无法破坏单例
public enum 枚举实现 {
    INSTANCE;

    private 枚举实现() {
        System.out.println("private Singleton2()");
    }

    @Override
    public String toString() {
        return getClass().getName() + "@" + Integer.toHexString(hashCode());
    }
    //没有静态方法返回也可以获取到 对象,因为枚举是公共的
    public static 枚举实现 getInstance() {
        return INSTANCE;
    }

    public static void otherMethod() {
        System.out.println("otherMethod()");
    }
}
