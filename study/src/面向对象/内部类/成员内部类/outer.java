package 面向对象.内部类.成员内部类;

public class outer {//外部类
    String name;
    int age;
    //成员内部类 可以被一些修饰符修饰,比如: private ,默认,protected,public,static
    //在成员内部类中,JDK16之前不能定义静态变量,后面开始才能定义 静态变量


    private abstract class engine{//成员内部类(可以抽象)
        String engineName;
        int engineAge;
        static int Age;
        void eng(){
            System.out.println("engine执行");
        }
        public abstract void a();
    }
    public inner getEngine(){
        return  new inner();
    }
    public class inner extends engine{//成员内部类(可以继承)
        String innerName;
        int innerAge;

        @Override
        public void a() {
            System.out.println("inner执行");
        }
    }

    //外部类,内部类,内部类方法 同名属性访问
    private int a=10;

    class in{
        private int a=20;

        public void show(){
            int a=30;
            System.out.println(a);
            System.out.println(this.a);
            //outer.this 获取了外部类对象的地址值
            //内部类自动添加的
            System.out.println(outer.this.a);
        }
    }


}
