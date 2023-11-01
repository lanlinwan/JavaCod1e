package 集合.双列集合.map.TreeMap;

import java.util.Comparator;
import java.util.TreeMap;

public class main {
    public static void main(String[] args) {
        //TreeMap
        //●TreeMap跟TreeSet底层原理一 -样,都是红黑树结构的。
        //●由键决定特性:不重复、无索引、可排序
        //●可排序: 对键进行排序。
        //●注意: 默认按照键的从小到大进行排序，也可以自己规定键的排序规则

        //代码书写两种排序规则
        //●实现Comparable接口， 指定比较规则。
        //●创建集合时传递Comparator比较器对象,指定比较规则。

        //Integer Double默认情况下都是按照升序排列的
        //String按照字母再ASCII码表中对应的数字升序进行排列
        //abcdefg
        //TreeMap<Integer, String> tm = new TreeMap<>();

        //自定义排序规则
        TreeMap<Integer, String> tm = new TreeMap<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                //o1:当前要添加的元素
                //o2:已经在红黑树存在的元素
                //O1.compareTo(O2),O1>O2,返回1,O1<O2,返回-1；O1==O2，返回0；.
                return o2.compareTo(o1);//降序
            }
        });

        //
        TreeMap<Integer, String> tm1 = new TreeMap<>((o1, o2) -> o2 - o1);

        tm.put(1, "序列化");
        tm.put(2, "b");
        tm.put(3, "序列化");

        System.out.println(tm);

    }
}
