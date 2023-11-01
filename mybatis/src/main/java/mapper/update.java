package mapper;

import mybatis.user;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

public class update {
    public static void main(String[] args) throws IOException {
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqLSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

        SqlSession sqlSession=sqLSessionFactory.openSession();

        UserMapper userMapper=sqlSession.getMapper(UserMapper.class);

        //接收参数
        int id=1;
        String name="yun";
        int age=45;
        String contact="18107966039";
        String hobby="play";
        //封装对象
        user user1=new user();
        user1.setId(id);
        user1.setName(name);
        user1.setAge(age);
        user1.setContact(contact);
        user1.setHobby(hobby);

        //修改
        int count= userMapper.update(user1);
        System.out.println(count);

        //提交事务
        sqlSession.commit();

        //释放资源
        sqlSession.close();

    }
}
