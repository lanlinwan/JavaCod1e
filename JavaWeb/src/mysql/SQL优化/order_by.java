package mysql.SQL优化;

public class order_by {
    //order-by优化:
    //①. Using filesort :通过表的索引或全表扫描,读取满足条件的数据行，然后在排序缓冲区sort buffer中完成排序操作,
    //   所有不是通过索引直接返回排序结果的排序都叫FileSort 排序。
    //②. Using index :通过有序索引顺序扫描直接返回有序数据,这种情况即为using index,不需要额外排序,操作效率高。

    //➢根据排序字段建立合适的索引，多字段排序时，也遵循最左前缀法则。
    //➢尽量使用覆盖索引。
    //➢多字段排序,一个升序一个降序，此时需要注意联合索引在创建时的规则(ASC/DESC)。
    //➢如果不可避免的出现filesort,大数据量排序时，可以适当增大排序缓冲区大小sort__buffer__size(默认256k)。
}
