package Spring;

public class SpringBoot {
    //Spring Boot启动过程中做了哪些事情?
    //1.首先,判断当前的应用类型，比如是不是web应用,如果是,那是servlet应用还是webflux应用, 不同类型后续会创建不同的Spring容器
    //2.根据应用类型创建Spring容器
    //3.解析启动类,从而进行扫描、导入自动配置类并解析解析
    //4.启动Tomcat或者jetty、undertow
    //5.调用ApplicationRunner或CommandLineRunner
    //以上至少- 些核心的,其实整个启动过程中还包含了SpringApplicationRunListeners的调用、 banner的打印、 ApplicationContextInitializer的执行等,
}
