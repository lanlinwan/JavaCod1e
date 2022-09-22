package 面向对象.继承;

public class main {
    public static void main(String[] args) {
        //extends 让一个类与另一个类 产生一种父子关系
        //提高代码复用性,减少代码冗余,增强类的功能扩展性
        //子类可以使用父类 的方法,属性
        //子类相同的属性放在父类中定义
        //子类独有的属性,方法应该定义i在子类自己里面

        //注意:子类可以继承父类属性 方法,但是不能继承父类的构造器
        //    Java是单继承:一个类只能继承一个直接父类
        //    Java不支持多继承,但是支持多层继承
        //    Java所有的类都是Object的子类

        //争议:子类可以继承父类私有成员,但是不能直接访问
        //    子类可以使用父类静态成员(共享不算继承)
        Student.a();

        //继承后成员访问特点:就近原则
        //找子类对象用 this 找父类用 super

        //方法重写:继承体系中,子类出现和父类一模一样的方法声明,称为方法重写
        //        重写方法的名词和形参列表 必须和被重写的一摸一样
        //        私有方法不能被重写
        //        @Override 重新校验注解,加上这个方法必须是重写的,安全,可读性强
        //        子类不能重写父类的静态方法

        //继承后子类构造器:会先访问父类的构造器再执行自己
        //              因为子类初始化之前,一定要调用父类构造器完成父类数据空间的初始化
        //              代码实现:默认会在子类构造器中加 super()

        Student s=new Student();
        System.out.println("---------");
        Student s1=new Student("lan");

        //调用父类有参数构造器
        Student s2=new Student("lan");

        //this()作用: 本类构造器访问本类兄弟构造器
        //this() 与 super() 都只能放在构造器第一行,所以两者不能共存
        Student s3=new Student("lan");
        System.out.println(s3.getName());
        System.out.println(s3.getAge());



    }

}
