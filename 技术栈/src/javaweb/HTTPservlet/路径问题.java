package javaweb.HTTPservlet;

public class 路径问题 {
    //www.itheima.com
    //路径问题
    //●明确路径谁使用?
    //➢浏览器使用: 需要加虚拟目录(项目访问路径)
    //➢服务端使用: 不需要加虚拟目录
    //●练习:
    //<a href=‘路径’ >
    //加虚拟目录
    //➢<form action=‘路径’ >加虚拟目录
    //➢req. getRequestDispatcher("路径")不加虚拟目录
    //➢resp sendRedirect(“路径")加虚拟目录
}
