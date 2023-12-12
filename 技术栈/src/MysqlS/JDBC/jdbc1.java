package MysqlS.JDBC;

import java.sql.*;
import java.util.ResourceBundle;

public class jdbc1 {
    private jdbc1(){}

    static String url;
    static  String user;
    static String password;

    static {
        ResourceBundle bundle = ResourceBundle.getBundle("jdbc");
        String driver = bundle.getString("driver");
        url = bundle.getString("url");
        user = bundle.getString("user");
        password = bundle.getString("password");

        try {
            Class.forName(driver);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    /**
     * 获取数据库链接对象
     * @return 链接对象
     * @throws SQLException
     */
    public static Connection getConnection() throws SQLException {
        return  DriverManager.getConnection(url, user, password);
    }


    public static void close(Connection conn, Statement ps, ResultSet rs){
        if (conn!=null){
            try {
                conn.close();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }if (ps!=null){
            try {
                ps.close();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }if (rs!=null){
            try {
                rs.close();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }
    }


}
