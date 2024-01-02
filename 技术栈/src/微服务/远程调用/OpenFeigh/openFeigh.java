package 微服务.远程调用.OpenFeigh;

public class openFeigh {
    /*
        OpenFeign是-个声明式的http客户端，是SpringCloud在Eureka公 司开源的Feign基础上改造而来。官方地址:
        https://github.com/OpenFeign/feign
        其作用就是基于SpringMVC的常见注解，帮我们优雅的实现http请求的发送。

        如何利用OpenFeign实现远程调用?
        ●引入OpenFeign和SpringCloudLoadBalancer依赖
        ●利用@EnableFeignClients注解开启OpenFeign功能
        ●编写FeignClient

        如何配置OpenFeign的连接池?
        ●引入http客户端依赖，例如OKHttp、HttpClient
        ●配置yaml文件，打开OpenFeign连接池开关

        OpenFeign使用的最佳实践方式是什么?
        ●由服务提供者编写独立module,将FeignClient及DTO抽取

        如何配置OpenFeign输出日志的级别?
        ●声明类型为Logger.Level的Bean
        ●在@FeignClient或@EnableFeignClient垮注解_上使用


     */
}
