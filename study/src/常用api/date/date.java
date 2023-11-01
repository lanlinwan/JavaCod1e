package 常用api.date;

import java.util.Date;

public class date {
    public static void main(String[] args) {
        //1. 创建对象表示一个时间
        Date d1=new Date();
        System.out.println(d1);
        //2. 创建对象表示一个指定的时间
        Date d2=new Date(0L); //long 数据类型,后面建议加 L
        System.out.println(d2);
        //3. 修改时间
        d2.setTime(1000L);
        System.out.println(d2);

        //4. 获取对象中的毫秒值
        System.out.println(d2.getTime());

        //printf 方法可以很轻松地格式化时间和日期。使用两个字母格式，它以 %t 开头并且以下面表格中的一个字母结尾。
        //
        //    %tY：输出四位数的年份，例如：2023
        //    %ty：输出两位数的年份，例如：23
        //    %tm：输出两位数的月份，例如：02
        //    %tB：输出月份的全名，例如：February
        //    %tb：输出月份的缩写，例如：Feb
        //    %tA：输出星期的全名，例如：Wednesday
        //    %ta：输出星期的缩写，例如：Wed
        //    %td：输出两位数的日期，例如：24
        //    %te：输出一位或两位数的日期，例如：24 或 02
        //    %tH：输出24小时制的小时数，例如：23
        //    %tI：输出12小时制的小时数，例如：11
        //    %tM：输出分钟数，例如：45
        //    %tS：输出秒数，例如：30
        //    %tp：输出上午还是下午，例如：AM 或 PM
        //    %tZ：输出时区，例如：GMT+08:00
        Date date = new Date();
        System.out.printf("%tY-%tm-%td %tH:%tM:%tS %tZ", date, date, date, date, date, date,date);
    }
}
