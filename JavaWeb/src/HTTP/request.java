package HTTP;

public class request {
    //Request获取请求数据
    //●请求数据分为3部分:
    //1. 请求行:
    //GET /request-demo/req1?username=zhangsan HTTP/1.1
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

}
