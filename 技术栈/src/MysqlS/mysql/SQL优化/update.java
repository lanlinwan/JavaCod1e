package MysqlS.mysql.SQL优化;

public class update {
    //update优化:
    //update student set no = '2000100100' where id = 1 ;
    //update student set no = '2000100105' where name='韦笑';
    //InnoDB的行锁是针对索引加的锁，不是针对记录加的锁,并且该索引不能失效，否则会从行锁升级为表锁。



}
