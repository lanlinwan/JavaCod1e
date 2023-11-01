package Spring;

public class spring事务失效 {

    // @Transactional控制事务，底层实现是基于切面编程AOP实现的，而Spring中实现AOP机制采用的是动态代理,
    // @EnableAspectJAutoProxy(exposeProxy = true)在启动类中添加，会由Cglib代理实现,
    // Spring 本身不实现事务，底层还是依赖于数据库的事务。没有数据库事务的支持，Spring事务是不会生效的
    // Spring事务的传播机制是指在多个事务方法相互调用时，确定事务应该如何传播的策略
    //1. Spring事务底层是基于数据库事务和AOP机制的
    //2.首先对于使用目Transactional注解的Bean, Spring会创建一 个代理对象作为Bean
    //3.当调用代理对象的方法时，会先判断谣方法上是否加了@Transactional注解
    //4.如果加了,那么则利用事务管理器创建一个数据库连接
    //5.并且修改数据库连接的autocommit属性为false,禁止此连接的自动提交,这是实现Spring事务非常重要的一步
    //6.然后执行当前方法,方法中会执行sq|
    //7.执行完当前方法后,如果没有出现异常就直接提交事务
    //8.如果出现了异常,并且这个异常是需要回滚的就会回滚事务,否则仍然提交事务
    //9.  Spring事务的隔离级别对应的就是数据库的隔离级别
    //10. Spring事务的传播机制是Spring事务自己实现的，也是Spring事务中最复杂的
    //11. Spring事务的传播机制是基于数据库连接来做的,一个数据库连接一个事务， 如果传播机制配置为需要新开一个事务，
    //    那么实际上就是先建立-个数据库连接, 在此新数据库连接上执行sq|


    //1. 抛出的是 检查异常 导致事务无法回滚
    //   解决:配置 rollbackFor 属性, @Transactional(rollbackFor = IOException.class)

    //2. 业务方法本身捕获了异常,Spring是否进行回滚是根据你是否抛出异常决定的，所以如果用try{}捕获了异常，Spring 也无能为力
    //   解决:抛出异常 或者 TransactionInterceptor.currentTransactionStatus.setRollbackOnly();

    //3.  aop切面顺序导致导致事务不能正确回滚:事务切面优先级最低，但如果自定义的切面优先级和他一样,则还是自定义切面在内层,这时若自定义切面没有正确抛出异常...
    //    解决:抛出异常 或 调整优先顺序@O

    //4.  方法不是public，Spring事务也会失败，因为Spring的事务管理源码AbstractFallbackTransactionAttributeSource中有判断computeTransactionAttribute()。
    //    如果目标方法不是公共的，则TransactionAttribute返回null。
    //    解决:将当前方法访问级别更改为public 或者 设置一个返回 AnnotationTransactionAttributeSource(false)的Bean

    //5.  父子容器导致的事务失效:子容器扫描范围过大,与父容器扫描了同一个类,子容器没有配置 @EnableTransactionManagement开启事务注解
    //                       运行时优先调用子容器中的类,导致事务失效
    //    解决: 采用精确扫包,只扫自己用的  或者  不要使用父子容器,所有的Bean放在同一容器中

    //6.   同一类中 方法调用另一个方法:Spring的事务管理功能是通过动态代理实现的，而Spring默认使用JDK动态代理，而JDK动态代理采用接口实现的方式，通过反射调用目标类
    //                            a()b()都添加事务注解 a() 调用 b(),走的是 this.b(),不会执行 事务的切面逻辑,b()事务失效
    //     解决:1. 循环依赖:自己 依赖自己 来调用方法
    //          2. @EnableAspectJAutoProxy(exposeProxy = true)在启动类中添加，会由Cglib代理实现,
    //              a()中  ((类名) AopContext.currentProxy()).b();

    //7.  错误使用传播机制:Spring事务的传播机制是指在多个事务方法相互调用时，确定事务应该如何传播的策略
    //    解决:将事务传播策略更改为默认值REQUIRED: @Transactional(propagation=Propagation.REQUIRED)


    //8.  多线程下 事务也会失效,因为@Transactional对 select语句 没有阻塞,多线程读取的数据 可能是还未事务提交的数据,业务出错
    //    @Transactional 方法下加 锁,因为 事务还有提交的一步操作,不在锁中 也会失效
    //    解决: 1.使用select...for update 替换select
    //         2.把锁的范围扩大至代理方法调用

    //9. 类没有被Spring管理
    //10.数据库不支持事务
    //11.没加@Configuration(springBoot没有这个问题)





}
