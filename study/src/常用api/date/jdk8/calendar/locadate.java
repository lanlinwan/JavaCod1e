package 常用api.date.jdk8.calendar;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;

public class locadate {
    public static void main(String[] args) {
       //LocalDate: 年 月 日


        //1.获取当前时间的日历对象(包含年月日)
        LocalDate nowDate = LocalDate.now();
        //System. out . println("今天的日期:”+ nowDate);|
        //2.获取指定的时间的日历对象
        LocalDate ldDate = LocalDate.of(2023, 1, 1);
        System.out.println("指定日期:" + ldDate);
        System.out.println("=======================");
        //3.get系列方法获取日历中的每-一个属性值
        //获取年
        int year = ldDate.getYear();
        System.out.println("year:" + year);
        //获取月
        //方式一:
        Month m = ldDate.getMonth();
        System.out.println(m);
        System.out.println(m.getValue());
        //方式二:
        int month = ldDate.getMonthValue();
        System.out.println("month:" + month);

        //获取日
        int day = ldDate.getDayOfMonth();
        System.out.println("day: " + day);
        //获取一年的第几天
        int dayofYear = ldDate.getDayOfYear();
        System.out.println("dayOfYear:" + dayofYear);
        //获取星期
        DayOfWeek dayOfWeek = ldDate.getDayOfWeek();
        System.out.println(dayOfWeek);
        System.out.println(dayOfWeek.getValue());
        //is开头的方法表示判断
        System.out.println(ldDate.isBefore(ldDate));
        System.out.println(ldDate.isAfter(ldDate));
        //with开头的方法表示修改,只能修改年月日
        LocalDate withLocalDate = ldDate.withYear(2000);
        System.out.println(withLocalDate);
        //minus开头的方法表示减少,只能减少年月日
        LocalDate minusLocalDate = ldDate.minusYears(1);
        System.out.println(minusLocalDate);
        //plusDays开头的方法表示增加,只能增加年月日
        LocalDate plus = ldDate.plusDays(1);
        System.out.println(minusLocalDate);

    }
}
