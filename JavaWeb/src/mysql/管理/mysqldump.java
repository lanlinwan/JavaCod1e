package mysql.管理;

public class mysqldump {
    /*
    mysqldump

    mysqldump客户端工具用来备份数据库或在不同数据库之间进行数据迁移。备份内容包含创建表，及插入表的SQL语句。
    语法:
        mysqldump [options] db_name [tables]
        mysqldump [options] --database/-B db1 [db2 d..]
        mysqldump [options] -all- databases/-A
    连接选项:
        -U, --user=name       指定用户名
        P, --password[=name]  指定密码
        -h, --host=name       指定服务器ip或域名
        -P,--port=#           指定连接端口

       例: mysqldump -uroot -padmin123 lan>B:lan.sql

    输出选项:
        -add-drop-database     在每个数据库创建语句前加上drop database语句
        --add-drop-table       在每个表创建语句前加上drop table语句,默认开启;不开启(--skip-add-drop-table)
        n, --no-create: db     不包含数据库的创建语句
        -t --no-create-info    不包含数据表的创建语句
        -d --no-data           不包含数据
        -T, --tab=name          自动生成两个文件:一个.sq|文件，创建表结构的语句;一个.tt文件，数据文件

      例: mysqldump -uroot -padmin123 -t lan>B:lan.sql


     */
}
