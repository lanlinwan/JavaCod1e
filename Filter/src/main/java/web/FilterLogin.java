package web;
import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.io.IOException;


@WebFilter("/*")
public class FilterLogin implements javax.servlet.Filter {

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        HttpServletRequest req= (HttpServletRequest) servletRequest;

        //判断访问路径是否和登录注册相关
        String[] urls={"login.jsp","loginService","loginServlet"};
        //获取当前访问的路径
        String url=req.getRequestURL().toString();
        //循环判断
        for (String u : urls){
            if(url.contains(u)){
                //放行

                return;
            }
        }



        //1.判断session中是否有login
        HttpSession session=req.getSession();
        Object login=session.getAttribute("login");

        //2.判断login是否为null
        if(login != null){
            //放行
            filterChain.doFilter(servletRequest, servletResponse);
        }else {
            //未登录,跳转登陆页面
            req.setAttribute("login_msg","你未登录");
            req.getRequestDispatcher("login.jsp").forward(servletRequest,servletResponse);

        }



    }

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }


    @Override
    public void destroy() {

    }
}
