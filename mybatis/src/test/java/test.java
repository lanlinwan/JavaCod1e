import mapper.UserMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;

public class test {
    UserMapper userMapper;
    {
        String resource = "mybatis-config.xml";
        InputStream inputStream = null;
        try {
            inputStream = Resources.getResourceAsStream(resource);
        } catch (IOException e) {
            e.printStackTrace();
        }
        SqlSessionFactory sqLSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession sqlSession=sqLSessionFactory.openSession();
        userMapper=sqlSession.getMapper(UserMapper.class);
    }
    @Test
    public void a(){
        userMapper.selectByLike("lan");
    }
}
