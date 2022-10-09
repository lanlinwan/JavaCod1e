package 集合.单例集合;

import java.util.ArrayList;
import java.util.Collection;

public class main {
    public static void main(String[] args) {
        //    单列集合(Collection):
        //        List系列集合:添加的元素是 有序的,可重复,有索引
        //        Set系列集合:添加的元素是 无序的,不重复,无索引
        /**
         Collection 是单列集合的祖宗接口，它的功能是全部单列集合都可以继承使用的。
         方法:
         public boolean add(E e)| 把给定的对象添加到当前集合中
         public void clear( ) 清空集合中所有的元素
         public boolean remove(E e) 把给定的对象在当前集合中删除
         public boolean contains(0bject obj) 判断当前集合中是否包含给定的对象
         public boolean isEmpty() 判断当前集合是否为空
         public int size() 返回集合中元素的个数/集合的长度
         */

        Collection<String> coll = new ArrayList<>();

        //细节1:如果我们要往List系列集 合中添加数据，那么方法永远返回true.因为List 系列的是允许元素重复的。
        //细节2:如果我们要往Set系列集合中添加数据，如果当前要添加元素不存在，方法返回true, 表示添加成功。
        //如果当前要添加的元素已经存在，方法返回false，表示添加失败。
        //因为Set系列的集合不允许重复。
        coll.add("aaa");
        coll.add("bbb");
        coll.add("ccc");
        System.out.println(coll);

        //2.清空
        //col1.clear();

        //3.删除
        //细节1:因为Collection 里面定义的是共性的方法，所以此时不能通过索引进行删除。只能通过元素的对象进行删除。
        //细节2:方法会有一一个布尔类型的返回值，删除成功返回true,删除失败返回false
        //如果要删除的元素不存在，就会删除失败。
        System.out.println(coll.remove("aaa"));
        System.out.println(coll);

        //4.判断元素是否包含
        //细节:底层是依赖equals方法进行判断是否存在的。
        //所以，如果集合中存储的是自定义对象，也想通过contains方法来判断是否包含，那么在javabean类中，一定 要重写equals方法。
        boolean resu1t1 = coll.contains("bbb");
        System.out.println(resu1t1);

        //5.判断集合是否为空
        boolean result2 = coll.isEmpty();
        System.out.println(result2);//false

        //6.获取集合的长度
        int size = coll.size();
        System.out.println(size);

    }
}
