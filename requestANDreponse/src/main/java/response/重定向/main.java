package response.重定向;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
@WebServlet("/req6")
public class main extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("req6");
        //重定向:

        //1.设置状态码 302
       // resp.setStatus(302);
        //2.设置响应头
       // resp.setHeader("Location","/tomact-demo1/req7");

        //简化写法
        //动态获取虚拟目录
        String path=req.getContextPath();
        resp.sendRedirect(path+"/req7");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doGet(req,resp);
    }
}
