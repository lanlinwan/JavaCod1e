package waterboss.dao;

import java.sql.Connection;
import java.sql.DriverManager;

public class BaseDao {
    private String url = "jdbc:oracle:thin:@192.168.80.10:1521:orcl";
    private String user = "wateruser";
    private String password = "wppe";
    private java.sql.Connection con=null;
    public Connection getDb() {
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            con=DriverManager.getConnection(url, user, password);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return con;
    }
}

