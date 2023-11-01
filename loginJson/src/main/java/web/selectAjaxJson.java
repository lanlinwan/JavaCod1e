package web;

import com.alibaba.fastjson.JSON;
import pojo.todo;
import service.todoService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;


@WebServlet("/selectAjaxJson")
public class selectAjaxJson extends HttpServlet {
    private todoService todoService=new  todoService();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //1. 调用Service 查询
        List<todo> todos=todoService.selectAll();
        //2.将集合转换为JSON数据  序列化
        String jsonString= JSON.toJSONString(todos);
        //3.响应数据
        resp.setContentType("text/json;charset=utf-8");
        resp.getWriter().write(jsonString);

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doGet(req,resp);
    }
}
