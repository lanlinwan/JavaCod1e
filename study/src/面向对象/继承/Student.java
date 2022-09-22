package 面向对象.继承;

//学生类
public class Student extends People {
    public Student(){
        System.out.println("子类构造器");
    }
    public Student(String name,int age){
        //调用父类有参数构造器,初始化继承自父类的数据
        super(name,age);
        System.out.println("子类有参数构造器");

    }
    public Student(String name){
        this(name,18);
    }
    //方法重写
    @Override
    public void  run(){
        //先用父类功能
        super.run();
        System.out.println("奔跑");
    }

//    @Override
//    private static void a(){
//
//    }

    //

}
