package Comprehensive.src.main.java.web.serevlet;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 *替换HttpServlet, 根据请求的最后一段路径来进行方法分发
 */
public class BaseServlet extends HttpServlet {
    //根据请求的最后一段路径进行方法分发
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp){
        //1.获取请求路径
        String uri=req.getRequestURI();//  / Comprehensive/brand/selectAll
        //1.2获取最后一段路径,方法名
        int index=uri.lastIndexOf('/');
        String methodName=uri.substring(index+1);//

        //2.执行方法
        //2.1 获取 BrandServlet 字节码对象Class
        Class<? extends BaseServlet> cls=this.getClass();
        //2.2 获取方法 Method对象
        try {
           Method method =cls.getMethod(methodName,HttpServletRequest.class,HttpServletResponse.class);
            method.setAccessible(true);
           //2.3 执行方法
            method.invoke(this,req,resp);
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }


    }
}
