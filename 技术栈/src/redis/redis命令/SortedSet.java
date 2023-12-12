package redis.redis命令;

public class SortedSet {
    /*
        SortedSet类型
    Redis的SortedSet是- -个可排序的set集合,与Java中的TreeSet有些类似，但底层数据结构却差别很大。SortedSet中
    的每一个元素都带有- -个score属性,可以基于score属性对元素排序，底层的实现是一-个跳表( SkipList)加hash表。
    SortedSet具备下列特性:
    ●可排序
    ●元素不重复
    ●查询速度快
    因为SortedSet的可排序特性,经常被用来实现排行榜这样的功能。

    SortedSet的常见命令有:
    ●ZADD key score member:添加一-个或多个元素到sorted set，如果已经存在则更新其score值
    ●ZREM key member:删除sorted set中的一-个指定元素
    ●ZSCORE key member :获取sorted set中的指定元素的score值
    ●ZRANK key member:获取sorted set中的指定元素的排名
    ●ZCARD key:获取sorted set中的元素个数
    ●ZCOUNT key min max:统计score值在给定范围内的所有元素的个数
    ●ZINCRBY key increment member:让sorted set中的指定元素自增，步长为指定的increment值
    ●ZRANGE key min max:按照score排序后，获取指定排名范围内的元素
    ●ZRANGEBYSCORE key min max:按照score排序后，获取指定score范围内的元素
    ●ZDIFF、 ZINTER、ZUNION:求差集、交集、并集




     */
}
