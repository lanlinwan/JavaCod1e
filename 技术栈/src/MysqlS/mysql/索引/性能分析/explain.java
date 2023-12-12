package MysqlS.mysql.索引.性能分析;

public class explain {
    //●explain执行计划
    // EXPLAIN或者DESC命令获取MySQL如何执行SELECT语句的信息,包括在SELECT语句执行过程中表如何连接和连接的顺序。
    //语法:
    // #直接在select语句之前加.上关键字explain或者desc
    //  EXPLAIN SELECT 字段列表FROM表名WHERE 条件;

    //  EXPLAIN执行计划各字段含义:
    //  ➢id:
    //    select查询的序列号，表示查询中执行select子句或者是操作表的顺序(id相同,执行顺序从上到下; id不同，值越大，越先执行)。
    //  ➢select_type:
    //   表示SELECT的类型，常见的取值有SIMPLE (简单表,即不使用表连接或者子查询)、PRIMARY (主查询，即外层的查询)、
    //   UNION (UNION中的第二个或者后面的查询语句)、SUBQUERY ( SELECT/WHERE之后包含了子查询)等
    //  ➢type:
    //   表示连接类型,性能由好到差的连接类型为system > const > eq_ref > ref > range > index > ALL
    //  ➢possible_ key:
    //   显示可能应用在这张表上的索引，一个或多个。
    //  ➢Key:
    //   实际使用的索引，如果为NULL,则没有使用索引。
    //  ➢Key_len:
    //   表示索引中使用的字节数，该值为索引字段最大可能长度,并非实际使用长度,在不损失精确性的前提下，长度越短越好。
    //  ➢rows:
    //   MySQL认为必须要执行查询的行数,在innodb引擎的表中，是一一个估计值，可能并不总是准确的。
    //  ➢filtered:
    //   表示返回结果的行数占需读取行数的百分比，filtered 的值越大越好。
    //  ➢extra:
    //    额外的查询信息
    //     Using where 条件查询
    //     Using index 覆盖索引


    //type:
    //ALL：全表扫描，表示MySQL将扫描整个表来找到匹配的行。
    //     这是最慢的访问方式，通常在没有使用索引或无法使用索引时出现。

    //index：索引全扫描，表示MySQL将扫描整个索引来找到匹配的行。
    //      与全表扫描相比，索引全扫描只需要读取索引数据而不需要读取实际的表数据，因此通常比全表扫描快。

    //range：范围扫描，表示MySQL使用索引来查找满足范围条件的行。
    //      例如，使用BETWEEN、IN、>、<等条件进行查询时，MySQL可能选择范围扫描。

    //index_merge：索引合并，表示MySQL使用多个索引来合并结果。
    //      当查询条件中涉及多个索引时，MySQL可能会使用索引合并来获取结果。

    //unique：唯一索引扫描，表示MySQL使用唯一索引来查找匹配的行。
    //       这通常发生在使用主键或唯一索引进行查询时。

    //const：常量查找，表示MySQL在查询时使用常量值进行查找。
    //      这通常发生在使用主键或唯一索引进行等值查询时。

    //system：系统表扫描，表示MySQL在系统表中进行扫描。
    //      这通常是在查询系统表或INFORMATION_SCHEMA表时出现。

    //NULL：表示MySQL无法确定访问方式，可能是由于查询语句的复杂性或其他因素导致。

    //需要注意的是，type列的值并不是互斥的，一个查询可能涉及多个访问方式的组合。
    // 在分析执行计划时，我们通常希望尽量避免全表扫描和索引全扫描，
    // 而是倾向于使用范围扫描、唯一索引扫描或常量查找等更高效的访问方式。
}
