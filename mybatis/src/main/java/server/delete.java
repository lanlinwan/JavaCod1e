package server;

import mapper.UserMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

public class delete {
    public static void main(String[] args) throws IOException {
        //加教mybatis的核心配置 文件，获取SqlSessionFactory
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqLSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);


        //获取SqlSessionFactory对象,用于执行sql
        SqlSession sqlSession=sqLSessionFactory.openSession();

        //获取mapper 接口代理对象
        UserMapper userMapper=sqlSession.getMapper(UserMapper.class);



        int id=5;

        //删除
         userMapper.deleteById(id);
        //批量删除
        int[] ids={4,6};
       // userMapper.deleteByIds(ids);


        //提交事务
        sqlSession.commit();

        //释放资源
        sqlSession.close();

    }
}
