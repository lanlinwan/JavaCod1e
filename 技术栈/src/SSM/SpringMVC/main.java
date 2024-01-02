package SSM.SpringMVC;

public class main {
    //SpringMVC是一个基于MVC模式的轻量级Web框架，是Spring框架的一个模块 。
    //通过把模型-视图-控制器分离，将web层进行职责解耦，
    //把复杂的web应用分成逻辑清晰的几部分，简化开发，减少出错，方便组内开发人员之间的配合。

    //SSM.Spring MVC的优点 ：
    //1.  可以支持各种视图技术,而不仅仅局限于JSP；
    //2.  与Spring框架集成（如IoC容器、AOP等）；
    //3.  清晰的角色分配：前端控制器(dispatcherServlet) , 请求到处理器映射（handlerMapping), 处理器适配器（HandlerAdapter), 视图解析器（ViewResolver）。
    //4.  支持各种请求资源的映射策略。

    //初始化阶段:
    //1. 在Web容器第一-次用到DispatcherServlet的时候，会创建其对象并执行init 方法
    //2. init 方法内会创建Spring Web容器，并调用容器refresh方法
    //3. refresh 过程中会创建并初始化SpringMVC中的重要组件，例如MultipartResolver, HandlerMapping,
    //   HandlerAdapter, HandlerExceptionResolver.ViewResolver等
    //4.容器初始化后，会将上一步初始化好的重要组件,赋值给DispatcherServlet的成员变量，留待后用

    //前端控制器（DispatcherServlet）：主要负责捕获来自客户端的请求和调度各个组件。
    //处理器映射器（HandlerMapping）：根据url查找后端控制器Handler(controller),并返回一个执行链
    //处理器适配器（HandlerAdapter）：执行后端控制器（Handler），拿到后端控制器返回的结果ModelAndView后将结果返回给前端控制器DispatcherServlet。
    //后端控制器（处理器）（Handler）：主要负责处理前端请求，完成业务逻辑，生成ModelAndView对象返回给HandlerAdapter。
    //视图解析器（ViewResolver）：主要负责将从DispatcherServlet中拿到的ModelAndView对象进行解析，生成View对象返回给DispatcherServlet。
    //视图View

    //spring执行流程
    //1. 户通过浏览器发起HttpRequest求到前端控制器(DispatcherServlet)。
    //2. DispatcherServlet将用户请求发送给处理器映射器(HandlerMapping)。
    //3. 处理器映射器(HandlerMapping)会根据请求,找到负责处理该请求的处理器,并将其封装为处理器执行链返迥
    //   (HandlerExecutionChain)给DispatcherServlet
    //4. DispatcherServlet会根据处理器执行链中的处理器,找到能够执行该处理器的处理器适配器(HandlerAdaptor)
    //  -注,处理器适配器有多个
    //5.处理器适配器(HandlerAdapter)会调用对应的具体的Controller
    //6. Controller将处理结果及要跳转的视图封装到一个对象ModelAndView中并将其返回给处理器适配器(HandlerAdaptor)
    //7. HandlerAdaptor直接将ModelAndView交给DispatcherServlet，到到,业务处理完毕
    //8. 务处理完毕后,我们需要将处理结果展示给用户。于是DispatcherServlet 调用ViewResolver,
    //   将ModelAndView中的视图名称封装为视图对象
    //9. ViewResolver将封装好的视图(View) 对象返回给DispatcherServlet
    //10.DispatcherServlet调用视图对象,让其自己(View)进行渲染(将模型数据填充至视图中) , 形成响应对象(HttpResponse)
    //11.前端控制器(DispatcherServlet)响应(HtpResponse)给浏览器，展示在页面上。

    //SpringMVC处理请求的流程是什么?
    //1. 在启动Tomcat过程中，会创建DispatcherServlet对象， 并执行它的初始化逻辑
    //2. DispatcherServlet初始化过程中会创建Spring容器 (根据用户的Spring配置)
    //3. 然后初始化过程中还是初始化HandlerMapping. HandlerAdapter等等
    //4. SpringMVC中默认提供了好几个HandlerMapping,其中有一个为RequestMappingHandlerMapping
    //5. RequestMappingHandlerMapping的作用是去寻找Spring容器中有哪些加了@RequestMapping的方法
    //6. 找到这些方法后,就会解析该注解上的信息,包含了指定的path,然后就把path作为key, Method作为value存到一 个map中
    //7. 当DispatcherServlet接收到请求后， RequestMappingHandlerMapping就会负责根据请求路径从map中找到对应的Method
    //8. 然后准备执行Method,只不过，在执行Method之前，会解析该方法的各个参数
    //9. 比如参数前面加了@RequestParam注解，那SpringMVC就会解析该注解,并从请求中取出对应request param中的数据传给该参数
    //10.解析完各个参数并从请求中拿到了对应的值之后，就会执行方法了
    //11.执行完方法得到了方法返回值后，SpringMVC会进一步解析
    //12.比如方法上如果加了@ResponseBody,那么就直接把返回值返回给浏览器
    //13.如果方法上没有加@ResponseBody,那么就要根据返回值找到对应的页面，并进行服务端渲染，再把渲染结果返回给浏览器
}
