package MysqlS.JDBC.dichen;

import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Field;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

/**
 * jdbc工具类
 * @author sx
 * @version 1.0
 */
public class JdbcUtil {
    /**
     * 声明连接对象
     */
    public static Connection conn;
    /**
     * 声明预编译执行对象
     */
    public static PreparedStatement state;
    /**
     * 声明结果集对象
     */
    public static ResultSet rs;

     //创建配置文件对象
     public static Properties p=new Properties();
     //在静态代码块中加载jdbc配置文件信息
     static {
         try {
             //用配置文件对象调用方法加载配置文件
             p.load(new FileInputStream("resources/jdbc.properties"));
         } catch (IOException e) {
             e.printStackTrace();
         }
     }

    /**
     * 获得连接对象的方法
     * @return Connection
     */
    public static Connection getConnection() throws ClassNotFoundException, SQLException {
        //加载驱动
        Class.forName(p.getProperty("driver"));
        //创建连接对象
        conn= DriverManager.getConnection(p.getProperty("url"),p.getProperty("username"),p.getProperty("password"));
        return conn;
    }

    /**
     * 执行增,删,改的sql语句的方法
     * @param sql 要执行sql语句
     * @param obs sql语句中占位符对应具体参数,按占位符顺序传参
     * @return int 结果
     */
    public static int update(String sql,Object...obs) throws SQLException, ClassNotFoundException {
        //获得连接对象
        conn=getConnection();
        //创建预编译执行对象
        state=conn.prepareStatement(sql);

        //给占位符传参
        if (obs!=null){
            for (int i=0;i<obs.length;i++){
                state.setObject(i+1,obs[i]);
            }
        }

        //用执行对象调用相应方法执行sql语句并得到结果
        int result=state.executeUpdate();
        return result;
    }

    /**
     * 执行查询的sql语句的方法
     * @param sql 要执行sql语句
     * @param obs sql语句中占位符对应具体参数,按占位符顺序传参
     * @return ResultSet 结果
     */
    public static ResultSet query(String sql,Object...obs) throws SQLException, ClassNotFoundException {
        //获得连接对象
        conn=getConnection();
        //创建预编译执行对象
        state=conn.prepareStatement(sql);

        //给占位符传参
        if (obs!=null){
            for (int i=0;i<obs.length;i++){
                state.setObject(i+1,obs[i]);
            }
        }

        //用执行对象调用相应方法执行sql语句并得到结果
         rs=state.executeQuery();
        return rs;
    }

    /**
     * 关闭jdbc常用对象的方法
     * @throws SQLException
     */
    public static void closeObjects() throws SQLException {
        if (rs!=null){
            rs.close();
        }
        if (state!=null){
            state.close();
        }
        if (conn!=null){
            conn.close();
        }
    }

    /**
     * 关闭对象的方法
     * @param obs 需要关闭的对象
     * @throws Exception
     */
    public static void closeObjects(AutoCloseable...obs) throws Exception {
        for (AutoCloseable ob:obs){
            if(ob!=null){
                ob.close();
            }
        }
    }

    /**
     * 查询多行数据返回对象集合的方法
     * 使用前提:要求对象所在类中,属性必须与查询的列名或列别名一致,且要求查询出列在类中全部都对应属性
     * @param clazz 对象所在类的类对象
     * @param sql 需要执行查询语句
     * @param obs sql语句占位符需要传入参数
     * @param <T> 泛型
     * @return List<T>
     */
    public static <T> List<T> queryList(Class<T> clazz,String sql,Object...obs) throws SQLException, ClassNotFoundException, IllegalAccessException, InstantiationException, NoSuchFieldException {
        //声明集合存查询结果中所有数据
        List<T> list=new ArrayList();

        //调用方法执行sql语句得到查询结果集
        rs=query(sql,obs);
        //获得结果集中列的信息
        ResultSetMetaData rsmd=rs.getMetaData();
        //获得结果集中列数
        int columnCount=rsmd.getColumnCount();

        //遍历结果集一行一行读取数据
        while (rs.next()){
            //获得实例对象存当前行的数据
            T t= clazz.newInstance();

           //遍历结果集中所有列的信息,根据列数和列编号,获得每列的列名
            for(int i=1;i<=columnCount;i++){
                //通过列编号获得当前行当前列的列名或列别名
                String columnName=rsmd.getColumnName(i);
                //通过列编号获得当前行当前列的数据类型
                String columnType=rsmd.getColumnTypeName(i);
                //通过列名获得当前列每列的值
                Object columnValue=rs.getObject(columnName);


                //巧用查询的列名或列别名与对象的属性名相同,获得这个列名对应类中属性的反射对象
                Field fieldObject=clazz.getDeclaredField(columnName);
                //设置属性访问权限
                fieldObject.setAccessible(true);
                //将读取当前行当前列的列值存在当前对象的当前属性中
                //Field属性的类对象中set()会根据实例对象的属性进行自动类型转换
                fieldObject.set(t,columnValue);
            }

            //每读取一行数据,将存这一行数据的实例对象添加到集合中
            list.add(t);
        }

        return  list;
    }

    /**
     * 查询一行数据返回对象的方法
     * 使用前提:要求对象所在类中,属性必须与查询的列名或列别名一致,且要求查询出列在类中全部都对应属性
     * @param clazz 对象所在类的类对象
     * @param sql 需要执行查询语句
     * @param obs sql语句占位符需要传入参数
     * @param <T> 泛型
     * @return List<T>
     */
    public static <T> T queryOne(Class<T> clazz,String sql,Object...obs) throws SQLException, ClassNotFoundException, IllegalAccessException, InstantiationException, NoSuchFieldException {
        //获得实例对象存当前行的数据
        T t= clazz.newInstance();

        //调用方法执行sql语句得到查询结果集
        rs=query(sql,obs);
        //获得结果集中列的信息
        ResultSetMetaData rsmd=rs.getMetaData();
        //获得结果集中列数
        int columnCount=rsmd.getColumnCount();

        //遍历结果集一行一行读取数据
        while (rs.next()){
            //遍历结果集中所有列的信息,根据列数和列编号,获得每列的列名
            for(int i=1;i<=columnCount;i++){
                //通过列编号获得当前行当前列的列名或列别名
                String columnName=rsmd.getColumnName(i);
                //通过列编号获得当前行当前列的数据类型
                String columnType=rsmd.getColumnTypeName(i);
                //通过列名获得当前列每列的值
                Object columnValue=rs.getObject(columnName);


                //巧用查询的列名或列别名与对象的属性名相同,获得这个列名对应类中属性的反射对象
                Field fieldObject=clazz.getDeclaredField(columnName);
                //设置属性访问权限
                fieldObject.setAccessible(true);
                //将读取当前行当前列的列值存在当前对象的当前属性中
                fieldObject.set(t,columnValue);
            }
        }

        return  t;
    }

}
