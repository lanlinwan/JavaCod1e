package mysql.索引.性能分析;

public class show {
    //●SQL执行频率
    // MySQL客户端连接成功后，通过show [session|global] status命令可以提供服务器状态信息。
    // 通过如下指令,可以查看当前数据库的INSERT. UPDATE、DELETE、 SELECT的访问频次:
    // show global status like 'Com_______';

    //●慢查询日志
    // 慢查询日志记录了所有执行时间超过指定参数(long_ query_ _time,单位:秒,默认10秒)的所有SQL语句的日志。
    //MySQL的慢查询日志默认没有开启,需要在MySQL的配置文件(/etc/my.cnf) 中配置如下信息:
    //#开启MySQL慢日志查询开关
    // slow_query_log=1
    //#设置慢日志的时间为2秒，SQL语句执行时间超过2秒，就会视为慢查询，记录慢查询日志
    // long__query_time=2
    //配置完毕之后，通过以下指令重新启动MySQL服务器进行测试,查看慢日志文件中记录的信息 /var/lib/mysql/localhost-slow.log。

    //●profile详情
    // show profiles能够在做SQL优化时帮助我们了解时间都耗费到哪里去了。通过have__profiling参数,能够看到当前MySQL是否支持
    //查看是否支持profile操作:
    // SELECT @@have_ profiling ;
    //默认profiling是关闭的，可以通过set语句在session/global级别开启profiling:
    // SET profiling= 1;

    //#查看每一条SQL的耗时基本情况
    // show profiles;
    //#查看指定query_id的SQL 语句各个阶段的耗时情况
    // show profile for query query_id;
    //#查看指定query_id的SQL语句CPU的使用情况
    // show profile cpu for query query_ _id;




}
