package SSM.Spring;

public class 设计模式 {
    //1.Spring中的单例模式 不是严格意义上的单例模式,只能保证一个容器中 相同id 的bean 单实例

    //2.Spring中的Builder,三处亮点:1.较灵活构建产品对象 2.不执行build方法前,产品对象不可用 3.构建过程采用链式调用

    //3.Spring中的Factory Method(工厂方法),SSM.Spring 中ApplicationContext与BeanFactory中的getBean都视为工厂方法
    //  它隐藏了bean创建过程和具体实现

    //4.Spring中的Adapter(适配器),适配器设计模式将一个接口转换成客户希望的另一个接口，适配器模式使得接口不兼容的那些类可以一起工作，其别名为包装器
    //  控制器的实现有各种:1.@RequestMapping标注的控制器实现
    //                 2.传统基于Controller接口实现
    //                 3.较新的基于RouterFunction接口实现,
    //  他们处理方法都不一样,为了同一调用,必须适配为HandlerAdapter接口

    //5.Spring中的Composite(组合器),composite对象的作用是,将分散的调用集中起来，统- -调用入口，它的特征是，与具体干活的实现实现同一个接口，
    //  当调用composite对象的接口方法时，其实是委托具体干活的实现来完成,

    //6.Spring中的Decorator(装饰器),装饰者设计模式可以动态地给对象增加些额外的属性或行为

    //7.Spring中的Proxy(代理),SSM.Spring AOP就是基于动态代理的,装饰器模式注重的是功能增强，避免进行子类继承，而代理模式更注重控制目标的访问

    //8.Spring中的Chain of Responsibility(责任链),实现:springMvc拦截器

    //9.Spring中的Observer(观察者),是一种对象行为模式。它表示的是一种对象与对象之间具有依赖关系，当一个对象发生改变时，这个对象锁依赖的对象也会做出反应,
    //  实现: spring监听器与广播器

    //10.Spring中的Strategy(策略模式),SSM.Spring 框架的资源访问接口就是基于策略设计模式实现的
    //   针对不同的底层资源，Spring将会提供不同的Resource实现类，不同的实现类负责不同的资源访问类型。

    //11.Spring中的Template Method(模板模式),定义一个操作中的算法的骨架,使得子类可以在不改变一个算法的结构即可重定义该算法的默写特定步骤的实现方式。
    //   实现:大部分以Template命名的类
}