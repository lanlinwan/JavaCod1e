package mapper;

import mybatis.user;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

public class insert {
    public static void main(String[] args) throws IOException {
        //加教mybatis的核心配置 文件，获取SqlSessionFactory
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqLSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);


        //获取SqlSessionFactory对象,用于执行sql
        SqlSession sqlSession=sqLSessionFactory.openSession();

        //获取mapper 接口代理对象
        UserMapper userMapper=sqlSession.getMapper(UserMapper.class);


        //接收参数
        String name="LAN";
        int age=22;
        String contact="18107966039";
        String hobby="play";
        //封装对象
        user user1=new user();
       // user1.setId(id);
        user1.setName(name);
        user1.setAge(age);
        user1.setContact(contact);
        user1.setHobby(hobby);

        //添加
        userMapper.add(user1);
        //主键返回
        Integer id=user1.getId();
        System.out.println(id);

        //提交事务
        sqlSession.commit();

        //释放资源
        sqlSession.close();

    }
}
