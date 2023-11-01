package mysql.管理;

public class mysqlshow {
    /*
    ●mysql show
    mysql show客户端对象查找工具，用来很快地查找存在哪些数据库、数据库中的表、表中的列或者索引。.
    语法:
        mysqlshow [options] [db_ name [table_ name [col namel]]
    选项:
    --count  显示数据库及表的统计信息(数据库，表均可以不指定)
    i        显示指定数据库或者指定表的状态信息(加在末尾)
    示例:
        #查询每个数据库的表的数量及表中记录的数量
          mysqlshow -uroot -p2143 --count
        #查询test库中每个表中的字段书，及行数
          mysqlshow -uroot -p2143 test --count
        #查询test库中book表的详细情况
          mysqlshow -uroot -p2143 test book --count

     */
}
