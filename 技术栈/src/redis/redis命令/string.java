package redis.redis命令;

public class string {
    /*
        String类型
        String类型，也就是字符串类型，是Redis中最简单的存储类型。
        其value是字符串，不过根据字符串的格式不同，又可以分为3类:
        ●string: 普通字符串
        ●int: 整数类型，可以做自增、自减操作
        ●float: 浮点类型，可以做自增、自减操作
        不管是哪种格式，底层都是字节数组形式存储，只不过是编码方式不同。字符串类型的最大空间不能超过512m.
        KEY           VALUE
        msg           hello world
        num           10
        score         92.5


         String的常见命令有:
        ●SET: 添加或者修改已经存在的- -个String类型的键值对
        ●GET:根据key获取String类型的value
        ●MSET: 批量添加多个String类型的键值对
        ●MGET: 根据多个key获取多个String类型的value
        ●INCR: 让--个整型的key自增1
        ●INCRBY:让--个整型的key自增并指定步长，例如: incrby num 2让num值自增2
        ●INCRBYFLOAT: 让一个浮点类型的数字自增并指定步长
        ●SETNX:添加一个String类型的键值对，前提是这个key不存在,否则不执行
        ●SETEX: 添加一个String类型的键值对，并且指定有效期

     */
}
