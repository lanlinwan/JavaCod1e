package 集合.双列集合.map.遍历;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class 键找值 {
    public static void main(String[] args) {
        //Map集合的第一种遍历方式:通过键找值

        //1.创建Map集合的对象
        Map<String, String> map = new HashMap<>();
        //2.添加元素
        map.put("兰", "小龙女");
        map.put("郭靖", "穆念慈");
        map.put("欧阳克", "黄蓉");
        //3.通过键找值
        //3.1获取所有的键，把这些键放到一-个单列集合当中
        Set<String> keys = map.keySet();
        //3.2遍历单列集合，得到每一一个键
        for (String key : keys) {
            //System. out. print1n(key);
            //3.3利用map集合中的键获取对应的值get
            String value = map.get(key);
            System.out.println(key + "=" + value);
        }

    }
}
