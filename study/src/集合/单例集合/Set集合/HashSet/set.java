package 集合.单例集合.Set集合.HashSet;

import java.util.HashSet;
import java.util.Iterator;

public class set {
    public static void main(String[] args) {
        // HashSet 基于 HashMap 来实现的，是一个不允许有重复元素的集合。
        // HashSet 允许有 null 值。
        // HashSet 是无序的，即不会记录插入的顺序。
        // HashSet 不是线程安全的， 如果多个线程尝试同时修改 HashSet，则最终结果是不确定的。
        // 您必须在多线程访问时显式同步对 HashSet 的并发访问。

        HashSet<String> sites = new HashSet<String>();
        sites.add("Google");
        sites.add("Runoob");
        sites.add("Taobao");
        sites.add("Zhihu");
        sites.add("Runoob");  // 重复的元素不会被添加

        System.out.println(sites);

        //contains() 方法来判断元素是否存在于集合当中:
        System.out.println(sites.contains("Runoob"));//true

        //remove() 方法来删除集合中的元素:

        //计算 HashSet 中的元素数量使用 size() 方法

        //可以使用 for-each 来迭代 HashSet 中的元素。
        sites.forEach(s -> System.out.println(s));


        HashSet<Srudy> set=new HashSet<>();
        set.add(new Srudy("lan",12));
        set.add(new Srudy("ben",18));
        set.add(new Srudy("lan",12));
        Iterator iterator=set.iterator();
        while(iterator.hasNext()) {
            //System.out.println(aai.next());

            System.out.println(iterator.next());
        }



    }
}
