package 常用api.date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateformat {
    public static void main(String[] args) throws ParseException {
        //SimpleDateFormat: 格式化   解析
        //构造:
        //    public SimpleDateFormat()   默认格式
        SimpleDateFormat sdf=new SimpleDateFormat();
        Date d1=new Date(0L);
        String str1=sdf.format(d1);
        //    public SimpleDateFormat()  指定格式
        SimpleDateFormat sdf2=new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss EE");
        String str2=sdf2.format(d1);
        System.out.println(str2);


        //方法:
        //    public final String format(Date date) 格式化(日期对象->字符串)

        //    public Date  parse(String source)     解析(字符串->日期对象)
        //定义一个字符串表示时间
        String str3="2022-3-23 8:00:00";
        //创建对象的格式要与字符串格式完全一致
        SimpleDateFormat sdf3=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date=sdf.parse(str3);

        System.out.println(date.getTime());



















    }
}
