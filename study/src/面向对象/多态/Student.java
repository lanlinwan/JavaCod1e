package 面向对象.多态;

public class Student extends Person {
    String id="学生";
    @Override
    public void show(){
        System.out.println("学生信息为:"+getName()+","+getAge());
    }
}
