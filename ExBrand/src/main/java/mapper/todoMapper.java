package mapper;

import org.apache.ibatis.annotations.Select;
import pojo.todo;

import java.util.List;

public interface todoMapper {
    /**
     * 查询所有
     * @return
     */
    @Select("select  * from todo")
    List<todo> selectAll();

}
