package mapper;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import pojo.books;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class 分页插件 {
    public static void main(String[] args) throws IOException {
        //加教mybatis的核心配置 文件，获取SqlSessionFactory
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqLSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        //获取SqlSessionFactory对象,用于执行sql
        SqlSession sqlSession=sqLSessionFactory.openSession();
        //获取mapper 接口代理对象
        booksMapper booksMapper=sqlSession.getMapper(booksMapper.class);

        /*
            limit index, pageSize

             index:当前页的起始索引
             pageNum:当前页的页码
             pageSize:每页显示的条数

              index=(pageNum-1) *pageSize

            使用MyBatis的分页插件实现分页功能:
            1,需要在查询功能之前开启分页
            PageHelper.startPage(int pageNum, int pageSize);
            2、在查询功能之后获取分页相关信息
            PageInfo<Emp> page = new PageInfo<>(list, 5);
            list表示分页数据.
            5表示当前导航分页的数量
         */
//        PageHelper.startPage(6,4);
//        List<books> list=booksMapper.selectPage();
//        PageInfo<books> page=new PageInfo<>(list,5);
//        System.out.println(page);
    }
}
