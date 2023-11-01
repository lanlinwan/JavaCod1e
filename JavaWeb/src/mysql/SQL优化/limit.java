package mysql.SQL优化;

public class limit {
    //limit优化:
    //一个常见又非常头疼的问题就是limit 2000000,10，此时需要MySQL排序前2000010记录,仅仅返回2000000 - 2000010
    //的记录，其他记录丢弃,查询排序的代价非常大。
    //优化思路: -般分页查询时,通过创建覆盖索引能够比较好地提高性能，可以通过覆盖索引加子查询形式进行优化。
    //explain select t.* from tb_ sku t，(select id from tb_ sku order by id limit 2000000,10) a where t.id = a.id;
}
