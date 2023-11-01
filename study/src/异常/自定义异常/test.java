package 异常.自定义异常;

public class test {
    //自定义异常: 所有异常都必须是 Throwable 的子类

    //1.自定义编译时异常:
    //a.定义1个异常类继承Exception.
    //b.重写构造器。
    //c.在出现异常的地方用throw new自定义对象抛出!
    //编译时异常是编译阶段就报错，提醒更加强烈，一定 需要处理

    //2.自定义运行时异常:
    //a.定义一个异常类继承RuntimeException.
    //b.重写构造器。
    //c.在出现异常的地方用throw new自定义对象抛出!
    //提醒不强烈，编译阶段不报错! !运行时才可能出现! !

    public static void main(String[] args) {
        try {
            //checkAge(-10);
            checkOpenAge(-10);
        } catch (异常.自定义异常.opeartion opeartion) {
            opeartion.printStackTrace();
        }
    }
    //编译时
    public static void checkAge(int age) throws compile {
        if (age<0 || age>200){
            //抛出去一个异常对象给调用者
            //throw:在方法内部直接创建一个异常对象,并从此抛出
            //throws:用在方法申明上的,抛出方法内部的异常
            throw new compile(age+"is illeagal");
        }else {
            System.out.println("合法");
        }
    }
    //运行时
    public static void checkOpenAge(int age) throws opeartion {
        if (age<0 || age>200){
            throw new opeartion(age+" is illeagal");
        }else {
            System.out.println("合法");
        }
    }

}
