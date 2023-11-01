package mysql.SQL优化;

public class insert {
    //insert 优化:

    //➢批量插入
    //insert into user values(1,'lan',18),(2,'cai',15),(3,'ben',19);

    //➢手动提交事物
    //start transaction;
    //insert into user values(1,'lan',18),(2,'cai',15);
    //insert into user values(3,'ben',19),(4,'bn',19);
    //insert into user values(5,'lan',18),(6,'cai',15);
    //commit

    //➢主键顺序插入
    //乱序插入: 8  2  9  6  3  1  5
    //顺序插入: 1  2  3  5  6  8  9

    //➢大批量插入数据
    //如果一次性需要插入大批量数据, 使用insert语句插入性 能较低,此时可以使用MySQL数据库提供的load指令进行插入。操作如下:
    //顺序插入 性能更高

    //#客户端连接服务端时，加上参数--local-infile
    //mysql --local-infile -∪root -P
    //#设置全局参数local_infile为1, 开启从本地加载文件导入数据的开关
    //set global local infile= 1;
    //#执行load指令将准备好的数据，加载到表结构中
    //load data local infile '/root/sql1.log' into table 'tb__user' fields terminated by ',' lines terminated by '\n' ;
    //                        路径名                      表名                           分割条件                  换行分割条件
}
