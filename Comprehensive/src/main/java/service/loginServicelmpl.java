package service;


import mapper.tbl_loginMapper;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import pojo.tbl_login;
import util.SqlSessionUtils;


public class loginServicelmpl {
    SqlSessionFactory factory = SqlSessionUtils.getSqlSessionFactory();

    public  String selectlogin(tbl_login login) {
        //2. 获取
        SqlSession sqlSession = factory.openSession();
        //3.获取BrandMapper
        tbl_loginMapper mapper = sqlSession.getMapper(tbl_loginMapper.class);
        //4.调用方法
        String password = mapper.selectlogin(login );
        //5.释放资源
        sqlSession.close();

        return password;
    }


    public tbl_login selectone(String email) {
        //2. 获取
        SqlSession sqlSession = factory.openSession();
        //3.获取BrandMapper
        tbl_loginMapper mapper = sqlSession.getMapper(tbl_loginMapper.class);
        //4.调用方法
        tbl_login list = mapper.selectone(email);
        //5.释放资源
        sqlSession.close();

        return list;
    }

    public void inster(tbl_login login) {
        //2. 获取
        SqlSession sqlSession = factory.openSession();
        //3.获取BrandMapper
        tbl_loginMapper mapper = sqlSession.getMapper(tbl_loginMapper.class);
        //4.调用方法
         mapper.inster(login);
        //5.提交事务
        sqlSession.commit();
        //6.释放资源
        sqlSession.close();

    }

}
