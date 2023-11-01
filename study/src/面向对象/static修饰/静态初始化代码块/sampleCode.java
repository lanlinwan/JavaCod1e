package 面向对象.static修饰.静态初始化代码块;

public class sampleCode {
    /**
     * 示例代码块:无 static 属于类,每次构建对象 触发一次(比较少用)
     */
    private String name;
    {
        name="lan";
        System.out.println("示例代码块执行");
    }


    public static void main(String[] args) {
        sampleCode a=new sampleCode();
        System.out.println(a.name);
    }
}
