package 集合.单例集合.遍历;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class 迭代器 {
    public static void main(String[] args) {
        /*
        Collection单例集合系列集合三种通用的遍历方式:
        1.迭代器遍历
        2.增强for遍历
        3.lambda表达式遍历
        迭代器遍历相关的三个方法:
        Iterator<E> iterator() : 获取-一个迭代器对象
        boolean hasNext() :判断当前指向的位置是否有元素
        E next() :获取当前指向的元素并移动指针
        */
        //1.创建集合并添加元素
        Collection<String> coll = new ArrayList<>();
        coll.add("aaa");
        coll.add("bbb");
        coll.add("ccc");
        coll.add("ddd");

        //2.获取迭代器对象
        //迭代器对象好比一个箭头,默认指向集合的0索引处
        Iterator<String> it = coll.iterator();
        //利用循环不断获取集合里的每一个元素
        while (it.hasNext()) {
            //next() 方法:获取元素并移动指针
            String str = it.next();
            System.out.println(str);
        }


        /**
         迭代器的细节注意点:
         1. 报错NoSuchElementException
         2. 迭代器遍历完毕，指针不会复位
         3. 循环中只能用 - 次next方法
         4. 迭代器遍历时，不能用集合的方法进行增加或者删除
         */

        Collection<String> col = new ArrayList<>();
        col.add("aaaa");
        col.add("bbbb");
        col.add("cccc");
        coll.add("dddd");

        Iterator<String> itt = col.iterator();

        while (itt.hasNext()) {
            String str = itt.next();
            System.out.println(str);
        }

        //当上面循环结束之后，迭代器的指针已经指向了最后没有元素的位置
        //System. out . println(it . next());//NoSuchElementException
        //迭代器遍历完毕，指针不会复位
        System.out.println(it.hasNext());
        //如果我们要继续第二次遍历集合，只能再次获取-一个新的迭代器对象
        Iterator<String> it2 = coll.iterator();
        while (it2.hasNext()) {
            String str = it2.next();
            //String str1 = it2.next();//多次使用next方法 可能会报错
            System.out.println(str);
        }


    }
}