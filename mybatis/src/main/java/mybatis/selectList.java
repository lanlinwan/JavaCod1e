package mybatis;

import mapper.UserMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import pojo.user;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class selectList {
    public static void main(String[] args) throws IOException {
        //1.加教mybatis的核心配置 文件，获取SqlSessionFactory
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqLSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);


        //2.获取SqlSessionFactory对象,用于执行sql
        SqlSession sqlSession=sqLSessionFactory.openSession();

        //3.执行sql
        UserMapper userMapper=sqlSession.getMapper(UserMapper.class);
//        user users= userMapper.SelectBook(1);
//        System.out.println(users);

        user user= userMapper.SelectBookOne(1);
        System.out.println(user);




        //4.释放资源
        sqlSession.close();
    }
}
