package service;

import mapper.FilterLoginMapper;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import login.login;
import util.SqlSessionUtils;

public class loginService {
    //利用工具类获取SqlSessionFactory
    SqlSessionFactory factory= SqlSessionUtils.getSqlSessionFactory();

    /**
     * 登录方法
     * @param loginName
     * @param loginPwd
     * @return
     */
    public login select(String loginName,String loginPwd){

        //获取SqlSession
        SqlSession sqlSession=factory.openSession();
        //获取 todoMapper接口
        FilterLoginMapper mapper=sqlSession.getMapper(FilterLoginMapper.class);
        //调用方法
        login login=mapper.select(loginName,loginPwd);

        sqlSession.close();

        return  login;
    }
}
