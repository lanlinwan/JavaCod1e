package MysqlS.mysql.存储过程;

public class 变量 {
    //●变量

    //●系统变量是MySQL服务器提供,不是用户定义的，属于服务器层面。
    //分为全局变量(GLOBAL)、会话变量(SESSION) 。
    /*
    ➢查看系统变量
      SHOW [ SESSION |GLOBAL ] VARIABLES ;         --查看所有系统变量
      SHOW [ SESSION |GLOBAL ] VARIABLES LIKE'...';--可以通过LKE模糊匹配方式查找变量
      SELECT @@[SESSION|GLOBAL].系统变量名;           --查看指定变量的值

    ➢设置系统变量
      SET [SESSION|GLOBAL]系统变量名=值;
      SET @@[SESSION|GLOBAL]系统变量名=值;
    注意:
      如果没有指定SESSION/GLOBAL,默认是SESSION,会话变量。
      mysql服务重新启动之后,所设置的全局参数会失效,要想不失效，可以在/etc/my.cnf中配置。

     */

    //●用户变量
    /*
    用户定义变量是用户根据需要自己定义的变量，用户变量不用提前声明，
    在用的时候直接用"@变量名”使用就可以。其作用域为当前连接。

    ➢赋值
    SET @name = expr [ @name = expr]...;
    SET @name:= expr [ @name = expr]....;
    SELECT @name := expr [ @name = expr]...;
    SELECT 字段名 into @name from 表名;

    ➢使用.
    SELECT @name ;

    注意:
        用户定义的变量无需对其进行声明或初始化，只不过获取到的值为NULL。

     */

    //●局部变量
    /*
    -- 变量:局部变量
    --声明- declare
    --赋值-
    create procedure p2()
    begin
         declare stu_count int default 0; .
         select count(*) into stu_count from student;
         select stu_count;
    end;

    call p2();


     */


}
