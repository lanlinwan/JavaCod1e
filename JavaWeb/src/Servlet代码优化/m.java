package Servlet代码优化;

public class m {
    //Servlet代码优化
    //●Web层的Servlet个数太多了，不利于管理和编写
    //●将Servlet进行归类,对于同-一个实体的操作方法，写到-一个Servlet中。比如: BrandServlet. UserServlet
    //http://localhost:8080/brand-case/brandyselecAlI
    //http://localhost:8080/brand-casebrand/add


    //1. 获取最后- -段路径，其实就是方法名称
    //RegisterServlet
    //pubLic void update(){}
    //C SelectAllServlet
    //public void delete(){}
    //2.通过反射获取方法对象， 执行方法
    //e SelectByldServlet
    //◎UpdateServlet
    //自定义Servlet,使用请求路径进行方法分发,
    //替换HttpServlet的根据请求方式进行方法分发
}
