package mysql;

public class mysql {
    //mysql:关系型数据库
    //
    //SQL:
    //

    //●DDL:数据定义语言，用来定义数据库对象,如数据库、数据表和数据字段;
    //●DML:数据操作语言，用来对数据库表中的数据进行增删改查操作;
    //●DQL:数据查询语言，用来查询数据库中表的记录;
    //●DCL:数据控制语言，用来创建数据库用户、 控制数据库的访问权限。

    //MySQL体系结构
    //●连接层
    //最上层是一些客户端和链接服务，主要完成一些类似于连接处理、 授权认证、及相关的安全方案。服务器也会为安全接入的每个客户
    //端验证它所具有的操作权限。
    //●服务层
    //第二层架构主要完成大多数的核心服务功能，如SQL接口，并完成缓存的查询, SQL的分析和优化，部分内置函数的执行。所有跨存
    //储引擎的功能也在这一层实现， 如过程、函数等。
    //●引擎层
    //存储引擎真正的负责了MySQL中数据的存储和提取，服务器通过API和存储引擎进行通信。不同的存储引擎具有不同的功能，这样我
    //们可以根据自己的需要，来选取合适的存储引擎。
    //●存储层
    //主要是将数据存储在文件系统之上，并完 成与存储引擎的交互。

}