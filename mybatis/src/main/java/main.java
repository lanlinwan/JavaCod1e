import mapper.UserMapper;
import pojo.user;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class main {
    public static void main(String[] args) throws IOException {
        //1.加教mybatis的核心配置 文件，获取SqlSessionFactory
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqLSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);


        //2.获取SqlSessionFactory对象,用于执行sql
        //MyBatis事务:
        // openSession(): 默认开启事务,进行增删改操作后需要使用sqISession.commit();手动提交事务
        // openSession(true): 可以设置为自动提交事务(关闭事务)
        SqlSession sqlSession=sqLSessionFactory.openSession();

        //3.执行sql
        //List<user> users=sqlSession.selectList("test.selectAll");
        //3.1 获取mapper 接口代理对象
        UserMapper userMapper=sqlSession.getMapper(UserMapper.class);

        //4. 查询所有
        List<user> users=userMapper.selectAll();
        System.out.println(users);

        //4.1 id 查询
        user usersId=userMapper.selectById(1);
        System.out.println(usersId);

        //4.2条件查询
        //接收参数
        int id=1;
        String name="cai";
        int age=22;
        //处理参数
        name="%"+name+"%";
        //4.2.1 散装参数
        //List<user> userCon=userMapper.selectByCondition(id,name,age);

        //封装对象
        user user1=new user();
        user1.setId(id);
        user1.setName(name);
        user1.setAge(age);
        //4.2.2  对象参数
        //List<user> userCon=userMapper.selectByCondition(user1);

        //map
        Map map=new HashMap();
        map.put("id",id);
        map.put("name",name);
        //map.put("age",age);
        //4.2.3  map集合参数
        List<user> userCon=userMapper.selectByCondition(map);

        System.out.println(userCon);

        //4.3 单动态条件查询
        user user2=new user();
        user2.setId(id);
        List<user> userConSingle=userMapper.selectByConditionSingle(user2);
        System.out.println(userConSingle);

        //5.释放资源
        sqlSession.close();
    }
}
