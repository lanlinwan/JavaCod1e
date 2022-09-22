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

    }
}
