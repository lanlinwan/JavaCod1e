package mapper;
import org.apache.ibatis.annotations.Mapper;
import pojo.user;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;
import java.util.Map;

@Mapper
public interface UserMapper {
    //查询所有
    List<user>  selectAll();
    //查看详情
    //注解配置
    @Select("select * from user where id = #{id}")
    user selectById(int id);
    //条件查询
    //1. 散装参数:如果方法中有多个参数,需要使用 @Param("SQL参数占位符名称")
    //2. 对象参数:SQL的参数名 和 对象的属性名名称 对应的上
    //3. map集合参数:SQL参数名 和 Map集合键的名称 对应的上
    List<user> selectByCondition(@Param("id") int ids,@Param("name") String name,@Param("age") int age);
    List<user> selectByCondition(user user);
    List<user> selectByCondition(Map map);

    //一对多
    user SelectBook(int i);

    //一对一
    user SelectBookOne(int i);


    //单条件动态查询
    List<user> selectByConditionSingle(user user);

    //动态设置表名
    List<user> getAllUser(@Param("tablesuser") String tables);


    //模糊查询
    List<user> selectByLike(@Param("username")String user);

    //添加 主键返回
    void add(user user);

    //批量添加
    void addList(List<user> Listaa);

    //修改
    int update(user user);

    //删除
    void deleteById(int id);

    //批量删除
    // <foreach collection="array"> 默认
    //void deleteByIds(int[] idarr);
    void deleteByIds(@Param("ids")int[] idarr);

    //批量删除 传string
    void deleteByIdstr(@Param("ids")String ids);




    //分页
    /*
        limit index, pageSize
        index:当前页的起始索引
        pageSize:每页显示的条数
        pageNum:当前页的页码
        index= (pageNum- 1) *pageSize
     */




}
