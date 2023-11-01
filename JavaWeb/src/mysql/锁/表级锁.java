package mysql.锁;

public class 表级锁 {
    //●表级锁
    // 表级锁，每次操作锁住整张表。锁定粒度大,发生锁冲突的概率最高，并发度最低。应用在MyISAM、InnoDB、 BDB等存储引擎中。

    //●表级锁,主要分为以下三类:
    //1. 表锁
    //2. 元数据锁 (meta data lock, MDL)
    //3. 意向锁

    //➢表锁分为两类:
    //1. 表共享读锁(read lock)
    //   加了锁,自己和其他线程只能读,不能写
    //2. 表独占写锁(write lock)
    //   加了锁,自己能写能读,其他线程不能读和写
    //注意:读锁不会阻塞其他客户端的读，但是会阻塞写。
    //    写锁既会阻塞其他客户端的读,又会阻塞其他客户端的写。
    //语法:
    // 1. 加锁: lock tables 表名 read/write
    // 2. 释放锁:unlock tables /客户端断开连接

    //➢元数据锁(meta data lock,mdl)
    //MDL加锁过程是系统自动控制，无需显式使用，在访问--张表的时候会自动加上。MDL锁主要作用是维护表元数据的数据一-致性,
    //在表上有活动事务的时候，不可以对元数据进行写入操作(改变表的结构)。为了避免DML与DDL冲突,保证读写的正确性。
    //在MySQL5.5中引入了MDL，当对一张表进行增删改查的时候,加MDL读锁(线程共享,都可以进行增删改);当对表结构进行变更操作的时候，加MDL写锁(排他)。
    //对应SQL                                        锁类型                          说明
    //lock tables xXxx read/write                   SHARED_READ_ONLY/SHARED_NO_READ_WRITE
    //select、select..lock in share mode            SHARED_READ                   与SHARED_READ、SHARED_WRITE兼容，与EXCLUSIVE互斥
    //insert、update、delete、select...for  update   SHARED_WRITE                  与SHARED_READ、SHARED_WRITE兼容， 与EXCLUSIVE互斥
    //alter table ....                              EXCLUSIVE                      与其他的MDL都互斥

    //➢意向锁
    //为了避免DML在执行时，加的行锁与表锁的冲突,在InnoDB中引入了意向锁,MySQL⾃⼰维护的
    //使得表锁不用检查每行数据是否加锁,使用意向锁来减少表锁的检查。
    //1.意向共享锁 (IS) :由语句select ... lock in share mode(行级锁:共享锁)添加。
    //                 与表锁共享锁(read)兼容,与表锁排它锁(write) 互斥。
    //2.意向排他锁(IX) :由insert、 update、delete、 select ... for update(行级锁:排他锁)添加。
    //                与表锁共享锁(read)及排它锁(write) 都互斥。意向锁之间不会互斥。

}
