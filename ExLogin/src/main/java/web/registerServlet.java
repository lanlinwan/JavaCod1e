package web;

import login.login;
import mapper.loginMapper;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import util.SqlSessionUtils;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet("/registerServlet")
public class registerServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //1.接收用户数据
        String loginName=request.getParameter("loginName");
        String loginPwd=request.getParameter("loginPwd");
        //封装用户对象
        login login=new login();
        login.setLoginName(loginName);
        login.setLoginPwd(loginPwd);

        //调用mapper 根据用户名查询
        SqlSessionFactory sqlSessionFactory= SqlSessionUtils.getSqlSessionFactory();
        //2.2 获取SqlSession
        SqlSession sqlSession=sqlSessionFactory.openSession();
        //2.3 获取Mapper
        loginMapper loginMapper=sqlSession.getMapper(loginMapper.class);

        //2.4 调用方法
        login l=loginMapper.selectByLoginName(loginName);

        //3.判断用户对象是否为null
        if (l == null){
            //用户名不存在,添加
            loginMapper.add(login);
            //提交事务
            sqlSession.commit();
            //释放资源
            sqlSession.close();
        }else {
            //存在
            response.setContentType("text/html;charset=utf-8");
            response.getWriter().write("用户名已存在");
        }


    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doGet(request, response);
    }
}
