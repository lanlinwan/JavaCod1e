package web;

import pojo.todo;
import service.todoService;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/selectAllServlet")
public class selectAllServlet extends HttpServlet {
    private todoService service=new todoService();
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //1.调用BrandService

        List<todo> todos = service.selectAll();
        System.out.println(todos);

        //2.存入requset域中
        request.setAttribute("todos",todos);
        //3.转发
        try {
            request.getRequestDispatcher("/todo.html").forward(request,response);
        } catch (ServletException e) {
            e.printStackTrace();
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doGet(request, response);
    }
}
