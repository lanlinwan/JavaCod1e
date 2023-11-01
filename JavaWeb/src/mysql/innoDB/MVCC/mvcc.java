package mysql.innoDB.MVCC;

public class mvcc {
    //MVCC-基本概念
    //●当前读
    // 读取的是记录的最新版本，读取时还要保证其他并发事务不能修改当前记录,会对读取的记录进行加锁。对于我们日常的操作，如:
    // select .. lock in share mode(共享锁), select .. for update、update、insert. delete(排他锁)都是一种当前读。
    //●快照读
    // 简单的select (不加锁)就是快照读,快照读,读取的是记录数据的可见版本,有可能是历史数据，不加锁，是非阻塞读。
    //●Read Committed:每次select, 都生成一一个快照读。
    //●Repeatable Read:开启事务后第一个select语句才是快照读的地方。
    // Serializable:快照读会退化为当前读。

    //MVCC
    //全称Multi-Version Concurrency Control,多版本并发控制。指维护-个数据的多个版本，使得读写操作没有冲突,快照读为MySQL实现
    //MVCC提供了-个非阻塞读功能。MVCC的具体实现，还需要依赖于数据库记录中的三个隐式字段、undo log日志、readView。

    //MVCC-实现原理: 1.记录隐藏字段; 2.undo log版本链; 3.readView

    //●记录中的隐藏字段
    //隐藏字段         含义
    //DB_TRX_ID      最近修改事务ID，记录插入这条记录或最后一-次修改该记录的事务ID。
    //DB_ROLL_PTR    回滚指针，指向这条记录的上一个版本，用于配合undo log，指向上一个版本。
    //DB_ROW_ID      隐藏主键，如果表结构没有指定主键，将会生成该隐藏字段。

    //●undo log(回滚日志)
    //1.回滚日志，在insert、 update、delete的时候产生的便于数据回滚的日志。
    //2.当insert的时候，产生的undo log日志只在回滚时需要,在事务提交后，可被立即删除。
    //3.而update、delete的时候, 产生的undo log日志不仅在回滚时需要，在快照读时也需要,不会立即被删除。
    //4.不同事务或相同事务对同一-条记录进行修改,会导致该记录的undolog生成一条记录版本链表, 链表的头部是最新的旧记录,链表尾部是最早的旧记录。


    //●readView:
    //ReadView (读视图)是快照读SQL执行时MVCC提取数据的依据,记录并维护系统当前活跃的事务(事务未提交的) id。

    //ReadView中包含了四个核心字段:
    //字段             含义
    //m_ids           当前活跃的事务ID集合
    //min_trx_id      最小活跃事务ID
    //max_trx_id      预分配事务ID，当前最大事务ID+1 (因为事务ID是自增的)
    //creator_trx_id  ReadView创建者的事务ID()

    //不同的隔离级别，生成ReadView的时机不同:
    //➢READ COMMITTED(RC):在事务中每一次执行快照读时生 成ReadView。
    //➢REPEATABLE READ(RR):仅在事务中第一 次执行快照读时生成ReadView, 后续复用该ReadView。

}
