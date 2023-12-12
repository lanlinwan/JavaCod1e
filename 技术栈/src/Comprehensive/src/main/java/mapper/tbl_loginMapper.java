package Comprehensive.src.main.java.mapper;

import Comprehensive.src.main.java.pojo.tbl_login;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

public interface tbl_loginMapper {

    @Select("select password  from tbl_login where email=#{email} ")
    String selectlogin(tbl_login login);

    @Select("select  * from tbl_login  where email=#{email}")
    tbl_login selectone(String email);

    @Insert("insert into tbl_login values(null,#{email},#{password})")
    void inster(tbl_login login);
}
