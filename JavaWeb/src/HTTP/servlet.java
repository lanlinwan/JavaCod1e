package HTTP;

public class servlet {
    //Servlet
    //●Servlet 是Java提供的一门动态web资源开发技术
    //●Servlet 是JavaEE规范之- -,其实就是一个接口，将来
    //web服务器
    //我们需要定义Servlet类实现Servlet接口，并由web服务器运行Servlet

    //●Servlet快速入门
    //1.创建web项目，导入Servlet依赖坐标
    //<dependency>
    //<groupld>javax.servlet</groupld>
    //<artifactld>javax.servlet-api</artifactld>
    //<version>3.1.0</version>
    //<scope>provided </scope>
    //</dependency>

    //2.创建:定义一个类,实现Servlet接口，并重写接口中所有方法，并在service方法中输入-句话
    //public class ServletDemo1 implements Servlet {
    //public void service()}
    //}

    //3.配置:在类上使用@WebServlet注解，配置该Servlet的访问路径
    //@WebServlet("/demo1")
    //public class ServletDemo1 implements Servlet {}

    //4.访问:启动Tomcat,浏览器输入URL访问该Servlet
    //http://localhost:8080/web-demo/demo1

    //●servlet执行流程:
    //1. Servlet 由谁创建? Servlet方法由谁调用?
    //Servlet由web服务器创建，Servlet方 法由web服务器调用。
    //2.服务器怎么知道Servlet中一 定有service方法?
    //因为我们自定 义的Servlet, 必须实现Servlet接口并复写其方法，而Servlet接口中有service方法


    //●Servlet生命周期:
    //对象的生命周期指一一个对象从被创建到被销毁的整个过程
    //Servlet运行在Servlet容器(web服务器)中，其生命周期由容器来管理，分为4个阶段:
    //1. 加载和实例化:默认情况下，当Servlet第一 -次被访问时，由容器创建Servlet对象
    //@WebServlet(urlPatterns = "/demo",
    //loadOnStartup= 1)

    //2. 初始化:在Servlet实例化之后，容器将调用Servlet的init()方法初始化这个对象,完成- -些如
    //①负整数: 第一次被访问时创建Servlet对象
    //加载配置文件、创建连接等初始化的工作。该方法只调用- -次
    //②0或正整数:服务器启动时创建Servlet对象

    //3. 请求处理:每次请求Servlet时， Servlet容器都会调用Servlet的service()方法对请求进行处理。
    //数字越小优先级越高

    //4.服务终止: 当需要释放内存或者容器关闭时,容器就会调用Servlet实例的destroy()方法完成
    //资源的释放。在destroy()方法调用之后, 容器会释放这个Servlet实例，该实例随后会被Java的
    //垃圾收集器所回收


    //Servlet方法介绍:
    //●初始化方法， 在Servlet被创建时执行，只执行- -次
    //void init(ServletConfig config)
    //●提供服务方法， 每次Servlet被访问， 都会调用该方法
    //void service(ServletRequest req, ServletResponse res)
    //●销毁方法， 当Servlet被销毁时，调用该方法。在内存释放或服务器关闭时销毁Servlet
    //void destroy()
    //●获取ServletConfig对象
    //ServletConfig getServletConfig()
    //●获取Servlet信息
    //String getServletInfo()

    //●Servlet体系结构.
    //1.ServLet      --> Servlet体系根接C ]
    //      ▲
    //2.GenericServLet --> Servlet抽象实现类
    //       ▲
    //3. HttpServlet  --> 对HTTP协议封装的Servlet实现类

    //我们将来开发B/S架构的web项目，都是针对HTTP协议所以我们自定义Servlet, 会继承HttpServlet


}
