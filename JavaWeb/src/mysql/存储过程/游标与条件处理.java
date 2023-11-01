package mysql.存储过程;

public class 游标与条件处理 {
    //游标:
    //游标(CURSOR) 是用来存储查询结果集的数据类型,在存储过程和函数中可以使用游标对结果集进行循环的处理。游标的使用包括游标
    //的声明、OPEN、 FETCH和CLOSE，其语法分别如下。
    //➢声明游标
    //  declare 游标名称 cursor for 查询语句;
    //➢打开游标 .
    //  open 游标名称;
    //➢获取游标记录
    //  fetch 游标名称 into 变量,变量;
    //➢关闭游标
    //  close 游标名称;

    //●条件处理程序 .
    //条件处理程序(Handler) 可以用来定义在流程控制结构执行过程中遇到问题时相应的处理步骤。
    /*
        --user
        create procedure p11(in uage int)
        begin
             declare  uname varchar(100);
             declare  uage varchar(100);
             declare  u-user cursor for select name,age from user where age >= uage;
             declare  exit handle for SQLSTATE '02000'(not found) close u-user;

             drop tables if exists tb_name_age;--先删除表
             create table if not exists tb_name_age(--再创建表
                  id int primary key auto_increment,
                  name varchar(100),
                  age  varchar(100)
             );

             open u-user;
             while true do
                fetch u-user into name,age;
                insert into tb_name_age values(null,name,age);

             end while;
             close  u-user
          end

        call p11(15);
     */
}
