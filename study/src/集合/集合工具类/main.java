package 集合.集合工具类;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class main {
    public static void main(String[] args) {
        //Collection 是一个接口，它是 Set、List 等容器的父接口；
        //Collections 类是 Java 提供的一个操作 Set、List 和 Map 等集合的工具类


        /*
        public static <T> boolean addAll(Collection<T> C, T... elements)
        批量添加元素
        public static void shuffle(List<?> list)
        打乱List集合元素的顺序
    */

        //addA11批量添 加元素
        //1.创建集合对象
        ArrayList<String> list = new ArrayList<>();
        //2.批最添加元素
        Collections.addAll(list,"abc","bcd","qwer","df","asdf"," zxcy","1234","qwer");
        //3.打印集合
        System.out.println(list);

        //shuffle打乱
        Collections.shuffle(list);

        System.out.println(list);
    }


}
