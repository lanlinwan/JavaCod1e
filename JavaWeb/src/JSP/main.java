package JSP;

public class main {
    //JSP
    //●概念:Java Server Pages, Java服务端页面
    //●-种动态的网页技术,其中既可以定义HTML、JS、CSS等静态内容,还可以定义Java代码的动态内容
    //●JSP=HTML+Java

    //JSP快速入门
    //1.导入JSP坐标
    //<dependency>
    //<groupld>javax.servlet.jsp</groupld>
    //<artifactld>jsp-api</artifactld>
    //<version> 2.2</version>
    //<scope>provided</scope>
    //</dependency>
    //2.创建JSP文件

    //3.编写HTML标签和Java代码
    //| <body>
    //<h1>hello jsp~</h1>
    //<% System. out . printf("jsp helLo~");%>
    //</ body>

    //JSP原理
    //●概念: Java Server Pages, Java服务端页面
    //●JSP = HTML + Java, 用于简化开发的
    //●JSP 本质上就是- -个Servlet

    //JSP脚本
    //●JSP脚本用于在 JSP页面内定义Java代码
    //●JSP 脚本分类:
    //1. <%..%>: 内容会直接放到」jspService()方法之中
    //2. <%=...%>: 内容会放到out.print()中， 作为out.print()的参数
    //3. <%!...%>: 内容会放到jspService()方法之外， 被类直接包含

    //JSP缺点
    //●由于JSP页面内，既可以定义HTML标签,又可以定义Java代码,造成了以下问题:
    //1.书写麻烦: 特别是复杂的页面
    //2.阅读麻烦
    //3. 复杂度高:运行需要依赖于各种环境，JRE, JSP容器，JavaE..
    //4.占内存和磁盘: JSP会自动生成java和.class文件占磁盘, 运行的是.class文件占内存
    //5.调试困难: 出错后,需要找到自动生成的java文件进行调试
    //6.不利于团队协作: 前端人员不会Java,后端人员不精HTML
}
