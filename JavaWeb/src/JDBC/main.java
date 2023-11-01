package JDBC;

import java.sql.*;
import java.util.*;
//JDBC概念:
//●JDBC 就是使用Java语言操作关系型数据库的一套API
//全称: ( Java DataBase Connectivity ) Java数据库连接
//JDBC本质:
//官方(sun公司) 定义的- -套操作所有关系型数据库的规则，即接口
//各个数据库厂商去实现这套接口，提供数据库驱动jar包
//我们可以使用这套接口(JDBC) 编程，真正执行的代码是驱动jar包
//JDBC好处:
//各数据库厂商使用相同的接口，Java代码不需要针对不同数据库分别开发
//可随时替换底层数据库,访问数据库的Java代码基本不变


//事务1-- >读取到版本号1.1
//事务2--->读取到版本号1.1
//其中事务1先修改了,修改之后看了版本号是1.1,于是提交修改的数据,将版本号修改为1.2
//其中务2后修改的,修改之后准备提交的时候,发现版本号是1.2 ,和它最初读的版本号不-致。回滚。
//悲观锁:务必须排队执行。数据锁住了,不允许并发。( 行级锁: select后面添加for update )
//乐观锁:支持井发,事务也不需要排队,只不过需要一 个版本号。

public class main {
    public static void main(String[] args) {

        //实际开发中不建议把连接数据库的信息写死到Java程序中
        //使用资源绑定器绑定属性配置文件
        ResourceBundle bundle = ResourceBundle.getBundle("jdbc");
        String driver = bundle.getString("driver");
        String url = bundle.getString("url");
        String user = bundle.getString("user");
        String password = bundle.getString("password");

        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;
        try {
            //1.注册驱动
//            Driver driver=new com.mysql.jdbc.Driver();//多态:父类型引用指向子类对象(mysql驱动)
//            DriverManager.registerDriver(driver);
            //第二种注册驱动,更常用,因为参数是一个字符串,可以写到配置文件中
            Class.forName(driver);

            //2.获取连接
            conn = DriverManager.getConnection(url, user, password);
            //System.out.println("数据库连接对象=" + conn);

            //3.获取数据库操作对象
            stmt = conn.createStatement();
            //4.执行sql
            //查询语句
            String sql3 = "select deptno,dname,loc from dept";
            rs = stmt.executeQuery(sql3);       //专门执行DQL语句方法
            //处理查询结果
            while (rs.next()) {
                String deptno = rs.getString("deptno");//以字符串格式取(可以填数字,表示列)
                String dname = rs.getString("dname");
                String loc = rs.getString("loc");
                System.out.println(deptno + "," + dname + "," + loc);
            }

            //添加语句
            String sql = "insert into dept(deptno,dname,loc) values(69,'保安','江西')";
            int count = stmt.executeUpdate(sql);        //专门执行DML语句方法
            System.out.println(count == 1 ? "添加成功" : "添加失败");
            //删除语句
            String sql1 = "delete from dept where deptno=20";
            int count1 = stmt.executeUpdate(sql1);
            System.out.println(count1 == 1 ? "删除成功" : "删除失败");
            //修改语句
            String sql2 = "update dept set dname='销售部',loc='天津' where deptno=30";
            int count2 = stmt.executeUpdate(sql2);
            System.out.println(count2 == 1 ? "修改成功" : "修改失败");




        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (stmt != null) {
                    stmt.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }

            try {
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }


    }

}
