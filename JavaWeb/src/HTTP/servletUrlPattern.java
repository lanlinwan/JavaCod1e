package HTTP;

public class servletUrlPattern {
    //Servlet urlPattern配置
    //●Servlet 要想被访问，必须配置其访问路径(urlPattern)
    //1.一个Servlet, 可以配置多个urlPattern
    //QWebServLet(urlPatterns = {"/demq1", "/demo2"})
    //2. urlPattern配置规则

    //1.精确匹配
    //●配置路径:@WebServLet("/user/select")
    //●访问路径: localhost:8080/web-demduser/select

    //2.目录匹配
    //●配置路径: @WebServLet("/user/*")
    //●访问路径:
    //localhost:8080/web demd/user/aaa
    //localhost:8080/web- demo/user/bbb

    //3.扩展名匹配
    //配置路径:@WebServLet("*.do")
    //●访问路径:
    //localhost:8080/web-demo/aaa.do
    //localhost:8080/web demo/bbb.do

    //4.任意匹配
    //配置路径:
    //@WebServLet("/")
    //@WebServLet("/*")
    //●访问路径:
    //localhost:8080/web-dem0/hehe
    //localhost:8080/web-demo/haha






}
