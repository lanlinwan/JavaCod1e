package redis.redis命令;

public class hash {
    /*
        Hash类型
        Hash类型,也叫散列，其value是一 个无序字典，类似于Java中的HashMap结构。
        String结构是将对象序列化为JSON字符串后存储,当需要修改对象某个字段时很不方便:

        Hash结构可以将对象中的每个字段独立存储，可以针对单个字段做CRUD:

                                 KEY
        VALUE              field     value
      heima:user:1          name      Jack
                            age        21
      heima:user:2          name       Rose
                            age        18



    Hash的常见命令有:
    ●HSET key field value:添加或者修改hash类型key的field的值
    ●HGET key field:获取一个hash类型key的field的值
    ●HMSET:  批量添加多个hash类型key的field的值
    ●HMGET:  批量获取多个hash类型key的field的值
    ●HGETALL:获取一个hash类型的key中的所有的field和value
    ●HKEYS:  获取一个hash类型的key中的所有的field
    ●HVALS:  获取一个hash类型的key中的所有的value
    ●HINCRBY:让一个hash类型key的字段值自增并指定步长
    ●HSETNX: 添加一个hash类型的key的field值，前提是这个field不存在，否则不执行









     */
}
