package waterboss.dao;

import java.sql.DriverManager;
import java.sql.SQLException;

public class BaseDao {

    static {
        //加载驱动
        try {
            Class.forName("oracle");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
    //获取数据库链接
    public  static  java.sql.Connection getConnection() throws SQLException {
        return DriverManager.getConnection("jdbc:oracle:thin:@192.168.80.10:1521:orcl","wateruser","wppe");
    }

    //关闭
    public static void close(){


    }
}
