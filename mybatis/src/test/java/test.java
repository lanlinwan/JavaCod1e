import mapper.UserMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;

public class test {
    UserMapper userMapper;
    InputStream inputStream = null;
    SqlSession sqlSession;

   {
        String resource = "mybatis-config.xml";
        try {
            inputStream = Resources.getResourceAsStream(resource);
        } catch (IOException e) {
            e.printStackTrace();
        }
        SqlSessionFactory sqLSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
         sqlSession=sqLSessionFactory.openSession();
        userMapper=sqlSession.getMapper(UserMapper.class);
    }

    @Test
    public void a(){
        System.out.println(userMapper.selectByLike("lan"));
    }

    @After
    public void c() throws IOException {
        inputStream.close();
        sqlSession.close();
    }
}
