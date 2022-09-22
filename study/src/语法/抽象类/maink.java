package 语法.抽象类;

public class maink extends test {

    //abstract 是抽象的意思,可以修饰类,成员方法

    //注意:抽象方法只有方法签名,不能声明方法体
    //    一个类定义了抽象方法,这个类必须声明称 抽象类,否则报错
    //    被子类继承后,抽象方法必须被重写 或者 将子类定义为抽象类;
    @Override
    public void add() {
        System.out.println("添加");
    }
    //使用场景:当父类有不知道如何定义的方法时,可以写成抽象方法交给 子类进行定义

}
