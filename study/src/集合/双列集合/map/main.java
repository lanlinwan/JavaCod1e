package 集合.双列集合.map;

import java.util.HashMap;
import java.util.Map;

public class main {
    public static void main(String[] args) {
        //    ->HashMap  ->LinkedHashMap
        //map
        //    ->TreeMap

        //Map是双列集合的顶层接口，它的功能是全部双列集合都可以继承使用的
        Map<String,String> m=new HashMap<>();

        // put(K key,V value)  添加元素
        //在添加数据的时候，如果键不存在，那么直接把键值对对象添加到map集合当中
        //在添加数据的时候，如果键是存在的，那么会把原有的键值对对象覆盖，会把被覆盖的值进行返回。
        m.put("兰","澜");
        m.put("本","翉");
        m.put("才","财");
        String value= m.put("兰","蓝");
        System.out.println(value);

        // get(key) 方法来获取 key 对应的 value:
        System.out.println("get:"+m.get("兰"));

        // remove(Object key)  根据键删除键值对元素
        //返回被删除的值
        String value2=m.remove("才");
        System.out.println(value2);

        // void clear()        移除所有的键值对元素
        //m.clear();

        // boolean containsKey(Object key)      判断集合是否包含指定的键
        boolean value3=m.containsKey("兰");
        System.out.println("key兰"+value3);

        // boolean containsValue(Object value)  判断集合是否包含指定的值
        boolean value4=m.containsValue("蓝");
        System.out.println("value蓝"+value4);

        // boolean isEmpty()   判断集合是否为空
        boolean result=m.isEmpty();
        System.out.println(result);

        // int size()          集合的长度，也就是集合中键值对的个数
        System.out.println(m.size());
    }
}
