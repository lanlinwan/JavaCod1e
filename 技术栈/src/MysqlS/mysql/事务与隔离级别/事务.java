package MysqlS.mysql.事务与隔离级别;

public class 事务 {
    //●事务
    //事务是一组操作的集合,它是一一个不可分割的工作单位，事务会把所有的操作作为- -个整体- -起向 系统提交或撤销操作请求,即这些操作
    //要么同时成功，要么同时失败。

    //start transaction --开启事务
    //commit/rollback   --提交/回滚事务

    //●特性 ACID
    //原子性(Atomicity) :事务是不可分割的最小操作单元，要么全部成功,要么全部失败。
    //一致性(Consistency) :事务完成时，必须使所有的数据都保持一致状态。
    //隔离性(Isolation) :数据库系统提供的隔离机制，保证事务在不受外部并发操作影响的独立环境下运行。
    //持久性(Durability) :事务- - 旦提交或回滚,它对数据库中的数据的改变就是永久的。

    //事务原理
    //原子性- undo log
    //持久性- redo log
    //一致性- undo log+redo log
    //隔离性- 锁 + MVCC


    //事务并发问题
    //问题         描述
    //脏读        个事务读到另外-一个事务还没有提交的数据,如果另一个事务在此后回滚了操作，那么第一个事务所读取到的数据就是无效的。
    //不可重复读   -个事务先后读取同-条记录，但两次读取的数据不同，称之为不可重复读。
    //幻读        一个事务按照条件查询数据时，没有对应的数据行，但是在插入数据时，又发现这行数据已经存在，好像出现了”幻影

    //不可重复读和脏读的区别是：
    //     脏读是读到未提交的数据，而不可重复读读到的却是已经提交的数据，但是其违反了事务一致性的要求。

    //不可重复读和幻读区别：
    //     不可重复读主要是针对数据的更新（即事务的两次读取结果值不一样），而幻读主要是针对数据的增加或减少（即事务的两次读取结果返回的数量不一样）。

}
