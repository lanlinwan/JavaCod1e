package Spring;

public class spring注解 {
    //组件扫描与配置类:
    //    @Component  标注一个普通的spring Bean类
    //    @Controller 标注一个控制器组件类
    //    @Service    标注一个业务逻辑组件类
    //    @Repository 标注一个数据访问层组件类
    //    @ComponentScan  定义扫描的路径,找出标识了需要装配的类自动装配到spring的bean容器中
    //    @Conditional    按照一定的条件对一个Bean进行判断,是否自动装配到spring容器中
    //    @Configuration 相当于传统的xml配置文件,默认为类生成代理,保证@Bean相互调用时的单例性
    //    @Bean       用@Bean标注方法等价于XML中配置的bean,
    //    @Import     用来导入其他配置类,自动装配到spring的bean容器中
    //    @PropertySource  加载配置文件 .yml  .properties
    //    @Lazy
    //bean:
    //    @scope         作用范围:设置单例
    //    @PostConstruct 生命周期:初始化前置
    //    @PreDestroy    生命周期:销毁前置
    //依赖注入:
    //    @Autowired  按照Type 注入
    //    @Qualifier  可根据name注入,更细粒度的控制
    //    @Value(${配置文件key})      值注入
    //    @Resource   java自带的注解,按照name和Type 注入
    //    @Primary    解决多个同类型bean,加在类上,优先被加载成bean
    //test:
    //    @RunWith(SpringJUnit4ClassRunner.class)     指定测试
    //    @ContextConfiguration(classes = SpringConfig.class)  指定配置类
    //事务:
    //    @EnableTransactionManagement 启用事务控制 配置类
    //    @Transactional               事务注解,加在方法或类上
    //核心:
    //    @Order   控制bean执行顺序
    //切面:
    //    @EnableAspectJAutoProxy   启用AOP自动代理


    //Spring MVC:
    //    @RequestMapping  共享映射,接收所有的HTTP请求,加类上:提取一个类中相同的路径
    //    @GetMapping      限制Get请求
    //    @PostMapping     限制Post请求
    //    @PutMapping      限制Put请求
    //    @DeleteMapping   限制Delete请求
    //    @PatchMapping    put方式的一种补充局部更新
    //    @EnableWebMvc    SpringMvc配置类
    //    @PathVariable    获得请求url中的动态参数,即url/{id}这种形式
    //    @RequestParam    获取查询参数,即url?name=这种形式
    //    @RequestParam(defaultValue="")  获取查询参数,设置默认值
    //    @ResponseBody    加类上,将java对象转为json格式的数据。
    //    @RequestBody     处理请求体json数据,加在方法参数前
    //    @DateTimeFormat(pattern="yyyy-MM-dd")  日期参数格式转换
    //    @ResponseStatus  在自定义异常类上面加上,当抛出自定义异常的时候,使用@ResponseStatus注解中声明的属性和reason属性将异常信息返回给客户端
    //    @RestController  @ResponseBody与@Controller 结合体,设置当前控制器为RESTFUL风格
    //    @ControllerAdvice 增强的 Controller,全局异常处理(@ExceptionHandler）,全局数据绑定（@InitBinder）,全局数据预处理（@ModelAttribute）
    //    @ExceptionHandler 用于全局处理控制器里的异常，进行全局异常处理

    //Spring Boot
    //    @SpringBootApplication   一个复合注解，包含了
    //          @SpringBootConfiguration   继承@Configuration注解，主要用于加载配置文件
    //          @EnableAutoConfiguration   开启自动配置功能:将所有符合条件的@Configuration配置都加载到当前SpringBoot创建并使用的IoC容器。
    //                                     应用于Spring Boot根据依赖中的jar包，自动选择实例化某些配置。
    //          @EnableHandleConfiguration
    //          @ComponentScan             用于组件扫描和自动装配:扫描被@Component (@Service,@Controller)注解的 bean，注解默认会扫描该类所在的包下所有的类
    //    @SpringBootTest
    //    @auto
    //    @ConfigurationProperties

    //MyBatis-plus:
    //    @Mapper        标记为数据层dao
    //    @TableName()   设置对应数据库表名
    //    @TableId(value,type) 将属性对应字段指定为id(可起别名)和 设置id添加策略
    //    @TableField(value,select=false)  对应表中字段名称,可设置为查询忽略此字段
    //     @TableField(exist=false)     表示不对应表中的字段,隐藏
    //    @TableLogic(value,delval)  标记为逻辑删除字段 value表示已被删除,delval表示没删
    //    @Version       修改乐观锁

}
