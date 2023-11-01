package 常用api.date;

import java.util.Calendar;
import java.util.Date;

public class calender {
    public static void main(String[] args) {
        //Calender 代表 了系统当前时间的日历对象，可以单独修改、获取时间中的年，月，日
        //细节: Calendar是一个抽象类，不能直接创建对象。
        //通过静态方法获取Calendar日历类对象的方法:
        // public static Calendar getInstance() 获取当前时间的日历对象
        Calendar c=Calendar.getInstance();
        System.out.println(c);

        //底层原理:
        //会根据系统的不同时区来获取不同的日历对象,默认表示当前时间。
        //把会把时间中的纪元，年，月，日，时，分，秒，星期，等等的都放到一个数组当中
        //0:纪元
        //1 :年
        //2 :月
        //3 :一年中的第几周
        //4 :一个月中的第几周
        //5: -一个月中的第几天(日期)
        //16....


        //细节:
        //1月份:范围0~11如果 获取出来的是e.那么实际上是1月。
        //星期:在老外的眼里，星期日是一周中的第一-天
        //1 (星期日) 2 (星期一) 3 (星期二) 4 (星期三) 5 (星期四) 6 (星期五) 7 (星期六)

        //修改日历表示的时间
        Date d=new Date();
        c.setTime(d);
        System.out.println(c);

        //1. public int get(int field)取日期中的某个字段信息
        //java在Calendar类中，把索引对应的数字都定义成常量
        int year = c.get(Calendar. YEAR);         //年份
        int month = c. get (Calendar .MONTH) + 1; //月份
        int date = c. get(Calendar.DAY_OF_MONTH); //日期
        int week = c.get(Calendar . DAY_OF_WEEK); //星期几
        int hour=c.get(Calendar.HOUR_OF_DAY);     //小时
        int minute = c.get(Calendar.MINUTE);      //分钟
        int second = c.get(Calendar.SECOND);      //秒
        System. out . println(year + "年" + month + "月" +date+"日 "+  ((week-1 ==0)? "星期日" : "星期"+(week-1) ) );//1970,日，1

        //2. public void set(int field,int value) 修改日历的某个字段信息
        c.set(Calendar.YEAR,2000);
        c.set(Calendar.MONTH,8);
        c.set(Calendar.DAY_OF_MONTH,10);
        System.out.println(c);

        //3. public void add(int field, int amount ) 为某个字段增加/减少指定的值
        //调用此方法在这个基础上增加一个月
        c.add(Calendar.MONTH,-1);
        System.out.println(c);

















    }
}
