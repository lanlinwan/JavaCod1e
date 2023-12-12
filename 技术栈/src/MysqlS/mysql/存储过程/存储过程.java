package MysqlS.mysql.存储过程;

public class 存储过程 {

    //●介绍
    //存储过程是事先经过编译并存储在数据库中的一段SQL语句的集合,调用存储过程可以简化应用开发人员的很多工作,
    //减少数据在数据库和应用服务器之间的传输，对于提高数据处理的效率是有好处的。
    //存储过程思想.上很简单，就是数据库SQL语言层面的代码封装与重用。

    //●特点
    // 封装,复用
    // 可以接受参数,返回数据
    // 减少网络交互,效率提升



    /*
        创建:
        create procedure p1()
        begin
          select count(*) from student;
        end;
        注意:在命令行中，执行创建存储过程的SQL时,需要通过关键字delimiter $$ 指定SQL语句的结束符为 $$。


        调用:
        call p1();

        查看:
        select * from
        show create procedure 存储过程名称;

        删除:
        drop procedure [if exists] 存储过程名称;

     */
}
