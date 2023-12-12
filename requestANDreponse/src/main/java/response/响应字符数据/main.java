package response.响应字符数据;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

//响应字符数据;设置字符数据响应体
@WebServlet("/req8")
public class main extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("req8");
        //设置响应数据格式,字符集
        resp.setContentType("text/html;charset=utf-8");
        //1.获取字符输出流
        PrintWriter writer=resp.getWriter();
        //
        resp.setHeader("content-type","text/html");
        writer.write("aaaa");
        writer.write("<h1>aaaa<h1>");

        //细节:流不需要关闭
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doGet(req,resp);
    }
}
