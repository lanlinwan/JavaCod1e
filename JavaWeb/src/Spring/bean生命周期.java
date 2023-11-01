package Spring;

public class bean生命周期 {
    //bean 是由 Spring IoC 容器实例化、组装和管理的对象。
    //它们是构成用户应用程序主干的对象。
    //Bean 是基于用户提供给容器的配置元数据创建。

    //bean scope:
    // Singleton - 每个 Spring IoC 容器仅有一个单实例。
    // Prototype - 每次请求都会产生一个新的实例。
    // Request - 每一次 HTTP 请求都会产生一个新的实例，并且该 bean 仅在当前 HTTP 请求内有效。
    // Session - 每一次 HTTP 请求都会产生一个新的 bean，同时该 bean 仅在当前 HTTP session 内有效。
    // Global-session 类似于标准的 HTTP Session 作用域，不过它仅仅在基于portlet 的 web 应用中才有意义。

    //Spring Bean 的生命周期：
    //首先是实例化、属性赋值(为bean设置相关属性和依赖)、初始化、销毁这 4 个大阶段；
    //再是初始化的具体操作，有 Aware 接口的依赖注入、BeanPostProcessor 在初始化前后的处理以及 InitializingBean 和 配置文件中init-method 的初始化操作；
    //销毁的具体操作，有注册相关销毁回调接口，最后通过DisposableBean 和 destory-method 进行销毁。


    //类--->推断构造方法--->普通对象--->依赖注入--->初始化前(@PostConstruct)--->初始化( InitializingBean)-->初始化后(AOP )-->代理对象---->放入Map单例池-->Bean对象

    //自动装配的不同模式：
    // no - 这是默认设置，表示没有自动装配。应使用显式 bean 引用进行装配。
    // byName - 它根据 bean 的名称注入对象依赖项。它匹配并装配其属性与 XML文件中由相同名称定义的 bean。
    // byType - 它根据类型注入对象依赖项。如果属性的类型与 XML 文件中的一个 bean 名称匹配，则匹配并装配属性。
    // 构造函数- 它通过调用类的构造函数来注入依赖项。它有大量的参数。
    // autodetect - 首先容器尝试通过构造函数使用 autowire 装配，如果不能，则尝试通过 byType 自动装配。

    //注意:自动装配基于反射设计创建对象并暴力反射对应属性为私有属性初始化数据, 因此无需提供setter方法
    //● 注意:自动装配建议使用无参构造方法创建对象(默认) ,如果不提供对应构造方法,请提供唯一 -的构造方法

    //依赖注入: 先byType 在byName
    //通过postProcessPropertyValues方法来会先根据byType去寻找，如果找到的数量＞1，
    //则会根据byName去寻找，这个时候如果找不到，则抛出异常。
    //byType通过属性的类型查找javabean依赖的对象并为其注入
    //byName根据被注入的名称作为bean名称作为依赖查找，并将对象设置到该属性。（根据bean的id进行查找）



    //创建bean:
    //  创建bean实例
    //      1.采用默认构造
    //      2.AutowiredAnnotationBeanPostProcessor:优先选择带@Autowired注解的构造
    //  属性赋值:
    //      为 bean 设置相关属性和依赖
    //  初始化:
    //      初始化前:检查Aware接口并设置相关的依赖,BeanPostProcessor前置处理
    //      初始化:  InitializingBean接口    和   配置文件中init-method 的初始化操作
    //            调用afterPropertiesSet方法 和 反射调用init-method指定的方法
    //           bean实现了InitializingBean接口，并且同时在配置文件中指定了init-method，
    //           系统则是先调用afterPropertiesSet方法，然后在调用init-method中指定的方法。
    //      初始化后:BeanPostProcessor后置处理
    //  销毁:
    //      使用前 注册销毁的相关调用接口
    //      使用后 DisposableBean 和 destroy-method 进行销毁


}
