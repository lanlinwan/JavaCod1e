package service;

import mapper.todoMapper;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import pojo.todo;
import uitil.SqlSessionUtils;

import java.util.List;

public class todoService {
    //利用工具类获取SqlSessionFactory
    SqlSessionFactory factory= SqlSessionUtils.getSqlSessionFactory();

    /**
     * 查询所有
     * @return
     */
    public List<todo> selectAll(){

        //获取SqlSession
        SqlSession sqlSession=factory.openSession();
        //获取 todoMapper接口
        todoMapper mapper=sqlSession.getMapper(todoMapper.class);
        //调用方法
        List<todo> todos=mapper.selectAll();

        sqlSession.close();

        return  todos;
    }
}
