package 集合.迭代器;

import java.util.ArrayList;
import java.util.Iterator;

public class m {
    //集合的并发修改异常
    //●使用迭代器遍历集合时，又同时在删除集合中的数据，程序就会出现并发修改异常的错误。
    //●由于增强for循环遍历集合就是迭代器遍历集合的简化写法，因此,使用增强for循环遍历集合,
    // 又在同时删除集合中的数据时,程序也会出现并发修改异常的错误

    //怎么保证遍历集合同时删除数据时不出bug?
    //●使用迭代器遍历集合,但用迭代器自己的删除方法删除数据即可。
    //●如果能用for循环遍历时:可以倒着遍历并删除;或者从前往后遍历，但删除元素后做i --操作。
    public static void main(String[] args) {
        //Java迭代器（Iterator）是 Java 集合框架中的一种机制，
        //它提供了一种在不暴露集合内部实现的情况下遍历集合元素的方法。

        //调用 it.next() 会返回迭代器的下一个元素，并且更新迭代器的状态。
        //调用 it.hasNext() 用于检测集合中是否还有元素。
        //调用 it.remove() 将迭代器返回的元素删除。

        //面试:
        // fail-fast 一旦发现遍历的同时其它人来修改，则立刻抛异常
        //           代表 ArrayList 原理: 底层 遍历时会 对集合容量进行检查
        // fail-safe 发现遍历的同时其它人来修改，应当能有应对策略，例如牺牲一致性来让整个遍历运行完成
        //           代表:CopyOnWriteArrayList,原理:读写分离 底层遍历时 会对原集合进行复制,然后遍历复制的集合

        // 创建集合
        ArrayList<String> sites = new ArrayList<>();
        sites.add("Google");
        sites.add("Runoob");
        sites.add("Taobao");
        sites.add("Zhihu");

        // 获取迭代器
        Iterator<String> it = sites.iterator();

        // 输出集合中的第一个元素
        //System.out.println(it.next());
        //循环集合元素
        while(it.hasNext()) {
            System.out.println(it.next());
        }

        //对象
        ArrayList<Srudy> aa = new ArrayList<>();
        aa.add(new Srudy("lan",1));
        aa.add(new Srudy("ben",1));
        aa.add(new Srudy("cai",1));
        Iterator<Srudy> aai=aa.iterator();
        while(aai.hasNext()) {
            //System.out.println(aai.next());
            Srudy a=aai.next();
            System.out.println(a.getName());
            System.out.println(a.getAge());
        }

    }
}
