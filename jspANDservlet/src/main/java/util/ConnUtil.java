package util;


import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

public class ConnUtil {

  static public SqlSession conn(){
      //1.加教mybatis的核心配置 文件，获取SqlSessionFactory
      String resource = "mybatis-config.xml";
      InputStream inputStream = null;
      try {
          inputStream = Resources.getResourceAsStream(resource);
      } catch (IOException e) {
          e.printStackTrace();
      }
      SqlSessionFactory sqLSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

      //2.获取SqlSessionFactory对象,用于执行sql
      //MyBatis事务:
      // openSession(): 默认开启事务,进行增删改操作后需要使用sqISession.commit();手动提交事务
      // openSession(true): 可以设置为自动提交事务(关闭事务)
      SqlSession sqlSession=sqLSessionFactory.openSession(false);
      return sqlSession;
  }

}
