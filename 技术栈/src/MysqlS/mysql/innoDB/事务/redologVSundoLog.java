package MysqlS.mysql.innoDB.事务;

public class redologVSundoLog {
    /*
    undo log和redo log的区别    :
        redo log: 记录的是数据页的物理变化，服务宕机可用来同步数据
        undo log : 记录的是逻辑日志，当事务回滚时，通过逆操作恢复原来的数据
        redo log保证了事务的持久性，undo log保证了事务的原子性和一致性
     */
}
