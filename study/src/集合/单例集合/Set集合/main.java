package 集合.单例集合.Set集合;

import javax.swing.text.html.HTMLDocument;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.function.Consumer;

public class main {
    public static void main(String[] args) {
        //Set系列集合
        //●无序:存取顺序不一致
        //●不重复:可以去除重复
        //●无索引:没有带索引的方法，所以不能使用普通for循环遍历,也不能通过索引来获取元素
        //Set集合的实现类
        //●HashSet: 无序、不重复、无索引
        //●LinkedHashSet: 有序、不重复、无索引
        //●TreeSet: 可排序、不重复、无索引

        //1.创建一一个Set集合的对象
        Set<String> s = new HashSet<>();
        //2,添加元素
        //如果当前元素是第- -次添加， 那么可以添加成功，返回tru
        //如果当前元素是第二次添加，那么添加失败，返回false
        s.add("张");
        s.add("张三");
        s.add("李四");
        s.add("王五");
        


        //3.打印集合
        //无序
        //System. out . print1n(s);//[李四，张三，王五]

        //迭代器遍历
        Iterator<String> it = s.iterator();
        while(it.hasNext()) {
            String str = it.next();
            System.out.println(str);

        }
        //增强for遍历
//        for (String str : s) {
//            System.out.println(str);
//        }
        //Lambda表达式
        s.forEach(s1 -> System.out.println(s1));


    }

}
