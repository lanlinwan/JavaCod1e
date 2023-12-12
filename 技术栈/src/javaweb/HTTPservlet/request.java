package javaweb.HTTPservlet;

public class request {
    //Request获取请求数据
    //●请求数据分为3部分:
    //1. 请求行:
    //GET /request-demo/req1?username=zhangsan javaweb.HTTP/1.1
    //String getMethod():获取请求方式: GET
    //String getContextPath(:获取虚拟目录(项目访问路径): /request-demo
    //String Buffer getRequestURL(:获取URL(统-资源定位符): http://localhost:8080/request-demo/req1
    //String getRequestURI(:获取URI(统一资源标识符): /request-demo/req1
    //String getQueryString():获取请求参数(GET方式) : username=zhangsan&password=123

    //2.请求头:
    //User-Agent: Moilla/5.0 Chrome/91.0.4472.106
    //String getHeader(String name):根据请求头名称,获取值

    //3.请求体:
    //useriame=superbaby&password=123
    //ServletInputStream getInputStream): 获取字节输入流
    //BufferedReader getReader():获取字符输入流


    //请求转发:
    //●请求转发(forward):-种在服务 器内部的资源跳转方式
    //●实现方式:
    //req.getRequestDispatcher("资源B路径').forward(req,resp);
    //●请求转发资源间共享数据:使用Request对象
    //●void setAtribute(String name, Object o):存储数据到request域中
    //●Object getAttribute(String name):根据key,获取值
    //●void removeAttribute(String name):根据key,删除该键值对
    //●请求转发特点:
    //➢浏览器地址栏路径不发生变化
    //➢只能转发到当前服务器的内部资源
    //➢一次请求， 可以在转发的资源间使用request共享数据


    /*
       2.1:setCharacterEncoding(String env);设置post请求的编码
       2.2:getParameter(String name);通过表单元素的name属性名获得value属性值
       2.3:getParameterValues(String name);通过表单元素的name属性名获得一组value属性值.
       2.4:getRequestDispatcher(String path).forward(request,response);用转发的方式实现页面跳转
       2.5:getParameterMap();获得表单中所有参数的name-value对形式
       2.6:setAttribute(String name, Object o);将数据以key-value的方式存在请求对象中
       2.7:getAttribute(String name);通过key名获得请求中value值.
       2.8:removeAttribute(String name);通过key名删除请求中value值.
       2.9:getInputStream(); 获得字节输入流
       2.10:getCookies();获得当前浏览器关于当前网站所有cookie对象.
       2.11:getSession();获得会话对象
     */


//    转发 VS重定向: 都可实现页面跳转 .
//
//     语法不同:
//           重定向:response.sendRedirect("跳转页面地址");
//          转发:request.getRequestDispatcher("index.html").forward(request, response);
//
//     url不同:
//          重定向后url会改变;转发后url不改变 .
//
//     数据共享性不同:
//            重定向后,重定向之前的数据没有了,不共享;转发后,原请求中数据共享 .
//
//    请求次数不同
//            重定向客户端至少发送两次请求;
//            转发客户端发送一次请求 .
//
//    起作用地方不同
//            重定向在客户端起作用;
//            转发在服务端起作用;
//
//    跳转范围不同
//            重定向可以跳转到其他网站的页面;
//            转发只能在当前项目中页面跳转;

//    应用场景不同
//            如果跳转后的页面需要跳转前的数据, 就用转发;
//            如果跳转后的页面不需要跳转前的数据,就用重定向;
}
