package 面向对象.抽象类;

public abstract  class test1 extends Ad{
    test1(int a){

    }
    private String name;
    private int age;
    public abstract void add();
    //可以有普通成员函数
    public void get(){
        System.out.println("名字"+name+"年龄"+age);
    };


}
