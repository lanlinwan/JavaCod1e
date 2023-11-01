package request.中文乱码解决;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.net.URLDecoder;
import java.net.URLEncoder;

@WebServlet("/req3")
public class main extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //1. POST解决乱码
        req.setCharacterEncoding("UTF-8");
        //  获取username
        String username=req.getParameter("username");
        System.out.println(username);

        //2. GET解决乱码
        //乱码原因: tomcat 进行URL解码，默认的字符集IS0-8859-1
        //tomact8 之后没有这个问题,默认 utf-8
        String nam="lan";
        // URL编码
        String encode= URLEncoder.encode(nam,"utf-8");
        System.out.println(encode);
        // URL解码
        String dencode= URLDecoder.decode(nam,"ISO-8859-1");
        // 转换为字节数据,编码
        byte[] bytes=dencode.getBytes("ISO-8859-1");
//        for (byte b : bytes){
//            System.out.println(b+" ");
//        }
        // 将字节数组转为字符串,解码
        String s=new String(bytes,"UTF-8");
        System.out.println(s);


    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doGet(req,resp);
    }
}
