package response.响应字节数据;



import org.apache.commons.io.IOUtils;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.SequenceInputStream;

//响应字节数据  ; 设置字节数据响应体
@WebServlet("/req9")
public class main extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //读取文件
        FileInputStream fis=new FileInputStream("B:/锁屏图片/wallhaven-73d9yv.jpg");
        //获取 response字节输出流
        ServletOutputStream os=resp.getOutputStream();
        //完成流的copy
//        byte[] buff=new byte[1024];
//        int len=0;
//        while ((len=fis.read(buff))!=-1){
//            os.write(buff,0,len);
//        }
        //简化
        IOUtils.copy(fis,os);

        fis.close();

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doGet(req,resp);
    }
}
