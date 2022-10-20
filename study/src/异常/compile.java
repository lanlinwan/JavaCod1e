package 异常;

public class compile {
    public static void main(String[] args) {
        //编译时异常:不是RuntimeException或者其子类的异常,编译阶就报错,必须处理，否则代码不通过。
        //编译时异常示例:
        //String date = "2015-01-12 10:23:21";
        //SimpleDateFormat sdf = new SimpleDateFormat( "yyyy-MM-dd HH:mm:ss");
        //Date d = sdf.parse(date); 日期解析异常: ParseException
        //System. out.println(d);

        //编译时异常的作用是什么:
        //●是担心程序员的技术不行，在编译阶段就爆出一一个错误,目的在于提醒不要出错!
        //●编译时异常是可遇不可求。遇到了就遇到了呗。

    }
}
