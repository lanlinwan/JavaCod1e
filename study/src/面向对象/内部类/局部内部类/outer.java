package 面向对象.内部类.局部内部类;

public class outer {
     int b=30;

    public void show(){
        int a=10;

        //局部内部类
        class inner{
            String name;
            int age;
            public void method(){
                //该类可以直接访问外部类的成员，也可以访问方法内的局部变量。
                System.out.println(a);
                System.out.println(b);
                System.out.println("局部内部类方法1");
            }
            public static void method2(){
                System.out.println("局部内部类方法2");
            }
        }
        //创建局部内部类的对象
        inner i=new inner();
        System.out.println(i.name);
        i.method();

        inner.method2();
    }
}
