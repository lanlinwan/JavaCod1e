package Spring;

public class ApplicationContext {
    //ApplicationContext 是Spring中的核心接口和容器，允许容器通过应用程序上下文环境创建、获取、管理bean。
    //在构建容器的时候，创建对象采用的策略是立即加载的方式，即只要一读取完配置文件就立即创建配置文件中配置的对象。
    //BeanFactory 是IOC容器的顶层接口,采用的是延迟加载的方式，什么时候根据id获取对象了，什么时候才真正地创建对象。

    //ApplicationContext该接口具有三个常用的实现类：
    //1、ClassPathXmlApplicationContext：可以加载类路径下的配置文件，要求配置文件必须在类路径之下。
    //2、FileSystemXmlApplicationContext：可以加载磁盘中任意路径下的配置文件，要求具有访问权限。
    //3、AnnotationConfigApplicationContext：用于读取注解创建容器。

    // BeanFactory与ApplicationContext的关系
    // 1.BeanFactory是Spring的早期接口，称为Spring的Bean工厂，ApplicationContext是后期更高级的接口，称之为Spring容器；
    // 2.ApplicationContext 在 BeanFactory基础上对功能进行了扩展，例如：监听功能、国际化功能(MessageSource)等。
    //   BeanFactory的API更偏向底层，ApplicationContext的API大多数是对这些底层API的封装；
    // 3.Bean创建的主要逻辑和功能都被封装在BeanFactory中，ApplicationContext不仅继承了BeanFactory,
    //   而且ApplicationContext内部还维护着BeanFactory的引用，所以，ApplicationContext与BeanFactory既有继承关系，又有融合关系；
    // 4.Bean初始化时机不同，原始BeanFactory是在首次调用getBean时才进行Bean的创建，而ApplicationContext则是配置文件时加载，
    //   容器一创建就将Bean都实例化并初始化好。


    //
}
