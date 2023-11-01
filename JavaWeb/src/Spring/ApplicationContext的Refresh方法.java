package Spring;

public class ApplicationContext的Refresh方法 {
    //ApplicationContext的父类是AbstractApplicationContext, refresh()是AbstractApplicationContext中的一个方法，
    // 它负责初始化ApplicationContext容器,容器必须经过调用 refresh 才能正常工作。
    // 它的内部主要会调用 12 个方法，我们把它们称为 refresh 的 12 个步骤：
    //1. prepareRefresh -做好准备工作,创建Environment为@Value值注入时提供键值
    //2. obtainFreshBeanFactory- 创建或获取BeanFactory
    //3. prepareBeanFactory- 准备BeanFactory
    //4. postProcessBeanFactory- 子类扩展BeanFactory
    //5. invokeBeanFactoryPostProcessors- 后处理器扩展BeanFactory
    //6. registerBeanPostProcessors- 准备Bean后处理器
    //7. initMessageSource -为ApplicationContext提供国际化功能
    //8. initApplicationEventMulticaster -为ApplicationContext 提供事件发布器
    //9. onRefresh- 留给子类扩展
    //10. registerListeners -为ApplicationContext准备监听器
    //11. finishBeanFactoryInitialization -初始化单例Bean,执行Bean后处理器扩展
    //12. finishRefresh- 准备生命周期管理器，发布ContextRefreshed事件


    //1.prepareRefresh：为后续的步骤做好准备工作
    //    ●创建Environment对象，并将对象赋值给ApplicationContext。 Environment用于管理各种键值信息，在初始化时其他地方会用到这些键值信息，主要包括：
    //        systemProperties：保存Java提供的键值信息，如默认编码，分隔符
    //        SystemEnvironment：保存系统的键值信息，如Java_HOME
    //        自定义的PropertySource：保存从自定义的properties文件中的键值
    //    ●Environment作用：为后续@Value值注入时提供键值

    //2. obtainFreshBeanFactory: 创建或获取BeanFactory
    //     ●创建BeanFactory对象，并将它作为成员变量赋值给ApplicationContext，初始化beanDefinitionMap成员变量
    //     ●BeanFactory的作用时负责bean的创建、依赖注入和初始化，bean 的各项特征由 BeanDefinition 定义
    //          BeanDefinition作为bean的定义信息，包好了bean的单例多例、依赖关系、初始销毁方法等
    //          BeanDefinition 的来源有多种多样，可以是通过 xml 获得、配置类获得、组件扫描获得，也可以是编程添加
    //     ●所有的 BeanDefinition 会存入 BeanFactory 中的 beanDefinitionMap 集合

    //3. prepareBeanFactory(beanFactory): 进一步完善BeanFactory的功能，初始化它的各项成员变量
    //    ●beanExpressionResolver: 在依赖注入时，用于解析spEL表达式。常见实现为 StandardBeanExpressionResolver，
    //                             将表达式中的值替换为将环境变量和Java变量，自定义键值对中对应的值
    //    ●propertyEditorRegistrars: 注册一些类型转换器，在Spring值注入时，需要将字符串类型转换为其他类型，常用于Environment完成${}解析
    //    ●ResolvableDependencies: 来管理一些特殊的bean，用于注入一些特殊依赖bean。来注册 beanFactory 以及 ApplicationContext，让它们也能用于依赖注入
    //    ●beanPostProcessors：是bean的后处理器集合，用于创建bean时对bean进行各种各样的扩展，如对一些bean的注解进行识别

    //4. postProcessBeanFactory(beanFactory): 子类扩展 BeanFactory
    //    ●这一步是空实现，留给子类扩展。用于完善BeanFactory，创建更多需要的Scope。
    //         一般 Web 环境的 ApplicationContext 都要利用它注册新的 Scope，如request，session，完善 Web 下的 BeanFactory。
    //    ●体现的是模板方法的设计模式

    //5.invokeBeanFactoryPostProcessors(beanFactory): 后处理器扩展 BeanFactory
    //    ●调用其他BeanFactory后处理器
    //    ●对整个BeanFactory的功能做完善，充当BeanFactory的扩展点，用来补充或修改BeanDefinition
    //          BeanFactory的另一种扩展方式，第四部步是将一些功能交给子类扩展，但在实际工作中不可能为了扩展一些功能去实现一个新的ApplicationContext，
    //          所以bean后处理器是一种更好的扩展方式。
    //    ●常见的BeanFactory后处理器有：
    //          ConfigurationClassPostProcessor – 解析 @Configuration、@Bean、@Import、@PropertySource ，补充BeanDefinition。
    //          PropertySourcesPlaceHolderConfigurer – 替换 BeanDefinition 中的 $
    //          MapperScannerConfigurer – 补充 Mapper 接口对应的 BeanDefinition


    //6. registerBeanPostProcessors(beanFactory): 准备 Bean后处理器
    //    ●用于对Bean做增强，在Bean的创建过程时
    //    ●在BeanDefinitionMap中找出所有Bean后处理器，添加到 beanPostProcessors 集合中
    //    ●Bean后处理器， 在bean的实例化、依赖注入、初始化阶段对bean进行增强
    //          AutowiredAnnotationBeanPostProcessor 功能有：解析 @Autowired，@Value 注解
    //          CommonAnnotationBeanPostProcessor 功能有：解析 @Resource，@PostConstruct，@PreDestroy
    //          AnnotationAwareAspectJAutoProxyCreator 功能有：解析Aspect注解，为符合切点的目标 bean 自动创建代理

    //7. initMessageSource: 为 ApplicationContext 提供国际化功能
    //    ●为ApplicationContext添加messageSource成员，实现国际化功能
    //    ●实现过程：
    //      从BeanDefinitionMap中寻找名为messageSource的bean信息，如果有则创建一个messageSource
    //      如果没有定义信息，则提供一个空的MessageSource 实现


    //8. initApplicationEventMulticaster
    //    ●添加应用程序事件广播器ApplicationEventMulticaster对象到ApplicationContext
    //    ●它的用于是发送事件给监听器。Spring容器中也可以定义一些监听器，当事件发生时，用广播器将事件发送给监听器。
    //    ●它的创建：去 beanFactory 的BeanDefinitionMap中找名为 applicationEventMulticaster 的 bean 作为事件广播器，若没有，会创建默认的事件广播器
    //    ●它如何广播：Multicaster里有一个监听器集合defaultRetriever，这个集合维护了所有的监听器，当事件发生时它遍历集合，找到对事件感兴趣的监听器去发送事件

    //9. onRefresh
    //    ●这一步是空实现，留给子类扩展
    //          SpringBoot 中的子类创建了内嵌的 web 容器
    //    ●体现的是模板方法设计模式


    //10. registerListeners
    //    ●用于注册监听器。这一步会从多种途径找到事件监听器，并添加至 applicationEventMulticaster
    //    ●事件监听器来源：
    //          BeanDefinitionMap中定义的Bean
    //          事先编程添加的
    //          标注了@EventListener的方法
    //    ●要实现事件监听器，只需要实现 ApplicationListener 接口，重写其中 onApplicationEvent(E e) 方法即可


    //11. finishBeanFactoryInitialization(beanFactory):
    //    ●初始化所有单例非延迟的bean对象，并放入单例池。创建bean分为三个阶段：创建bean，依赖注入，初始化
    //    ●并进一步补充beanFactory 的成员的成员变量：
    //    ●conversionService 也是类型转换机制，作为对 PropertyEditor 的补充
    //    ●embeddedValueResolvers 即内嵌值解析器，用来解析 @Value 中的 ${ }，借用的是 Environment 的功能
    //    ●singletonObjects 即单例池，缓存所有单例对象

    //12. finishRefresh: 用于控制容器内需要声明周期管理的bean
    //    ●在ApplicationContext 添加 lifecycleProcessor 成员，用于控制容器内需要声明周期管理的bean
    //    ●lifecycleProcessor 成员的创建：BeanDefinitionMap中有名称为 lifecycleProcessor 的 bean 就用创建它，否则创建默认的生命周期管理器
    //    ●lifecycleProcessor 如何控制声明周期：
    //    ●调用 context 的 start，即可触发所有实现 LifeCycle 接口 bean 的 start
    //    ●调用 context 的 stop，即可触发所有实现 LifeCycle 接口 bean 的 stop
    //    ●发布ContextRefreshed事件，表示整个Spring容器初始化完成
}
