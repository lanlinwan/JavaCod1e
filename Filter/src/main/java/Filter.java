import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;


@WebFilter("/*")
public class Filter implements javax.servlet.Filter {

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
       //1. 放行前,对 ServletRequest 数据进行处理
        System.out.println("filter");
        //放行
        filterChain.doFilter(servletRequest, servletResponse);
        //2. 放行前,对 ServletResponse 数据进行处理
        System.out.println("放行后");
    }

    @Override
    public void destroy() {

    }
}
