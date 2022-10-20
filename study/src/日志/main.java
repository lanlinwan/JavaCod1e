package 日志;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class main {
    //日志技术具备的优势:
    //●可以将系统执行的信息选择性的记录到指定的位置(控制台、文件中、数据库中)。 .
    //●可以随时以开关的形式控制是否记录日志，无需修改源代码。

    //Logback日志框架
    //●Logback是 由log4j创始人设计的另- -个开源日志组件，性能比log4j要好
    //●Logback是基于slf4j的日志规范实现的框架。
    //Logback主要分为三个技术模块:
    //logback-core: logback-core 模块为其他两个模块奠定了基础，必须有。
    //logback-classic: 它是log4j的- 一个改良版本,同时它完整实现了slf4j API。
    //logback-access 模块与Tomcat和Jetty等Servlet容器集成，以提供HTTP访问日志功能

    //日志级别
    //●级别程度依次是: TRACE< DEBUG< INFO<WARN<ERROR ;默认级别是debug (忽略大小写)，对应其方法。
    //作用:用于控制系统中哪些日志级别是可以输出的，只输出级别不低于设定级别的日志信息。
    //●ALL和OFF分别是打开全部日志信息，及关闭全部日志信息。
    //具体在<root level=“INFO" >标签的level属性中设置志级别。，

    //创建Logback的日志对象,代表了日志技术
    public static final Logger LOGGER= LoggerFactory.getLogger("main.class");
    public static void main(String[] args) {

        try {
            LOGGER.debug("main");
            int a = 10;
            int b = 0;
            LOGGER.trace("a=" + a);
            LOGGER.trace("b=" + b);
            System.out.println(a / b);
        } catch (Exception e) {
            e.printStackTrace();
            LOGGER.error("功能异常"+e);
        }


    }
}
