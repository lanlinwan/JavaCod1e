package 面向对象.多态;

public class Teacher extends Person{
    String id="学生";
    @Override
    public void show(){
        System.out.println("老师信息为:"+getName()+","+getAge());
    }


    public void s(){
        System.out.println("老师特有方法");
    }
}
