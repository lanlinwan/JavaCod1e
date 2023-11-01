package 集合.双列集合.map.遍历;



import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;

public class lambda {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("鲁迅", "这句话是我说的");
        map.put("曹操", "不可能绝对不可能");
        map.put("刘备", "接着奏乐接着舞");
        map.put("柯镇恶", "看我眼色行事");
        //3.利用lambda表达式进行遍历
        //底层:
        //forEach其实就是利用第二种方式进行遍历，依次得到每一个键和值
        //再调用accept方法
        map.forEach(new BiConsumer<String, String>() {
            @Override
            public void accept(String key, String value) {
                System.out.println(key + "=" + value);
            }
        });

        System.out.println("-----------------------------");

        map.forEach((String key, String value) -> {
                    System.out.println(key + "=" + value);
                }
        );

        System.out.println("-----------------------------");

        map.forEach((key, value) -> System.out.println(key + "=" + value));


    }
}
