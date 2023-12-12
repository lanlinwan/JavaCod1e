package mapper;


import org.apache.ibatis.annotations.Insert;
import pojo.Item;

/**
 * <p>
 * 商品表 Mapper 接口
 * </p>
 *
 * @author 虎哥
 * @since 2023-05-05
 */
public interface ItemMapper  {


    @Insert("insert into item(id,name,price) value(#{id},#{name},#{price}) ")
    void insert1000(Item item);
}
