package 集合.双列集合.map.hashmap.LinkedHashMap;

import java.util.LinkedHashMap;

public class main {
    public static void main(String[] args) {
        //LinkedHashMap
        //●由键决定:有序、不重复、无索引。
        //●这里的有序指的是保证存储和取出的元素顺序-致
        //●原理:底层数据结构是依然哈希表,只是每个键值对元素又额外的多了- -个双链表的机制记录存储的顺序。


        LinkedHashMap<String,Integer> lhm= new LinkedHashMap<>();

        lhm.put("a",123);
        lhm.put("b",123);
        lhm.put("c",123);

        System.out.println(lhm);




    }
}
