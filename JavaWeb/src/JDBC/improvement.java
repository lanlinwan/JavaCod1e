package JDBC;

import java.sql.*;
import java.util.ResourceBundle;

public class improvement {
    public static void main(String[] args) {
        ResourceBundle bundle = ResourceBundle.getBundle("jdbc");
        String driver = bundle.getString("driver");
        String url = bundle.getString("url");
        String user = bundle.getString("user");
        String password = bundle.getString("password");
        //实际开发中不建议把连接数据库的信息写死到Java程序中
        //使用资源绑定器绑定属性配置文件


        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs ;
        try {
            //1.注册驱动
//            Driver driver=new com.mysql.jdbc.Driver();//多态:父类型引用指向子类对象(mysql驱动)
//            DriverManager.registerDriver(driver);
            //第二种注册驱动,更常用,因为参数是一个字符串,可以写到配置文件中
            Class.forName(driver);

            //2.获取连接
            conn = DriverManager.getConnection(url, user, password);
            //System.out.println("数据库连接对象=" + conn);
            //将自动提交改为手动提交
            conn.setAutoCommit(false);//

            //查询语句
            String sql = "select deptno,dname,loc from dept";
            ps = conn.prepareStatement(sql);
            rs=ps.executeQuery();
            //处理查询结果
            while (rs.next()) {
                String deptno = rs.getString("deptno");//以字符串格式取(可以填数字,表示列)
                String dname = rs.getString("dname");
                String loc = rs.getString("loc");
                System.out.println(deptno + "," + dname + "," + loc);
            }


            //添加语句
            String sql1 = "insert into dept(deptno,dname,loc) values(?,?,?)";
            ps=conn.prepareStatement(sql1);
            ps.setInt(1, 19);
            ps.setString(2,"lan");
            ps.setString(3,"南京");
            int count1=ps.executeUpdate();
            System.out.println(count1==1? "添加成功" : "添加失败");

            //删除语句
            String sql2 = "delete from dept where deptno=?";
            ps = conn.prepareStatement(sql2);
            ps.setInt(1,19);
            int count2=ps.executeUpdate();
            System.out.println(count2==1? "删除成功" : "删除失败");

            //修改语句
            String sql3 = "update dept set dname=?, loc=?  where deptno=?";
            ps=conn.prepareStatement(sql3);
            ps.setString(1,"本");
            ps.setString(2,"上海");
            ps.setInt(3,11);
            int count3=ps.executeUpdate();
            System.out.println(count3==1? "修改成功" : "修改失败");

            //程序走到这里声明以上程序没有异常,事务结束,手动提交数据
            conn.commit();//提交事务

        } catch (Exception e) {
            e.printStackTrace();
            //回滚事务
            if(conn!=null){
                try {
                    conn.rollback();//回滚
                }catch (SQLException e1){
                    e1.printStackTrace();
                }
            }
        } finally {
            //6.释放资源
            //从小到大依次关闭
            try {
                if (ps != null) {
                    ps.close();
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



































