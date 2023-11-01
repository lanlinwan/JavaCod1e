package request.通用方式请求参数;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Map;

@WebServlet("/req2")
public class main extends HttpServlet {
    //Request通用方式获取请求参数
    //●Map<String, String[ ]> getParameterMap():获取所有参数Map集合
    //●String[ ] getParameterValues(String name) :根据名称获取参数值(数组
    //●String getParameter(String name):根据名称获取参数值(单个值)
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("get");
        //1.获取所有参数Map集合
        Map<String,String[]> map=req.getParameterMap();
        for (String key : map.keySet() ){
            //username:lan ben
            System.out.println(key+":");

            //获取值
            String[] values=map.get(key);
            for (String value : values){
                System.out.println(value+" ");
            }
            System.out.println();
        }

        System.out.println("------");

        // 2. 根据key获取 参数值.数组
        String[] hobbies=req.getParameterValues("hobby");
        for (String hobby : hobbies) {
            System.out.println(hobby);
        }

        System.out.println("------");

        //3. 根据key 获取单个参数值
        String name=req.getParameter("username");
        String password=req.getParameter("password");
        System.out.println(name);
        System.out.println(password);

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("post");
        //通用方式获取请求参数
        this.doGet(req,resp);
    }
}
