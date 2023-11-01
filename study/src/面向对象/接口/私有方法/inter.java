package 面向对象.接口.私有方法;

public interface inter {
    static  int a=10;
    public static void show1() {
        System.out.println("show1方法开始执行了");
        show4();
    }

    public default void show2() {
        System.out.println(" show2方法开始执行了");
        show3();
    }

    //普通的私有方法，给默认方法服务的
    private void show3() {
        System.out.println("3记录程序在运行过程中的各种细节，这里有100行代码");
    }

    //静态的私有方法，给静态方法服务的
    private static void show4() {
        System.out.println("4记录程序在运行过程中的各种细节，这里有100行代码");
    }

}
