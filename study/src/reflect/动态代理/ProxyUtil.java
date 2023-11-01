package reflect.动态代理;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class ProxyUtil {
    /*
    *方法作用:
    *    给 BigStar 创建一个代理对象
    *形参:
    *   需要代理的 对象
    *返回值:
    *   创建的代理
    *
    **/
    public static Star createProxy(BigStar bigStar){
        //●java.lang.reflect.Proxy类: 提供了为对象产生代理对象的方法:
        //public static Object newProxyInstance(ClassLoader loader, Class<?>[] interfaces， InvocationHandler h)
        //参数一:用于指定用哪个类加载器，去加载生成的代理类
        //参数二:指定接口，这些接口用于指定生成的代理长什么，也就是有哪些方法
        //参数三:用来指定生成的代理对象要干什么事情
         Star star= (Star) Proxy.newProxyInstance(
                 ProxyUtil.class.getClassLoader(),//类加载器
                 new Class[]{Star.class},         //指定接口
                 new InvocationHandler() {
                     @Override
                     public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                         //参数一:代理的对象
                         //参数二:运行的方法
                         //参数三:调用方法时传递的实参
                         if(method.getName().equals("sing")){
                             System.out.println("准备话筒,收钱");
                         }else if(method.getName().equals("dance")){
                             System.out.println("准备场地,收钱");
                         }
                         return method.invoke(bigStar,args);
                     }
                 }
         );
         return star;
    }
}
