package ex.登录验证;

import JDBC.jdbc1;

import java.sql.*;
import java.util.HashMap;
import java.util.Map;
import java.util.ResourceBundle;
import java.util.Scanner;


//1、当前程序存在的问题:
//用户名: fdsa
//密码: fdsa '
//or '1'='1
//登录成功
//这种现象被称为sQL注入(安全隐患)。(黑客经常使用 )
//2、导致sQL注入的根本原因是什么?
//用户输入的信息中含有sq1语句的关键字，并且这些关键字参与sq1语句的编译过程，
//导致sql语句的原意被扭曲，进而达到sq1注入。

//3、对比一下Statement和 PreparedStatement?
//Statement存在sq1注入问题，PreparedStatement 解决了sQL注入问题。
//statement是编译一次执行一 次。PreparedStatement 是编译一次， 可执行N次。PreparedStatement效率较高一些。
//PreparedStatement 会在编译阶段做类型的安全检查。
//综上所述: PreparedStatement 使用较多。只有极少数的情况下需要使用Statement
//4、什么情况下必须使用Statement呢?
//业务方面要求必须支持sQu注入的时候。
//statement支持SQL注入，凡是业务方面要求是需要进行sq1语句拼接的，必须使用Statement
public class main {
    public static void main(String[] args) {
        //初始化界面
        Map<String, String> user = initUI();
        //验证用户名密码
        boolean login = Login(user);
        //输出结果
        System.out.println(login ? "登陆成功" : "登录失败");
    }

    /**
     * @param userLogin
     * @return
     */
    private static boolean Login(Map<String, String> userLogin) {
        boolean login = false;

        String loginName = userLogin.get("loginName");
        String loginPwd = userLogin.get("loginPwd");

        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        try {
            //1.工具类获取连接
            conn=jdbc1.getConnection();

            //2.获取预编译数据库操作对象
            // sQI语句的框子。其中一个2，表示一个占位符，一个2将来接收一一个“值”，注意:占位符不能使用单引号括起来。
            String sql = "select * from login where loginName=? and loginPwd=? ";
            //程序执行到此处，会发送sq1语句框子给DBMS,然后DBMS进行sq1语句的预先编译。
            ps = conn.prepareStatement(sql);
            //给占位符2传值(第1个问号下标是1，第2个问号下标是2，JDBC中所有下标从1开始。)
            ps.setString(1, loginName);
            ps.setString(2,loginPwd);

            //3.执行查询语句
            rs = ps.executeQuery();
            //4..处理查询结果
            if (rs.next()) {
                login = true;
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            //5.工具类释放资源
            jdbc1.close(conn,ps,rs);
        }
        return login;
    }

    /**
     * 初始化界面
     *
     * @return 用户输入的 信息
     */
    private static Map<String, String> initUI() {
        Scanner s = new Scanner(System.in);
        System.out.println("请输入用户名");
        String name = s.nextLine();
        System.out.println("请输入密码");
        String pwd = s.nextLine();

        Map<String, String> userLogin = new HashMap<>();
        userLogin.put("loginName", name);
        userLogin.put("loginPwd", pwd);
        return userLogin;
    }
}
