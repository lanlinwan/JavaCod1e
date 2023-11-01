package 面向对象.继承;

public class main {
    public static void main(String[] args) {
        //继承是面向对象最显著的一个特性。
        // 继承是从已有的类中派生出新的类，新的类能吸收已有类的数据属性和行为，并能扩展新的能力。

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


        //继承后子类构造器:会先访问父类的构造器再执行自己
        //              因为子类初始化之前,一定要调用父类构造器完成父类数据空间的初始化
        //              代码实现:默认会在子类构造器中加 super()

        Student s=new Student();
        System.out.println(s.getName());

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
