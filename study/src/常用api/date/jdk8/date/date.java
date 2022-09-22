package 常用api.date.jdk8.date;

import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Set;

public class date {
    public static void main(String[] args) {
        //一. Zoneld 时区

        //1.static Set<String> getAvailableZoneIds() 获取Java中支持的所有时区
        Set<String> zone = ZoneId.getAvailableZoneIds();
        System.out.println(zone.size());//601
        System.out.println(zone);
        //2.static ZoneId systemDefault() 获取系统默认时区
        ZoneId zone1 = ZoneId.systemDefault();
        System.out.println(zone1);
        //3.static ZoneId of(String zoneId) 获取一个指定时区
        ZoneId zone2 = ZoneId.of("Asia/Pontianak");
        System.out.println(zone2);


        //二. instant时间戳
        //1. static Instant now() 获取当前时间的Instant对象( 标准时间)
        Instant noe = Instant.now();
        System.out.println(noe);
        //2. static Instant ofXxxx( long epochMilli) 根据(秒/毫秒/纳秒)获取Instant对象
        Instant instant1 = Instant.ofEpochMilli(1000L);
        System.out.println(instant1);//1970-01-01T00:00:00Z

        Instant instant2 = Instant.ofEpochSecond(1L);
        System.out.println(instant2);//1970-01-01T00:00:01Z

        Instant instant3 = Instant.ofEpochSecond(1L, 1000000000L);
        System.out.println(instant3);//1970-01-01T00:00:02Z

        //3. ZonedDateTime atZone( ZoneId zone ) 指定时区
        ZonedDateTime time = Instant.now().atZone(ZoneId.of("Asia/Pontianak"));
        System.out.println(time);

        //4. boolean isXxx(Instant otherInstant) 判断系列的方法
        Instant instant4 = Instant.ofEpochMilli(0L);
        Instant instant5 = Instant.ofEpochMilli(1000L);
        //isBefore:instant4 是否在 instant5 之前
        boolean result1 = instant4.isBefore(instant5);
        System.out.println(result1);//true

        //isAfter:instant4 是否 instant5 之后
        boolean result2 = instant4.isAfter(instant5);
        System.out.println(result2);//false

        //5. Instant minusXxx(long millisToSubtract) 减少时间系列的方法
        Instant instant6 = Instant.ofEpochMilli(3000L);
        System.out.println(instant6);//1970-01-01T00:00:03Z

        Instant instant7 = instant6.minusSeconds(1);
        System.out.println(instant7);//1970-01-01T00:00:02Z

        //6. Instant p1usXxx(long millisToSubtract) 增加时间系列的方法
    }
}
