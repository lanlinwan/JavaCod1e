package 面向对象.多态;

public class Administrator extends Person{
    String id="动物";
    @Override
    public void show(){
        System.out.println("管理员信息为:"+getName()+","+getAge());
    }
}
