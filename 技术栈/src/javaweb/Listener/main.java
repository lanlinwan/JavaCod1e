package javaweb.Listener;

public class main {
    //javaweb.Listener
    //●概念: Listener表示监听器，是JavaWeb三大组件(Servlet、javaweb.Filter. javaweb.Listener)之一 。
    //●监听器可以监听就是在application,session,request三 个对象创建、销毁或者往其中添加修改删除
    //属性时自动执行代码的功能组件
    //●Listener分类: JavaWeb中提供了8个监听器


    //ServletContext监听:
    //ServletContextListener 用于对ServletContext对象进行监听(创建、销毁)
    //ServletContextAttributeListener 对ServletContext对象中属性的监听(增删改属性)

    //Session监听:
    //HttpSessionListener 对Session对象的整体状态的监听(创建、销毁)
    //HttpSessionAttributeListener 对Session对象中的属性监听(增删改属性)
    //HttpSessionBindingListener 监听对象于Session的绑定和解除
    //HttpSessionActivationListener 对Session数据的钝化和活化的监听

    //Request监听:
    //ServletRequestListener 对Request对象进行监听(创建、销毁)
    //ServletRequestAttributeListener 对Request对象中属性的监听(增删改属性)
}
