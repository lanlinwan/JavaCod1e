package servlet;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

@WebServlet(value = "/servlet", loadOnStartup = 1)
public class main implements Servlet {

    /**
     * 初始化方法:
     * 1.调用时机:默认情况,Servlet被第一次访问,调用
     * loadOnStartup:
     * 2.调用次数:  1
     *
     * @param servletConfig
     * @throws ServletException
     */
    @Override
    public void init(ServletConfig servletConfig) throws ServletException {
        System.out.println("init");
    }

    /**
//     * 提供服务
//     * 1.调用时机
//     * 2.调用次数:多次
//     *
//     * @param servletRequest
//     * @param servletResponse
//     * @throws ServletException
//     * @throws IOException
//     */
    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("servlet");
        //根据请求方式的不同，进行分别的处理
        HttpServletRequest request = (HttpServletRequest) servletRequest;
        //1.获取请求方式
        String method = request.getMethod();
        //2.判断
        if ("GET".equals(method)) {
        // get方式的处理運辑
        } else if ("POST".equals(method)) {
        // post方式的处理逻辑
        }

    }

    /**
     * 销毁方法
     * 1.调用时机:内存释放或者服务器关闭,Servlet对象会被销毁,调用
     * 2.调用次数:1
     */
    @Override
    public void destroy() {
        System.out.println("destroy");
    }


    @Override
    public ServletConfig getServletConfig() {
        return null;
    }


    @Override
    public String getServletInfo() {
        return null;
    }


}
