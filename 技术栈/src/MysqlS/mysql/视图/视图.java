package MysqlS.mysql.视图;

public class 视图 {
    //视图:
    //●介绍
    //  视图(View) 是一种虚拟存在的表。视图中的数据并不在数据库中实际存在,
    //  行和列数据来自定义视图的查询中使用的表,并且是在使用视图时动态生成的。
    //通俗的讲，视图只保存了查询的SQL逻辑,不保存查询结果。所以我们在创建视图的时候，主要的工作就落在创建这条SQL查询语句上。

    //●作用
    //➢简单
    //  视图不仅可以简化用户对数据的理解,也可以简化他们的操作。那些被经常使用的查询可以被定义为视图,
    //  从而使得用户不必为以后的操作每次指定全部的条件。
    //➢安全
    //  数据库可以授权,但不能授权到数据库特定行和特定的列上。通过视图用户只能查询和修改他们所能见到的数据
    //➢数据独立
    //  视图可帮助用户屏蔽真实表结构变化带来的影响。

    //创建:
    //create [or replace] view 视图名 as select 语句
    //后面加上 with cascaded check option,自动g'xing

    //查询:
    //查看创建视图语句: show create view 视图名称;
    //查看视图数据:   select * from 视图名称...;

    //修改:
    //1. create [or replace] view 视图名[(列表名称)] as select 语句
    //2. alert view 视图名[(列表名称)] as select 语句

    //删除:
    //drop view[if exists] 视图名

    //●视图的检查选项:
    //  当使用WITH CHECK OPTION子句创建视图时, MySQL会通过视图检查正在更改的每个行,例如插入，更新,删除，以使其符合视图的定
    //义。MySQL 允许基于另-一个视图创建视图,它还会检查依赖视图中的规则以保持一致性。 为了确定检查的范围, mysql提供了两个选项:
    //CASCADED和LOCAL，默认值为CASCADED。
    //CASCADED :
    // create view v1 as select id,  name from student where id <= 20 with cascaded check option ;
    // create view v2 as select id , name from v1 where id>= 10 with cascaded check option ;
    // create view v3 as select id , name from v2 where id <= 15

    //LOCAL :
    //create view v1 as select id,name from student where id <= 15
    //create view v2 as select id，name from v1 where id >= 10 with local check option ;
    //create view v3 as select id , name from v2 where id < 20

    //加了local只递归检查local。加CASCADED是只要递归都检查

    //●视图的更新
    //要使视图可更新，视图中的行与基础表中的行之间必须存在一对一的关系。如果视图包含以下任何一项,则该视图不可更新:
    //1.聚合函数或窗口函数 (SUM()、MIN()、 MAX()、 COUNT()等 )
    //2. DISTINCTDE
    //3. GROUP BY
    //4. HAVING
    //5. UNION 或者UNION ALL


}
