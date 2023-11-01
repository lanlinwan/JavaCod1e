package request.请求转发;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

//请求转发(forward):-种在服务 器内部的资源跳转方式
@WebServlet("/req4")
public class main extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("get");

        //存储数据
        req.setAttribute("msg","hello");

        //请求转发
        req.getRequestDispatcher("/req5").forward(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
       this.doGet(req,resp);
    }
}
