package 前端.JSP;

public class cls {
    /*
        Java Server Pages（JSP）的九大内置对象是：

    request：这个对象是HttpServletRequest的实例。每次用户请求时都会创建一个新的对象。
            该对象具有作用域，其范围为从用户第一次请求页面开始，到该用户当前请求的页面结束。该对象在JSP页面中可用，直到页面结束。

    response：这个对象是HttpServletResponse的实例。
             该对象具有作用域，其范围为从用户第一次请求页面开始，到该用户当前请求的页面结束。该对象在JSP页面中可用，直到页面结束。

    out：这个对象是JspWriter的实例，用于发送内容到客户端。
        该对象具有作用域，其范围为从用户第一次请求页面开始，到该用户当前请求的页面结束。该对象在JSP页面中可用，直到页面结束。

    session：这个对象是HttpSession的实例。它用于保存每个用户的特定信息。
            这个对象具有作用域，其范围为从用户第一次请求页面开始，到用户会话结束。该对象在JSP页面中可用，直到会话结束。

    application：这个对象是ServletContext的实例。它用于保存所有用户的共享信息。
                这个对象具有作用域，其范围为从Web应用程序启动开始，到Web应用程序关闭结束。该对象在JSP页面中可用，直到Web应用程序结束。

    config：这个对象是ServletConfig的实例。它包含了用于配置Servlet的初始化参数。这个对象在JSP页面中是不可用的。

    pageContext：这个对象是PageContext的实例。它提供了对其他8个内置对象的引用，
                同时还提供了其他一些功能，如数据封装和作用域管理等。这个对象在JSP页面中是不可用的。

    page：这个对象是一个Java对象的实例，代表当前JSP页面正在被执行。这个对象在JSP页面中是不可用的。

    exception：这个对象是Throwable的实例。它代表了在JSP页面中产生的异常（如果有）。这个对象只有在错误处理期间可用，且仅在错误处理块中可用

     */
}
