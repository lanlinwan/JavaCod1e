package web.serevlet;

import com.alibaba.fastjson.JSON;
import pojo.Brand;
import pojo.tbl_login;
import service.loginServicelmpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.List;

@WebServlet("/register/*")
public class register extends BaseServlet{
    loginServicelmpl  loginServicelmpl=new loginServicelmpl();



    public void regin(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        request.setCharacterEncoding("UTF-8");
        //获取用户名和密码
        String email=request.getParameter("email");
        String password=request.getParameter("password");


        tbl_login login=new tbl_login();
        login.setEmail(email);
        login.setPassword(password);

        tbl_login register=loginServicelmpl.selectone(email);
        System.out.println(register);
        //判断用户名密码是否正确（这里只做简单讲解）
        if(register!=null){
            //否则重定向到登录界面，并提示用户用户名或密码错误
            response.getWriter().write("sb");
        }else{
            //如果用户名密码正确，则请求转发到登录成功页面
            loginServicelmpl.inster(login);
            response.getWriter().write("success");
//            response.setHeader("Access-Control-Allow-Origin","*");
//            response.sendRedirect( "brand.html");
        }



    }




}
