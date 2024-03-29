package MysqlS.mysql.索引;

public class 索引分类 {
    //索引分类
    //分类        含义                        特点                   关键字
    //主键索引   针对于表中主键创建的索引         默认自动创建，只能有一个   PRIMARY
    //唯一索引   避免同一个表中某数据列中的值重复  可以有多个               UNIQUE
    //常规索引   快速定位特定数据               可以有多个
    //全文索引   全文索引查找的是文本中的关键词，  可以有多个              FULLTEXT
    //         而不是比较索引中的值

    //在InnoDB存储引擎中，根据索引的存储形式，又可以分为以下两种:
    //分类                        含义                                             特点
    //聚集索引(Clustered Index)   索引结构的叶子节点存储有键值和数据行               必须有，而且只有一个
    //二级索引(Secondary Index)   索引结构的叶子节点存储的是键值和指向聚集索引的指针。  可以存在多个

    //回表查询:二级索引查询数据 当键值不满足查询要求,例进行 select* 查询数据时,
    //       需要根据对应的 主键索引 进行 回表查询
    //索引下推:mysql5.6 引入了索引下推，索引下推一定是在联合索引的情况下，根据联合索引本身就有的数据直接做一次过滤
    //       mysql中的索引下推 可以说是减少不必要的数据行返回
    //   传统的方式是先根据索引定位到符合索引条件的数据行，然后再将这些数据行读取到内存中进行过滤。
    //   这种方式可能导致不必要的数据行被读取到内存中，增加了IO和CPU开销。
    //   而索引下推优化则可以在存储引擎层面上进行过滤，只将符合索引条件的数据行读取到内存中，而不需要读取整个数据行。
    //   这样可以减少不必要的数据行返回，减少了IO和CPU开销，提高了查询性能。

    //聚集索引选取规则:
    //➢如果存在主键, 主键索引就是聚集索引。
    //➢如果不存在主键，将使用第一个唯一(UNIQUE) 索引作为聚集索引。
    //➢如果表没有主键， 或没有合适的唯一索引, 则InnoDB会自动生成一个rowid作 为隐藏的聚集索引。
}
