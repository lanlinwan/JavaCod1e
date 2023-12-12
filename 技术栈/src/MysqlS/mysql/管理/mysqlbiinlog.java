package MysqlS.mysql.管理;

public class mysqlbiinlog {
    /*
    ●MysqlS.mysql binlog
    由于服务器生成的二进制日志文件以二进制格式保存，
    所以如果想要检查这些文本的文本格式，就会使用到mysqlbinlog日志管理工具。
    语法:
        mysqlbinlog [options] log files1 log files2...
    选项:
        -d, --database=name     指定数据库名称，只列出指定的数据库相关操作。
        -0, --offset=#          忽略掉日志中的前n行命令。
        -,--result-file=name    将输出的文本格式日志输出到指定文件。
        -S, --short-form        显示简单格式，省略掉 一些信息。
        -start-datatime=date1 -- stop-datetime=date2      指定日期间隔内的所有日志。
        --start-position=pos1 --stop-position=pos2        指定位置间隔内的所有日志。

     */
}
