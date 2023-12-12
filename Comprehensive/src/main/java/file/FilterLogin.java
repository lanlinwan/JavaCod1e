package file;
import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;


@WebFilter("/*")
public class FilterLogin implements Filter {

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        HttpServletRequest req= (HttpServletRequest) servletRequest;

        //解决乱码
        utf(req);

        //判断访问路径是否和登录注册相关
        String[] urls={"login.jsp","loginService","loginServlet","login.html","brand.html"};
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

    private void utf(HttpServletRequest req) throws UnsupportedEncodingException {
        //1. POST解决乱码
        req.setCharacterEncoding("UTF-8");
        //  获取login
        String login= req.getParameter("login");
        System.out.println("login: "+login);



//        //2. GET解决乱码
//        //乱码原因: tomcat 进行URL解码，默认的字符集IS0-8859-1
//        //tomact8 之后没有这个问题,默认 utf-8
//        String nam="lan";
//        // URL编码:模拟一个utf-8数据进行
//        String encode= URLEncoder.encode(nam,"utf-8");
//        System.out.println(encode);
//        // URL解码
//        String dencode= URLDecoder.decode(nam,"ISO-8859-1");
//        // 转换为字节数据,编码
//        byte[] bytes=dencode.getBytes(StandardCharsets.ISO_8859_1);
////        for (byte b : bytes){
////            System.out.println(b+" ");
////        }
//        // 将字节数组转为字符串,解码
//        String s=new String(bytes, StandardCharsets.UTF_8);
//        System.out.println(s);
    }

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }


    @Override
    public void destroy() {

    }
}
