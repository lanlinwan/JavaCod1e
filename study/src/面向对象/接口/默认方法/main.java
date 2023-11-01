package 面向对象.接口.默认方法;

public class main  {
    public static void main(String[] args) {
        //接口中默认方法的定义格式: .
        //格式: public default 返回值类型方法名(参数列表) { }
        //接口中默认方法的注意事项:
        //1.默认方法不是抽象方法，所以不强制被重写。但是如果被重写，重写的时候去掉default关键字
        //2. public可以省略，default 不能省略
        //3.如果实现了多个接口，多个接口中存在相同名字的默认方法，子类就必须对该方法进行重写*/

        //这个特点在实践中的具体作用是：
        //  当我们进行业务扩展时，需要在接口中新增方法。如果新增的这个方法写成普通方法的话，
        //  那么需要在该接口所有的实现类中都重写这个方法。如果新增的方法定义为default类型，
        //  就不需要在所有的实现类中全部重写该default方法，哪个实现类需要新增该方法，就在哪个实现类中进行实现。
        in i=new in();
        i.show();
        i.m();
    }
}
