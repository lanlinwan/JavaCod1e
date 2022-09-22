package 面向对象.内部类.成员内部类;

import 面向对象.内部类.Car;

public class test {
    public static void main(String[] args) {
        //获取成员内部类对象的两种方式:
        //方式一:外部举编写方法，对外提供内部类对象,
        outer q=new outer();
        System.out.println(q.getEngine());
        //方式二:直接创建
        //格式:外部类名.内部类名对象名=外部类对象.内部类对象;
        //范例: Outer.Inner oi = new Outer().new Inner();
        outer.inner o= new outer().new inner();
        System.out. println(o.innerName);


        //外部类,内部类,内部类方法 同名属性访问
        outer.in oi= new outer().new in();
        oi.show();
    }
}
