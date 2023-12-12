package javaweb.HTTPservlet;

public class response {
    //Response设置响应数据功能介绍
    //●响应数据分为3部分:
    //1. 响应行:
    //javaweb.HTTP/1.1 200 OK
    //●void setStatus(int sc) :设置响应状态码
    //2.响应头: .
    //Content-Type: text/html
    //void setHeader(String name, String value) :设置响应头键值对
    //3.响应体:
    //<html><head>head><body></body></html>
    //PrintWriter getWriter():获取字符输出流
    //ServletOutputStream getOutputStream():获取字节输出流

    //Response完成重定向
    //●重定向(Redirect): - -种资源跳转方式
    //●实现方式:
    //resp.setStatus(302);
    //resp.setHeader("location" ,"资源B的路径");

    //重定向特点:
    //浏览器地址栏路径发生变化
    //➢可以重定向到任意位置的资源(服务器内部、外部均可)
    //➢两次请求，不能在多个资源使用request共享数据

    //3.转发到 brand.jsp
    //request.getRequestDispatcher("/todo.jsp").forward(request,response);



    //Response响应字符数据
    //●使用:
    //1. 通过Response对象获取字符输出流
    //PrintWriter writer = resp.getWriter();
    //2.写数据 .
    //writer.write("aa");
    //●注意:
    //该流不需要关闭，随着响应结束，response对象销毁, 由服务器关闭
    //中文数据乱码:原因通过Response获取的字符输出流默认编码: IS0-8859-1
    //resp.setContentType("texthtml;charset=utf-8");

    //Response响应字节数据.
    //●使用:
    //1.通过Response对象获取字符输出流
    //ServletOutputStream outputStream = resp.getOutputStream();
    //2. 写数据.
    //outputStream.write(字节数据);

    /*
        response:一次请求对应一个响应对象.
              7:getOutputStream();获得字节输出流.
              3:getWriter();获得字符打印流
              6:addCookie(Cookie cookie);将cookie对象写入客户端
              1:setCharacterEncoding(String charset);设置响应编码方式.
              2:setContentType(String type);设置响应内容类型和编码方式.
              5:setHeader(String name, String value);设置响应头部信息
              4:sendRedirect(String location);用重定向的方式实现页面跳转

     */

    //●lOUtils工具类使用:
    //1. 导入坐标
    //<dependency>
    //<groupld>commons-io</groupld>
    //<artifactld>commons-io</artifactld>
    //<version>2.6</version>
    //</dependency>
    //2.使用
    //l0Utils.copy(输入流输出流);


}
