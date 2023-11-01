package mapper;

import login.login;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
public interface loginMapper {
    /**
     * 根据用户名与密码查询用户对象
     * @param loginName
     * @param loginPwd
     * @return
     */
    @Select("select * from login where loginName =#{loginName} and loginPwd=#{loginPwd}")
    login select(@Param("loginName") String loginName,@Param("loginPwd") String loginPwd);

    /**
     * 根据用户名查询用户对象
     * @param loginName
     * @return
     */
    @Select("select * from login where loginName=#{loginName}")
    login selectByLoginName(String loginName);

    /**
     * 添加用户
     * @param login
     */
    @Insert("insert into login values(null,#{loginName},#{loginPwd})")
    void add(login login);
}
