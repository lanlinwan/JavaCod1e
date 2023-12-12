package MysqlS.mysql.锁;

public class 全局锁 {
    //●全局锁:
    //全局锁就是对整个数据库实例加锁,加锁后整个实例就处于只读状态，
    //后续的DML的写语句，DDL语句，已经更新操作的事务提交语句都将被阻塞。
    //其典型的使用场景是做全库的逻辑备份,对所有的表进行锁定,从而获取--致性视图,保证数据的完整性。

    //加锁:flush tables with read lock;
    //解锁:unlock tables;

    //●特点
    //数据库中加全局锁,是--个比较重的操作,存在以下问题:
    //1.如果在主库上备份，那么在备份期间都不能执行更新，业务基本上就得停摆。
    //2.如果在从库上备份,那么在备份期间从库不能执行主库同步过来的二进制日志(binlog) ，会导致主从延迟。
    //  在InnoDB引擎中，我们可以在备份时加.上参数--single-transaction参数来完成不加锁的一致性数据备份。
    //  mysqldump --single-transaction -uroot -padmin123 lan>lan.sql
}
