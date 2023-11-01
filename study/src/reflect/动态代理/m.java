package reflect.动态代理;

public class m {
    //动态代理:
    //   无侵入式的给代码增加额外的功能
    //程序为什么需要代理?
    //    对象嫌身上的干的事太多了,可以通过代理转移部分职责
    //代理应该怎么写:
    //    对象有什么方法需要被代理,代理就一定要有对应的方法
    //代理如何知道应该要被代理的方法?
    //    对象 和 代理 都继承一个接口,接口内写需要被 代理的方法


    //如何为Java对象创建一个代理对象?
    //●java.lang.reflect.Proxy类: 提供了为对象产生代理对象的方法:
    //public static Object newProxyInstance(ClassLoader loader, Class<?>[] interfaces， InvocationHandler h)
    //参数一:用于指定用哪个类加载器，去加载生成的代理类
    //参数二:指定接口，这些接口用于指定生成的代理长什么，也就是有哪些方法
    //参数三:用来指定生成的代理对象要干什么事情
}
