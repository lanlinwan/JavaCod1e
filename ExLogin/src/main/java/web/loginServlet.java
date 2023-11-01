package web;

import login.login;
import mapper.loginMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;

@WebServlet("/loginServlet")
public class loginServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        //1.接收用户名密码
        String loginName = request.getParameter("loginName");
        String loginPwd = request.getParameter("loginPwd");

        //2.调用MyBatis完成查询
        //2.1 获取SqlSessionFactory对象
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        //2.2 获取SqlSession
        SqlSession sqlSession=sqlSessionFactory.openSession();
        //2.3 获取Mapper
        loginMapper loginMapper=sqlSession.getMapper(loginMapper.class);
        //2.4调用方法
         login login=loginMapper.select(loginName,loginPwd);
        //2.5 释放资源
        sqlSession.close();

        //获取字符输出流,并设置content type
        response.setContentType("text/html;charset=utf-8");
        PrintWriter write=response.getWriter();
        //3.判断
        if (login !=null){
            //成功
            write.write("登陆成功");
        }else {
            //失败
            write.write("登陆失败");
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doGet(request, response);
    }
}
