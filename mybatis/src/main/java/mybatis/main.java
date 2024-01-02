package mybatis;


import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import pojo.user;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class main {
    public static void main(String[] args) throws IOException {
        //1.加教mybatis的核心配置 文件，获取SqlSessionFactory
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqLSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);


        //2.获取SqlSessionFactory对象,用于执行sql
        SqlSession sqlSession=sqLSessionFactory.openSession();

        //3.执行sql
         List<user> users=sqlSession.selectList("mapper.UserMapper.selectAll");

        System.out.println(users);

        //4.释放资源
        sqlSession.close();
    }
}
