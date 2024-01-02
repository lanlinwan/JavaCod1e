package javaweb.Filter;

public class main {
    //javaweb.Filter
    //●概念: javaweb.Filter 表示过滤器，是JavaWeb三大组件(Servlet、javaweb.Filter、 javaweb.Listener)之一 。
    //●过滤器可以把对资源的请求拦截下来,从而实现-些特殊的功能。
    //●过滤器一般完成一些通用的操作,比如:权限控制、统一编码处理、敏感字符处理等等...


    //Filter执行流程
    //1. 放行后访问对应资源，资源访问完成后，还会回到Filter中吗?会
    //2.如果回到Filter中， 是重头执行还是执行放行后的逻辑呢?放行后逻辑
    //执行放行前逻辑 -->  放行 -->  访问资源  -->  执行放行后逻辑


    //Filter拦截路径配置
    //●javaweb.Filter 可以根据需求，配置不同的拦截资源路径
    //@WebFilter ("/*")
    //public cLass FilterDemo
    //➢拦截具体的资源: /index.jsp: 只有访问index.jsp时才会被拦截。
    //➢目录拦截: /user/*:访问/user^下的所有资源，都会被拦截
    //➢后缀名拦截: *jsp: 访问后缀名为jsp的资源，都会被拦截
    //拦截所有: /*: 访问所有资源，都会被拦截


    //过滤器链
    //●- -个Web应用，可以配置多个过滤器，这多个过滤器称为过滤器链
    //●注解配置的Filter, 优先级按照过滤器类名(字符串)的自然排序



}
