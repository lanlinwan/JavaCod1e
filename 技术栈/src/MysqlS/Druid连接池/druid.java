//package MysqlS.Druid连接池;
//
//import com.alibaba.druid.pool.DruidDataSourceFactory;
//
//import javax.sql.DataSource;
//import java.io.FileInputStream;
//import java.sql.Connection;
//import java.util.Properties;
//
//public class druid {
//    public static void main(String[] args) throws Exception {
//        //1. 导入jar包druid.jar
//        //2.定义配置文件(druid.properties)
//
//        //3.加载配置文件
//        Properties prop=new Properties();
//        prop.load(new FileInputStream("JavaWeb/src/MysqlS.Druid连接池/druid.properties"));
//        //4.获取数据库连接池对象
//        DataSource dataSource= DruidDataSourceFactory.createDataSource(prop);
//        //5.获取连接
//        Connection connection=dataSource.getConnection();
//        System.out.println(connection);
//    }
//}
