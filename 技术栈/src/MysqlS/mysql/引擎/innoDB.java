package MysqlS.mysql.引擎;

public class innoDB {
    //●InnoDB
    //➢介绍
    //  InnoDB是-种兼顾高可靠性和高性能的通用存储引擎,在MySQL 5.5之后, InnoDB是默认的MySQL存储引擎。
    //➢特点
    //  DML操作遵循ACID模型，支持事务;
    //  行级锁,提高并发访问性能;
    //  支持外键FOREIGN KEY约束,保证数据的完整性和正确性;
    //➢文件
    //  xxx.ibd: xxx代表的是表名，innoDB引擎的每张表都会对应这样一个表空间文件，存储该表的表结构(frm、 sdi) 、数据和索引。
    //  参数: innodb_ file_ per_ table

    /*
    1、事务
        MyISAM不支持
        InnoDB支持
    2、锁级别
        InnoDB  表级锁,行级锁
        MyISAM  表级锁
    3、行数
         MyISAM存储表的总行数
         InnoDB不存储总行数
    4、索引
         MyISAM采用非聚集索引，B+树叶子存储指向数据文件的指针
           MyISAM适合：插入不频繁，查询非常频繁，如果执行大量的SELECT，MyISAM是更好的选择， 没有事务。
         InnoDB主键索引采用聚集索引，B+树叶子存储数据
           可靠性要求比较高，或者要求事务；表更新和查询都相当的频繁， 大量的写操作
     */
}
