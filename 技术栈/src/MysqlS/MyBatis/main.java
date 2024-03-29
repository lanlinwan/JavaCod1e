package MysqlS.MyBatis;

public class main {
    //MysqlS.MyBatis:
    //MyBatis是- -款优秀的持久层框架， 用于简化JDBC开发
    //MyBatis本是Apache的一个开源项目iBatis, 2010年这个项目由apache software
    //foundation迁移到了google code,并且改名为MyBatis。2013年1 1月迁移到Github

    //●MysqlS.JDBC
    // SQL夹杂在Java代码中耦合度高，导致硬编码内伤
    // 维护不易且实际开发需求中SQL有变化，频繁修改的情况多见
    // 代码冗长，开发效率低
    //●Hibernate和JPA
    // 操作简便，开发效率高
    // 程序中的长难复杂SQL需要绕过框架
    // 内部自动生产的SQL,不容易做特殊优化
    // 基于全映射的全自动框架，大量字段的POJO进行部分映射时比较困难。
    // 反射操作太多，导致数据库性能下降
    //●MysqlS.MyBatis
    // 轻量级，性能出色
    // SQL和Java编码分开，功能边界清晰。Java代码专注业务、SQL语句专注数据
    // 开发效率稍逊于HIbernate,但是完全能够接受

    //持久层
    //●负责将数据到保存到数据库的那一层代码(持久层)
    //●JavaEE三层架构: 表现层、业务层、持久层
    //框架
    //●框架就是一个半成品软件， 是-套可重用的、通用的、软件基础代码模型
    //●在框架的基础之 上构建软件编写更加高效、规范、通用、可扩展


    //MyBatis快速入门
    //查询user表中所有数据
    //1.创建user表,添加数据
    //2.创建模块,导入坐标
    //3.编写MyBatis核心配置文件- - >替换连接信息解决硬编码问题
    //4.编写SQL映射文件--统- -管理sq|语句，解决硬编码问题
    //5.编码:
    //    1.定义POJ0类
    //    2.加载核心配置文件，获取SqlSessionFactory 对象
    //    3.获取SqlSession对象，执行SQL语句.
    //    4.释放资源


    //注解完成增删改查
    //使用注解开发会比配置文件开发更加方便
    //@Select("select * from tb_ _user where id = #{d}")
    //public User selectById(int id);
    //●查询: @Select
    //●添加: @Insert
    //●修改: @Update
    //●删除: @Delete

    //使用注解来映射简单语句会使代码显得更加简洁，但对于稍微复杂一-点的语句， Java 注解不仅力不从心，还会让你本就复杂的SQL语句更加混乱不堪。因此，如果你需要做一些很复杂的操作，最好用XML来映射语句。
    //选择何种方式来配置映射，以及认为是否应该要统映射语句定义的形式,完全取决于你和你的团队。换句话说， 永远不要拘泥于一种方式, 你可以很轻松的在基于注解和XML的语句映射方式间自由移植和切换。







}
