package web.serevlet;


import pojo.tbl_login;
import service.loginServicelmpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet("/login/*")
public class loginServlet extends BaseServlet {
    service.loginServicelmpl loginServicelmpl=new loginServicelmpl();

    public void login(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //设置请求发来的字符集，避免乱码
        request.setCharacterEncoding("UTF-8");
        //获取用户名和密码
        String email=request.getParameter("email");
        String password=request.getParameter("password");
        //System.out.println(email+password);

        tbl_login login=new tbl_login();
        login.setEmail(email);
        login.setPassword(password);

        String password1=loginServicelmpl.selectlogin(login);
//        System.out.println(password1.equals(password));
        //判断用户名密码是否正确（这里只做简单讲解）
        if(password.equals(password1)){
            //如果用户名密码正确，则请求转发到登录成功页面
            //将登陆成功的对象,存储到Session中
            HttpSession session=request.getSession();
            session.setAttribute("login",login);
            response.getWriter().write("success");
        }else{
            //否则重定向到登录界面，并提示用户用户名或密码错误
            response.getWriter().write("sb");
        }

    }





    }
