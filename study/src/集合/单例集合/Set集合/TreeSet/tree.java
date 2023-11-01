package 集合.单例集合.Set集合.TreeSet;

import java.util.Iterator;
import java.util.TreeSet;
import java.util.function.Consumer;

public class tree {
    public static void main(String[] args) {
        //TreeSet的特点
        //●不重复、无索引、可排序
        // 可排序:按照元素的默认规则(有小到大)排序。
        //●TreeSet集 合底层是基于红黑树的数据结构实现排序的，增删改查性能都较好。

        //底层 创建 了一个TreeMap,是红黑树结构

        TreeSet<Integer> ts = new TreeSet<>();

        ts.add(2);
        ts.add(1);
        ts.add(5);
        ts.add(3);

        System.out.println(ts);

        //三种遍历方式
        //迭代器
        Iterator<Integer> it =ts.iterator();
        while (it.hasNext()){
            int i = it.next();
            System.out.println(i);
        }
        System.out.println("---------");

        //增强for
        for (int t : ts){
            System.out.println(t);
        }
        //lambda
        ts.forEach(integer -> System.out.println(integer));


        //排序规则:
        // 1. 默认形式: 数值类型: Integer,Double 默认按照 从小到大排序
        //            对于字符 字符串类型:按照ASCII码表的数字升序 进行排序

        //2. 创建时直接使用 匿名内部类 指定比较规则
        //  TreeSet<Integer> ts = new TreeSet<>(new Comparator<Integer>() {
        //            @Override
        //            public int compare(Integer o1, Integer o2) {
        //                return o1 - o2;
        //            }
        //        });

        //3. 存储的对象 必须实现 Comparable接口中的 compareTo方法
        //   这里按 age 从小到大
        Student s1= new Student("lan",20);
        Student s2= new Student("l",18);
        Student s3= new Student("an",19);

        TreeSet<Student> ts1=new TreeSet<>();

        ts1.add(s3);
        ts1.add(s2);
        ts1.add(s1);
        System.out.println(ts1);

    }
}
