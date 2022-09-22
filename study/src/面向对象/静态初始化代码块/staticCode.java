package 面向对象.静态初始化代码块;

public class staticCode {
    public static String school;

    /**
     * 静态代码块:有 static 属于类,与类一起优先加载一次,自动触发
     * 作用: 可用于初始化静态资源
     */
    static {
        System.out.println("-----静态代码块----");
        school="lan";
    }


    public static void main(String[] args) {
        System.out.println("---main方法执行--");
    }
}
