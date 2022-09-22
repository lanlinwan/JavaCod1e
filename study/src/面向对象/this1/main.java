package 面向对象.this1;

public class main {
    public static void main(String[] args) {
        //this 用于指定访问当前对象的成员变量 成员方法
        //谁调用 指向谁
        Car1 c=new Car1("宝马",88.88);
        System.out.println(c.name);
        System.out.println(c.price);

        c.go("奔驰");
    }


}