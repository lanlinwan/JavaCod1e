package web;

import login.login;
import service.loginService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;


@WebServlet("/loginServlet")
public class loginServlet extends HttpServlet {
    private loginService service=new loginService();
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //获取用户密码
        String loginName=request.getParameter("loginName");
        String loginPwd=request.getParameter("loginPwd");

        //获取复选框数据
        String remember=request.getParameter("remember");

        //调用Service 查询
        login login =service.select(loginName,loginPwd);

        //判断
        if(login !=null){


            //将登陆成功的对象,存储到Session中
            HttpSession session=request.getSession();
            session.setAttribute("login",login);

            request.getRequestDispatcher("/index.jsp").forward(request,response);
        }else {

            //登陆失败
            //存储错误信息到requset
            request.setAttribute("login-msg","用户名或密码错误");
            //跳转到login.jsp
            request.getRequestDispatcher("/login.jsp").forward(request,response);
        }

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doGet(request, response);
    }
}

